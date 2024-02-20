package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.petto.business.service.AdminService;
import com.petto.business.service.CustomerService;
import com.petto.business.service.ItemService;
import com.petto.business.service.OrderService;
import com.petto.presentation.form.AdminForm;
import com.petto.presentation.form.CustomerForm;

public class AdminLoginAction extends BaseAction {

	private AdminService myAdminService;	
	private ItemService myItemService;
	private OrderService myOrderService;
	private CustomerService myCustomerService;
	
	public ItemService getMyItemService() {
		return myItemService;
	}

	public void setMyItemService(ItemService myItemService) {
		this.myItemService = myItemService;
	}

	public OrderService getMyOrderService() {
		return myOrderService;
	}

	public void setMyOrderService(OrderService myOrderService) {
		this.myOrderService = myOrderService;
	}

	public CustomerService getMyCustomerService() {
		return myCustomerService;
	}

	public void setMyCustomerService(CustomerService myCustomerService) {
		this.myCustomerService = myCustomerService;
	}

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
		//System.out.println("Ih login action Execute");
		AdminForm myForm=(AdminForm)form;
		myOrderService.gettingTotalSale(myForm);
		myOrderService.gettingTotalOrder(myForm);
		myOrderService.gettingTotalPendingOrder(myForm);
		myOrderService.gettingTotalConfirmOrder(myForm);
		myOrderService.loadAllProcessingOrdersDashboard(myForm);
		myItemService.gettingTotalProduct(myForm);
		myCustomerService.gettingTotalUser(myForm);
		
		
		
		//System.out.println(myForm.getFrmAdminEmail()+" pw "+myForm.getFrmAdminPassword());
		myAdminService.checkLoginAdmin(myForm);

		   ActionErrors errors=new ActionErrors();
		   if(myForm.getLoginAdmin()==null)				//Login data is wrong, there is no such customer
		   {
			   errors.add("loginerror", new ActionMessage("errors.login"));
			   saveErrors(request,errors);
			   //System.out.println("AdminLoginError");
			   return "gotoAdminLoginPage";
		   }
		   else
		   {
			   //System.out.println(myForm.getLoginAdmin().getAdminName());
			   request.getSession(true);
			   request.getSession().setAttribute("adminId", request.getSession().getId());		//Saving login user id to session
			   	
			  
			   return "gotoAdminDeshboard";
		   }
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		return "gotoAdminDeshboard";
	}
	
	

}
