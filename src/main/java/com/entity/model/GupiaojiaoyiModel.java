package com.entity.model;

import com.entity.GupiaojiaoyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 股票交易
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public class GupiaojiaoyiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
