package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodonggonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodonggonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodonggonggaoView;


/**
 * 活动公告
 *
 * @author 
 * @email 
 * @date 2023-02-11 09:01:21
 */
public interface HuodonggonggaoService extends IService<HuodonggonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodonggonggaoVO> selectListVO(Wrapper<HuodonggonggaoEntity> wrapper);
   	
   	HuodonggonggaoVO selectVO(@Param("ew") Wrapper<HuodonggonggaoEntity> wrapper);
   	
   	List<HuodonggonggaoView> selectListView(Wrapper<HuodonggonggaoEntity> wrapper);
   	
   	HuodonggonggaoView selectView(@Param("ew") Wrapper<HuodonggonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodonggonggaoEntity> wrapper);
   	

}

