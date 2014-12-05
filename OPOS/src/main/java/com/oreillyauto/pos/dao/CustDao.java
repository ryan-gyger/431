package com.oreillyauto.pos.dao;

import com.oreillyauto.pos.domain.Customer;

public class CustDao {

	public Customer getCust(int custId) {

		// We are just mocking here instead of actually hitting a database
		Customer theCustomer = new Customer();
		theCustomer.setCustId(custId);
		theCustomer.setCustName("Testy Tester");
		theCustomer.setCustPhone("877-CASH-NOW");
		theCustomer.setCustEmail("ttester@iamacustomer.com");
		theCustomer.setCustAddress("One Microsoft Way, Redmond, WA 98052-7329");
		return theCustomer;
	}

}
