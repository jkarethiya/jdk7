package com.jk.easymock;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jk.jdk.core.bean.Stock;
import com.jk.jdk.core.bean.StockMarket;

public class PortfolioTest {

	private Portfolio portfolio;
	private StockMarket stockMarket;

	@Before
	public void setUP() {
		portfolio = new Portfolio();
		portfolio.setName("Jitendra");

		stockMarket = EasyMock.createMock(StockMarket.class);
		portfolio.setStockMarket(stockMarket);
	}

	@Test
	public void testGetTotalValue() {
		EasyMock.expect(stockMarket.getPrice("EBAY")).andReturn(100.0);
		EasyMock.replay(stockMarket);

		Stock ebayStock = new Stock("EBAY", 2);
		portfolio.addStock(ebayStock);

		Assert.assertEquals((Double) 200.00, portfolio.getTotalValue());
	}
}
