package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.entity.Items;
import com.petto.business.entity.Orders;
import com.petto.business.service.ItemService;
import com.petto.business.service.OrderService;
import com.petto.presentation.form.CartForm;
import com.petto.presentation.form.CartItemForm;
import com.petto.presentation.form.CustomerForm;
import com.petto.presentation.form.OrderForm;

public class CheckoutAction extends BaseAction {

	private OrderService myOrderService;
	private ItemService myItemService;
	
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

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		OrderForm myForm = (OrderForm)form;
		
		
		
		Orders order = myOrderService.saveNewOrder(myForm);			//save new order
		
		for(CartItemForm cartItem: myForm.getCartItemList())
		{
			int stockLeft = cartItem.getCartItem().getStock() - cartItem.getQty();
			myItemService.reduceStockQty(stockLeft,cartItem.getCartItem());
			myOrderService.saveNewOrderItem(myForm, order, cartItem.getCartItem(), cartItem.getQty()); //save new order items to order detail
		}

		//Clear Cart
		CartForm cartForm = (CartForm)request.getSession().getAttribute("CartFormBean");
		cartForm.getCartItemList().clear();
		cartForm.setFrmTotalPrice(0);
		cartForm.setFrmTotalQty(0);
		cartForm.setFrmItemQty(0);
		//Clear Item - cart_qty
		myItemService.clearCartQty();
		
		//Clear Order
		myOrderService.clearOrder(myForm);
		
		return "gotoIndex";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("userId") == null) {
			return "gotoLoginPage";
		}
		
		OrderForm myForm = (OrderForm)form;
		CustomerForm loginForm = (CustomerForm)request.getSession().getAttribute("LoginFormBean"); //getting login customer form session
		CartForm cartForm = (CartForm)request.getSession().getAttribute("CartFormBean");			//getting cart from session
		if(cartForm.getCartItemList().isEmpty()){					//if cart is empty, can't go to checkout page
			return "gotoCart";
		}
		
		//setting required data to checkout
		myForm.setCustomer(loginForm.getLoginCustomer());
		myForm.setCartItemList(cartForm.getCartItemList());
		myForm.setTotalQty(cartForm.getFrmTotalQty());
		myForm.setTotalPrice(cartForm.getFrmTotalPrice());
		myOrderService.firstLoadCheckoutPage(myForm);			//first load checkout page
		//System.out.println("Checkout load mae cus yae phone number "+myForm.getCustomer().getPhone());
		return "gotoCheckoutPage";
	}
	
	

}
