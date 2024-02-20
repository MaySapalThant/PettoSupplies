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

public class AdminCategoryAction extends BaseAction {

	private CategoryService myCategoryService;
	
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
		
		//Category Delete
		if (request.getParameter("btnDelete") != null) {
			AdminCategoryForm myForm = (AdminCategoryForm)form;
			
			try{
				myCategoryService.deleteCategory(myForm, myForm.getFrmCategoryId()); 	//Delete Category
				myForm.setDeleteError(null);
			}catch(Exception e){ //Can't delete parent key if child exist.
				myForm.setDeleteError("Can't delete!  At first, you must delete all the items of this category.");
				myCategoryService.loadAllCategorys(myForm);
				return "gotoAllCategory";
			}
			
			myCategoryService.loadAllCategorys(myForm);							//Load all Categories after deleting
			return "gotoAllCategory";											//Back to Categories page
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
		myForm.setDeleteError(null);
		//System.out.println("Before Load All Categories");
		myCategoryService.loadAllCategorys(myForm);					//First load all Categories
		return "gotoAllCategory";
	}

}
