package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.CategoryService;
import com.petto.business.service.PetService;
import com.petto.presentation.form.AdminCategoryForm;
import com.petto.presentation.form.AdminPetForm;

public class AdminCategoryEditAction extends BaseAction {

	private PetService myPetService;
	private CategoryService myCategoryService;
	
	public PetService getMyPetService() {
		return myPetService;
	}

	public void setMyPetService(PetService myPetService) {
		this.myPetService = myPetService;
	}

	public CategoryService getMyCategoryService() {
		return myCategoryService;
	}

	public void setMyCategoryService(CategoryService myCategoryService) {
		this.myCategoryService = myCategoryService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		if (request.getParameter("btnSave") != null) {			//Saving update category
			
			AdminCategoryForm myForm = (AdminCategoryForm)form;		
			myCategoryService.saveUpdateCategory(myForm);		//Save updated category to database
			myForm.setAlert(" is successfully Updated!");
			return "gotoCategoryEdit";
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
		
		AdminCategoryForm myForm = (AdminCategoryForm)form;
				
		//clear catch form data
		myForm.setAlert(null);
		myForm.setFrmCategoryName(null);
		myForm.setCategory(null);
		myCategoryService.editCategory(myForm, myForm.getFrmCategoryId());		//First Load before updating
		
		
		return "gotoCategoryEdit";
	}
}
