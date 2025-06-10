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


import com.dao.HuodonggonggaoDao;
import com.entity.HuodonggonggaoEntity;
import com.service.HuodonggonggaoService;
import com.entity.vo.HuodonggonggaoVO;
import com.entity.view.HuodonggonggaoView;

@Service("huodonggonggaoService")
public class HuodonggonggaoServiceImpl extends ServiceImpl<HuodonggonggaoDao, HuodonggonggaoEntity> implements HuodonggonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodonggonggaoEntity> page = this.selectPage(
                new Query<HuodonggonggaoEntity>(params).getPage(),
                new EntityWrapper<HuodonggonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodonggonggaoEntity> wrapper) {
		  Page<HuodonggonggaoView> page =new Query<HuodonggonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodonggonggaoVO> selectListVO(Wrapper<HuodonggonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodonggonggaoVO selectVO(Wrapper<HuodonggonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodonggonggaoView> selectListView(Wrapper<HuodonggonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodonggonggaoView selectView(Wrapper<HuodonggonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
