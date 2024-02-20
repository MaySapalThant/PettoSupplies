package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.OrderService;
import com.petto.presentation.form.CartItemForm;
import com.petto.presentation.form.OrderForm;

public class CustomerOrderDetailAction extends BaseAction {

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

		OrderForm myForm = (OrderForm)form;
		myOrderService.loadOrderById(myForm);				//Load order by order id
		
//		for(CartItemForm ci : myForm.getFrmDetailCartItemList()){
//			System.out.println(ci.getCartItem().getItemImage());
//		}
		return "gotoCustomerOrderDetail";
	}
	
	

}
