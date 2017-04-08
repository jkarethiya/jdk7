package com.jk.jdk.ds;

public class ArmstrongTest {
	public static void main(String args[]) {

		int number = 153;
		if (isArmStrong(number)) {
			System.out.println("Number : " + number + " is an Armstrong number");
		} else {
			System.out.println("Number : " + number + " is not an Armstrong number");
		}
	}

	/* * @return true if number is Armstrong number or return false */
	private static boolean isArmStrong(int number) {
		int result = 0;
		int orig = number;

		while (number != 0) {
			int remainder = number % 10;
			result = result + remainder * remainder * remainder;
			number = number / 10;
		}

		// number is Armstrong return true
		if (orig == result) {
			return true;
		}

		return false;
	}
}
