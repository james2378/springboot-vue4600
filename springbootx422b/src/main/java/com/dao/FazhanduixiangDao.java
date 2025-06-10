package com.dao;

import com.entity.FazhanduixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FazhanduixiangVO;
import com.entity.view.FazhanduixiangView;


/**
 * 发展对象
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface FazhanduixiangDao extends BaseMapper<FazhanduixiangEntity> {
	
	List<FazhanduixiangVO> selectListVO(@Param("ew") Wrapper<FazhanduixiangEntity> wrapper);
	
	FazhanduixiangVO selectVO(@Param("ew") Wrapper<FazhanduixiangEntity> wrapper);
	
	List<FazhanduixiangView> selectListView(@Param("ew") Wrapper<FazhanduixiangEntity> wrapper);

	List<FazhanduixiangView> selectListView(Pagination page,@Param("ew") Wrapper<FazhanduixiangEntity> wrapper);
	
	FazhanduixiangView selectView(@Param("ew") Wrapper<FazhanduixiangEntity> wrapper);
	

}
