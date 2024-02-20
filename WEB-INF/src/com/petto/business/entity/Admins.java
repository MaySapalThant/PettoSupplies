package com.petto.business.entity;

import com.petto.business.entity.base.BaseAdmins;



public class Admins extends BaseAdmins {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Admins () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Admins (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Admins (
		java.lang.Integer id,
		java.lang.String adminName,
		java.lang.String adminEmail,
		java.lang.String adminPassword) {

		super (
			id,
			adminName,
			adminEmail,
			adminPassword);
	}

/*[CONSTRUCTOR MARKER END]*/


}