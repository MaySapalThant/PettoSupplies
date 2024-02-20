package com.petto.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.entity.Items;
import com.petto.business.service.PetPageService;
import com.petto.presentation.form.PetPageForm;

public class SearchItemAction extends BaseAction {

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
		myPetPageService.searchItemsByKey(myForm);			//search items by item name and item description by input keyword
		myForm.setSearchKey(myForm.getFrmSearchKey());
		myForm.setFrmSearchKey(null);
		return "gotoSearchItemPage";
	}

}
