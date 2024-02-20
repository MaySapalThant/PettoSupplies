package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.CategoryService;
import com.petto.business.service.HomeService;
import com.petto.business.service.ItemService;
import com.petto.business.service.PetService;
import com.petto.presentation.form.CartForm;
import com.petto.presentation.form.HomeForm;

public class HomeAction extends BaseAction {

	private HomeService myHomeService;
	private ItemService myItemService;
	
	public ItemService getMyItemService() {
		return myItemService;
	}

	public void setMyItemService(ItemService myItemService) {
		this.myItemService = myItemService;
	}

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
		
		HomeForm myForm = (HomeForm)form;
		myHomeService.loadAllPets(myForm);			//Loading all pets
		myHomeService.loadAllCategories(myForm);	//Loading all categories
		myHomeService.loadAllItems(myForm);			//Loading all items
		myHomeService.loadLatestItems(myForm);		//Loading all items form latest to earliest
		CartForm cartForm = (CartForm)request.getSession().getAttribute("CartFormBean");//getting cart from session
		if(cartForm == null){
			//Clear Item - cart_qty
			myItemService.clearCartQty(); //if cart is null, cartQty will be reset in database
		}
		
		return "gotoIndex";
	}
	
	

}
