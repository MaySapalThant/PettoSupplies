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

import com.petto.business.service.ItemService;
import com.petto.presentation.form.AdminItemForm;
import com.petto.presentation.form.AdminPetForm;

public class AdminItemAddAction extends BaseAction {

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
		
		if (request.getParameter("btnAdd") != null) {								//Adding new item
			
			AdminItemForm myForm = (AdminItemForm)form;
			
			FileOutputStream outputStream = null;
			FormFile formFile = myForm.getFrmItemImg();								//Getting item's image form file
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
				String itemImgPath = "images/" + fst;								//Creating image path using input image file name
				myForm.setFrmItemImgPath(itemImgPath);								

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			myItemService.saveNewItem(myForm);										//Saving new item into database
			myForm.setAlert(" is successfully Added!");
			return "gotoItemAdd";
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
		myForm.setFrmItemId(0);
		myForm.setFrmDescription(null);
		myForm.setFrmItemUnitPrice(null);
		myForm.setFrmCategoriesList(null);
		myForm.setFrmCategoryId(null);
		myForm.setFrmCategoryName(null);
		
		
		myItemService.firstLoadItemAdd(myForm);			//First load all items
		return "gotoItemAdd";
	}
	
	

}
