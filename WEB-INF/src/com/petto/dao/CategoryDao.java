package com.petto.dao;

import java.util.List;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Pets;

public interface CategoryDao {
	public List<Categories> getAllCategories();
	public void saveCategory(Categories myCategory);
	public Categories getCategoryById(Integer id);
	public void deleteCategory(Categories category);
	
	public List<Categories> getAllSubCategories(Pets pet);
}
