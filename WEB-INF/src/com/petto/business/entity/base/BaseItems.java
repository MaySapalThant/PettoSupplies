package com.petto.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the items table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="items"
 */

public abstract class BaseItems  implements Serializable {

	public static String REF = "Items";
	public static String PROP_ITEM_IMAGE = "itemImage";
	public static String PROP_UNIT_PRICE = "unitPrice";
	public static String PROP_CART_QTY = "cartQty";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_CATEGORY = "category";
	public static String PROP_ITEM_NAME = "itemName";
	public static String PROP_ID = "id";
	public static String PROP_STOCK = "stock";


	// constructors
	public BaseItems () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseItems (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseItems (
		java.lang.Integer id,
		com.petto.business.entity.Categories category,
		java.lang.String itemName,
		java.lang.Integer unitPrice) {

		this.setId(id);
		this.setCategory(category);
		this.setItemName(itemName);
		this.setUnitPrice(unitPrice);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String itemName;
	private java.lang.String description;
	private java.lang.Integer unitPrice;
	private java.lang.Integer stock;
	private java.lang.Integer cartQty;
	private java.lang.String itemImage;

	// many to one
	private com.petto.business.entity.Categories category;

	// collections
	private java.util.Set<com.petto.business.entity.Orderdetail> orderdetails;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="item_id"
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
	 * Return the value associated with the column: item_name
	 */
	public java.lang.String getItemName () {
		return itemName;
	}

	/**
	 * Set the value related to the column: item_name
	 * @param itemName the item_name value
	 */
	public void setItemName (java.lang.String itemName) {
		this.itemName = itemName;
	}



	/**
	 * Return the value associated with the column: description
	 */
	public java.lang.String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
	 */
	public void setDescription (java.lang.String description) {
		this.description = description;
	}



	/**
	 * Return the value associated with the column: unit_price
	 */
	public java.lang.Integer getUnitPrice () {
		return unitPrice;
	}

	/**
	 * Set the value related to the column: unit_price
	 * @param unitPrice the unit_price value
	 */
	public void setUnitPrice (java.lang.Integer unitPrice) {
		this.unitPrice = unitPrice;
	}



	/**
	 * Return the value associated with the column: stock
	 */
	public java.lang.Integer getStock () {
		return stock;
	}

	/**
	 * Set the value related to the column: stock
	 * @param stock the stock value
	 */
	public void setStock (java.lang.Integer stock) {
		this.stock = stock;
	}



	/**
	 * Return the value associated with the column: cart_qty
	 */
	public java.lang.Integer getCartQty () {
		return cartQty;
	}

	/**
	 * Set the value related to the column: cart_qty
	 * @param cartQty the cart_qty value
	 */
	public void setCartQty (java.lang.Integer cartQty) {
		this.cartQty = cartQty;
	}



	/**
	 * Return the value associated with the column: item_image
	 */
	public java.lang.String getItemImage () {
		return itemImage;
	}

	/**
	 * Set the value related to the column: item_image
	 * @param itemImage the item_image value
	 */
	public void setItemImage (java.lang.String itemImage) {
		this.itemImage = itemImage;
	}



	/**
	 * Return the value associated with the column: category_id
	 */
	public com.petto.business.entity.Categories getCategory () {
		return category;
	}

	/**
	 * Set the value related to the column: category_id
	 * @param category the category_id value
	 */
	public void setCategory (com.petto.business.entity.Categories category) {
		this.category = category;
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

	public void addToorderdetails (com.petto.business.entity.Orderdetail orderdetail) {
		if (null == getOrderdetails()) setOrderdetails(new java.util.TreeSet<com.petto.business.entity.Orderdetail>());
		getOrderdetails().add(orderdetail);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.petto.business.entity.Items)) return false;
		else {
			com.petto.business.entity.Items items = (com.petto.business.entity.Items) obj;
			if (null == this.getId() || null == items.getId()) return false;
			else return (this.getId().equals(items.getId()));
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