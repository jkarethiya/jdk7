/**
 * @author Jitendra Arethiya
 * @version 1.0
 * @since 23-Jun-2015 7:51:51 pm
 */
package com.jk.apache.commons.csv;

public class CSVParserDemo {
/*
 *	public static void main(String[] args) throws IOException {
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



	*/
}

