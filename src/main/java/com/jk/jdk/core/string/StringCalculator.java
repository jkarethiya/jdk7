package com.jk.jdk.core.string;

public class StringCalculator {
	
	public StringCalculator() {}

	public static final int add(final String numbers) {
		int sum = 0;
		
		String[] numbersArray = numbers.split(",");
		
		if(numbersArray.length > 2) {
			//throw new IllegalArgumentException("More than 2 numbers");
		} else {			
			for (String number : numbersArray) {
				if(!number.trim().isEmpty())
					sum += Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
            }
		}
		
		return sum;
	}
	
}
