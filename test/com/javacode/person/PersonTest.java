package com.javacode.person;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void checkAgeElder() {
		Person person = new Person();
		person.checkAge(70);
		assertTrue(true);
	}

	@Test
	public void checkAgeAdult() {
		Person person = new Person();
		person.checkAge(22);
		assertTrue(true);
	}
	
	@Test
	public void checkAgeYoug() {
		Person person = new Person();
		person.checkAge(16);
		assertTrue(true);
	}

	@Test
	public void checkAgeChild() {
		Person person = new Person();
		person.checkAge(2);
		assertTrue(true);
	}	
}
