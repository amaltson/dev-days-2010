package org.devdays.server.dao;

import java.util.List;

import org.devdays.shared.Customer;

import com.googlecode.objectify.ObjectifyFactory;

public class CustomerDaoImpl implements CustomerDao {

	private ObjectifyFactory objectifyFactory;

	public CustomerDaoImpl(ObjectifyFactory objectifyFactory) {
		this.objectifyFactory = objectifyFactory;
	}

	public void persist(Customer member) {
	}

	public Customer findMemberByIrn(String irn) {
		return null;
	}

	public List<Customer> findMembersByBulkIrn(String... irns) {
		return null;
	}
}
