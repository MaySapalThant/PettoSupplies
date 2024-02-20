package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.CustomerService;
import com.petto.business.service.ItemService;
import com.petto.business.service.OrderService;
import com.petto.presentation.form.AdminForm;

public class AdminDashboardAction extends BaseAction {

	
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
		
		AdminForm myForm=(AdminForm)form;
		myOrderService.gettingTotalSale(myForm);
		myOrderService.gettingTotalOrder(myForm);
		myOrderService.gettingTotalPendingOrder(myForm);
		myOrderService.gettingTotalConfirmOrder(myForm);
		myOrderService.loadAllProcessingOrdersDashboard(myForm);	
		myItemService.gettingTotalProduct(myForm);
		myCustomerService.gettingTotalUser(myForm);
		
		return "gotoAdminDeshboard";
	}
	
	

}
