package com.dao;

import com.entity.YubeizhuanzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YubeizhuanzhengVO;
import com.entity.view.YubeizhuanzhengView;


/**
 * 预备转正
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface YubeizhuanzhengDao extends BaseMapper<YubeizhuanzhengEntity> {
	
	List<YubeizhuanzhengVO> selectListVO(@Param("ew") Wrapper<YubeizhuanzhengEntity> wrapper);
	
	YubeizhuanzhengVO selectVO(@Param("ew") Wrapper<YubeizhuanzhengEntity> wrapper);
	
	List<YubeizhuanzhengView> selectListView(@Param("ew") Wrapper<YubeizhuanzhengEntity> wrapper);

	List<YubeizhuanzhengView> selectListView(Pagination page,@Param("ew") Wrapper<YubeizhuanzhengEntity> wrapper);
	
	YubeizhuanzhengView selectView(@Param("ew") Wrapper<YubeizhuanzhengEntity> wrapper);
	

}
