package com.petto.business.service;

import java.util.List;

import com.petto.business.entity.Customers;
import com.petto.business.entity.Pets;
import com.petto.dao.CustomerDao;
import com.petto.presentation.form.AdminCustomerForm;
import com.petto.presentation.form.AdminForm;
import com.petto.presentation.form.AdminPetForm;
import com.petto.presentation.form.CustomerForm;


public class CustomerService {

	private CustomerDao myCustomerDao;
	
	public CustomerDao getMyCustomerDao() {
		return myCustomerDao;
	}

	public void setMyCustomerDao(CustomerDao myCustomerDao) {
		this.myCustomerDao = myCustomerDao;
	}

	//Loading all customers
	public void loadAllCustomers(AdminCustomerForm myForm){
		List<Customers> customersList = myCustomerDao.getAllCustomers();
		myForm.setCustomersList(customersList);
	}
	
	//checking customer is exist or not
	public void checkLoginCustomer(CustomerForm myForm) {
		Customers myCustomer = myCustomerDao
				.getCustomerByLoginEmailAndPassword(myForm.getFrmLoginEmail(),
						myForm.getFrmLoginPassword());
		myForm.setLoginCustomer(myCustomer);
	}
	
	//Saving new customer
	public void saveNewCustomer(CustomerForm myForm) {
		Customers myCustomer = new Customers();
		myCustomer.setId(null);
		
		//Getting data from register form
		myCustomer.setCustomerName(myForm.getFrmRegName());
		myCustomer.setCustomerEmail(myForm.getFrmRegEmail());
		myCustomer.setPassword(myForm.getFrmRegPassword());
		myCustomer.setPhone(myForm.getFrmRegPhone());
		myCustomer.setAddress(myForm.getFrmRegAddress());
		myCustomerDao.saveCustomer(myCustomer);

	}
	
	//Checking email is already exist or not
	public Customers checkEmail(String email) {
		Customers myCustomer = myCustomerDao
				.getCustomerByEmail(email);
		return myCustomer;
	}
	
	//Loading customer profile before updating
	public void firstLoadUpdateProfile(CustomerForm myForm)
	{
		Customers myCus = myForm.getLoginCustomer();
		myForm.setFrmUpdateName(myCus.getCustomerName());
		myForm.setFrmUpdateEmail(myCus.getCustomerEmail());
		myForm.setFrmUpdatePhone(myCus.getPhone());
		myForm.setFrmUpdateAddress(myCus.getAddress());
		myForm.setUpdateAlert(null);	
	}
	
	
	public void saveUpdateCustomer(CustomerForm myForm)
	{	
		Customers myCus = myForm.getLoginCustomer();
		myCus.setCustomerName(myForm.getFrmUpdateName());
		//myCus.setCustomerEmail(myForm.getFrmUpdateEmail());
		myCus.setPhone(myForm.getFrmUpdatePhone());
		myCus.setAddress(myForm.getFrmUpdateAddress());
		myCustomerDao.saveCustomer(myCus);
	}
	
	public void saveUpdateCustomerPassword(CustomerForm myForm)
	{	
		Customers myCus = myForm.getLoginCustomer();
		myCus.setPassword(myForm.getFrmUpdateNewPassword());
		myCustomerDao.saveCustomer(myCus);
	}
	
	public Customers loadCustomerById(Integer id){
		Customers customer = myCustomerDao.getCustomerById(id);
		return customer;
	}
	
	public void gettingTotalUser(AdminForm myForm){
		myForm.setFrmTotalUser(myCustomerDao.getTotalCustomerCount());
	}
}
