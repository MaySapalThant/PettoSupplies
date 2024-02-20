package com.petto.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the pets table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="pets"
 */

public abstract class BasePets  implements Serializable {

	public static String REF = "Pets";
	public static String PROP_PET_IMAGE = "petImage";
	public static String PROP_PET_NAME = "petName";
	public static String PROP_ID = "id";


	// constructors
	public BasePets () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePets (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BasePets (
		java.lang.Integer id,
		java.lang.String petName) {

		this.setId(id);
		this.setPetName(petName);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String petName;
	private java.lang.String petImage;

	// collections
	private java.util.Set<com.petto.business.entity.Categories> categories;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="pet_id"
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
	 * Return the value associated with the column: pet_name
	 */
	public java.lang.String getPetName () {
		return petName;
	}

	/**
	 * Set the value related to the column: pet_name
	 * @param petName the pet_name value
	 */
	public void setPetName (java.lang.String petName) {
		this.petName = petName;
	}



	/**
	 * Return the value associated with the column: pet_image
	 */
	public java.lang.String getPetImage () {
		return petImage;
	}

	/**
	 * Set the value related to the column: pet_image
	 * @param petImage the pet_image value
	 */
	public void setPetImage (java.lang.String petImage) {
		this.petImage = petImage;
	}



	/**
	 * Return the value associated with the column: categories
	 */
	public java.util.Set<com.petto.business.entity.Categories> getCategories () {
		return categories;
	}

	/**
	 * Set the value related to the column: categories
	 * @param categories the categories value
	 */
	public void setCategories (java.util.Set<com.petto.business.entity.Categories> categories) {
		this.categories = categories;
	}

	public void addTocategories (com.petto.business.entity.Categories categories) {
		if (null == getCategories()) setCategories(new java.util.TreeSet<com.petto.business.entity.Categories>());
		getCategories().add(categories);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.petto.business.entity.Pets)) return false;
		else {
			com.petto.business.entity.Pets pets = (com.petto.business.entity.Pets) obj;
			if (null == this.getId() || null == pets.getId()) return false;
			else return (this.getId().equals(pets.getId()));
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