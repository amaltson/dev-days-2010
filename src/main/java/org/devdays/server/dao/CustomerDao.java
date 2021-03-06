package org.devdays.server.dao;

import java.util.List;

import org.devdays.shared.Customer;

public interface CustomerDao {

	void persist(Customer customer);

	Customer findCustomerById(String id);
	
	List<Customer> findCustomerByBulkIds(String... ids);
}
