package com.javacode.sale;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class SaleTest {

	@Test
	public void testCheckCustomerWithCreditLimit() {

		Client client = new Client("16533202065", "Zoraia Rodrigues");

		ICreditService creditService = mock(ICreditService.class);

		when(creditService.getLimit(client.getCpf())).thenReturn(8000d);

		Sale sale = new Sale(client, 2000, creditService);
		sale.setNoPaymentInCash();
		boolean result = sale.checkOut();

		assertTrue(result);

	}

	@Test
	public void testCheckCustomerWithoutCreditLimit() {

		Client client = new Client("16533202065", "Zoraia Rodrigues");

		ICreditService creditService = mock(ICreditService.class);

		when(creditService.getLimit(client.getCpf())).thenReturn(1000d);

		Sale sale = new Sale(client, 2000, creditService);
		sale.setNoPaymentInCash();
		boolean result = sale.checkOut();

		verify(creditService, times(1)).getLimit(client.getCpf());

		assertFalse(result);

	}

	@Test
	public void testCheckCustomerPaymentInCashNoCheckCreditLimit() {

		Client client = new Client("16533202065", "Zoraia Rodrigues");

		ICreditService creditService = mock(ICreditService.class);

		when(creditService.getLimit(client.getCpf())).thenReturn(1000d);

		Sale sale = new Sale(client, 2000, creditService);

		verify(creditService, never()).getLimit(client.getCpf());

	}
	
	@Test
	public void testCheckoutDoNotCompleteTheSaleIfTheCreditFails() {

		Client client = new Client("16533202065", "Zoraia Rodrigues");

		ICreditService creditService = mock(ICreditService.class);

		when(creditService.getLimit(anyString())).thenThrow(new RuntimeException());

		Sale sale = new Sale(client, 2000, creditService);

		verify(creditService, never()).getLimit(client.getCpf());

	}
}
