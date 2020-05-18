package com.jinal.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jinal.kata.LeapYear;

class LeapYearTestCases {

	LeapYear test = new LeapYear();
	@Test
	public void divisible_by_400_LeapYear() {
		assertEquals(true, test.isLeapYear(2000));
	}
}
