package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.ItemService;
import com.petto.presentation.form.CartForm;
import com.petto.presentation.form.PetPageForm;

public class CartAction extends BaseAction {

ItemService myItemService;
	
	public ItemService getMyItemService() {
		return myItemService;
	}
	public void setMyItemService(ItemService myItemService) {
		this.myItemService = myItemService;
	}
	
	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		
		CartForm myForm=(CartForm)form;
		
		if(request.getParameter("btnAddToCart")!=null)				//Adding item to shopping cart
		{
			HttpSession session = request.getSession(false);		
			if (session.getAttribute("userId") != null) {
				myForm.setLoginOrNot("1");
			}
			
			//In (myForm,myForm.getFrmItemQty()), myForm.getFrmItemQty()is for 'is it coming from detail_page add_to_card btn or normal add_to_card btn?'
			//myForm.getFrmItemQty()is 1 at normal add_to_card.
			if(!myItemService.checkItemExistInCart(myForm,myForm.getFrmItemQty())){		//Checking item already exist in cart or not
				myItemService.addToCartItem(myForm);				//adding item to cart
				myForm.setFrmAlert(null);
				return "gotoIndex";
			}
			
			myForm.setFrmAlert("Item already exist in cart. Add quantity.");		//setting alert if item already exist in the cart
			return "gotoCart";
		}
		
		
		if (request.getParameter("btnPlus") != null) {		//if user click plus button
			
			myItemService.increaseItemQtyInCart(myForm);
								
			return "gotoCart";
		}
		
		if (request.getParameter("btnMinus") != null) {		//if user click minus button
			
			myItemService.decreaseItemQtyInCart(myForm);
			
			return "gotoCart";
		}
		
		
		if(request.getParameter("btnRemove")!=null)					//remove item from shopping cart
		{
			myItemService.removeFromCartItem(myForm);
			return "gotoCart";
			
			
		}
		return null;
	}
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		
		CartForm myForm=(CartForm)form;
		myForm.setFrmAlert(null);
		return "gotoCart";
	}

	
	
}
