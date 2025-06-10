package com.dao;

import com.entity.DiscusshuodonggonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuodonggonggaoVO;
import com.entity.view.DiscusshuodonggonggaoView;


/**
 * 活动公告评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface DiscusshuodonggonggaoDao extends BaseMapper<DiscusshuodonggonggaoEntity> {
	
	List<DiscusshuodonggonggaoVO> selectListVO(@Param("ew") Wrapper<DiscusshuodonggonggaoEntity> wrapper);
	
	DiscusshuodonggonggaoVO selectVO(@Param("ew") Wrapper<DiscusshuodonggonggaoEntity> wrapper);
	
	List<DiscusshuodonggonggaoView> selectListView(@Param("ew") Wrapper<DiscusshuodonggonggaoEntity> wrapper);

	List<DiscusshuodonggonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuodonggonggaoEntity> wrapper);
	
	DiscusshuodonggonggaoView selectView(@Param("ew") Wrapper<DiscusshuodonggonggaoEntity> wrapper);
	

}
