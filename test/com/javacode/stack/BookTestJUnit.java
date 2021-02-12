package com.javacode.stack;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javacode.stake.Book;

public class BookTestJUnit {

	@Test
	public void testGetTitle() {
		Book book = new Book("The Sun");	
		assertEquals("The Sun", book.getTitle());
	}

	@Test
	public void testSetTitle() {
		Book book = new Book("The Sun");
		String title = "Iron Man";
		book.setTitle(title);
		assertEquals("Iron Man", book.getTitle());
	}
}
