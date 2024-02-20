package com.petto.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;

public class CategoryDaoImpl extends HibernateDaoSupport implements CategoryDao {
	
	//Getting all categories	
	public List<Categories> getAllCategories() {
		List l=getHibernateTemplate().find("from Categories");
		return l.isEmpty()|| l==null? null:l;
	}

	//Saving new category or update category
	public void saveCategory(Categories myCategory) {
		getHibernateTemplate().saveOrUpdate(myCategory);	
	}

	//Getting category by id
	public Categories getCategoryById(Integer id) {
		//System.out.println("(Dao)" + id);
		List l = getHibernateTemplate().find("from Categories i where i.id=?",id);
		Categories category = (Categories)l.get(0);
		//System.out.println("(DaoImpl) The Pet is " + pet.getPetName());
		return l.isEmpty()|| l==null? null:category;
	}
	
	//Deleting category
	public void deleteCategory(Categories category){
		getHibernateTemplate().delete(category);
	}
	
	//getting category by pet
	public List<Categories> getAllSubCategories(Pets pet) {
		List l=getHibernateTemplate().find("from Categories i where i.pet=?",pet);
		return l.isEmpty()|| l==null? null:l;
	}
	

}
