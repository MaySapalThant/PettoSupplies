package com.petto.business.entity;

import com.petto.business.entity.base.BaseCustomers;



public class Customers extends BaseCustomers {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Customers () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Customers (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Customers (
		java.lang.Integer id,
		java.lang.String customerName,
		java.lang.String customerEmail,
		java.lang.String password) {

		super (
			id,
			customerName,
			customerEmail,
			password);
	}

/*[CONSTRUCTOR MARKER END]*/


}