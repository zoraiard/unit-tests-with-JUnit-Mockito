package com.javacode.stack;

import static org.junit.Assert.*;
import com.javacode.stake.Book;
import com.javacode.stake.Stack;
import com.javacode.stake.DAO.StackDAO;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class StackTestJUnit {
	
	static StackDAO stackDAO = mock(StackDAO.class);
	
	@Test
	public void removeLastBook(){
		
		Stack stack = new Stack(stackDAO);		
		
		Book book = new Book("The fortress");
		
		stack.push(book);
		
		book = new Book("The Alamut Ambush");		
		stack.push(book);
		
		book = new Book("The Shipwreck");
		stack.push(book);
		
		String resultExpected = "The Shipwreck";
		
		assertEquals(stack .pop().getTitle(), resultExpected);	
	}
	
	@Test(expected = ArrayStoreException.class)
	public void doNotAddBookBeyondTheLimit(){
		Stack stake = new Stack(stackDAO);
		
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
	}
	
	@Test
	public void doesNotAddNonStandardBook(){
		Stack stack = new Stack(stackDAO);
		
		Book book1 = new Book("The fortress");		
		stack.push(book1);

		Book book2 = new Book("Iron Man");		
		stack.push(book2);

		String resultExpected = "The fortress";		
		
		assertEquals(stack .pop().getTitle(), resultExpected);	
	}
		
	
	/*
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Stack stack = new Stack(stackDAO);
		System.out.println("Executed @BeforeClass");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		stack = null;
		System.out.println("Executed @AfterClass");
	}

	@Before
	public void setUp() throws Exception {

		Book book1 = new Book("The fortress");
		Book book2 = new Book("The Alamut Ambush");
		Book book3 = new Book("The Clonw");
		Book book4 = new Book("The Moon");
		Book book5 = new Book("The Sun");		

		stack.push(book1);
		stack.push(book2);
		stack.push(book3);
		stack.push(book4);
		stack.push(book5);
	}

	@After
	public void tearDown() throws Exception {
		int size = stack.count();

		while (size > 0) {
			stack.pop();
			size--;
		}
	}

	@Test
	public void doNotAddBookBeyondTheLimit() {
		try {
			stack.push(new Book("Around the world"));
			fail();
		} catch (ArrayStoreException e) {
					
		}

		//Book book = stack.pop();
		//assertEquals("The Sun", book.getTitle());
		System.out.println("Executed doNotAddBookBeyondTheLimit");
	}
	
	@Test (expected = ArrayStoreException.class)
	public void doNotAddBookBeyondTheLimitWithException() {
		stack.push(new Book("Around the world"));
		System.out.println("Executed doNotAddBookBeyondTheLimitWithException");						
	}

	@Test
	public void doesNotAddNonStandardBook() {
		
		stack.pop();
		
		stack.push(new Book("Not worth"));

		Book book = stack.pop();

		assertEquals("The Moon", book.getTitle());

		System.out.println("Executed doesNotAddNonStandardBook");
	}
*/	
}
