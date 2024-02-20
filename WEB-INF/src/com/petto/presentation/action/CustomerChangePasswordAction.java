package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.petto.business.entity.Customers;
import com.petto.business.service.CustomerService;
import com.petto.presentation.form.CustomerForm;

public class CustomerChangePasswordAction extends BaseAction {
	
	private CustomerService myCustomerService;
	
	public CustomerService getMyCustomerService() {
		return myCustomerService;
	}

	public void setMyCustomerService(CustomerService myCustomerService) {
		this.myCustomerService = myCustomerService;
	}
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		
		
		HttpSession session = request.getSession(false);
		if (session.getAttribute("userId") == null) {
			return "gotoLoginPage";
		}
		
		CustomerForm myForm = (CustomerForm)form;
		if (request.getParameter("btnChangePassword") != null) {		//if user change password
			ActionErrors errors=new ActionErrors();
			
			int flag = 0;
			
			//checking current password 
			if(!myForm.getFrmUpdateCurrentPassword().equals(myForm.getLoginCustomer().getPassword())){ 
				//System.out.println("Current Password Wrong");
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
				myCustomerService.saveUpdateCustomerPassword(myForm);				//Saving customer new password
				myForm.setChangePasswordAlert("Password changed successfully.");
				//return "gotoCustomerChangePassword";
			}
			return "gotoCustomerChangePassword";
			
		}
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		
		
		HttpSession session = request.getSession(false);
		if (session.getAttribute("userId") == null) {
			return "gotoLoginPage";
		}
		
		CustomerForm myForm = (CustomerForm)form;
		
		//loading login customer
		CustomerForm loginForm = (CustomerForm)request.getSession().getAttribute("LoginFormBean");	
		myForm.setLoginCustomer(loginForm.getLoginCustomer());
		
		//clear catch data of password text fields
		myForm.setFrmUpdateNewPassword(null);
		myForm.setFrmUpdateCurrentPassword(null);
		myForm.setFrmUpdateConfirmPassword(null);
		myForm.setChangePasswordAlert(null);
		return "gotoCustomerChangePassword";
	}
	
	

}
