package com.petto.presentation.form;

import java.util.List;


import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Pets;


public class AdminCategoryForm extends ValidatorForm {
	//All Categories
	List<Categories> categoriesList;
	
	//Edit Category
	int frmCategoryId;
	Categories category;
	
	//Add Category
	String frmCategoryName;
	String alert;
	List<Pets> frmPetsList;
	String frmPetId;
	String frmPetName;
	
	//Category delete error
	String deleteError;
	
	public String getDeleteError() {
		return deleteError;
	}
	public void setDeleteError(String deleteError) {
		this.deleteError = deleteError;
	}
	public List<Categories> getCategoriesList() {
		return categoriesList;
	}
	public void setCategoriesList(List<Categories> categoriesList) {
		this.categoriesList = categoriesList;
	}
	public int getFrmCategoryId() {
		return frmCategoryId;
	}
	public void setFrmCategoryId(int frmCategoryId) {
		this.frmCategoryId = frmCategoryId;
	}
	public Categories getCategory() {
		return category;
	}
	public void setCategory(Categories category) {
		this.category = category;
	}
	public String getFrmCategoryName() {
		return frmCategoryName;
	}
	public void setFrmCategoryName(String frmCategoryName) {
		this.frmCategoryName = frmCategoryName;
	}
	public String getAlert() {
		return alert;
	}
	public void setAlert(String alert) {
		this.alert = alert;
	}
	public List<Pets> getFrmPetsList() {
		return frmPetsList;
	}
	public void setFrmPetsList(List<Pets> frmPetsList) {
		this.frmPetsList = frmPetsList;
	}
	public String getFrmPetId() {
		return frmPetId;
	}
	public void setFrmPetId(String frmPetId) {
		this.frmPetId = frmPetId;
	}
	public String getFrmPetName() {
		return frmPetName;
	}
	public void setFrmPetName(String frmPetName) {
		this.frmPetName = frmPetName;
	}
	
}
