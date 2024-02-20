package com.petto.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Customers;

public class AdminCustomerForm extends ValidatorForm {
	List<Customers> customersList;

	public List<Customers> getCustomersList() {
		return customersList;
	}

	public void setCustomersList(List<Customers> customersList) {
		this.customersList = customersList;
	}
}
