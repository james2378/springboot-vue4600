package com.dao;

import com.entity.ZhibudahuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhibudahuiVO;
import com.entity.view.ZhibudahuiView;


/**
 * 支部大会
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface ZhibudahuiDao extends BaseMapper<ZhibudahuiEntity> {
	
	List<ZhibudahuiVO> selectListVO(@Param("ew") Wrapper<ZhibudahuiEntity> wrapper);
	
	ZhibudahuiVO selectVO(@Param("ew") Wrapper<ZhibudahuiEntity> wrapper);
	
	List<ZhibudahuiView> selectListView(@Param("ew") Wrapper<ZhibudahuiEntity> wrapper);

	List<ZhibudahuiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhibudahuiEntity> wrapper);
	
	ZhibudahuiView selectView(@Param("ew") Wrapper<ZhibudahuiEntity> wrapper);
	

}
