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

import com.petto.business.entity.Pets;
import com.petto.business.service.PetService;
import com.petto.presentation.form.AdminPetForm;

public class AdminPetAddAction extends BaseAction {

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
		
		
		if (request.getParameter("btnAdd") != null) {								//Add new Pets
			
			AdminPetForm myForm = (AdminPetForm)form;
			
			FileOutputStream outputStream = null;
			FormFile formFile = myForm.getFrmPetImg();								//Getting pet's image form file
			Blob bfile;
			try {
				bfile = Hibernate.createBlob(formFile.getInputStream());			//Creating blob file of image
				String fst = formFile.getFileName().trim();							//trimming to get file name only
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
				String petImgPath = "images/" + fst;								//Creating image path using input image
				myForm.setFrmPetImgPath(petImgPath);								

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			myPetService.saveNewPet(myForm);					//Save new pet to database
			myForm.setAlert(" is successfully Added!");			//Setting alert after successful adding
			return "gotoPetAdd";
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
		return "gotoPetAdd";
	}
	
	

}
