package com.jk.easymock;

import java.util.ArrayList;
import java.util.List;

import com.jk.jdk.core.bean.Stock;
import com.jk.jdk.core.bean.StockMarket;

public class Portfolio {
	private String name;
	private StockMarket stockMarket;
	private List<Stock> stocks = new ArrayList<>();

	/*
	 * this method gets the market value for each stock, sums it up and returns
	 * the total value of the portfolio.
	 */
	public Double getTotalValue() {
		Double value = 0.0;
		for (Stock stock : this.stocks) {
			value += (stockMarket.getPrice(stock.getName()) * stock.getQuantity());
		}
		return value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public void addStock(Stock stock) {
		stocks.add(stock);
	}

	public StockMarket getStockMarket() {
		return stockMarket;
	}

	public void setStockMarket(StockMarket stockMarket) {
		this.stockMarket = stockMarket;
	}
}