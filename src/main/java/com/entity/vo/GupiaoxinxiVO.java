package com.entity.vo;

import com.entity.GupiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 股票信息
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public class GupiaoxinxiVO  implements Serializable {
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
	 * 历史最高价
	 */
	
	private String lishizuigaojia;
		
	/**
	 * 历史最低价
	 */
	
	private String lishizuidijia;
		
	/**
	 * 市净率
	 */
	
	private String shijinglv;
		
	/**
	 * 市盈率
	 */
	
	private String shiyinglv;
		
	/**
	 * 市销率
	 */
	
	private String shixiaolv;
		
	/**
	 * 总股本
	 */
	
	private String zongguben;
		
	/**
	 * 总市值
	 */
	
	private String zongshizhi;
		
	/**
	 * 流通股
	 */
	
	private String liutonggu;
		
	/**
	 * 流通值
	 */
	
	private String liutongzhi;
		
	/**
	 * 营业总收入
	 */
	
	private String yingyezongshouru;
		
	/**
	 * 归母净利润
	 */
	
	private String guimujinglirun;
		
	/**
	 * 股票简介
	 */
	
	private String gupiaojianjie;
		
	/**
	 * 股票图片
	 */
	
	private String gupiaotupian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
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
	 * 设置：历史最高价
	 */
	 
	public void setLishizuigaojia(String lishizuigaojia) {
		this.lishizuigaojia = lishizuigaojia;
	}
	
	/**
	 * 获取：历史最高价
	 */
	public String getLishizuigaojia() {
		return lishizuigaojia;
	}
				
	
	/**
	 * 设置：历史最低价
	 */
	 
	public void setLishizuidijia(String lishizuidijia) {
		this.lishizuidijia = lishizuidijia;
	}
	
	/**
	 * 获取：历史最低价
	 */
	public String getLishizuidijia() {
		return lishizuidijia;
	}
				
	
	/**
	 * 设置：市净率
	 */
	 
	public void setShijinglv(String shijinglv) {
		this.shijinglv = shijinglv;
	}
	
	/**
	 * 获取：市净率
	 */
	public String getShijinglv() {
		return shijinglv;
	}
				
	
	/**
	 * 设置：市盈率
	 */
	 
	public void setShiyinglv(String shiyinglv) {
		this.shiyinglv = shiyinglv;
	}
	
	/**
	 * 获取：市盈率
	 */
	public String getShiyinglv() {
		return shiyinglv;
	}
				
	
	/**
	 * 设置：市销率
	 */
	 
	public void setShixiaolv(String shixiaolv) {
		this.shixiaolv = shixiaolv;
	}
	
	/**
	 * 获取：市销率
	 */
	public String getShixiaolv() {
		return shixiaolv;
	}
				
	
	/**
	 * 设置：总股本
	 */
	 
	public void setZongguben(String zongguben) {
		this.zongguben = zongguben;
	}
	
	/**
	 * 获取：总股本
	 */
	public String getZongguben() {
		return zongguben;
	}
				
	
	/**
	 * 设置：总市值
	 */
	 
	public void setZongshizhi(String zongshizhi) {
		this.zongshizhi = zongshizhi;
	}
	
	/**
	 * 获取：总市值
	 */
	public String getZongshizhi() {
		return zongshizhi;
	}
				
	
	/**
	 * 设置：流通股
	 */
	 
	public void setLiutonggu(String liutonggu) {
		this.liutonggu = liutonggu;
	}
	
	/**
	 * 获取：流通股
	 */
	public String getLiutonggu() {
		return liutonggu;
	}
				
	
	/**
	 * 设置：流通值
	 */
	 
	public void setLiutongzhi(String liutongzhi) {
		this.liutongzhi = liutongzhi;
	}
	
	/**
	 * 获取：流通值
	 */
	public String getLiutongzhi() {
		return liutongzhi;
	}
				
	
	/**
	 * 设置：营业总收入
	 */
	 
	public void setYingyezongshouru(String yingyezongshouru) {
		this.yingyezongshouru = yingyezongshouru;
	}
	
	/**
	 * 获取：营业总收入
	 */
	public String getYingyezongshouru() {
		return yingyezongshouru;
	}
				
	
	/**
	 * 设置：归母净利润
	 */
	 
	public void setGuimujinglirun(String guimujinglirun) {
		this.guimujinglirun = guimujinglirun;
	}
	
	/**
	 * 获取：归母净利润
	 */
	public String getGuimujinglirun() {
		return guimujinglirun;
	}
				
	
	/**
	 * 设置：股票简介
	 */
	 
	public void setGupiaojianjie(String gupiaojianjie) {
		this.gupiaojianjie = gupiaojianjie;
	}
	
	/**
	 * 获取：股票简介
	 */
	public String getGupiaojianjie() {
		return gupiaojianjie;
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
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
