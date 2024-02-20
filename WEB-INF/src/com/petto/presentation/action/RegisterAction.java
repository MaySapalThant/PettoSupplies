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
import com.petto.presentation.form.AdminCategoryForm;
import com.petto.presentation.form.CustomerForm;

public class RegisterAction extends BaseAction {

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
		
		if(isCancelled(request))
		{
			return "gotoLoginPage";
		}
		
		if (request.getParameter("btnRegister") != null) {		//register new customer
			
			CustomerForm myForm = (CustomerForm)form;	
			
			
			ActionErrors errors = new ActionErrors();
			
			if (!myForm.getFrmRegPassword().equals(myForm.getFrmRegConfirmPassword())) {  //checking password and confirm password are match or not
				
				errors.add("matchPassword", new ActionMessage("errors.matchPassword"));
				saveErrors(request, errors);
				//System.out.println("Password na ku ma tu buu naw!");
				return "gotoRegisterPage";
				
			}
			
			
				Customers customer = myCustomerService.checkEmail(myForm.getFrmRegEmail());		//checking email is already exist or not in database
				//System.out.println("Email tu tae customer" + customer);
				if (customer != null) {			//if customer exists, can't use that mail again
					errors.add("emailError", new ActionMessage("errors.emailError"));
					saveErrors(request, errors);
					//System.out.println("Shi tal");
					return "gotoRegisterPage";
				}
			
		
			myCustomerService.saveNewCustomer(myForm);				//saving new customer
			//myForm.setUpdateAlert(" is successfully Added!");
			return "gotoLoginPage";
			
		}
		
		
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		return "gotoRegisterPage";
	}
	
	

}
