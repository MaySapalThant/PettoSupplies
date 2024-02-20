package com.petto.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the categories table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="categories"
 */

public abstract class BaseCategories  implements Serializable {

	public static String REF = "Categories";
	public static String PROP_CATEGORY_NAME = "categoryName";
	public static String PROP_ID = "id";
	public static String PROP_PET = "pet";


	// constructors
	public BaseCategories () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCategories (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCategories (
		java.lang.Integer id,
		com.petto.business.entity.Pets pet,
		java.lang.String categoryName) {

		this.setId(id);
		this.setPet(pet);
		this.setCategoryName(categoryName);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String categoryName;

	// many to one
	private com.petto.business.entity.Pets pet;

	// collections
	private java.util.Set<com.petto.business.entity.Items> items;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="category_id"
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
	 * Return the value associated with the column: category_name
	 */
	public java.lang.String getCategoryName () {
		return categoryName;
	}

	/**
	 * Set the value related to the column: category_name
	 * @param categoryName the category_name value
	 */
	public void setCategoryName (java.lang.String categoryName) {
		this.categoryName = categoryName;
	}



	/**
	 * Return the value associated with the column: pet_id
	 */
	public com.petto.business.entity.Pets getPet () {
		return pet;
	}

	/**
	 * Set the value related to the column: pet_id
	 * @param pet the pet_id value
	 */
	public void setPet (com.petto.business.entity.Pets pet) {
		this.pet = pet;
	}



	/**
	 * Return the value associated with the column: items
	 */
	public java.util.Set<com.petto.business.entity.Items> getItems () {
		return items;
	}

	/**
	 * Set the value related to the column: items
	 * @param items the items value
	 */
	public void setItems (java.util.Set<com.petto.business.entity.Items> items) {
		this.items = items;
	}

	public void addToitems (com.petto.business.entity.Items items) {
		if (null == getItems()) setItems(new java.util.TreeSet<com.petto.business.entity.Items>());
		getItems().add(items);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.petto.business.entity.Categories)) return false;
		else {
			com.petto.business.entity.Categories categories = (com.petto.business.entity.Categories) obj;
			if (null == this.getId() || null == categories.getId()) return false;
			else return (this.getId().equals(categories.getId()));
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