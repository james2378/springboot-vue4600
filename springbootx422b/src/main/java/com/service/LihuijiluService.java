package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LihuijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LihuijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LihuijiluView;


/**
 * 例会记录
 *
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public interface LihuijiluService extends IService<LihuijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LihuijiluVO> selectListVO(Wrapper<LihuijiluEntity> wrapper);
   	
   	LihuijiluVO selectVO(@Param("ew") Wrapper<LihuijiluEntity> wrapper);
   	
   	List<LihuijiluView> selectListView(Wrapper<LihuijiluEntity> wrapper);
   	
   	LihuijiluView selectView(@Param("ew") Wrapper<LihuijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LihuijiluEntity> wrapper);
   	

}

