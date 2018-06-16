package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class StockDetails {
	
	@Id
	@Column(name="stock_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stockId;
	
	@Column(name="stock_symbol")
	private String symbol;
	
	@Column(name="stock_price")
	private float price;
	
	@Column(name="stock_volume")
	private int volume;
	
	@Column(name="stock_date")
	private Date date;
	
	@Column(name="stock_volume_price")
	private float stockPrice;
	
	@Column(name="stock_fees")
	private float stockFees;
	
	@Column(name="stock_total_price")
	private float stockPriceTotal;
	
	public StockDetails(String symbol, float price, int volume, Date date, float stockPrice, float stockFees,
			float stockPriceTotal) {
		super();
		this.symbol = symbol;
		this.price = price;
		this.volume = volume;
		this.date = date;
		this.stockPrice = stockPrice;
		this.stockFees = stockFees;
		this.stockPriceTotal = stockPriceTotal;
	}


	public StockDetails() {
		super();
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(float stockPrice) {
		this.stockPrice = stockPrice;
	}

	public float getStockFees() {
		return stockFees;
	}

	public void setStockFees(float stockFees) {
		this.stockFees = stockFees;
	}

	public float getStockPriceTotal() {
		return stockPriceTotal;
	}

	public void setStockPriceTotal(float stockPriceTotal) {
		this.stockPriceTotal = stockPriceTotal;
	}

	
	
	
	
	
}
 