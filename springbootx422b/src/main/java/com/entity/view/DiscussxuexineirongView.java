package com.entity.view;

import com.entity.DiscussxuexineirongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习内容评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
@TableName("discussxuexineirong")
public class DiscussxuexineirongView  extends DiscussxuexineirongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxuexineirongView(){
	}
 
 	public DiscussxuexineirongView(DiscussxuexineirongEntity discussxuexineirongEntity){
 	try {
			BeanUtils.copyProperties(this, discussxuexineirongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
