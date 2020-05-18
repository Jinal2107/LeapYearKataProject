package com.jinal.kata;

public class LeapYear {

	/**
	 * 
	 * @param year
	 * @return
	 */
	public boolean isLeapYear(int year) {
		boolean result = isDivisibleBy100_and_isDivisibleBy400(year);
		return result;
	}
	private boolean isDivisibleBy100_and_isDivisibleBy400(int year) {
		return (isDivisibleBy100(year) && (isDivisibleBy400(year)) );
	}
	private boolean isDivisibleBy100(int i) {
		return isDivisibleBy(i, 100);
	}
	private boolean isDivisibleBy400(int i) {
		return isDivisibleBy(i, 400);
	}

	private boolean isDivisibleBy(int num, int base) {
		return ((num % base) == 0);
	}

}
