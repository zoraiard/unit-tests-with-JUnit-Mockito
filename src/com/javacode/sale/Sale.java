package com.javacode.sale;

public class Sale {

	private Client client;
	
	private double value;
	
	private ICreditService ICredidService;

	private boolean paymentInCash = true; 
	
	public Client getClient() {
		return client;
	}

	public double getValue() {
		return value;
	}

	public Sale(Client client, double value, ICreditService iCredit) {
		super();
		this.client = client;
		this.value = value;
		this.ICredidService = iCredit;
	}

	public boolean checkOut() {
		double limit;
		
		if (paymentInCash == true) {
			return true;
		}
		
		try {
			limit = ICredidService.getLimit(client.getCpf());
			
			if (value > limit ) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void setNoPaymentInCash(){
		paymentInCash = false;
		
	}

}

	