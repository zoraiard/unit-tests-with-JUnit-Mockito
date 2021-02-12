package com.javacode.stake.DAO;

import java.util.ArrayList;

import com.javacode.stake.Book;

public class MockStackDAO implements IStackDAO{

	@Override
	public void save(ArrayList<Book> stack) {
		System.out.println("I don't speak to databases");		
	}	
}
