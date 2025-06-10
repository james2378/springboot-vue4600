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


import com.dao.YubeizhuanzhengDao;
import com.entity.YubeizhuanzhengEntity;
import com.service.YubeizhuanzhengService;
import com.entity.vo.YubeizhuanzhengVO;
import com.entity.view.YubeizhuanzhengView;

@Service("yubeizhuanzhengService")
public class YubeizhuanzhengServiceImpl extends ServiceImpl<YubeizhuanzhengDao, YubeizhuanzhengEntity> implements YubeizhuanzhengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YubeizhuanzhengEntity> page = this.selectPage(
                new Query<YubeizhuanzhengEntity>(params).getPage(),
                new EntityWrapper<YubeizhuanzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YubeizhuanzhengEntity> wrapper) {
		  Page<YubeizhuanzhengView> page =new Query<YubeizhuanzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YubeizhuanzhengVO> selectListVO(Wrapper<YubeizhuanzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YubeizhuanzhengVO selectVO(Wrapper<YubeizhuanzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YubeizhuanzhengView> selectListView(Wrapper<YubeizhuanzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YubeizhuanzhengView selectView(Wrapper<YubeizhuanzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
