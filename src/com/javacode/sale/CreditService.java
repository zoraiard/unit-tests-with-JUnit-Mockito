package com.javacode.sale;

public class CreditService implements ICreditService {

	public double getLimit(String cpf) {
		System.out.println("Consulting Credit Card Administrators.");	
		return 1500;
	}	
}
