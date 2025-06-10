package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YubeizhuanzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YubeizhuanzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YubeizhuanzhengView;


/**
 * 预备转正
 *
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface YubeizhuanzhengService extends IService<YubeizhuanzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YubeizhuanzhengVO> selectListVO(Wrapper<YubeizhuanzhengEntity> wrapper);
   	
   	YubeizhuanzhengVO selectVO(@Param("ew") Wrapper<YubeizhuanzhengEntity> wrapper);
   	
   	List<YubeizhuanzhengView> selectListView(Wrapper<YubeizhuanzhengEntity> wrapper);
   	
   	YubeizhuanzhengView selectView(@Param("ew") Wrapper<YubeizhuanzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YubeizhuanzhengEntity> wrapper);
   	

}

