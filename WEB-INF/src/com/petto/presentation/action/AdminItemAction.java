package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.ItemService;
import com.petto.presentation.form.AdminItemForm;
import com.petto.presentation.form.AdminPetForm;

public class AdminItemAction extends BaseAction {

	private ItemService myItemService;
	
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
		if (request.getParameter("btnDelete") != null) {					//Delete Item
			AdminItemForm myForm = (AdminItemForm)form;
			myItemService.deleteItem(myForm, myForm.getFrmItemId());		//Delete Item by id
			myItemService.loadAllItems(myForm);								//Reloading all items after deleting
			return "gotoAllItem";
		}
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLoginPage";
		}
			
		AdminItemForm myForm = (AdminItemForm)form;
		//clear catch form data
		myForm.setAlert(null);
		myForm.setFrmItemImgPath(null);
		myForm.setFrmItemName(null);
		myForm.setItem(null);
		
		myItemService.loadAllItems(myForm);									//First load all items
		return "gotoAllItem";
	}

	
	
}
