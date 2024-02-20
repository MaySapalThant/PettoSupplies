package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.OrderService;
import com.petto.presentation.form.OrderForm;

public class AdminOrderConfirmAction extends BaseAction {

	private OrderService myOrderService;
	
	public OrderService getMyOrderService() {
		return myOrderService;
	}

	public void setMyOrderService(OrderService myOrderService) {
		this.myOrderService = myOrderService;
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
		
		OrderForm myForm = (OrderForm)form;
		myOrderService.confirmOrderById(myForm.getFrmDetailOrderId());		//Confirm customer's valid and paid orders
		myOrderService.loadAllProcessingOrders(myForm);						//Reloading all of processing orders of customers
		myOrderService.loadAllConfirmOrders(myForm);						//Reloading all of confirm orders of customers
		return "gotoAllOrder";
	}

	
	
}
