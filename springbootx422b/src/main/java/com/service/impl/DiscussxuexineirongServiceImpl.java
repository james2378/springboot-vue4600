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


import com.dao.DiscussxuexineirongDao;
import com.entity.DiscussxuexineirongEntity;
import com.service.DiscussxuexineirongService;
import com.entity.vo.DiscussxuexineirongVO;
import com.entity.view.DiscussxuexineirongView;

@Service("discussxuexineirongService")
public class DiscussxuexineirongServiceImpl extends ServiceImpl<DiscussxuexineirongDao, DiscussxuexineirongEntity> implements DiscussxuexineirongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuexineirongEntity> page = this.selectPage(
                new Query<DiscussxuexineirongEntity>(params).getPage(),
                new EntityWrapper<DiscussxuexineirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuexineirongEntity> wrapper) {
		  Page<DiscussxuexineirongView> page =new Query<DiscussxuexineirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuexineirongVO> selectListVO(Wrapper<DiscussxuexineirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuexineirongVO selectVO(Wrapper<DiscussxuexineirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuexineirongView> selectListView(Wrapper<DiscussxuexineirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuexineirongView selectView(Wrapper<DiscussxuexineirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
