package org.devdays.server.service;

import java.util.List;

import javax.inject.Inject;

import org.devdays.server.dao.CustomerDao;
import org.devdays.shared.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	@Inject
	public CustomerServiceImpl(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void save(Customer customer) {
		customerDao.persist(customer);
	}

	public Customer get(String id) {
		return customerDao.findCustomerById(id);
	}

	public List<Customer> getCustomers(String ids) {
		return customerDao.findCustomerByBulkIds(ids);
	}
}
