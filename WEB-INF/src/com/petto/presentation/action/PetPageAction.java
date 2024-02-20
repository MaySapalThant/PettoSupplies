package com.petto.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;
import com.petto.business.service.PetPageService;
import com.petto.presentation.form.HomeForm;
import com.petto.presentation.form.PetPageForm;

public class PetPageAction extends BaseAction {

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
		if(request.getParameter("btnSearch")!=null)				//Adding item to shopping cart
		{
			PetPageForm myForm = (PetPageForm)form;	
			//System.out.println("Search Key is - " + myForm.getFrmSearchKey());
			if(!myForm.getFrmSearchKey().equals("")){
				List<Items> subItemsListByPet = myPetPageService.searchItemsByKeyAndPet(myForm);//search items by item name, description and pet using input keyword
				//System.out.println("Search Key type is - " + myForm.getFrmSearchKey().getClass().getSimpleName()+ " in if.");
				myForm.setSearchKey(myForm.getFrmSearchKey());
				myForm.setFrmSearchKey(null);
				myForm.setSubItemsListByPet(subItemsListByPet);
			}
			else{
				myPetPageService.loadAllSubItemsbyPet(myForm); //loading items by pet
				System.out.println("Current Pet(Action): " + myForm.getPet().getPetName());
			}
			
			return "gotoPetPage";
		}
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		PetPageForm myForm = (PetPageForm)form;
		Pets pet = myPetPageService.getPetbyId(Integer.parseInt(myForm.getFrmPetId()));	//getting pet from pet id
		myForm.setPet(pet);
		//Categories category = myPetPageService.getCategorybyId(Integer.parseInt(myForm.getFrmCategoryId()));
		//myForm.setPet(pet);
		myPetPageService.loadAllPets(myForm);			//loading all pets
		myPetPageService.loadAllCategories(myForm);		//loading all categories
		myPetPageService.loadAllItems(myForm);			//loading all items
		
		myPetPageService.loadAllSubCategories(myForm);	//loading all sub categories
		myPetPageService.loadAllSubItemsbyPet(myForm);	//loading items by pet
		myForm.setSearchList(myForm.getSubItemsListByPet());
		return "gotoPetPage";
	}

}
