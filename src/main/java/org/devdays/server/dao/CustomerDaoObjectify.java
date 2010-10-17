package org.devdays.server.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.devdays.shared.Customer;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;

public class CustomerDaoObjectify implements CustomerDao {

	private ObjectifyFactory objectifyFactory;

	public CustomerDaoObjectify(ObjectifyFactory objectifyFactory) {
		this.objectifyFactory = objectifyFactory;
	}

	public void persist(Customer customer) {
		Objectify objectify = objectifyFactory.begin();
		objectify.put(customer);
	}

	public Customer findCustomerById(String id) {
		Objectify objectify = objectifyFactory.begin();
		return objectify.get(Customer.class, id);
	}

	public List<Customer> findCustomerByBulkIds(String... ids) {
		Objectify objectify = objectifyFactory.begin();
		Map<String, Customer> result = objectify.get(Customer.class, ids);
		return new ArrayList<Customer>(result.values());
	}
}
