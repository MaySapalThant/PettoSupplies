package com.petto.dao;

import java.util.List;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;

public interface ItemDao {
	public List<Items> getAllItems();
	public void saveItem(Items myItem);
	public Items getItemById(Integer id);
	public void deleteItem(Items item);
	public List<Items> getAllSubItemsbyPet(Pets pet);
	public List<Items> getAllSubItemsbyCategory(Categories category);
	public List<Items> getItemByNameAndDescription(String keyword);
	public List<Items> getItemByNameAndPet(String keyword, Pets pet);
	public List<Items> getItemByNameAndCategory(String keyword, Categories category);
	public void resetCartQryToAllItems(List<Items> itemList);
	public List<Integer> getTotalProductList();
}
