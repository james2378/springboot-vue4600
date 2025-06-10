package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhibudahuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhibudahuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhibudahuiView;


/**
 * 支部大会
 *
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface ZhibudahuiService extends IService<ZhibudahuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhibudahuiVO> selectListVO(Wrapper<ZhibudahuiEntity> wrapper);
   	
   	ZhibudahuiVO selectVO(@Param("ew") Wrapper<ZhibudahuiEntity> wrapper);
   	
   	List<ZhibudahuiView> selectListView(Wrapper<ZhibudahuiEntity> wrapper);
   	
   	ZhibudahuiView selectView(@Param("ew") Wrapper<ZhibudahuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhibudahuiEntity> wrapper);
   	

}

