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
import com.petto.presentation.form.PetPageForm;

public class CategoryPageAction extends BaseAction {

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
				List<Items> subItemsListByCategory = myPetPageService.searchItemsByKeyAndCategory(myForm);//search items by item name and category using input keyword
				//System.out.println("Search Key type is - " + myForm.getFrmSearchKey().getClass().getSimpleName()+ " in if.");
				myForm.setSearchKey(myForm.getFrmSearchKey());
				myForm.setFrmSearchKey(null);
				myForm.setSubItemsListByCategory(subItemsListByCategory);
			}
			else{
				myPetPageService.loadAllSubItemsbyCategory(myForm); //loading items by category
				System.out.println("Current Category(Action): " + myForm.getCategory().getCategoryName());
			}
			
			return "gotoCategoryPage";
		}
			return null;
		
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		PetPageForm myForm = (PetPageForm)form;
		Categories category = myPetPageService.getCategorybyId(Integer.parseInt(myForm.getFrmCategoryId()));  //getting category from form category id
		myForm.setCategory(category);
		Pets pet = myPetPageService.getPetbyId(myForm.getCategory().getPet().getId());			//getting pet from pet id which is get from category
		myForm.setPet(pet);
		
		myPetPageService.loadAllPets(myForm);				//Load all pets
		myPetPageService.loadAllCategories(myForm);			//Load all categories
		myPetPageService.loadAllItems(myForm);				//Load all items
			
		myPetPageService.loadAllSubCategories(myForm);		//Load all sub categories of choosing pet
		myPetPageService.loadAllSubItemsbyPet(myForm);		//Load items of choosing pet	
		myPetPageService.loadAllSubItemsbyCategory(myForm);	//Load items of choosing category
		myForm.setSearchList(myForm.getSubItemsListByCategory());
		return "gotoCategoryPage";
	}
	
	

}
