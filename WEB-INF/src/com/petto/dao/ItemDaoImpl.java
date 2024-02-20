package com.petto.dao;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.petto.business.entity.Admins;
import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;


public class ItemDaoImpl extends HibernateDaoSupport implements ItemDao {
	
	//Getting all items
	public List<Items> getAllItems() {
		List l=getHibernateTemplate().find("from Items");
		return l.isEmpty()|| l==null? null:l;
	}
	
	//Saving item or updating item
	public void saveItem(Items myItem) {
		getHibernateTemplate().saveOrUpdate(myItem);	
	}
	
	//Getting item by id
	public Items getItemById(Integer id) {
		//System.out.println("(Dao)" + id);
		List l = getHibernateTemplate().find("from Items i where i.id=?",id);
		Items item = (Items)l.get(0);
		//System.out.println("(DaoImpl) The Pet is " + pet.getPetName());
		return l.isEmpty()|| l==null? null:item;
	}
	
	//Deleting item
	public void deleteItem(Items item){
		getHibernateTemplate().delete(item);
	}

	//Getting items by pet
	public List<Items> getAllSubItemsbyPet(Pets pet) {
		
		List l = getHibernateTemplate().find("select I from Items I, Categories C where C.id = I.category.id and C.pet=?",pet);
		return l.isEmpty()|| l==null? null:l;
	}
	
	//Getting items by category
	public List<Items> getAllSubItemsbyCategory(Categories category){
		List l = getHibernateTemplate().find("from Items I where I.category=?",category);
		return l.isEmpty()|| l==null? null:l;
	}
	
	//Getting item by name and description
	public List<Items> getItemByNameAndDescription(String keyword){
		String hql = "from Items I where I.itemName like ? or I.description like ?";
		Object[] param = {"%"+keyword+"%", "%"+keyword+"%"};
		List l = getHibernateTemplate().find(hql,param);
		//List l = getHibernateTemplate().find("from Items I where I.itemName like ?","%"+keyword+"%");
		return l.isEmpty()|| l==null? null:l;
	}
	
	//Getting item by name and description
	public List<Items> getItemByNameAndPet(String keyword, Pets pet){
		String hql="select I from Items I, Categories C where I.itemName like ? and C.id = I.category.id and C.pet=?";
		Object[] param = {"%"+keyword+"%", pet};
		List l = getHibernateTemplate().find(hql,param);
		//List l = getHibernateTemplate().find("from Items I where I.itemName like ?","%"+keyword+"%");
		return l.isEmpty()|| l==null? null:l;
	}
	
	//Getting item by name and description
	public List<Items> getItemByNameAndCategory(String keyword, Categories category){
		String hql="select I from Items I where I.itemName like ? and I.category=?";
		Object[] param = {"%"+keyword+"%", category};
		List l = getHibernateTemplate().find(hql,param);
		//List l = getHibernateTemplate().find("from Items I where I.itemName like ?","%"+keyword+"%");
		return l.isEmpty()|| l==null? null:l;
	}


	public void resetCartQryToAllItems(List<Items> itemList) {
		//getHibernateTemplate().find("UPDATE Items SET cartQty= 0");
		getHibernateTemplate().saveOrUpdateAll(itemList);
	}

	//Getting all stock quantity of items
	public List<Integer> getTotalProductList() {
		List l=getHibernateTemplate().find("select stock from Items");
		return l.isEmpty()|| l==null? null:l;
		
	}

	
}
