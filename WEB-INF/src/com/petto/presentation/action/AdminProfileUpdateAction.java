package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.AdminService;
import com.petto.presentation.form.AdminForm;
import com.petto.presentation.form.CustomerForm;

public class AdminProfileUpdateAction extends BaseAction {
	
	private AdminService myAdminService;
	
	public AdminService getMyAdminService() {
		return myAdminService;
	}

	public void setMyAdminService(AdminService myAdminService) {
		this.myAdminService = myAdminService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLoginPage";
		}
		
		AdminForm myForm = (AdminForm)form;
		
		if (request.getParameter("btnUpdate") != null) {		//admin profile update
			ActionErrors errors = new ActionErrors();
				
			myAdminService.saveUpdateAdmin(myForm);			//saving updated admin data
			//myForm.setUpdateAlert("Profile Successfully Updated!");
			return "gotoAdminProfilePage";
			
		}
		return null;
	}
	
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLoginPage";
		}
		
		AdminForm myForm = (AdminForm)form;
		AdminForm loginForm = (AdminForm)request.getSession().getAttribute("AdminLoginFormBean"); //getting login customer form session
		myForm.setLoginAdmin(loginForm.getLoginAdmin());
		myAdminService.firstLoadUpdateProfile(myForm);			//first load before update profile
		return "gotoAdminProfilePage";

	}

}
