package com.petto.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.petto.business.entity.Orderdetail;

public class OrderDetailDaoImpl extends HibernateDaoSupport implements OrderDetailDao {
	
	//Saving order item to order detail
	public void saveNewOrderItem(Orderdetail myItem) {
		getHibernateTemplate().saveOrUpdate(myItem);
		}
}
