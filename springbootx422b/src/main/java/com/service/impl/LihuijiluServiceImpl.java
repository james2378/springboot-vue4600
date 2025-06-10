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


import com.dao.LihuijiluDao;
import com.entity.LihuijiluEntity;
import com.service.LihuijiluService;
import com.entity.vo.LihuijiluVO;
import com.entity.view.LihuijiluView;

@Service("lihuijiluService")
public class LihuijiluServiceImpl extends ServiceImpl<LihuijiluDao, LihuijiluEntity> implements LihuijiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LihuijiluEntity> page = this.selectPage(
                new Query<LihuijiluEntity>(params).getPage(),
                new EntityWrapper<LihuijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LihuijiluEntity> wrapper) {
		  Page<LihuijiluView> page =new Query<LihuijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LihuijiluVO> selectListVO(Wrapper<LihuijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LihuijiluVO selectVO(Wrapper<LihuijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LihuijiluView> selectListView(Wrapper<LihuijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LihuijiluView selectView(Wrapper<LihuijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
