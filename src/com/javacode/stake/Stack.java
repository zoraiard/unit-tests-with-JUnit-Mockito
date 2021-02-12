package com.javacode.stake;

import java.util.ArrayList;
import com.javacode.stake.DAO.MockStackDAO;
import com.javacode.stake.DAO.StackDAO;

public class Stack {
	private int limit = 5;
	   
	private ArrayList<Book> stack = new ArrayList<Book>();	
	private StackDAO stackDAO;
	
	public Stack(StackDAO StackDAO) {
		this.stackDAO = StackDAO;		
	}
	
	public Stack() {
		// TODO Auto-generated constructor stub
	}



	public Book pop() {		
		Book book = stack.get(stack.size() - 1);
		
		stack.remove(stack.size() - 1);
		
		return book;		
	}
	
	public void push(Book book) {
		if (stack.size() >= limit) {
			throw new ArrayStoreException();
		}
	
		if (!book.getTitle().startsWith("T")) {
			return;
		}
	
		stack.add(book);
		stackDAO.save(stack);
	}	
	
	public int count() {
		return stack.size();
	}
}
