package com.dao;

import com.entity.YubeidangyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YubeidangyuanVO;
import com.entity.view.YubeidangyuanView;


/**
 * 预备党员
 * 
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface YubeidangyuanDao extends BaseMapper<YubeidangyuanEntity> {
	
	List<YubeidangyuanVO> selectListVO(@Param("ew") Wrapper<YubeidangyuanEntity> wrapper);
	
	YubeidangyuanVO selectVO(@Param("ew") Wrapper<YubeidangyuanEntity> wrapper);
	
	List<YubeidangyuanView> selectListView(@Param("ew") Wrapper<YubeidangyuanEntity> wrapper);

	List<YubeidangyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YubeidangyuanEntity> wrapper);
	
	YubeidangyuanView selectView(@Param("ew") Wrapper<YubeidangyuanEntity> wrapper);
	

}
