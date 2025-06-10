package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusshuodonggonggaoDao;
import com.entity.DiscusshuodonggonggaoEntity;
import com.service.DiscusshuodonggonggaoService;
import com.entity.vo.DiscusshuodonggonggaoVO;
import com.entity.view.DiscusshuodonggonggaoView;

@Service("discusshuodonggonggaoService")
public class DiscusshuodonggonggaoServiceImpl extends ServiceImpl<DiscusshuodonggonggaoDao, DiscusshuodonggonggaoEntity> implements DiscusshuodonggonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuodonggonggaoEntity> page = this.selectPage(
                new Query<DiscusshuodonggonggaoEntity>(params).getPage(),
                new EntityWrapper<DiscusshuodonggonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuodonggonggaoEntity> wrapper) {
		  Page<DiscusshuodonggonggaoView> page =new Query<DiscusshuodonggonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuodonggonggaoVO> selectListVO(Wrapper<DiscusshuodonggonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuodonggonggaoVO selectVO(Wrapper<DiscusshuodonggonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuodonggonggaoView> selectListView(Wrapper<DiscusshuodonggonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuodonggonggaoView selectView(Wrapper<DiscusshuodonggonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
