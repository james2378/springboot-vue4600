package com.entity.view;

import com.entity.YubeizhuanzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预备转正
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
@TableName("yubeizhuanzheng")
public class YubeizhuanzhengView  extends YubeizhuanzhengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YubeizhuanzhengView(){
	}
 
 	public YubeizhuanzhengView(YubeizhuanzhengEntity yubeizhuanzhengEntity){
 	try {
			BeanUtils.copyProperties(this, yubeizhuanzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
