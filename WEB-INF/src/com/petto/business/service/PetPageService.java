package com.petto.business.service;

import java.util.List;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;
import com.petto.dao.CategoryDao;
import com.petto.dao.ItemDao;
import com.petto.dao.PetDao;
import com.petto.presentation.form.HomeForm;
import com.petto.presentation.form.PetPageForm;

public class PetPageService {
	
	private PetDao myPetDao;
	private CategoryDao myCategoryDao;
	private ItemDao myItemDao;
	
	public PetDao getMyPetDao() {
		return myPetDao;
	}
	public void setMyPetDao(PetDao myPetDao) {
		this.myPetDao = myPetDao;
	}
	public CategoryDao getMyCategoryDao() {
		return myCategoryDao;
	}
	public void setMyCategoryDao(CategoryDao myCategoryDao) {
		this.myCategoryDao = myCategoryDao;
	}
	public ItemDao getMyItemDao() {
		return myItemDao;
	}
	public void setMyItemDao(ItemDao myItemDao) {
		this.myItemDao = myItemDao;
	}
	
	//Loading all pets
	public void loadAllPets(PetPageForm myForm){
		List<Pets> petsList = myPetDao.getAllPets();
		myForm.setPetsList(petsList);
	}
	
	//Loading all categories
	public void loadAllCategories(PetPageForm myForm){
		List<Categories> categoriesList = myCategoryDao.getAllCategories();
		myForm.setCategoriesList(categoriesList);
	}
	
	//Loading all items
	public void loadAllItems(PetPageForm myForm){
		List<Items> itemsList = myItemDao.getAllItems();
		myForm.setItemsList(itemsList);
	}
	
	
	//Loading categories by pet
	public void loadAllSubCategories(PetPageForm myForm){
		List<Categories> subCategoriesList = myCategoryDao.getAllSubCategories(myForm.getPet());
		myForm.setSubCategoriesList(subCategoriesList);
	}
	
	
	//Loading items by pet
	public void loadAllSubItemsbyPet(PetPageForm myForm){
		List<Items> subItemsList = myItemDao.getAllSubItemsbyPet(myForm.getPet());
		System.out.println("Current Pet(Service): " + myForm.getPet().getPetName());
		myForm.setSubItemsListByPet(subItemsList);
	}
	
	
	//getting pet by id
	public Pets getPetbyId(Integer id){
		Pets pet = myPetDao.getPetById(id);
		return pet;
	}
	
	//Loading items by category
	public void loadAllSubItemsbyCategory(PetPageForm myForm){
		List<Items> subItemsList = myItemDao.getAllSubItemsbyCategory(myForm.getCategory());
		System.out.println(myForm.getCategory());
		myForm.setSubItemsListByCategory(subItemsList);
	}
	
	//Getting category by id
	public Categories getCategorybyId(Integer id){
		Categories category = myCategoryDao.getCategoryById(id);
		return category;
	}
	
	//Getting item by id
	public void loadItembyId(PetPageForm myForm){
		Items item = myItemDao.getItemById(Integer.parseInt(myForm.getFrmItemId()));
		myForm.setItem(item);
	}
	
	
	//Searching items by item name and item description by keyword
	public List<Items> searchItemsByKey(PetPageForm myForm){
		List<Items> itemsList = myItemDao.getItemByNameAndDescription(myForm.getFrmSearchKey());
		myForm.setItemsList(itemsList);
		return itemsList;
	}
	
	//Searching items by item name by keyword within related pet
	public List<Items> searchItemsByKeyAndPet(PetPageForm myForm){
		List<Items> itemsList = myItemDao.getItemByNameAndPet(myForm.getFrmSearchKey(),myForm.getPet());
		//myForm.setItemsList(itemsList);
		return itemsList;
	}
	
	//Searching items by item name by keyword within related category
	public List<Items> searchItemsByKeyAndCategory(PetPageForm myForm){
		List<Items> itemsList = myItemDao.getItemByNameAndCategory(myForm.getFrmSearchKey(),myForm.getCategory());
		//myForm.setItemsList(itemsList);
		return itemsList;
	}
	
	
	//Getting Stock by Item id
	public int getStockbyItemId(PetPageForm myForm){
		Items item = myItemDao.getItemById(Integer.parseInt(myForm.getFrmItemId()));
		return item.getStock();
	}
	
	
	//getting item by item id
	public Items getItemById(PetPageForm myForm){
		Items item = myItemDao.getItemById(Integer.parseInt(myForm.getFrmItemId()));
		return item;
	}
}
