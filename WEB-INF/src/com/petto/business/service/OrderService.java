package com.petto.business.service;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.petto.business.entity.Customers;
import com.petto.business.entity.Items;
import com.petto.business.entity.Orderdetail;
import com.petto.business.entity.Orders;
import com.petto.business.entity.Pets;
import com.petto.dao.OrderDao;
import com.petto.dao.OrderDetailDao;
import com.petto.presentation.form.AdminCustomerForm;
import com.petto.presentation.form.AdminForm;
import com.petto.presentation.form.AdminPetForm;
import com.petto.presentation.form.CartItemForm;
import com.petto.presentation.form.CustomerForm;
import com.petto.presentation.form.OrderForm;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;




public class OrderService {
	
	public OrderDao getMyOrderDao() {
		return myOrderDao;
	}


	public void setMyOrderDao(OrderDao myOrderDao) {
		this.myOrderDao = myOrderDao;
	}


	private OrderDao myOrderDao;
	private OrderDetailDao myOrderDetailDao;
	
	
	public OrderDetailDao getMyOrderDetailDao() {
		return myOrderDetailDao;
	}


	public void setMyOrderDetailDao(OrderDetailDao myOrderDetailDao) {
		this.myOrderDetailDao = myOrderDetailDao;
	}

	//First loading checkout page
	public void firstLoadCheckoutPage(OrderForm myForm)
	{
		Customers myCus = myForm.getCustomer();
		myForm.setFrmRecName(myCus.getCustomerName());
		myForm.setFrmRecPhone(myCus.getPhone());
		myForm.setFrmRecAddress(myCus.getAddress());
		//myForm.setPaymentMethod(myForm.getPaymentMethod());
	}
	
	//Saving new order
	public Orders saveNewOrder(OrderForm myForm)
	throws ParseException {
		
		//Double total = Double.valueOf(cart.getValue());
		Orders  newOrder = new Orders();
		newOrder.setId(null);
		newOrder.setOrderDate(new Date());
		newOrder.setStatus("Processing");

		//SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
		//Date shipdate =
			//myformat.parse(myForm.getFrmShipDeliveredDate());
		//newOrder.setShipDate(shipdate);
		newOrder.setReceiverName(myForm.getFrmRecName());
		newOrder.setReceiverPhone(myForm.getFrmRecPhone());
		newOrder.setReceiverAddress(myForm.getFrmRecAddress());
		newOrder.setCustomer(myForm.getCustomer());
		newOrder.setPaymentType(myForm.getPaymentMethod());
		newOrder.setTotalPrice(myForm.getTotalPrice());
		newOrder.setTotalQty(myForm.getTotalQty());
		newOrder.setRemark(myForm.getFrmRemark());
		myOrderDao.saveNewOrder(newOrder);
		//myForm.setOrderCount(0);
		return newOrder;
	}
	
	
	//save new order items of order
	public void saveNewOrderItem(OrderForm myForm, Orders myOrder, Items item, int qty) {
		Orderdetail newItem = new Orderdetail();
		newItem.setId(null);
		newItem.setOrder(myOrder);
		newItem.setItem(item);
		newItem.setQty(qty);
		myOrderDetailDao.saveNewOrderItem(newItem);
		}
	
	//Clear order after placing order
	public void clearOrder(OrderForm myForm){
		myForm.getCartItemList().clear();
		myForm.setFrmRemark(null);
		myForm.setTotalPrice(0);
		myForm.setTotalQty(0);
	}
	
	//Loading all login customers
	public void loadAllLoginCustomerOrders(OrderForm myForm, Customers customer){
		System.out.println("In OrderService " + customer.getCustomerName());
		List<Orders> orderList = myOrderDao.getAllLoginCustomerOrders(customer);
		if (orderList == null){
			System.out.println("List is null");	
		}
		myForm.setOrderList(orderList);
	}
	
	
	//Loading order by order id
	public void loadOrderById(OrderForm myForm){
		//System.out.println("In OrderService order id " + myForm.getFrmDetailOrderId());
		Orders order = myOrderDao.getOrderById(myForm.getFrmDetailOrderId());
		
		//Getting order detail by order id
		List<Orderdetail> orderDetailList = myOrderDao.getOrderDetailByOrderId(myForm.getFrmDetailOrderId());
		
		//Creating arraylist to save cart item form objects
		List<CartItemForm> cartItemList = new ArrayList<CartItemForm>();
		
		//adding orderdetail into cartItemForm
		if(orderDetailList != null){
			for(Orderdetail od: orderDetailList){
				CartItemForm cartItem = new CartItemForm(od.getItem(),od.getQty());
				cartItemList.add(cartItem);
			}
		}
		
		myForm.setFrmDetailCartItemList(cartItemList);
		myForm.setDetailOrder(order);
	}
	
	//loading all processing orders
	public void loadAllProcessingOrders(OrderForm myForm){
		List<Orders> orderProcessingList = myOrderDao.getAllOrdersByStatus("Processing"); //getting "Processing" status orders
		myForm.setOrderProcessingList(orderProcessingList);
	}
	
	//loading all processing orders for dashboard
	public void loadAllProcessingOrdersDashboard(AdminForm myForm){
		List<Orders> orderProcessingList = myOrderDao.getAllOrdersByStatus("Processing"); //getting "Processing" status orders
		List<Orders> latestOrderList = new ArrayList<Orders>();

		//Getting latest items from all items list
		if(orderProcessingList!=null){
			int allOrdersListIndex = orderProcessingList.size()-1;
			while(allOrdersListIndex >=0){
				latestOrderList.add(orderProcessingList.get(allOrdersListIndex));
				
				allOrdersListIndex--;
			}
		}
		//From latest to earliest

		//myForm.setLatestItemList(latestItemList);
		
		myForm.setOrderProcessingList(latestOrderList);
	}
	
	//Loading all confirm orders
	public void loadAllConfirmOrders(OrderForm myForm){
		List<Orders> orderConfirmList = myOrderDao.getAllOrdersByStatus("Confirm");  //getting "Confirm" status orders
		myForm.setOrderConfirmList(orderConfirmList);
	}
	
	//Confirm order
	public void confirmOrderById(int id){
		Orders order = myOrderDao.getOrderById(id);	
		order.setStatus("Confirm");
		myOrderDao.saveNewOrder(order);
	}
	
	//Getting Total Sale
	public void gettingTotalSale(AdminForm myForm){
		List<Integer> totalSaleList = new ArrayList<Integer>();
		int totalSale=0;
		if(myOrderDao.getTotalOrderPriceList()!=null){
			totalSaleList.addAll(myOrderDao.getTotalOrderPriceList());
			//List<Items> itemsList = myItemDao.getAllItems();
			Iterator<Integer> itr = totalSaleList.iterator(); 
			while (itr.hasNext()) 
			{ 
				totalSale += itr.next(); 
			}
		}
		myForm.setFrmTotalSale(totalSale);
	}
	
	//Getting total order count
	public void gettingTotalOrder(AdminForm myForm){
		myForm.setFrmTotalOrder(myOrderDao.getTotalOrderCount());
	}
	
	//getting total pending order count
	public void gettingTotalPendingOrder(AdminForm myForm){
		myForm.setFrmTotalPendingOrder(myOrderDao.getTotalPendingOrderCount());
	}
	
	//getting total confirm order count
	public void gettingTotalConfirmOrder(AdminForm myForm){
		myForm.setFrmTotalConfirmOrder(myOrderDao.getTotalConfirmOrderCount());
	}
}
