package com.foodybuddy.EcomBackend.dao;

import java.util.List;

import com.foodybuddy.EcomBackend.model.Customer;

public interface CustomerDao {
	
	boolean insertCustomer(Customer customer);
	boolean updateCustomer(Customer customer);
	boolean deleteCustomer(Customer customer);
	List<Customer> selectAllCustomers();
	Customer selectOneCustomer();
}
