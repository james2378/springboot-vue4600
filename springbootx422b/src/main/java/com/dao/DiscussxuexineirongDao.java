package com.dao;

import com.entity.DiscussxuexineirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexineirongVO;
import com.entity.view.DiscussxuexineirongView;


/**
 * 学习内容评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface DiscussxuexineirongDao extends BaseMapper<DiscussxuexineirongEntity> {
	
	List<DiscussxuexineirongVO> selectListVO(@Param("ew") Wrapper<DiscussxuexineirongEntity> wrapper);
	
	DiscussxuexineirongVO selectVO(@Param("ew") Wrapper<DiscussxuexineirongEntity> wrapper);
	
	List<DiscussxuexineirongView> selectListView(@Param("ew") Wrapper<DiscussxuexineirongEntity> wrapper);

	List<DiscussxuexineirongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexineirongEntity> wrapper);
	
	DiscussxuexineirongView selectView(@Param("ew") Wrapper<DiscussxuexineirongEntity> wrapper);
	

}
