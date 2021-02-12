package com.javacode.stake.DAO;

import java.util.ArrayList;

import com.javacode.stake.Book;

public class StackDAO implements IStackDAO {

	@Override
	public void save(ArrayList<Book> stack) {
		System.out.print("I'm to save the stack in the data base");
		
	}

}
