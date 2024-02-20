package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.entity.Items;
import com.petto.business.service.PetPageService;
import com.petto.presentation.form.AdminCategoryForm;
import com.petto.presentation.form.CartForm;
import com.petto.presentation.form.PetPageForm;

public class ItemDetailAction extends BaseAction {

	private PetPageService myPetPageService;


	public PetPageService getMyPetPageService() {
		return myPetPageService;
	}


	public void setMyPetPageService(PetPageService myPetPageService) {
		this.myPetPageService = myPetPageService;
	}


	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		
		PetPageForm myForm = (PetPageForm)form;
		
			
		if (request.getParameter("btnPlus") != null) {		//if user click plus button
			
			int qty = myForm.getFrmItemQty();
			//int stock = myPetPageService.getStockbyItemId(myForm);
			Items item = myPetPageService.getItemById(myForm);
			if(qty < item.getStock()-item.getCartQty()){
				qty++;
			}
			myForm.setFrmItemQty(qty);					//adding 1 to qty
			return "gotoItemDetail";
		}
		
		if (request.getParameter("btnMinus") != null) {		//if user click minus button
			
			int qty = myForm.getFrmItemQty();				
			qty = qty - 1;									//subtracting 1 from qty
			
			if(qty <= 1 ){									//if qty greater than or equal to 1,
				qty = 1;									//qty must be at least one
			}
			myForm.setFrmItemQty(qty);
			return "gotoItemDetail";
		}
		return null;
	}

	
	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {

		PetPageForm myForm = (PetPageForm)form;
		myForm.setFrmItemQty(1);
		
		
		myPetPageService.loadAllPets(myForm);			//Loading all pets
		myPetPageService.loadAllCategories(myForm);		//Loading all categories
		myPetPageService.loadItembyId(myForm);			//Loading selected item by id
		
		return "gotoItemDetail";
	}
	

}
