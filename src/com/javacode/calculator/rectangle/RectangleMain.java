package com.javacode.calculator.rectangle;

import com.javacode.rectangle.RectangleTest;

public class RectangleMain {

	public static void main(String[] args) {
	
		RectangleTest rectangleTest = new RectangleTest();
		boolean result;
		
		result = rectangleTest.testCalculateArea();
		System.out.println(" Test Area: " + result);
		result = rectangleTest.testCalculatePerimeter();
		System.out.println(" Test Perimeter: " + result);
		
	}

}
