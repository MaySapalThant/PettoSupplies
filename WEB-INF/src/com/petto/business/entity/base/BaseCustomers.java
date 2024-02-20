package com.petto.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the customers table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="customers"
 */

public abstract class BaseCustomers  implements Serializable {

	public static String REF = "Customers";
	public static String PROP_ADDRESS = "address";
	public static String PROP_CUSTOMER_EMAIL = "customerEmail";
	public static String PROP_PHONE = "phone";
	public static String PROP_CUSTOMER_NAME = "customerName";
	public static String PROP_ID = "id";
	public static String PROP_PASSWORD = "password";


	// constructors
	public BaseCustomers () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCustomers (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCustomers (
		java.lang.Integer id,
		java.lang.String customerName,
		java.lang.String customerEmail,
		java.lang.String password) {

		this.setId(id);
		this.setCustomerName(customerName);
		this.setCustomerEmail(customerEmail);
		this.setPassword(password);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String customerName;
	private java.lang.String customerEmail;
	private java.lang.String phone;
	private java.lang.String password;
	private java.lang.String address;

	// collections
	private java.util.Set<com.petto.business.entity.Orders> orders;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="customer_id"
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
	 * Return the value associated with the column: customer_name
	 */
	public java.lang.String getCustomerName () {
		return customerName;
	}

	/**
	 * Set the value related to the column: customer_name
	 * @param customerName the customer_name value
	 */
	public void setCustomerName (java.lang.String customerName) {
		this.customerName = customerName;
	}



	/**
	 * Return the value associated with the column: customer_email
	 */
	public java.lang.String getCustomerEmail () {
		return customerEmail;
	}

	/**
	 * Set the value related to the column: customer_email
	 * @param customerEmail the customer_email value
	 */
	public void setCustomerEmail (java.lang.String customerEmail) {
		this.customerEmail = customerEmail;
	}



	/**
	 * Return the value associated with the column: phone
	 */
	public java.lang.String getPhone () {
		return phone;
	}

	/**
	 * Set the value related to the column: phone
	 * @param phone the phone value
	 */
	public void setPhone (java.lang.String phone) {
		this.phone = phone;
	}



	/**
	 * Return the value associated with the column: password
	 */
	public java.lang.String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: password
	 * @param password the password value
	 */
	public void setPassword (java.lang.String password) {
		this.password = password;
	}



	/**
	 * Return the value associated with the column: address
	 */
	public java.lang.String getAddress () {
		return address;
	}

	/**
	 * Set the value related to the column: address
	 * @param address the address value
	 */
	public void setAddress (java.lang.String address) {
		this.address = address;
	}



	/**
	 * Return the value associated with the column: orders
	 */
	public java.util.Set<com.petto.business.entity.Orders> getOrders () {
		return orders;
	}

	/**
	 * Set the value related to the column: orders
	 * @param orders the orders value
	 */
	public void setOrders (java.util.Set<com.petto.business.entity.Orders> orders) {
		this.orders = orders;
	}

	public void addToorders (com.petto.business.entity.Orders orders) {
		if (null == getOrders()) setOrders(new java.util.TreeSet<com.petto.business.entity.Orders>());
		getOrders().add(orders);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.petto.business.entity.Customers)) return false;
		else {
			com.petto.business.entity.Customers customers = (com.petto.business.entity.Customers) obj;
			if (null == this.getId() || null == customers.getId()) return false;
			else return (this.getId().equals(customers.getId()));
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