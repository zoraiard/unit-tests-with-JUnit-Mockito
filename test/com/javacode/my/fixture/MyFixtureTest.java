package com.javacode.my.fixture;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyFixtureTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass - This method runs once before the first test");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass - This method runs once after the last test");

	}

	@Before
	public  void setUp() throws Exception {
		System.out.println("@Befor This method runs before each test");
	}
	
	@After
	public  void tearDown() throws Exception {
		System.out.println("@After This method runs after each test");
	}
	
	@Test
	public void testOne() throws Exception {
		System.out.println("I'm test One");
	}
	
	@Test
	public void testTwo() throws Exception {
		System.out.println("I'm test Two");
	}
}
