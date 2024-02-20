package com.petto.dao;

import java.util.List;


import com.petto.business.entity.Categories;
import com.petto.business.entity.Pets;


public interface PetDao {
	public List<Pets> getAllPets();
	public void savePet(Pets pet);
	public Pets getPetById(Integer id);
	public void deletePet(Pets pet);
	
}
