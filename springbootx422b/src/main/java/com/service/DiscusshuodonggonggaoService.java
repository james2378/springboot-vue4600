package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuodonggonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuodonggonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuodonggonggaoView;


/**
 * 活动公告评论表
 *
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface DiscusshuodonggonggaoService extends IService<DiscusshuodonggonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuodonggonggaoVO> selectListVO(Wrapper<DiscusshuodonggonggaoEntity> wrapper);
   	
   	DiscusshuodonggonggaoVO selectVO(@Param("ew") Wrapper<DiscusshuodonggonggaoEntity> wrapper);
   	
   	List<DiscusshuodonggonggaoView> selectListView(Wrapper<DiscusshuodonggonggaoEntity> wrapper);
   	
   	DiscusshuodonggonggaoView selectView(@Param("ew") Wrapper<DiscusshuodonggonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuodonggonggaoEntity> wrapper);
   	

}

