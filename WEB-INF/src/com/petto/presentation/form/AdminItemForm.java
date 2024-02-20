package com.petto.presentation.form;

import java.util.List;

import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;

public class AdminItemForm extends ValidatorForm {

	//All Pet
	List<Items> itemsList;
	
	//Editing Pet
	int frmItemId;
	Items item;
	
	//Adding Pet
	FormFile frmItemImg;
	String frmItemName;
	String frmItemImgPath;
	String frmItemStock;
	String frmItemUnitPrice;
	String frmDescription;
	List<Categories> frmCategoriesList;
	String frmCategoryId;
	String frmCategoryName;
	String alert;
	
	
	public String getFrmItemStock() {
		return frmItemStock;
	}
	public void setFrmItemStock(String frmItemStock) {
		this.frmItemStock = frmItemStock;
	}
	public List<Items> getItemsList() {
		return itemsList;
	}
	public void setItemsList(List<Items> itemsList) {
		this.itemsList = itemsList;
	}
	public int getFrmItemId() {
		return frmItemId;
	}
	public void setFrmItemId(int frmItemId) {
		this.frmItemId = frmItemId;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public FormFile getFrmItemImg() {
		return frmItemImg;
	}
	public void setFrmItemImg(FormFile frmItemImg) {
		this.frmItemImg = frmItemImg;
	}
	public String getFrmItemName() {
		return frmItemName;
	}
	public void setFrmItemName(String frmItemName) {
		this.frmItemName = frmItemName;
	}
	public String getFrmItemImgPath() {
		return frmItemImgPath;
	}
	public void setFrmItemImgPath(String frmItemImgPath) {
		this.frmItemImgPath = frmItemImgPath;
	}
	public String getFrmItemUnitPrice() {
		return frmItemUnitPrice;
	}
	public void setFrmItemUnitPrice(String frmItemUnitPrice) {
		this.frmItemUnitPrice = frmItemUnitPrice;
	}
	public String getFrmDescription() {
		return frmDescription;
	}
	public void setFrmDescription(String frmDescription) {
		this.frmDescription = frmDescription;
	}

	public List<Categories> getFrmCategoriesList() {
		return frmCategoriesList;
	}
	public void setFrmCategoriesList(List<Categories> frmCategoriesList) {
		this.frmCategoriesList = frmCategoriesList;
	}
	public String getFrmCategoryId() {
		return frmCategoryId;
	}
	public void setFrmCategoryId(String frmCategoryId) {
		this.frmCategoryId = frmCategoryId;
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
	
	
}
