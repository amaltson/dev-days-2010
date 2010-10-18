package org.devdays.server.service;

import java.util.List;

import org.devdays.shared.Customer;

public interface CustomerService {

	void save(Customer customer);

	Customer get(String id);

	List<Customer> getCustomers(String ids);
}
