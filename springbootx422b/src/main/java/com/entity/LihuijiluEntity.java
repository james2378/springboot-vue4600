package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 例会记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-11 09:01:22
 */
@TableName("lihuijilu")
public class LihuijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LihuijiluEntity() {
		
	}
	
	public LihuijiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 记录编号
	 */
					
	private String jilubianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jilushijian;
	
	/**
	 * 记录人
	 */
					
	private String jiluren;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：记录编号
	 */
	public void setJilubianhao(String jilubianhao) {
		this.jilubianhao = jilubianhao;
	}
	/**
	 * 获取：记录编号
	 */
	public String getJilubianhao() {
		return jilubianhao;
	}
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
