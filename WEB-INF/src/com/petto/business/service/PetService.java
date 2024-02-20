package com.petto.business.service;

import java.io.FileNotFoundException;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;

import org.apache.struts.upload.FormFile;
import org.hibernate.Hibernate;

import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;
import com.petto.dao.PetDao;
import com.petto.presentation.form.AdminPetForm;



public class PetService {

	private PetDao myPetDao;

	public PetDao getMyPetDao() {
		return myPetDao;
	}

	public void setMyPetDao(PetDao myPetDao) {
		this.myPetDao = myPetDao;
	}
	
	//Loading all pets
	public void loadAllPets(AdminPetForm myForm){
		List<Pets> petsList = myPetDao.getAllPets();
		myForm.setPetsList(petsList);
	}
	
	//Saving new pet
	public void saveNewPet(AdminPetForm myForm){
		
		Pets myPet = new Pets();
		myPet.setId(null);
		myPet.setPetName(myForm.getFrmPetName());
		myPet.setPetImage(myForm.getFrmPetImgPath());	
		myPetDao.savePet(myPet);
	}
	
	//Editing pet
	public void editPet(AdminPetForm myForm, int id){	
		//System.out.println("(Service)" + myForm.getFrmPetId());
		Pets pet = myPetDao.getPetById(id);
		//Adding old data
		myForm.setPet(pet);
		myForm.setFrmPetImgPath(pet.getPetImage());
		//System.out.println("(Service) The Pet is " + myForm.getPet().getPetName());
	}
	
	
	//Saving updated pet
	public void saveUpdatePet(AdminPetForm myForm)
	{	
		Pets myPet = myForm.getPet();
		myPet.setPetName(myForm.getFrmPetName());
		myPet.setPetImage(myForm.getFrmPetImgPath());
		myPetDao.savePet(myPet);
	}
	
	//Deleting pet
	public void deletePet(AdminPetForm myForm, int id){
		Pets myPet = myPetDao.getPetById(id);
		myPetDao.deletePet(myPet);
	}
}
