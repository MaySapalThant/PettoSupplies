package com.petto.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the admins table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="admins"
 */

public abstract class BaseAdmins  implements Serializable {

	public static String REF = "Admins";
	public static String PROP_ADMIN_NAME = "adminName";
	public static String PROP_ID = "id";
	public static String PROP_ADMIN_EMAIL = "adminEmail";
	public static String PROP_ADMIN_PASSWORD = "adminPassword";


	// constructors
	public BaseAdmins () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAdmins (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseAdmins (
		java.lang.Integer id,
		java.lang.String adminName,
		java.lang.String adminEmail,
		java.lang.String adminPassword) {

		this.setId(id);
		this.setAdminName(adminName);
		this.setAdminEmail(adminEmail);
		this.setAdminPassword(adminPassword);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String adminName;
	private java.lang.String adminEmail;
	private java.lang.String adminPassword;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="admin_id"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: admin_name
	 */
	public java.lang.String getAdminName () {
		return adminName;
	}

	/**
	 * Set the value related to the column: admin_name
	 * @param adminName the admin_name value
	 */
	public void setAdminName (java.lang.String adminName) {
		this.adminName = adminName;
	}



	/**
	 * Return the value associated with the column: admin_email
	 */
	public java.lang.String getAdminEmail () {
		return adminEmail;
	}

	/**
	 * Set the value related to the column: admin_email
	 * @param adminEmail the admin_email value
	 */
	public void setAdminEmail (java.lang.String adminEmail) {
		this.adminEmail = adminEmail;
	}



	/**
	 * Return the value associated with the column: admin_password
	 */
	public java.lang.String getAdminPassword () {
		return adminPassword;
	}

	/**
	 * Set the value related to the column: admin_password
	 * @param adminPassword the admin_password value
	 */
	public void setAdminPassword (java.lang.String adminPassword) {
		this.adminPassword = adminPassword;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.petto.business.entity.Admins)) return false;
		else {
			com.petto.business.entity.Admins admins = (com.petto.business.entity.Admins) obj;
			if (null == this.getId() || null == admins.getId()) return false;
			else return (this.getId().equals(admins.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}