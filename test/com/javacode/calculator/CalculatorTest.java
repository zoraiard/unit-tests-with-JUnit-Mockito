package com.javacode.calculator;

public class CalculatorTest {

	private Calculator calculator;

	public void testCalculatorAdd() {
		
		calculator = new Calculator();
		int resultExpected = 4;
		int result = calculator.add(2, 2);

		if (result == resultExpected) {
			System.out.println("Test ok");
		}else {
			System.out.println("Test failed");
		}
	}

}
