package com.petto.business.entity;

import com.petto.business.entity.base.BaseOrders;



public class Orders extends BaseOrders {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Orders () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Orders (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Orders (
		java.lang.Integer id,
		com.petto.business.entity.Customers customer,
		java.lang.Integer totalQty,
		java.lang.Integer totalPrice,
		java.lang.String paymentType,
		java.lang.String status,
		java.util.Date orderDate,
		java.lang.String receiverName,
		java.lang.String receiverPhone,
		java.lang.String receiverAddress) {

		super (
			id,
			customer,
			totalQty,
			totalPrice,
			paymentType,
			status,
			orderDate,
			receiverName,
			receiverPhone,
			receiverAddress);
	}

/*[CONSTRUCTOR MARKER END]*/


}