package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FazhanduixiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FazhanduixiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FazhanduixiangView;


/**
 * 发展对象
 *
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface FazhanduixiangService extends IService<FazhanduixiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FazhanduixiangVO> selectListVO(Wrapper<FazhanduixiangEntity> wrapper);
   	
   	FazhanduixiangVO selectVO(@Param("ew") Wrapper<FazhanduixiangEntity> wrapper);
   	
   	List<FazhanduixiangView> selectListView(Wrapper<FazhanduixiangEntity> wrapper);
   	
   	FazhanduixiangView selectView(@Param("ew") Wrapper<FazhanduixiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FazhanduixiangEntity> wrapper);
   	

}

