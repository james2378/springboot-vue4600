package com.entity.view;

import com.entity.HuodonggonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-11 09:01:21
 */
@TableName("huodonggonggao")
public class HuodonggonggaoView  extends HuodonggonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuodonggonggaoView(){
	}
 
 	public HuodonggonggaoView(HuodonggonggaoEntity huodonggonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, huodonggonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
