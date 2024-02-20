package com.petto.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.petto.business.entity.Admins;
import com.petto.business.entity.Customers;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	//Getting Admin by Email and Password
	public Admins getAdminByLoginEmailAndPassword(String strEmail,
			String strPassword) {
		String hql="from Admins i where i.adminEmail=? and i.adminPassword=?";
		Object[] param={strEmail,strPassword};
		List l=getHibernateTemplate().find(hql,param);
		return l.isEmpty() || l==null ? null: (Admins)l.get(0);
	}
	
	//updating admin
	public void saveAdmin(Admins admin) {
		getHibernateTemplate().saveOrUpdate(admin);
	}
}
