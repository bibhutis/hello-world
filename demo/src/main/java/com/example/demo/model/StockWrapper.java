package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockWrapper {
	
	@JsonProperty(value="Meta Data")
	private MetaData metaData;
	
	@JsonProperty(value="Stock Quotes")
	private List<Stock> stockList;
	
	public StockWrapper(MetaData metaData, List<Stock> stockList) {
		super();
		this.metaData = metaData;
		this.stockList = stockList;
	}
	public StockWrapper() {
		super();
	}
	public MetaData getMetaData() {
		return metaData;
	}
	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	
	
}
