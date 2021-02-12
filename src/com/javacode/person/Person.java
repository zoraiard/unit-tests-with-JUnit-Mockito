package com.javacode.person;

public class Person {

	public void checkAge(int age) {
		if (age > 60) {
			String person = "Elder";
			System.out.println(person);
		} else if (age >= 21) {
			String person = "Adult";
			System.out.println(person);
		} else if (age >= 14) {
			String person = "Young";
			System.out.println(person);
		} else {
			String person = "Child";
			System.out.println(person);
		}
	}
}
