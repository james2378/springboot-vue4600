package com.dao;

import com.entity.LihuijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LihuijiluVO;
import com.entity.view.LihuijiluView;


/**
 * 例会记录
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface LihuijiluDao extends BaseMapper<LihuijiluEntity> {
	
	List<LihuijiluVO> selectListVO(@Param("ew") Wrapper<LihuijiluEntity> wrapper);
	
	LihuijiluVO selectVO(@Param("ew") Wrapper<LihuijiluEntity> wrapper);
	
	List<LihuijiluView> selectListView(@Param("ew") Wrapper<LihuijiluEntity> wrapper);

	List<LihuijiluView> selectListView(Pagination page,@Param("ew") Wrapper<LihuijiluEntity> wrapper);
	
	LihuijiluView selectView(@Param("ew") Wrapper<LihuijiluEntity> wrapper);
	

}
