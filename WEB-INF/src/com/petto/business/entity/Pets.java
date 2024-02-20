package com.petto.business.entity;

import com.petto.business.entity.base.BasePets;



public class Pets extends BasePets {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Pets () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Pets (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Pets (
		java.lang.Integer id,
		java.lang.String petName) {

		super (
			id,
			petName);
	}

/*[CONSTRUCTOR MARKER END]*/


}