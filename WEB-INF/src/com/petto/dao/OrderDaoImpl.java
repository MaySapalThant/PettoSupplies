package com.petto.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.petto.business.entity.Admins;
import com.petto.business.entity.Customers;
import com.petto.business.entity.Items;
import com.petto.business.entity.Orderdetail;
import com.petto.business.entity.Orders;
import com.petto.business.entity.Pets;

public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao {

	//saving new order or updating order
	public void saveNewOrder(Orders order) {
		getHibernateTemplate().saveOrUpdate(order);
		}
	
	//Getting orders by status "Processing" or "Confirm"
	public List<Orders> getAllOrdersByStatus(String status) {
		List l=getHibernateTemplate().find("from Orders i where i.status=?",status);
		return l.isEmpty()|| l==null? null:l;
	}
	
	//Getting all customers orders
	public List<Orders> getAllLoginCustomerOrders(Customers customer) {
		System.out.println("In OrderDao " + customer.getCustomerName());
		List l=getHibernateTemplate().find("from Orders i where i.customer=?",customer);
		return l.isEmpty()|| l==null? null:l;
	}
	
	//Getting order by id
	public Orders getOrderById(int orderId) {
		List l=getHibernateTemplate().find("from Orders i where i.id=?",orderId);
		Orders order = (Orders)l.get(0);
		return l.isEmpty()|| l==null? null:order;
	}
	
	//Getting Order detail by order id
	public List<Orderdetail> getOrderDetailByOrderId(int orderId) {
		List l=getHibernateTemplate().find("from Orderdetail i where i.order.id=?",orderId);
		return l.isEmpty()|| l==null? null:l;
	}

	//Getting total order price integer list
	public List<Integer> getTotalOrderPriceList() {
		List l=getHibernateTemplate().find("select totalPrice from Orders");
		return l.isEmpty()|| l==null? null:l;
	}
	
	//Getting total order count
	public Long getTotalOrderCount() {
		List l=getHibernateTemplate().find("select count(*) from Orders");
		System.out.println("Order count is " + l);
		return (Long)(l.isEmpty() || l==null ? null: l.get(0));
	}

	//Getting total pending order count
	public Long getTotalPendingOrderCount() {
		List l=getHibernateTemplate().find("select count(*) from Orders where status='processing'");
		System.out.println("Pending Order count is " + l);
		return (Long)(l.isEmpty() || l==null ? null: l.get(0));
	}

	//Getting total confirm order count
	public Long getTotalConfirmOrderCount() {
		List l=getHibernateTemplate().find("select count(*) from Orders where status='confirm'");
		System.out.println("Confirm Order count is " + l);
		return (Long)(l.isEmpty() || l==null ? null: l.get(0));
	}
	
	
	
}
