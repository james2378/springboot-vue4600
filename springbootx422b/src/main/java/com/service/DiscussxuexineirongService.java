package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexineirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexineirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexineirongView;


/**
 * 学习内容评论表
 *
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface DiscussxuexineirongService extends IService<DiscussxuexineirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexineirongVO> selectListVO(Wrapper<DiscussxuexineirongEntity> wrapper);
   	
   	DiscussxuexineirongVO selectVO(@Param("ew") Wrapper<DiscussxuexineirongEntity> wrapper);
   	
   	List<DiscussxuexineirongView> selectListView(Wrapper<DiscussxuexineirongEntity> wrapper);
   	
   	DiscussxuexineirongView selectView(@Param("ew") Wrapper<DiscussxuexineirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexineirongEntity> wrapper);
   	

}

