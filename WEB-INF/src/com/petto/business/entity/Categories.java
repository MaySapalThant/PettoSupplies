package com.petto.business.entity;

import com.petto.business.entity.base.BaseCategories;



public class Categories extends BaseCategories {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Categories () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Categories (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Categories (
		java.lang.Integer id,
		com.petto.business.entity.Pets pet,
		java.lang.String categoryName) {

		super (
			id,
			pet,
			categoryName);
	}

/*[CONSTRUCTOR MARKER END]*/


}