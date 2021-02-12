package com.javacode.calculator;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorJUnit {

	@Test
	public void testAdd() {

		Calculator calculator = new Calculator();

		int result = calculator.add(4, 6);

		assertEquals(10, result);
	}

	@Test
	public void testAddNegativeNumbers() {

		Calculator calculator = new Calculator();

		int result = calculator.add(-4, -6);

		assertEquals(-10, result);
	}

	@Test
	public void testDivision() {

		Calculator calculator = new Calculator();

		int a = 20;
		int b = 10;

		int result = calculator.divsion(a, b);

		assertEquals(2, result);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisionException() {

		Calculator calculator = new Calculator();

		int a = 20;
		int b = 0;

		calculator.divsion(a, b);
	}

}
