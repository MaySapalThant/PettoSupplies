package com.petto.dao;

import java.util.List;

import com.petto.business.entity.Customers;

public interface CustomerDao {
	public List<Customers> getAllCustomers();
	public Customers getCustomerByLoginEmailAndPassword(String strEmail,
			String strPassword);
	public void saveCustomer(Customers customer);	
	public Customers getCustomerByEmail(String email);
	public Customers getCustomerById(Integer id);
	public Long getTotalCustomerCount();
}
