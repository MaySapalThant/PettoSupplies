package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.petto.business.service.AdminService;
import com.petto.presentation.form.AdminForm;
import com.petto.presentation.form.CustomerForm;

public class AdminChangePasswordAction extends BaseAction {

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
		if (request.getParameter("btnChangePassword") != null) {		//if user change password
			ActionErrors errors=new ActionErrors();
			
			int flag = 0;
			
			//checking current password 
			if(!myForm.getFrmUpdateCurrentPassword().equals(myForm.getLoginAdmin().getAdminPassword())){ 
				
				errors.add("currentPasswordError", new ActionMessage("errors.currentPassword"));
				 saveErrors(request,errors);
				 flag=1;
			}
			
			//checking new password and confirm password are match or not
			if (!myForm.getFrmUpdateNewPassword().equals(myForm.getFrmUpdateConfirmPassword())) {		
					
				errors.add("passwordError", new ActionMessage("errors.matchPassword"));
				saveErrors(request,errors);
				flag=1;
			}

			if(flag == 0){
				myAdminService.saveUpdateAdminPassword(myForm);				//Saving admin new password
				myForm.setChangePasswordAlert("Password changed successfully.");
				//return "gotoCustomerChangePassword";
			}
			return "gotoAdminChangePasswordPage";
			
		}
		return null;
	}
	
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		
		
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLoginPage";
		}
		
		AdminForm myForm = (AdminForm)form;
		
		//loading login customer
		AdminForm loginForm = (AdminForm)request.getSession().getAttribute("AdminLoginFormBean");	
		myForm.setLoginAdmin(loginForm.getLoginAdmin());
		
		//clear catch data of password text fields
		myForm.setFrmUpdateNewPassword(null);
		myForm.setFrmUpdateCurrentPassword(null);
		myForm.setFrmUpdateConfirmPassword(null);
		myForm.setChangePasswordAlert(null);
		return "gotoAdminChangePasswordPage";
	}

}
