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


import com.dao.FazhanduixiangDao;
import com.entity.FazhanduixiangEntity;
import com.service.FazhanduixiangService;
import com.entity.vo.FazhanduixiangVO;
import com.entity.view.FazhanduixiangView;

@Service("fazhanduixiangService")
public class FazhanduixiangServiceImpl extends ServiceImpl<FazhanduixiangDao, FazhanduixiangEntity> implements FazhanduixiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FazhanduixiangEntity> page = this.selectPage(
                new Query<FazhanduixiangEntity>(params).getPage(),
                new EntityWrapper<FazhanduixiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FazhanduixiangEntity> wrapper) {
		  Page<FazhanduixiangView> page =new Query<FazhanduixiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FazhanduixiangVO> selectListVO(Wrapper<FazhanduixiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FazhanduixiangVO selectVO(Wrapper<FazhanduixiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FazhanduixiangView> selectListView(Wrapper<FazhanduixiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FazhanduixiangView selectView(Wrapper<FazhanduixiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
