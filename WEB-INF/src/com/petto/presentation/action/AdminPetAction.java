/**
 * 
 */
package com.petto.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.petto.business.service.PetService;
import com.petto.presentation.form.AdminPetForm;

/**
 * @author Administrator
 *
 */
public class AdminPetAction extends BaseAction {

	/* (non-Javadoc)
	 * @see com.petto.presentation.action.BaseAction#doExecute(org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.apache.struts.action.ActionMapping)
	 */
	
	private PetService myPetService;
	
	public PetService getMyPetService() {
		return myPetService;
	}

	public void setMyPetService(PetService myPetService) {
		this.myPetService = myPetService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		if (request.getParameter("btnDelete") != null) {				//Pet Delete function
			AdminPetForm myForm = (AdminPetForm)form;
			try{
				myPetService.deletePet(myForm, myForm.getFrmPetId());		//Deleting pet by pet id
				myForm.setDeleteError(null);
			}
			catch(Exception e){		//Can't delete parent key if child exist.
				myForm.setDeleteError("Can't delete!  At first, you must delete all the categories of this pet.");
				myPetService.loadAllPets(myForm);
				return "gotoAllPet";
			}
			
			myPetService.loadAllPets(myForm);				//Load all Pets after deleting
			return "gotoAllPet";
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
		
		AdminPetForm myForm = (AdminPetForm)form;
		//clear catch form data
		myForm.setAlert(null);
		myForm.setFrmPetImgPath(null);
		myForm.setFrmPetName(null);
		myForm.setPet(null);
		myForm.setDeleteError(null);
		//System.out.println("In init pet action");
		myPetService.loadAllPets(myForm);					//First load all Pets
		return "gotoAllPet";
	}

	
	
}
