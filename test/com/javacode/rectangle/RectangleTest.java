package com.javacode.rectangle;

import com.javacode.calculator.rectangle.Rectangle;

public class RectangleTest {

	private Rectangle rectangle;

	public boolean testCalculateArea() {

		rectangle = new Rectangle(10,2);
		
		int resultExpected = 20;
		int result = rectangle.calculateArea();		

		if (result == resultExpected) {
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean testCalculatePerimeter() {

		rectangle = new Rectangle(10,2);
		
		int resultExpected = 24;
		int result = rectangle.calculatePerimere();		

		if (result == resultExpected) {
			return true;
		}else {
			return false;
		}
		
	}

}
