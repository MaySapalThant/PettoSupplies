package com.petto.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the orders table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="orders"
 */

public abstract class BaseOrders  implements Serializable {

	public static String REF = "Orders";
	public static String PROP_STATUS = "status";
	public static String PROP_RECEIVER_ADDRESS = "receiverAddress";
	public static String PROP_TOTAL_QTY = "totalQty";
	public static String PROP_RECEIVER_PHONE = "receiverPhone";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_TOTAL_PRICE = "totalPrice";
	public static String PROP_PAYMENT_TYPE = "paymentType";
	public static String PROP_ID = "id";
	public static String PROP_RECEIVER_NAME = "receiverName";
	public static String PROP_REMARK = "remark";
	public static String PROP_ORDER_DATE = "orderDate";


	// constructors
	public BaseOrders () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseOrders (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseOrders (
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

		this.setId(id);
		this.setCustomer(customer);
		this.setTotalQty(totalQty);
		this.setTotalPrice(totalPrice);
		this.setPaymentType(paymentType);
		this.setStatus(status);
		this.setOrderDate(orderDate);
		this.setReceiverName(receiverName);
		this.setReceiverPhone(receiverPhone);
		this.setReceiverAddress(receiverAddress);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.Integer totalQty;
	private java.lang.Integer totalPrice;
	private java.lang.String paymentType;
	private java.lang.String remark;
	private java.lang.String status;
	private java.util.Date orderDate;
	private java.lang.String receiverName;
	private java.lang.String receiverPhone;
	private java.lang.String receiverAddress;

	// many to one
	private com.petto.business.entity.Customers customer;

	// collections
	private java.util.Set<com.petto.business.entity.Orderdetail> orderdetails;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="order_id"
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
	 * Return the value associated with the column: total_qty
	 */
	public java.lang.Integer getTotalQty () {
		return totalQty;
	}

	/**
	 * Set the value related to the column: total_qty
	 * @param totalQty the total_qty value
	 */
	public void setTotalQty (java.lang.Integer totalQty) {
		this.totalQty = totalQty;
	}



	/**
	 * Return the value associated with the column: total_price
	 */
	public java.lang.Integer getTotalPrice () {
		return totalPrice;
	}

	/**
	 * Set the value related to the column: total_price
	 * @param totalPrice the total_price value
	 */
	public void setTotalPrice (java.lang.Integer totalPrice) {
		this.totalPrice = totalPrice;
	}



	/**
	 * Return the value associated with the column: payment_type
	 */
	public java.lang.String getPaymentType () {
		return paymentType;
	}

	/**
	 * Set the value related to the column: payment_type
	 * @param paymentType the payment_type value
	 */
	public void setPaymentType (java.lang.String paymentType) {
		this.paymentType = paymentType;
	}



	/**
	 * Return the value associated with the column: remark
	 */
	public java.lang.String getRemark () {
		return remark;
	}

	/**
	 * Set the value related to the column: remark
	 * @param remark the remark value
	 */
	public void setRemark (java.lang.String remark) {
		this.remark = remark;
	}



	/**
	 * Return the value associated with the column: status
	 */
	public java.lang.String getStatus () {
		return status;
	}

	/**
	 * Set the value related to the column: status
	 * @param status the status value
	 */
	public void setStatus (java.lang.String status) {
		this.status = status;
	}



	/**
	 * Return the value associated with the column: order_date
	 */
	public java.util.Date getOrderDate () {
		return orderDate;
	}

	/**
	 * Set the value related to the column: order_date
	 * @param orderDate the order_date value
	 */
	public void setOrderDate (java.util.Date orderDate) {
		this.orderDate = orderDate;
	}



	/**
	 * Return the value associated with the column: receiver_name
	 */
	public java.lang.String getReceiverName () {
		return receiverName;
	}

	/**
	 * Set the value related to the column: receiver_name
	 * @param receiverName the receiver_name value
	 */
	public void setReceiverName (java.lang.String receiverName) {
		this.receiverName = receiverName;
	}



	/**
	 * Return the value associated with the column: receiver_phone
	 */
	public java.lang.String getReceiverPhone () {
		return receiverPhone;
	}

	/**
	 * Set the value related to the column: receiver_phone
	 * @param receiverPhone the receiver_phone value
	 */
	public void setReceiverPhone (java.lang.String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}



	/**
	 * Return the value associated with the column: receiver_address
	 */
	public java.lang.String getReceiverAddress () {
		return receiverAddress;
	}

	/**
	 * Set the value related to the column: receiver_address
	 * @param receiverAddress the receiver_address value
	 */
	public void setReceiverAddress (java.lang.String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}



	/**
	 * Return the value associated with the column: customer_id
	 */
	public com.petto.business.entity.Customers getCustomer () {
		return customer;
	}

	/**
	 * Set the value related to the column: customer_id
	 * @param customer the customer_id value
	 */
	public void setCustomer (com.petto.business.entity.Customers customer) {
		this.customer = customer;
	}



	/**
	 * Return the value associated with the column: orderdetails
	 */
	public java.util.Set<com.petto.business.entity.Orderdetail> getOrderdetails () {
		return orderdetails;
	}

	/**
	 * Set the value related to the column: orderdetails
	 * @param orderdetails the orderdetails value
	 */
	public void setOrderdetails (java.util.Set<com.petto.business.entity.Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.petto.business.entity.Orders)) return false;
		else {
			com.petto.business.entity.Orders orders = (com.petto.business.entity.Orders) obj;
			if (null == this.getId() || null == orders.getId()) return false;
			else return (this.getId().equals(orders.getId()));
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