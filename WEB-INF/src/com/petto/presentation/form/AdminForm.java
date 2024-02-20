package com.petto.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Admins;
import com.petto.business.entity.Orders;

public class AdminForm extends ValidatorForm {
	
	//Admin Login Data
	private String frmAdminEmail;
	private String frmAdminPassword;
	private String frmAdminName;
	
	//Login Admin
	private Admins loginAdmin;
	
	//Update Admin
	private String frmUpdateAdminName;
	private String frmUpdateAdminEmail;

	//Change Password Path
	private String frmUpdateNewPassword;
	private String frmUpdateCurrentPassword;
	private String frmUpdateConfirmPassword;
	private String changePasswordAlert;
	
	
	//Admin Dashboard
	private int frmTotalSale;
	private Long frmTotalOrder;
	private int frmTotalProduct;
	private Long frmTotalUser;
	private Long frmTotalPendingOrder;
	private Long frmTotalConfirmOrder;
	
	private List<Orders> orderProcessingList;
	
	public List<Orders> getOrderProcessingList() {
		return orderProcessingList;
	}
	public void setOrderProcessingList(List<Orders> orderProcessingList) {
		this.orderProcessingList = orderProcessingList;
	}
	public Long getFrmTotalPendingOrder() {
		return frmTotalPendingOrder;
	}
	public void setFrmTotalPendingOrder(Long frmTotalPendingOrder) {
		this.frmTotalPendingOrder = frmTotalPendingOrder;
	}
	public Long getFrmTotalConfirmOrder() {
		return frmTotalConfirmOrder;
	}
	public void setFrmTotalConfirmOrder(Long frmTotalConfirmOrder) {
		this.frmTotalConfirmOrder = frmTotalConfirmOrder;
	}
	public Long getFrmTotalUser() {
		return frmTotalUser;
	}
	public void setFrmTotalUser(Long frmTotalUser) {
		this.frmTotalUser = frmTotalUser;
	}
	public int getFrmTotalSale() {
		return frmTotalSale;
	}
	public void setFrmTotalSale(int frmTotalSale) {
		this.frmTotalSale = frmTotalSale;
	}
	
	public Long getFrmTotalOrder() {
		return frmTotalOrder;
	}
	public void setFrmTotalOrder(Long frmTotalOrder) {
		this.frmTotalOrder = frmTotalOrder;
	}
	public int getFrmTotalProduct() {
		return frmTotalProduct;
	}
	public void setFrmTotalProduct(int frmTotalProduct) {
		this.frmTotalProduct = frmTotalProduct;
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
	public String getChangePasswordAlert() {
		return changePasswordAlert;
	}
	public void setChangePasswordAlert(String changePasswordAlert) {
		this.changePasswordAlert = changePasswordAlert;
	}
	public String getFrmUpdateAdminName() {
		return frmUpdateAdminName;
	}
	public void setFrmUpdateAdminName(String frmUpdateAdminName) {
		this.frmUpdateAdminName = frmUpdateAdminName;
	}
	public String getFrmUpdateAdminEmail() {
		return frmUpdateAdminEmail;
	}
	public void setFrmUpdateAdminEmail(String frmUpdateAdminEmail) {
		this.frmUpdateAdminEmail = frmUpdateAdminEmail;
	}
	public Admins getLoginAdmin() {
		return loginAdmin;
	}
	public void setLoginAdmin(Admins loginAdmin) {
		this.loginAdmin = loginAdmin;
	}
	public String getFrmAdminEmail() {
		return frmAdminEmail;
	}
	public void setFrmAdminEmail(String frmAdminEmail) {
		this.frmAdminEmail = frmAdminEmail;
	}
	public String getFrmAdminPassword() {
		return frmAdminPassword;
	}
	public void setFrmAdminPassword(String frmAdminPassword) {
		this.frmAdminPassword = frmAdminPassword;
	}
	public String getFrmAdminName() {
		return frmAdminName;
	}
	public void setFrmAdminName(String frmAdminName) {
		this.frmAdminName = frmAdminName;
	}
	
	
}
