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


import com.dao.RudangshenqingDao;
import com.entity.RudangshenqingEntity;
import com.service.RudangshenqingService;
import com.entity.vo.RudangshenqingVO;
import com.entity.view.RudangshenqingView;

@Service("rudangshenqingService")
public class RudangshenqingServiceImpl extends ServiceImpl<RudangshenqingDao, RudangshenqingEntity> implements RudangshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RudangshenqingEntity> page = this.selectPage(
                new Query<RudangshenqingEntity>(params).getPage(),
                new EntityWrapper<RudangshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RudangshenqingEntity> wrapper) {
		  Page<RudangshenqingView> page =new Query<RudangshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RudangshenqingVO> selectListVO(Wrapper<RudangshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RudangshenqingVO selectVO(Wrapper<RudangshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RudangshenqingView> selectListView(Wrapper<RudangshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RudangshenqingView selectView(Wrapper<RudangshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
