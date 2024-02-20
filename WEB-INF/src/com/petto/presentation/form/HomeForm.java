package com.petto.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;

public class HomeForm extends ValidatorForm {
	
	//Home loading lists
	List<Pets> petsList;
	List<Categories> categoriesList;
	List<Items> itemsList;
	
	//To Check item qty in cart
	int tempQty;
	
	String frmPetId;
	String frmCategoryId;
	String frmItemId;
	
	//For Latest Items
	List<Items> latestItemList;
	
	
	
	public int getTempQty() {
		return tempQty;
	}
	public void setTempQty(int tempQty) {
		this.tempQty = tempQty;
	}
	public List<Items> getLatestItemList() {
		return latestItemList;
	}
	public void setLatestItemList(List<Items> latestItemList) {
		this.latestItemList = latestItemList;
	}
	public String getFrmPetId() {
		return frmPetId;
	}
	public void setFrmPetId(String frmPetId) {
		this.frmPetId = frmPetId;
	}
	public String getFrmCategoryId() {
		return frmCategoryId;
	}
	public void setFrmCategoryId(String frmCategoryId) {
		this.frmCategoryId = frmCategoryId;
	}
	public String getFrmItemId() {
		return frmItemId;
	}
	public void setFrmItemId(String frmItemId) {
		this.frmItemId = frmItemId;
	}
	public List<Pets> getPetsList() {
		return petsList;
	}
	public void setPetsList(List<Pets> petsList) {
		this.petsList = petsList;
	}
	public List<Categories> getCategoriesList() {
		return categoriesList;
	}
	public void setCategoriesList(List<Categories> categoriesList) {
		this.categoriesList = categoriesList;
	}
	public List<Items> getItemsList() {
		return itemsList;
	}
	public void setItemsList(List<Items> itemsList) {
		this.itemsList = itemsList;
	}
}
