package com.jinal.kata;

public class LeapYear {

	/**
	 * This method checks is it is Leap Year or not
	 * @param year
	 * @return boolean
	 * @author Jinal
	 */
	public boolean isLeapYear(int year) {
		boolean result = isDivisibleBy4(year) && isDivisibleBy100_or_isDivisibleBy100And400(year);;
		return result;
	}
	/**
	 * This method checks year is divisible by 100 or 400
	 * @param year
	 * @return boolean
	 * @author Jinal
	 */
	private boolean isDivisibleBy100_or_isDivisibleBy100And400(int year) {
		return isDivisibleBy100(year) || isDivisibleBy100_and_isDivisibleBy400(year);
	}
	/**
	 * This method checks year is divisible by 100 and 400
	 * @param year
	 * @return boolean
	 * @author Jinal
	 */
	private boolean isDivisibleBy100_and_isDivisibleBy400(int year) {
		return (isDivisibleBy(year,100) && (isDivisibleBy(year,400)) );
	}
	/**
	 * This method checks year is not divisible by 100 
	 * @param year
	 * @return boolean
	 * @author Jinal
	 */
	private boolean isDivisibleBy100(int i) {
		return !isDivisibleBy(i, 100);
	}
	/**
	 * This method checks year is divisible by 4
	 * @param year
	 * @return boolean
	 * @author Jinal
	 */
	private boolean isDivisibleBy4(int i) {
		return isDivisibleBy(i, 4);
	}
	/**
	 * This method checks year is divisible by any number
	 * @param year
	 * @return boolean
	 * @author Jinal
	 */
	private boolean isDivisibleBy(int num, int base) {
		return ((num % base) == 0);
	}
}
