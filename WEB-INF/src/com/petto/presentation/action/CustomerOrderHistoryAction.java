package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.OrderService;
import com.petto.presentation.form.AdminPetForm;
import com.petto.presentation.form.CustomerForm;
import com.petto.presentation.form.OrderForm;

public class CustomerOrderHistoryAction extends BaseAction {

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
		if (session.getAttribute("userId") == null) {
			return "gotoLoginPage";
		}
		
		//getting login customer from session
		CustomerForm loginForm = (CustomerForm)request.getSession().getAttribute("LoginFormBean");	
		
		OrderForm myForm = (OrderForm)form;
		myOrderService.loadAllLoginCustomerOrders(myForm, loginForm.getLoginCustomer());	//getting orders of login customer
		//System.out.println(myForm.getOrderList());
		return "gotoCustomerOrderHistory";
	}

	
	
}
