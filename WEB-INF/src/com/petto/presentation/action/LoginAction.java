package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.petto.business.service.CustomerService;
import com.petto.presentation.form.CustomerForm;

public class LoginAction extends BaseAction {

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
		
		    //System.out.println("Ih login action Execute");
			CustomerForm myForm=(CustomerForm)form;
			
			
			myCustomerService.checkLoginCustomer(myForm);	//Checking login data are correct, customer exists or not

			   ActionErrors errors=new ActionErrors();
			   if(myForm.getLoginCustomer()==null)			//if customer doesn't exist
			   {
				   errors.add("loginerror", new ActionMessage("errors.login"));
				   saveErrors(request,errors);
				   //System.out.println("LoginError");
				   return "gotoLoginPage";
			   }
			   else
			   {
				   //System.out.println(myForm.getLoginCustomer().getCustomerName());
				   request.getSession(true);
				   request.getSession().setAttribute("userId", request.getSession().getId()); //saving customer id to session
				   
				
				   //Checking where to go after login
				   if(myForm.getToWhere() == "0"){
					   return "gotoCheckout";
				   }
				   else{
					   return "gotoIndex";
				   }
				   
			   }
						
	}


	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		
//		HttpSession session = request.getSession(false);
//		if (session.getAttribute("userId") == null) {
//			System.out.println("Ih login action init");
//			return "gotoLoginPage";
//		}
		//return "gotoProfilePage";
		return "gotoLoginPage";
	}
	
	

}
