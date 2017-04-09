package com.jk.jdk.core.bean;

public class Country {

	public Country(String name, String capital, String currency) {
		super();
		this.name = name;
		this.capital = capital;
		this.currency = currency;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the capital
	 */
	public String getCapital() {
		return capital;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	private String name;
	private String capital;
	private String currency;
}
