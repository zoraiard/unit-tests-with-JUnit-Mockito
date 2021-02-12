package com.javacode.stack;

public class StackMain {

	public static void main(String[] args) {
		
		StackText stackText = new StackText();
		
		boolean result;
		
		result = stackText.doNotAddBookBeyondTheLimit(); 
		System.out.println("doNotAddBookBeyondTheLimit "+result);
		result = stackText.removeLastBook();
		System.out.println("removeLastBook "+result);
		result = stackText.doesNotAddNonStandardBook();
		System.out.println("doesNotAddNonStandardBook "+result);
	}

}
