package com.dao;

import com.entity.XuexineirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexineirongVO;
import com.entity.view.XuexineirongView;


/**
 * 学习内容
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:21
 */
public interface XuexineirongDao extends BaseMapper<XuexineirongEntity> {
	
	List<XuexineirongVO> selectListVO(@Param("ew") Wrapper<XuexineirongEntity> wrapper);
	
	XuexineirongVO selectVO(@Param("ew") Wrapper<XuexineirongEntity> wrapper);
	
	List<XuexineirongView> selectListView(@Param("ew") Wrapper<XuexineirongEntity> wrapper);

	List<XuexineirongView> selectListView(Pagination page,@Param("ew") Wrapper<XuexineirongEntity> wrapper);
	
	XuexineirongView selectView(@Param("ew") Wrapper<XuexineirongEntity> wrapper);
	

}
