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


import com.dao.ZhibudahuiDao;
import com.entity.ZhibudahuiEntity;
import com.service.ZhibudahuiService;
import com.entity.vo.ZhibudahuiVO;
import com.entity.view.ZhibudahuiView;

@Service("zhibudahuiService")
public class ZhibudahuiServiceImpl extends ServiceImpl<ZhibudahuiDao, ZhibudahuiEntity> implements ZhibudahuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhibudahuiEntity> page = this.selectPage(
                new Query<ZhibudahuiEntity>(params).getPage(),
                new EntityWrapper<ZhibudahuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhibudahuiEntity> wrapper) {
		  Page<ZhibudahuiView> page =new Query<ZhibudahuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhibudahuiVO> selectListVO(Wrapper<ZhibudahuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhibudahuiVO selectVO(Wrapper<ZhibudahuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhibudahuiView> selectListView(Wrapper<ZhibudahuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhibudahuiView selectView(Wrapper<ZhibudahuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
