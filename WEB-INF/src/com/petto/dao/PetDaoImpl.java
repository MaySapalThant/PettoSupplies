package com.petto.dao;

import java.util.List;


import org.hibernate.exception.ConstraintViolationException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Pets;
import com.petto.presentation.form.AdminPetForm;

public class PetDaoImpl extends HibernateDaoSupport implements PetDao {

	//Getting all pets
	public List<Pets> getAllPets() {
		List l=getHibernateTemplate().find("from Pets");
		return l.isEmpty()|| l==null? null:l;
	}
	
	//Saving new pet or updating pet
	public void savePet(Pets pet){
		getHibernateTemplate().saveOrUpdate(pet);
	}
	
	//Getting pet by id
	public Pets getPetById(Integer id) {
		//System.out.println("(Dao)" + id);
		List l = getHibernateTemplate().find("from Pets i where i.id=?",id);
		Pets pet = (Pets)l.get(0);
		//System.out.println("(DaoImpl) The Pet is " + pet.getPetName());
		return l.isEmpty()|| l==null? null:pet;
	}
	
	//Deleting pet
	public void deletePet(Pets pet){
		getHibernateTemplate().delete(pet);	
	}
	
}
