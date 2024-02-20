package com.petto.business.service;

import com.petto.business.entity.Admins;
import com.petto.business.entity.Customers;
import com.petto.dao.AdminDao;
import com.petto.presentation.form.AdminForm;
import com.petto.presentation.form.CustomerForm;


public class AdminService {

	private AdminDao myAdminDao;
	
	public AdminDao getMyAdminDao() {
		return myAdminDao;
	}

	public void setMyAdminDao(AdminDao myAdminDao) {
		this.myAdminDao = myAdminDao;
	}

	//Check whether accout exist or not
	public void checkLoginAdmin(AdminForm myForm) {
		Admins myAdmin = myAdminDao
				.getAdminByLoginEmailAndPassword(myForm.getFrmAdminEmail(),
						myForm.getFrmAdminPassword());						//Admin login by email and password
		myForm.setLoginAdmin(myAdmin);
	}
	
	
	//Loading Admin Profile
	public void firstLoadUpdateProfile(AdminForm myForm){
		Admins myAdmin = myForm.getLoginAdmin();
		myForm.setFrmUpdateAdminName(myAdmin.getAdminName());
		myForm.setFrmUpdateAdminEmail(myAdmin.getAdminEmail());
	}
	
	//Save Admin Profile
	public void saveUpdateAdmin(AdminForm myForm){
		Admins myAdmin = myForm.getLoginAdmin();
		myAdmin.setAdminName(myForm.getFrmUpdateAdminName());
		myAdminDao.saveAdmin(myAdmin);
	}
	
	//Update Admin Password
	public void saveUpdateAdminPassword(AdminForm myForm)
	{	
		Admins myAdmin = myForm.getLoginAdmin();
		myAdmin.setAdminPassword(myForm.getFrmUpdateNewPassword());
		myAdminDao.saveAdmin(myAdmin);
	}
	
	
}
