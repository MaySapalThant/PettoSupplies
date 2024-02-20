package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.CustomerService;
import com.petto.presentation.form.AdminCustomerForm;
import com.petto.presentation.form.AdminPetForm;

public class AdminCustomerAction extends BaseAction {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
			
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLoginPage";
		}
		
		AdminCustomerForm myForm = (AdminCustomerForm)form;
		
		myCustomerService.loadAllCustomers(myForm);						//Load all customers data
		return "gotoAllCustomer";
	}
	
	

}
