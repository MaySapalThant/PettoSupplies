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

public class ProfileUpdateAction extends BaseAction {

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
		
		if (request.getParameter("btnUpdate") != null) {		//customer profile update
			ActionErrors errors = new ActionErrors();
			
//			Customers customer = myCustomerService.checkEmail(myForm.getFrmUpdateEmail());
//			System.out.println("Email tu tae customer" + customer);
//			if (customer != null) {
//				errors.add("accountError", new ActionMessage("errors.account"));
//				saveErrors(request, errors);
//				System.out.println("Shi tal");
//			}
				
			myCustomerService.saveUpdateCustomer(myForm);			//saving updated customer data
			//myForm.setUpdateAlert("Profile Successfully Updated!");
			return "gotoIndex";
			
		}
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(false);
		if (session.getAttribute("userId") == null) {
			return "gotoLoginPage";
		}
		
		CustomerForm myForm = (CustomerForm)form;
		CustomerForm loginForm = (CustomerForm)request.getSession().getAttribute("LoginFormBean"); //getting login customer form session
		myForm.setLoginCustomer(loginForm.getLoginCustomer());
		myCustomerService.firstLoadUpdateProfile(myForm);			//first load before update profile
		//System.out.println(myForm.getLoginCustomer().getPhone());
		return "gotoProfilePage";

	}

	
}
