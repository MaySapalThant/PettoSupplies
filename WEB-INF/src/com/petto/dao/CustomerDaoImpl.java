package com.petto.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.petto.business.entity.Customers;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	//Getting all customers
	public List<Customers> getAllCustomers() {
		List l=getHibernateTemplate().find("from Customers");
		return l.isEmpty()|| l==null? null:l;
	}
	
	//getting customer by email and password
	public Customers getCustomerByLoginEmailAndPassword(String strEmail,
			String strPassword) {
		String hql="from Customers i where i.customerEmail=? and i.password=?";
		Object[] param={strEmail,strPassword};
		List l=getHibernateTemplate().find(hql,param);
		return l.isEmpty() || l==null ? null: (Customers)l.get(0);
	}
	
	//saving customer or updating customer
	public void saveCustomer(Customers customer) {
		getHibernateTemplate().saveOrUpdate(customer);
	}
	
	//getting customer by email to check whether email is already used or not
	public Customers getCustomerByEmail(String email) {
		String hql="from Customers i where i.customerEmail=?";
		List l=getHibernateTemplate().find(hql, email);
		return l.isEmpty()||l==null? null:(Customers)l.get(0);
	}
	
	//getting customer by id
	public Customers getCustomerById(Integer id) {
		String hql="from Customers i where i.id=?";
		List l=getHibernateTemplate().find(hql, id);
		return l.isEmpty()||l==null? null:(Customers)l.get(0);
	}

	public Long getTotalCustomerCount() {
		List l=getHibernateTemplate().find("select count(*) from Customers");
		System.out.println("Customer count is " + l);
		return (Long)(l.isEmpty() || l==null ? null: l.get(0));
	}
}
