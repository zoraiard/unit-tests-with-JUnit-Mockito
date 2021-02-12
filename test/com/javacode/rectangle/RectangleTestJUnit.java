package com.javacode.rectangle;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.javacode.calculator.rectangle.Rectangle;

@RunWith(Parameterized.class)
public class RectangleTestJUnit {
	
	private int base;
	private int height;

	private int area;
		public RectangleTestJUnit(int base, int height, int area) {
		this.base = base;
		this.height = height;
		this.area = area;
	}

	
	@Parameters
	public static Collection<Object[]> parameters(){
		
		return Arrays.asList(new Object[][]{
			{10,20,200},
			{10,30,300},
			{100,100,10000},
			{10,40,400}
		});
	}
	
	@Test
	public void testCalculateArea() {
		Rectangle rectangle = new Rectangle(base, height);
		
		int result = rectangle.calculateArea();
		
		assertEquals(result, area);
	}


}
