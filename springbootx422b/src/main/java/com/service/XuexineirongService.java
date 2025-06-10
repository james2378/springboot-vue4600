package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexineirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexineirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexineirongView;


/**
 * 学习内容
 *
 * @author 
 * @email 
 * @date 2023-02-11 09:01:21
 */
public interface XuexineirongService extends IService<XuexineirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexineirongVO> selectListVO(Wrapper<XuexineirongEntity> wrapper);
   	
   	XuexineirongVO selectVO(@Param("ew") Wrapper<XuexineirongEntity> wrapper);
   	
   	List<XuexineirongView> selectListView(Wrapper<XuexineirongEntity> wrapper);
   	
   	XuexineirongView selectView(@Param("ew") Wrapper<XuexineirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexineirongEntity> wrapper);
   	

}

