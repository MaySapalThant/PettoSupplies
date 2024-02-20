package com.petto.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;

public class PetPageForm extends ValidatorForm {
	
	//Loading lists
	List<Pets> petsList;
	List<Categories> categoriesList;
	List<Items> itemsList;
	
	//For search
	String frmSearchKey;
	String searchKey;
	
	List<Items> searchList;
	
	List<Categories> subCategoriesList;
	List<Items> subItemsListByPet;
	List<Items> SubItemsListByCategory;
	
	String frmPetId;
	String frmCategoryId;
	String frmSubCategoryId;
	String frmItemId;
	int frmItemQty;
	
	
	public List<Items> getSearchList() {
		return searchList;
	}
	public void setSearchList(List<Items> searchList) {
		this.searchList = searchList;
	}
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public String getFrmSearchKey() {
		return frmSearchKey;
	}
	public void setFrmSearchKey(String frmSearchKey) {
		this.frmSearchKey = frmSearchKey;
	}
	public int getFrmItemQty() {
		return frmItemQty;
	}
	public void setFrmItemQty(int frmItemQty) {
		this.frmItemQty = frmItemQty;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	Items item;

	public List<Items> getSubItemsListByPet() {
		return subItemsListByPet;
	}
	public void setSubItemsListByPet(List<Items> subItemsListByPet) {
		this.subItemsListByPet = subItemsListByPet;
	}
	public List<Items> getSubItemsListByCategory() {
		return SubItemsListByCategory;
	}
	public void setSubItemsListByCategory(List<Items> subItemsListByCategory) {
		SubItemsListByCategory = subItemsListByCategory;
	}
	public Categories getCategory() {
		return category;
	}
	public void setCategory(Categories category) {
		this.category = category;
	}
	
	Pets pet;
	Categories category;
	
	public Pets getPet() {
		return pet;
	}
	public void setPet(Pets pet) {
		this.pet = pet;
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
	public List<Categories> getSubCategoriesList() {
		return subCategoriesList;
	}
	public void setSubCategoriesList(List<Categories> subCategoriesList) {
		this.subCategoriesList = subCategoriesList;
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
	public String getFrmSubCategoryId() {
		return frmSubCategoryId;
	}
	public void setFrmSubCategoryId(String frmSubCategoryId) {
		this.frmSubCategoryId = frmSubCategoryId;
	}
	public String getFrmItemId() {
		return frmItemId;
	}
	public void setFrmItemId(String frmItemId) {
		this.frmItemId = frmItemId;
	}
	
}
