package com.petto.presentation.form;

import java.util.List;


import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Pets;

public class AdminPetForm extends ValidatorForm {
	//All Pet
	List<Pets> petsList;
	
	//Edit Pet
	int frmPetId;
	Pets pet;
	
	//Add Pet
	FormFile frmPetImg;
	String frmPetName;
	String frmPetImgPath;
	String alert;
	
	//Delete Pet Delete error
	String deleteError;

	
	public String getDeleteError() {
		return deleteError;
	}
	public void setDeleteError(String deleteError) {
		this.deleteError = deleteError;
	}
	public String getAlert() {
		return alert;
	}
	public void setAlert(String alert) {
		this.alert = alert;
	}
	public String getFrmPetImgPath() {
		return frmPetImgPath;
	}
	public void setFrmPetImgPath(String frmPetImgPath) {
		this.frmPetImgPath = frmPetImgPath;
	}
	public List<Pets> getPetsList() {
		return petsList;
	}
	public void setPetsList(List<Pets> petsList) {
		this.petsList = petsList;
	}
	public int getFrmPetId() {
		return frmPetId;
	}
	public void setFrmPetId(int frmPetId) {
		this.frmPetId = frmPetId;
	}
	public Pets getPet() {
		return pet;
	}
	public void setPet(Pets pet) {
		this.pet = pet;
	}
	public FormFile getFrmPetImg() {
		return frmPetImg;
	}
	public void setFrmPetImg(FormFile frmPetImg) {
		this.frmPetImg = frmPetImg;
	}
	public String getFrmPetName() {
		return frmPetName;
	}
	public void setFrmPetName(String frmPetName) {
		this.frmPetName = frmPetName;
	}
	
}
