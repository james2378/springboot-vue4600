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


import com.dao.XuexineirongDao;
import com.entity.XuexineirongEntity;
import com.service.XuexineirongService;
import com.entity.vo.XuexineirongVO;
import com.entity.view.XuexineirongView;

@Service("xuexineirongService")
public class XuexineirongServiceImpl extends ServiceImpl<XuexineirongDao, XuexineirongEntity> implements XuexineirongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexineirongEntity> page = this.selectPage(
                new Query<XuexineirongEntity>(params).getPage(),
                new EntityWrapper<XuexineirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexineirongEntity> wrapper) {
		  Page<XuexineirongView> page =new Query<XuexineirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexineirongVO> selectListVO(Wrapper<XuexineirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexineirongVO selectVO(Wrapper<XuexineirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexineirongView> selectListView(Wrapper<XuexineirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexineirongView selectView(Wrapper<XuexineirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
