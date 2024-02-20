package com.petto.business.service;

import java.util.List;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Pets;
import com.petto.dao.CategoryDao;
import com.petto.dao.PetDao;
import com.petto.presentation.form.AdminCategoryForm;
import com.petto.presentation.form.AdminPetForm;

public class CategoryService {

	private CategoryDao myCategoryDao;
	private PetDao myPetDao;

	public CategoryDao getMyCategoryDao() {
		return myCategoryDao;
	}

	public void setMyCategoryDao(CategoryDao myCategoryDao) {
		this.myCategoryDao = myCategoryDao;
	}
	
	public PetDao getMyPetDao() {
		return myPetDao;
	}

	public void setMyPetDao(PetDao myPetDao) {
		this.myPetDao = myPetDao;
	}

	
	//Functions calling from Action
	public void loadAllCategorys(AdminCategoryForm myForm){
		List<Categories> categoriesList = myCategoryDao.getAllCategories();	//Getting all categories
		myForm.setCategoriesList(categoriesList);
	}
	
	public void firstLoadCategoryAdd(AdminCategoryForm myForm){
		List<Pets> l = myPetDao.getAllPets();								//Getting all pets
		myForm.setFrmPetsList(l);
		myForm.setFrmPetId("0");
	}
	
	
	public void saveNewCategory(AdminCategoryForm myForm){
		Categories myCategory = new Categories();
		myCategory.setId(null);
		myCategory.setCategoryName(myForm.getFrmCategoryName());		
		Pets myPet = myPetDao.getPetById(Integer
				.parseInt(myForm.getFrmPetId()));							//Get pet by id
		myCategory.setPet(myPet);
		myCategoryDao.saveCategory(myCategory);								//Save new category
	}
	
	
	public void editCategory(AdminCategoryForm myForm, int id){
		
		//System.out.println("(Service)" + myForm.getFrmPetId());
		Categories category = myCategoryDao.getCategoryById(id);			//Get category by id
		//Adding old data
		myForm.setCategory(category);
		List<Pets> l = myPetDao.getAllPets();								//getting all pets 
		myForm.setFrmPetsList(l);
		//myForm.setFrmPetImgPath(pet.getPetImage());
		//System.out.println("(Service) The Pet is " + myForm.getPet().getPetName());
	}
	
	//Saving new category or updating category
	public void saveUpdateCategory(AdminCategoryForm myForm){
		Categories myCategory = myForm.getCategory();
		myCategory.setCategoryName(myForm.getFrmCategoryName());
		Pets myPet = myPetDao.getPetById(Integer
				.parseInt(myForm.getFrmPetId()));							//getting pet by id
		myCategory.setPet(myPet);
		myCategoryDao.saveCategory(myCategory);								//save new category
	}
	
	//Deleting category
	public void deleteCategory(AdminCategoryForm myForm, int id){
		Categories myCategory = myCategoryDao.getCategoryById(id);
		myCategoryDao.deleteCategory(myCategory);							//delete category
	}
}
