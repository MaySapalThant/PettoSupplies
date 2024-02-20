package com.petto.presentation.form;

import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Items;

public class CartItemForm extends ValidatorForm {
	
	private Items cartItem;
	private int qty;
	
	
	//Constructors for create cartItemForm object
	public CartItemForm(Items frmCartItem, int frmItemQty) {
		this.cartItem = frmCartItem;
		this.qty = frmItemQty;
	}
	
	public CartItemForm() {
		// TODO Auto-generated constructor stub
	}
	
	public Items getCartItem() {
		return cartItem;
	}
	public void setCartItem(Items cartItem) {
		this.cartItem = cartItem;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
