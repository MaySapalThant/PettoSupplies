package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.HomeService;
import com.petto.presentation.form.CartForm;
import com.petto.presentation.form.HomeForm;
import com.petto.presentation.form.OrderForm;

public class LogoutAction extends BaseAction {

	
	private HomeService myHomeService;
	
	public HomeService getMyHomeService() {
		return myHomeService;
	}

	public void setMyHomeService(HomeService myHomeService) {
		this.myHomeService = myHomeService;
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
		
		
		
		//Clear Cart
		CartForm cartForm = (CartForm)request.getSession().getAttribute("CartFormBean");
		if(cartForm != null){
			cartForm.getCartItemList().clear();
			cartForm.setFrmTotalPrice(0);
			cartForm.setFrmTotalQty(0);
			cartForm.setFrmItemQty(0);
			
		}
		
		
		
		//Clear Order
//		OrderForm orderForm = (OrderForm)request.getSession().getAttribute("OrderFormBean");
//		if(orderForm != null){
//			if(orderForm.getCartItemList() != null){
//				orderForm.getCartItemList().clear();
//			}
//			orderForm.setFrmRemark(null);
//			orderForm.setTotalPrice(0);
//			orderForm.setTotalQty(0);
//		}
		
		HttpSession session=request.getSession(false);
		session.removeAttribute("LoginFormBean");			//removing login form bean from session
		//session.invalidate();
		//session.setAttribute("userId", null);
		HomeForm myForm = (HomeForm)form;			//go back to home page
		myHomeService.loadAllPets(myForm);			//load all pets
		myHomeService.loadAllCategories(myForm);	//load all categories
		myHomeService.loadAllItems(myForm);			//load all items
		return "gotoIndex";
	}

}
