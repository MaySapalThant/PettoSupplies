package com.petto.presentation.action;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.hibernate.Hibernate;

import com.petto.business.service.PetService;
import com.petto.presentation.form.AdminPetForm;

public class AdminPetEditAction extends BaseAction {

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
		
		AdminPetForm myForm = (AdminPetForm)form;
		//myPetService.editPet(myForm, myForm.getFrmPetId());
		
		
		
		if (request.getParameter("btnSave") != null) {
			FormFile formFile = myForm.getFrmPetImg();									//Getting pet's image form file
			
			FileOutputStream outputStream = null;
			Blob bfile;
			try {
				bfile = Hibernate.createBlob(formFile.getInputStream());				//Creating blob file of image
				String fst = formFile.getFileName().trim();								//trimming to get file name only
				
				if(fst == null || fst.equals("")){
					myForm.setFrmPetImgPath(myForm.getFrmPetImgPath());
				}
				else{
					String filePath = getServlet().getServletContext().getRealPath("")
					+ "/images/" + fst;													//Creating file path to save images
					BufferedOutputStream outStream = new BufferedOutputStream(
					new FileOutputStream(filePath));
					InputStream in = bfile.getBinaryStream();
					byte[] buffer = new byte[1000];
					int n = 0;
					while ((n = in.read(buffer)) != -1) {
						outStream.write(buffer, 0, n);
					}
					in.close();
					outStream.close();
					String petImgPath = "images/" + fst;			//Creating image path using input image
					myForm.setFrmPetImgPath(petImgPath);
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
			
			myPetService.saveUpdatePet(myForm);						//Save updated pet to database
			myForm.setAlert(" is successfully updated!");			//Setting alert after successful updating
			return "gotoPetEdit";
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
		
		//System.out.println("(Action)" + myForm.getFrmPetId());
		//clear catch form data
		myForm.setAlert(null);
		myForm.setFrmPetImgPath(null);
		myForm.setFrmPetName(null);
		myForm.setPet(null);
		myPetService.editPet(myForm, myForm.getFrmPetId());					//first load pet before deleting
		
		//System.out.println("(Action) The Pet is " + myForm.getPet().getPetName());
		return "gotoPetEdit";
	}


	
	

}
