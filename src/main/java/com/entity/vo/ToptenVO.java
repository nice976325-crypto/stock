package com.entity.vo;

import com.entity.ToptenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 十大成交股
 * @author 
 * @email 
 * @date 2024-04-30 00:22:45
 */
public class ToptenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 股票简称
	 */
	
	private String stockname;
		
	/**
	 * 买入金额
	 */
	
	private String buybalance;
		
	/**
	 * 卖出金额
	 */
	
	private String sellbalance;
		
	/**
	 * 成交金额
	 */
	
	private String balance;
		
	/**
	 * 净买额
	 */
	
	private String netbuying;
		
	/**
	 * 排名
	 */
	
	private Integer ranking;
		
	/**
	 * 收盘价
	 */
	
	private Double closingprice;
		
	/**
	 * 涨跌幅
	 */
	
	private String pricelimit;
		
	/**
	 * 涨跌额
	 */
	
	private Double pricerange;
				
	
	/**
	 * 设置：股票简称
	 */
	 
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	
	/**
	 * 获取：股票简称
	 */
	public String getStockname() {
		return stockname;
	}
				
	
	/**
	 * 设置：买入金额
	 */
	 
	public void setBuybalance(String buybalance) {
		this.buybalance = buybalance;
	}
	
	/**
	 * 获取：买入金额
	 */
	public String getBuybalance() {
		return buybalance;
	}
				
	
	/**
	 * 设置：卖出金额
	 */
	 
	public void setSellbalance(String sellbalance) {
		this.sellbalance = sellbalance;
	}
	
	/**
	 * 获取：卖出金额
	 */
	public String getSellbalance() {
		return sellbalance;
	}
				
	
	/**
	 * 设置：成交金额
	 */
	 
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	/**
	 * 获取：成交金额
	 */
	public String getBalance() {
		return balance;
	}
				
	
	/**
	 * 设置：净买额
	 */
	 
	public void setNetbuying(String netbuying) {
		this.netbuying = netbuying;
	}
	
	/**
	 * 获取：净买额
	 */
	public String getNetbuying() {
		return netbuying;
	}
				
	
	/**
	 * 设置：排名
	 */
	 
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	
	/**
	 * 获取：排名
	 */
	public Integer getRanking() {
		return ranking;
	}
				
	
	/**
	 * 设置：收盘价
	 */
	 
	public void setClosingprice(Double closingprice) {
		this.closingprice = closingprice;
	}
	
	/**
	 * 获取：收盘价
	 */
	public Double getClosingprice() {
		return closingprice;
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
				
	
	/**
	 * 设置：涨跌额
	 */
	 
	public void setPricerange(Double pricerange) {
		this.pricerange = pricerange;
	}
	
	/**
	 * 获取：涨跌额
	 */
	public Double getPricerange() {
		return pricerange;
	}
			
}
