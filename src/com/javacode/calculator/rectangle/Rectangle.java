package com.javacode.calculator.rectangle;

public class Rectangle {
	private int base;

	private int height;

	public Rectangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int calculateArea() {

		return base * height;
	}

	public int calculatePerimere() {

		return 2 * base + 2 * height;
	}

}
