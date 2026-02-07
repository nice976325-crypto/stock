package com.entity.vo;

import com.entity.HistoryinfoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 历史数据
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public class HistoryinfoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
