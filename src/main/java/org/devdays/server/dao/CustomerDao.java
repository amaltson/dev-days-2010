package org.devdays.server.dao;

import java.util.List;

import org.devdays.shared.Customer;

public interface CustomerDao {

	void persist(Customer member);

	Customer findMemberByIrn(String irn);
	
	List<Customer> findMembersByBulkIrn(String... irns);
}
