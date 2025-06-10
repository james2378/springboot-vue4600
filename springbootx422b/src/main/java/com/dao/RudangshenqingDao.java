package com.dao;

import com.entity.RudangshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RudangshenqingVO;
import com.entity.view.RudangshenqingView;


/**
 * 入党申请
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface RudangshenqingDao extends BaseMapper<RudangshenqingEntity> {
	
	List<RudangshenqingVO> selectListVO(@Param("ew") Wrapper<RudangshenqingEntity> wrapper);
	
	RudangshenqingVO selectVO(@Param("ew") Wrapper<RudangshenqingEntity> wrapper);
	
	List<RudangshenqingView> selectListView(@Param("ew") Wrapper<RudangshenqingEntity> wrapper);

	List<RudangshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<RudangshenqingEntity> wrapper);
	
	RudangshenqingView selectView(@Param("ew") Wrapper<RudangshenqingEntity> wrapper);
	

}
