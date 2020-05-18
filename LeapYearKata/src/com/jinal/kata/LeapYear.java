package com.jinal.kata;

public class LeapYear {

	/**
	 * 
	 * @param year
	 * @return
	 */
	public boolean isLeapYear(int year) {
		boolean result = isDivisibleBy400(year);
		return result;
	}
	private boolean isDivisibleBy400(int i) {
		return isDivisibleBy(i, 400);
	}

	private boolean isDivisibleBy(int num, int base) {
		return ((num % base) == 0);
	}

}
