package com.dao;

import com.entity.HuodonggonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodonggonggaoVO;
import com.entity.view.HuodonggonggaoView;


/**
 * 活动公告
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:21
 */
public interface HuodonggonggaoDao extends BaseMapper<HuodonggonggaoEntity> {
	
	List<HuodonggonggaoVO> selectListVO(@Param("ew") Wrapper<HuodonggonggaoEntity> wrapper);
	
	HuodonggonggaoVO selectVO(@Param("ew") Wrapper<HuodonggonggaoEntity> wrapper);
	
	List<HuodonggonggaoView> selectListView(@Param("ew") Wrapper<HuodonggonggaoEntity> wrapper);

	List<HuodonggonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<HuodonggonggaoEntity> wrapper);
	
	HuodonggonggaoView selectView(@Param("ew") Wrapper<HuodonggonggaoEntity> wrapper);
	

}
