package com.petto.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Customers;
import com.petto.business.entity.Orders;

public class OrderForm extends ValidatorForm {

	//Order Form Required Data
	private String frmRecName;
	private String frmRecPhone;
	private String frmRecAddress;
	private String frmRemark;
	private Customers customer;
	private List<CartItemForm> cartItemList;
	private int totalQty;
	private int totalPrice;
	private String paymentMethod;
	
	
	//To retrieve orders
	private List<Orders> orderList;
	
	//Customer Order detail history
	private String frmDetailDate;
	private String frmDetailTotalQty;
	private String frmDetailTotalPrice;
	private String frmDetailPaymentMethod;
	private Orders detailOrder;
	
	//Admin confirm order
	private List<Orders> orderProcessingList;
	private List<Orders> orderConfirmList;
		
	public List<Orders> getOrderProcessingList() {
		return orderProcessingList;
	}
	public void setOrderProcessingList(List<Orders> orderProcessingList) {
		this.orderProcessingList = orderProcessingList;
	}
	public List<Orders> getOrderConfirmList() {
		return orderConfirmList;
	}
	public void setOrderConfirmList(List<Orders> orderConfirmList) {
		this.orderConfirmList = orderConfirmList;
	}
	private List<CartItemForm> frmDetailCartItemList;
	private int frmDetailOrderId;
	
	
	public Orders getDetailOrder() {
		return detailOrder;
	}
	public void setDetailOrder(Orders detailOrder) {
		this.detailOrder = detailOrder;
	}
	
	public int getFrmDetailOrderId() {
		return frmDetailOrderId;
	}
	public void setFrmDetailOrderId(int frmDetailOrderId) {
		this.frmDetailOrderId = frmDetailOrderId;
	}
	public String getFrmDetailDate() {
		return frmDetailDate;
	}
	public void setFrmDetailDate(String frmDetailDate) {
		this.frmDetailDate = frmDetailDate;
	}
	public String getFrmDetailTotalQty() {
		return frmDetailTotalQty;
	}
	public void setFrmDetailTotalQty(String frmDetailTotalQty) {
		this.frmDetailTotalQty = frmDetailTotalQty;
	}
	public String getFrmDetailTotalPrice() {
		return frmDetailTotalPrice;
	}
	public void setFrmDetailTotalPrice(String frmDetailTotalPrice) {
		this.frmDetailTotalPrice = frmDetailTotalPrice;
	}
	public String getFrmDetailPaymentMethod() {
		return frmDetailPaymentMethod;
	}
	public void setFrmDetailPaymentMethod(String frmDetailPaymentMethod) {
		this.frmDetailPaymentMethod = frmDetailPaymentMethod;
	}
	public List<CartItemForm> getFrmDetailCartItemList() {
		return frmDetailCartItemList;
	}
	public void setFrmDetailCartItemList(List<CartItemForm> frmDetailCartItemList) {
		this.frmDetailCartItemList = frmDetailCartItemList;
	}
	public List<Orders> getOrderList() {
		
		return orderList;
	}
	public void setOrderList(List<Orders> orderList) {
		this.orderList = orderList;
	}
	public String getFrmRemark() {
		return frmRemark;
	}
	public void setFrmRemark(String frmRemark) {
		this.frmRemark = frmRemark;
	}
	public String getFrmRecName() {
		return frmRecName;
	}
	public void setFrmRecName(String frmRecName) {
		this.frmRecName = frmRecName;
	}
	public String getFrmRecPhone() {
		return frmRecPhone;
	}
	public void setFrmRecPhone(String frmRecPhone) {
		this.frmRecPhone = frmRecPhone;
	}
	public String getFrmRecAddress() {
		return frmRecAddress;
	}
	public void setFrmRecAddress(String frmRecAddress) {
		this.frmRecAddress = frmRecAddress;
	}
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public List<CartItemForm> getCartItemList() {
		return cartItemList;
	}
	public void setCartItemList(List<CartItemForm> cartItemList) {
		this.cartItemList = cartItemList;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
}
