package com.petto.dao;

import java.util.List;

import com.petto.business.entity.Customers;
import com.petto.business.entity.Orderdetail;
import com.petto.business.entity.Orders;

public interface OrderDao {

	public void saveNewOrder(Orders order);
	public List<Orders> getAllLoginCustomerOrders(Customers customer);
	public List<Orders> getAllOrdersByStatus(String status);
	public Orders getOrderById(int orderId);
	public List<Orderdetail> getOrderDetailByOrderId(int orderId);
	public List<Integer> getTotalOrderPriceList();
	public Long getTotalOrderCount();
	public Long getTotalPendingOrderCount();
	public Long getTotalConfirmOrderCount();
}
