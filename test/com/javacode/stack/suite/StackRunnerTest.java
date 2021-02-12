package com.javacode.stack.suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.javacode.stack.BookTestJUnit;

public class StackRunnerTest {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(BookTestJUnit.class);
		
		System.out.println("Test result: "+result.wasSuccessful());
	}

}
