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
 * 历史数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
@TableName("historyinfo")
public class HistoryinfoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HistoryinfoEntity() {
		
	}
	
	public HistoryinfoEntity(T t) {
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
	 * 日期
	 */
					
	private String date;
	
	/**
	 * 当日资金流入（元）
	 */
					
	private String capitalinflow;
	
	/**
	 * 当日余额（元）
	 */
					
	private String balance;
	
	/**
	 * 当日成交净买额 （元）
	 */
					
	private String netbuying;
	
	/**
	 * 买入成交额 （元）
	 */
					
	private String buybalance;
	
	/**
	 * 卖出成交额 （元）
	 */
					
	private String sellbalance;
	
	/**
	 * 领涨股
	 */
					
	private String gainer;
	
	/**
	 * 领涨股涨跌幅
	 */
					
	private String lzgztf;
	
	/**
	 * 上证指数
	 */
					
	private Double exponent;
	
	/**
	 * 涨跌幅
	 */
					
	private String pricelimit;
	
	
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
	 * 设置：日期
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * 获取：日期
	 */
	public String getDate() {
		return date;
	}
	/**
	 * 设置：当日资金流入（元）
	 */
	public void setCapitalinflow(String capitalinflow) {
		this.capitalinflow = capitalinflow;
	}
	/**
	 * 获取：当日资金流入（元）
	 */
	public String getCapitalinflow() {
		return capitalinflow;
	}
	/**
	 * 设置：当日余额（元）
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}
	/**
	 * 获取：当日余额（元）
	 */
	public String getBalance() {
		return balance;
	}
	/**
	 * 设置：当日成交净买额 （元）
	 */
	public void setNetbuying(String netbuying) {
		this.netbuying = netbuying;
	}
	/**
	 * 获取：当日成交净买额 （元）
	 */
	public String getNetbuying() {
		return netbuying;
	}
	/**
	 * 设置：买入成交额 （元）
	 */
	public void setBuybalance(String buybalance) {
		this.buybalance = buybalance;
	}
	/**
	 * 获取：买入成交额 （元）
	 */
	public String getBuybalance() {
		return buybalance;
	}
	/**
	 * 设置：卖出成交额 （元）
	 */
	public void setSellbalance(String sellbalance) {
		this.sellbalance = sellbalance;
	}
	/**
	 * 获取：卖出成交额 （元）
	 */
	public String getSellbalance() {
		return sellbalance;
	}
	/**
	 * 设置：领涨股
	 */
	public void setGainer(String gainer) {
		this.gainer = gainer;
	}
	/**
	 * 获取：领涨股
	 */
	public String getGainer() {
		return gainer;
	}
	/**
	 * 设置：领涨股涨跌幅
	 */
	public void setLzgztf(String lzgztf) {
		this.lzgztf = lzgztf;
	}
	/**
	 * 获取：领涨股涨跌幅
	 */
	public String getLzgztf() {
		return lzgztf;
	}
	/**
	 * 设置：上证指数
	 */
	public void setExponent(Double exponent) {
		this.exponent = exponent;
	}
	/**
	 * 获取：上证指数
	 */
	public Double getExponent() {
		return exponent;
	}
	/**
	 * 设置：涨跌幅
	 */
	public void setPricelimit(String pricelimit) {
		this.pricelimit = pricelimit;
	}
	/**
	 * 获取：涨跌幅
	 */
	public String getPricelimit() {
		return pricelimit;
	}

}
