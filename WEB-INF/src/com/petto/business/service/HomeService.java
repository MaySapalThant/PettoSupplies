package com.petto.business.service;

import java.util.ArrayList;
import java.util.List;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;
import com.petto.dao.CategoryDao;
import com.petto.dao.ItemDao;
import com.petto.dao.PetDao;
import com.petto.presentation.form.HomeForm;

public class HomeService {

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
	public void loadAllPets(HomeForm myForm){
		List<Pets> petsList = myPetDao.getAllPets();
		myForm.setPetsList(petsList);
	}
	
	//Loading all categories
	public void loadAllCategories(HomeForm myForm){
		List<Categories> categoriesList = myCategoryDao.getAllCategories();
		if (categoriesList == null){
			System.out.println("Category List is null");	
		}
		myForm.setCategoriesList(categoriesList);
	}
	
	//Loading all items
	public void loadAllItems(HomeForm myForm){
		List<Items> itemsList = myItemDao.getAllItems();
		myForm.setItemsList(itemsList);
	}
	
	
	//Loading items from latest to earliest
	public void loadLatestItems(HomeForm myForm){
		List<Items> itemsList = myItemDao.getAllItems();
		List<Items> latestItemList = new ArrayList<Items>();
		List<Items> latestTenItemList = new ArrayList<Items>();
		//Getting latest items from all items list
		
		//From latest to earliest
		int allItemsListIndex = itemsList.size()-1;
		while(allItemsListIndex >=0){
			latestItemList.add(itemsList.get(allItemsListIndex));
			
			allItemsListIndex--;
		}
		//Getting ten latest item list
		for(int i=0; i<10 ; i++){
			latestTenItemList.add(latestItemList.get(i));
		}

		myForm.setLatestItemList(latestTenItemList);
	}
	
}
