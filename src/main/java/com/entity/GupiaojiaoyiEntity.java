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
 * 股票交易
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
@TableName("gupiaojiaoyi")
public class GupiaojiaoyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GupiaojiaoyiEntity() {
		
	}
	
	public GupiaojiaoyiEntity(T t) {
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
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 股票代码
	 */
					
	private String gupiaodaima;
	
	/**
	 * 股票名称
	 */
					
	private String gupiaomingcheng;
	
	/**
	 * 股票类型
	 */
					
	private String gupiaoleixing;
	
	/**
	 * 股票图片
	 */
					
	private String gupiaotupian;
	
	/**
	 * 买入时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date mairushijian;
	
	/**
	 * 买入价格
	 */
					
	private Double mairujiage;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：股票代码
	 */
	public void setGupiaodaima(String gupiaodaima) {
		this.gupiaodaima = gupiaodaima;
	}
	/**
	 * 获取：股票代码
	 */
	public String getGupiaodaima() {
		return gupiaodaima;
	}
	/**
	 * 设置：股票名称
	 */
	public void setGupiaomingcheng(String gupiaomingcheng) {
		this.gupiaomingcheng = gupiaomingcheng;
	}
	/**
	 * 获取：股票名称
	 */
	public String getGupiaomingcheng() {
		return gupiaomingcheng;
	}
	/**
	 * 设置：股票类型
	 */
	public void setGupiaoleixing(String gupiaoleixing) {
		this.gupiaoleixing = gupiaoleixing;
	}
	/**
	 * 获取：股票类型
	 */
	public String getGupiaoleixing() {
		return gupiaoleixing;
	}
	/**
	 * 设置：股票图片
	 */
	public void setGupiaotupian(String gupiaotupian) {
		this.gupiaotupian = gupiaotupian;
	}
	/**
	 * 获取：股票图片
	 */
	public String getGupiaotupian() {
		return gupiaotupian;
	}
	/**
	 * 设置：买入时间
	 */
	public void setMairushijian(Date mairushijian) {
		this.mairushijian = mairushijian;
	}
	/**
	 * 获取：买入时间
	 */
	public Date getMairushijian() {
		return mairushijian;
	}
	/**
	 * 设置：买入价格
	 */
	public void setMairujiage(Double mairujiage) {
		this.mairujiage = mairujiage;
	}
	/**
	 * 获取：买入价格
	 */
	public Double getMairujiage() {
		return mairujiage;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
