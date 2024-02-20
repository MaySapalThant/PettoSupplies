package com.petto.business.entity;

import com.petto.business.entity.base.BaseOrderdetail;



public class Orderdetail extends BaseOrderdetail {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Orderdetail () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Orderdetail (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Orderdetail (
		java.lang.Integer id,
		com.petto.business.entity.Items item,
		com.petto.business.entity.Orders order,
		java.lang.Integer qty) {

		super (
			id,
			item,
			order,
			qty);
	}

/*[CONSTRUCTOR MARKER END]*/


}