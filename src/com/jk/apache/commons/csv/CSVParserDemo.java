/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 23-Jun-2015 7:51:51 pm
 */
package com.jk.apache.commons.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CSVParserDemo {

	public static void main(String[] args) throws IOException {
		List<Country> list1 = readCSV();
		
		//print(list1);
		
		List<Country> list2 = parseCSV();
		
		print(list2);
	}

	
	private static List<Country> parseCSV() throws IOException {
		List<Country> list = new ArrayList<Country>();
		
		CSVParser parser = new CSVParser(new FileReader(new File("country.csv")), CSVFormat.DEFAULT.withHeader());
		
		Country country = null;
		
		for(CSVRecord record : parser) {
			System.out.println(record.getCharacterPosition());
			country = new Country(record.get("NAME"), record.get("CAPITAL"), record.get("CURRENCY"));
			
			list.add(country);
		}
		
		return list;
	}


	private static void print(List<Country> list) {
		for(Country cnt :  list) {
			System.out.println(cnt.getName() + " : " + cnt.getCapital() + " : " + cnt.getCurrency());
		}
	}


	private static List<Country> readCSV() throws IOException {
		List<Country> list = new ArrayList<Country>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("country.csv")))) {
			String line = br.readLine();

			Country country = null;
			
			while( (line = br.readLine()) != null && !line.isEmpty() ) {
				String[] fields = line.split(",");
				
				country = new Country(fields[0], fields[1], fields[2]);
				
				list.add(country);
			}
		}
		
		return list;
	}


	private static class Country {
		
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
}

