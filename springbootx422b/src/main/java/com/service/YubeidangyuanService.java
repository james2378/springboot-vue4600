package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YubeidangyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YubeidangyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YubeidangyuanView;


/**
 * 预备党员
 *
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface YubeidangyuanService extends IService<YubeidangyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YubeidangyuanVO> selectListVO(Wrapper<YubeidangyuanEntity> wrapper);
   	
   	YubeidangyuanVO selectVO(@Param("ew") Wrapper<YubeidangyuanEntity> wrapper);
   	
   	List<YubeidangyuanView> selectListView(Wrapper<YubeidangyuanEntity> wrapper);
   	
   	YubeidangyuanView selectView(@Param("ew") Wrapper<YubeidangyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YubeidangyuanEntity> wrapper);
   	

}

