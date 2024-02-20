package com.petto.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the orderdetail table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="orderdetail"
 */

public abstract class BaseOrderdetail  implements Serializable {

	public static String REF = "Orderdetail";
	public static String PROP_ORDER = "order";
	public static String PROP_ITEM = "item";
	public static String PROP_QTY = "qty";
	public static String PROP_ID = "id";


	// constructors
	public BaseOrderdetail () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseOrderdetail (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseOrderdetail (
		java.lang.Integer id,
		com.petto.business.entity.Items item,
		com.petto.business.entity.Orders order,
		java.lang.Integer qty) {

		this.setId(id);
		this.setItem(item);
		this.setOrder(order);
		this.setQty(qty);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.Integer qty;

	// many to one
	private com.petto.business.entity.Items item;
	private com.petto.business.entity.Orders order;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="order_detail_id"
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
	 * Return the value associated with the column: qty
	 */
	public java.lang.Integer getQty () {
		return qty;
	}

	/**
	 * Set the value related to the column: qty
	 * @param qty the qty value
	 */
	public void setQty (java.lang.Integer qty) {
		this.qty = qty;
	}



	/**
	 * Return the value associated with the column: item_id
	 */
	public com.petto.business.entity.Items getItem () {
		return item;
	}

	/**
	 * Set the value related to the column: item_id
	 * @param item the item_id value
	 */
	public void setItem (com.petto.business.entity.Items item) {
		this.item = item;
	}



	/**
	 * Return the value associated with the column: order_id
	 */
	public com.petto.business.entity.Orders getOrder () {
		return order;
	}

	/**
	 * Set the value related to the column: order_id
	 * @param order the order_id value
	 */
	public void setOrder (com.petto.business.entity.Orders order) {
		this.order = order;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.petto.business.entity.Orderdetail)) return false;
		else {
			com.petto.business.entity.Orderdetail orderdetail = (com.petto.business.entity.Orderdetail) obj;
			if (null == this.getId() || null == orderdetail.getId()) return false;
			else return (this.getId().equals(orderdetail.getId()));
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