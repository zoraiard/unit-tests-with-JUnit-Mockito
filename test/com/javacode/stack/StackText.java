package com.javacode.stack;
import com.javacode.stake.Book;
import com.javacode.stake.Stack;

public class StackText {

	Stack stack = new Stack();
	
	public boolean removeLastBook(){
		
		Book book = new Book("The fortress");		
		stack.push(book);
		
		book = new Book("The Alamut Ambush");		
		stack.push(book);
		
		book = new Book("The Shipwreck");
		stack.push(book);
		
		String resultExpected = "The Shipwreck";

		return stack.pop().getTitle().equals(resultExpected);
	}
	
	public boolean doNotAddBookBeyondTheLimit(){
		Stack stake = new Stack();
		Book book1 = new Book("The fortress");		
		Book book2 = new Book("The Alamut Ambush");		
		Book book3 = new Book("The Shipwreck");		
		Book book4 = new Book("The Cronw");		
		Book book5 = new Book("The Clonw");		
		Book book6 = new Book("The Moon");
		
		stake.push(book1);
		stake.push(book2);
		stake.push(book3);
		stake.push(book4);
		stake.push(book5);
		stake.push(book6);
		
		String resultExpected = "The Clonw";
		
		return stake.pop().getTitle().equals(resultExpected);
		
	}
	
	public boolean doesNotAddNonStandardBook(){
		Stack stake = new Stack();
		Book book1 = new Book("The fortress");		
		stake.push(book1);

		Book book2 = new Book("Iron Man");		
		stake.push(book2);

		String resultExpected = "The fortress";
		
		return stake.pop().getTitle().equals(resultExpected);	
	}
	
	
	
}
