package com.petto.presentation.action;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.hibernate.Hibernate;

import com.petto.business.service.CategoryService;
import com.petto.presentation.form.AdminCategoryForm;
import com.petto.presentation.form.AdminPetForm;

public class AdminCategoryAddAction extends BaseAction {

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
		if (request.getParameter("btnAdd") != null) {			//Adding new Category
			
			AdminCategoryForm myForm = (AdminCategoryForm)form;		
			myCategoryService.saveNewCategory(myForm);			//Save new category to database
			myForm.setAlert(" is successfully Added!");			//Setting alert after successful adding
			return "gotoCategoryAdd";
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
		//System.out.println("Before First Load Adding");
		myCategoryService.firstLoadCategoryAdd(myForm);		//Fist load before adding
		//System.out.println("After First Load Adding");
		return "gotoCategoryAdd";
	}

}
