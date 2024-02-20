package com.petto.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Customers;
import com.petto.business.entity.Pets;

public class CustomerForm extends ValidatorForm {
	//Header DropDown
	List<Pets> petsList;
	List<Categories> categoriesList;
	
	//Login Path
	private String frmLoginEmail;
	private String frmLoginPassword;
	Customers loginCustomer;
	
	//Register Path
	private String frmRegName;
	private String frmRegEmail;
	private String frmRegPassword;
	private String frmRegConfirmPassword;
	private String frmRegPhone;
	private String frmRegAddress;
	
	//Check where to go after login: profile page or checkout form
	private String toWhere;
	
	//Update Path
	private String frmUpdateName;
	private String frmUpdateEmail;
	private String frmUpdatePhone;
	private String frmUpdateAddress;
	private String updateAlert;
	private String frmUpdateId;
	
	public String getFrmUpdateId() {
		return frmUpdateId;
	}
	public void setFrmUpdateId(String frmUpdateId) {
		this.frmUpdateId = frmUpdateId;
	}
	//Change Password Path
	private String frmUpdateNewPassword;
	private String frmUpdateCurrentPassword;
	private String frmUpdateConfirmPassword;
	private String changePasswordAlert;
	
	public String getChangePasswordAlert() {
		return changePasswordAlert;
	}
	public void setChangePasswordAlert(String changePasswordAlert) {
		this.changePasswordAlert = changePasswordAlert;
	}
	public String getFrmUpdateNewPassword() {
		return frmUpdateNewPassword;
	}
	public void setFrmUpdateNewPassword(String frmUpdateNewPassword) {
		this.frmUpdateNewPassword = frmUpdateNewPassword;
	}
	public String getFrmUpdateCurrentPassword() {
		return frmUpdateCurrentPassword;
	}
	public void setFrmUpdateCurrentPassword(String frmUpdateCurrentPassword) {
		this.frmUpdateCurrentPassword = frmUpdateCurrentPassword;
	}
	public String getFrmUpdateConfirmPassword() {
		return frmUpdateConfirmPassword;
	}
	public void setFrmUpdateConfirmPassword(String frmUpdateConfirmPassword) {
		this.frmUpdateConfirmPassword = frmUpdateConfirmPassword;
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
	public String getUpdateAlert() {
		return updateAlert;
	}
	public void setUpdateAlert(String updateAlert) {
		this.updateAlert = updateAlert;
	}
	public String getFrmUpdateName() {
		return frmUpdateName;
	}
	public void setFrmUpdateName(String frmUpdateName) {
		this.frmUpdateName = frmUpdateName;
	}
	public String getFrmUpdateEmail() {
		return frmUpdateEmail;
	}
	public void setFrmUpdateEmail(String frmUpdateEmail) {
		this.frmUpdateEmail = frmUpdateEmail;
	}
	public String getFrmUpdatePhone() {
		return frmUpdatePhone;
	}
	public void setFrmUpdatePhone(String frmUpdatePhone) {
		this.frmUpdatePhone = frmUpdatePhone;
	}
	public String getFrmUpdateAddress() {
		return frmUpdateAddress;
	}
	public void setFrmUpdateAddress(String frmUpdateAddress) {
		this.frmUpdateAddress = frmUpdateAddress;
	}
	public String getToWhere() {
		return toWhere;
	}
	public void setToWhere(String toWhere) {
		this.toWhere = toWhere;
	}
	public String getFrmRegName() {
		return frmRegName;
	}
	public void setFrmRegName(String frmRegName) {
		this.frmRegName = frmRegName;
	}
	public String getFrmRegEmail() {
		return frmRegEmail;
	}
	public void setFrmRegEmail(String frmRegEmail) {
		this.frmRegEmail = frmRegEmail;
	}
	public String getFrmRegPassword() {
		return frmRegPassword;
	}
	public void setFrmRegPassword(String frmRegPassword) {
		this.frmRegPassword = frmRegPassword;
	}
	public String getFrmRegConfirmPassword() {
		return frmRegConfirmPassword;
	}
	public void setFrmRegConfirmPassword(String frmRegConfirmPassword) {
		this.frmRegConfirmPassword = frmRegConfirmPassword;
	}
	public String getFrmRegPhone() {
		return frmRegPhone;
	}
	public void setFrmRegPhone(String frmRegPhone) {
		this.frmRegPhone = frmRegPhone;
	}
	public String getFrmRegAddress() {
		return frmRegAddress;
	}
	public void setFrmRegAddress(String frmRegAddress) {
		this.frmRegAddress = frmRegAddress;
	}
	public Customers getLoginCustomer() {
		return loginCustomer;
	}
	public void setLoginCustomer(Customers loginCustomer) {
		this.loginCustomer = loginCustomer;
	}
	public String getFrmLoginEmail() {
		return frmLoginEmail;
	}
	public void setFrmLoginEmail(String frmLoginEmail) {
		this.frmLoginEmail = frmLoginEmail;
	}
	public String getFrmLoginPassword() {
		return frmLoginPassword;
	}
	public void setFrmLoginPassword(String frmLoginPassword) {
		this.frmLoginPassword = frmLoginPassword;
	}
	
	
	
	
}
