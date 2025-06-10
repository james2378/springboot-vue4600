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


import com.dao.YubeidangyuanDao;
import com.entity.YubeidangyuanEntity;
import com.service.YubeidangyuanService;
import com.entity.vo.YubeidangyuanVO;
import com.entity.view.YubeidangyuanView;

@Service("yubeidangyuanService")
public class YubeidangyuanServiceImpl extends ServiceImpl<YubeidangyuanDao, YubeidangyuanEntity> implements YubeidangyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YubeidangyuanEntity> page = this.selectPage(
                new Query<YubeidangyuanEntity>(params).getPage(),
                new EntityWrapper<YubeidangyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YubeidangyuanEntity> wrapper) {
		  Page<YubeidangyuanView> page =new Query<YubeidangyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YubeidangyuanVO> selectListVO(Wrapper<YubeidangyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YubeidangyuanVO selectVO(Wrapper<YubeidangyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YubeidangyuanView> selectListView(Wrapper<YubeidangyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YubeidangyuanView selectView(Wrapper<YubeidangyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
