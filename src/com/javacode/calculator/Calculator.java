package com.javacode.calculator;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int divsion(int a, int b) {
		if (b==0) {
			throw new ArithmeticException();
		}		
		return a / b;
	}
}
