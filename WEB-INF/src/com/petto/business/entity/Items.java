package com.petto.business.entity;

import com.petto.business.entity.base.BaseItems;



public class Items extends BaseItems {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Items () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Items (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Items (
		java.lang.Integer id,
		com.petto.business.entity.Categories category,
		java.lang.String itemName,
		java.lang.Integer unitPrice) {

		super (
			id,
			category,
			itemName,
			unitPrice);
	}

/*[CONSTRUCTOR MARKER END]*/


}