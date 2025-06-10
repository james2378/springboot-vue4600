package com.entity.vo;

import com.entity.LihuijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 例会记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
public class LihuijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 例会主题
	 */
	
	private String lihuizhuti;
		
	/**
	 * 例会内容
	 */
	
	private String lihuineirong;
		
	/**
	 * 记录时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jilushijian;
		
	/**
	 * 记录人
	 */
	
	private String jiluren;
				
	
	/**
	 * 设置：例会主题
	 */
	 
	public void setLihuizhuti(String lihuizhuti) {
		this.lihuizhuti = lihuizhuti;
	}
	
	/**
	 * 获取：例会主题
	 */
	public String getLihuizhuti() {
		return lihuizhuti;
	}
				
	
	/**
	 * 设置：例会内容
	 */
	 
	public void setLihuineirong(String lihuineirong) {
		this.lihuineirong = lihuineirong;
	}
	
	/**
	 * 获取：例会内容
	 */
	public String getLihuineirong() {
		return lihuineirong;
	}
				
	
	/**
	 * 设置：记录时间
	 */
	 
	public void setJilushijian(Date jilushijian) {
		this.jilushijian = jilushijian;
	}
	
	/**
	 * 获取：记录时间
	 */
	public Date getJilushijian() {
		return jilushijian;
	}
				
	
	/**
	 * 设置：记录人
	 */
	 
	public void setJiluren(String jiluren) {
		this.jiluren = jiluren;
	}
	
	/**
	 * 获取：记录人
	 */
	public String getJiluren() {
		return jiluren;
	}
			
}
