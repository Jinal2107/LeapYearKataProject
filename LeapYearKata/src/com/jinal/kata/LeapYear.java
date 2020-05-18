package com.jinal.kata;

public class LeapYear {

	public boolean isLeapYear(int year) {
		boolean result = isDivisibleBy4(year) && isDivisibleBy100_or_isDivisibleBy100And400(year);;
		return result;
	}
	private boolean isDivisibleBy100_or_isDivisibleBy100And400(int year) {
		return isDivisibleBy100(year) || isDivisibleBy100_and_isDivisibleBy400(year);
	}
	private boolean isDivisibleBy100_and_isDivisibleBy400(int year) {
		return (isDivisibleBy(year,100) && (isDivisibleBy(year,400)) );
	}
	private boolean isDivisibleBy100(int i) {
		return !isDivisibleBy(i, 100);
	}
	private boolean isDivisibleBy4(int i) {
		return isDivisibleBy(i, 4);
	}
	private boolean isDivisibleBy(int num, int base) {
		return ((num % base) == 0);
	}
}
