package com.entity.view;

import com.entity.DiscusshuodonggonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动公告评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
@TableName("discusshuodonggonggao")
public class DiscusshuodonggonggaoView  extends DiscusshuodonggonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshuodonggonggaoView(){
	}
 
 	public DiscusshuodonggonggaoView(DiscusshuodonggonggaoEntity discusshuodonggonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, discusshuodonggonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
