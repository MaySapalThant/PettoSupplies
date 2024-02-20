package com.petto.presentation.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.petto.business.entity.Items;

public class CartForm extends ValidatorForm {
	
	//Shopping cart data
	private List<CartItemForm> cartItemList;
	private Items frmCartItem;
	
	private String frmCartItemId;
	private int frmItemQty;
	private int frmTotalQty;
	private int frmTotalPrice;
	
	String frmAlert;
	
	//Checking already Login or not
	String loginOrNot;

	//Creating ArrayList in constructor
	public CartForm(){
		cartItemList = new ArrayList<CartItemForm>();
	}
	
	public String getLoginOrNot() {
		return loginOrNot;
	}

	public void setLoginOrNot(String loginOrNot) {
		this.loginOrNot = loginOrNot;
	}

	public String getFrmAlert() {
		return frmAlert;
	}

	public void setFrmAlert(String frmAlert) {
		this.frmAlert = frmAlert;
	}
	
	public int getFrmTotalPrice() {
		return frmTotalPrice;
	}
	public void setFrmTotalPrice(int frmTotalPrice) {
		this.frmTotalPrice = frmTotalPrice;
	}
	public int getFrmTotalQty() {
		return frmTotalQty;
	}
	public void setFrmTotalQty(int frmTotalQty) {
		this.frmTotalQty = frmTotalQty;
	}
	public int getFrmItemQty() {
		return frmItemQty;
	}
	public void setFrmItemQty(int frmItemQty) {
		this.frmItemQty = frmItemQty;
	}
	
	public List<CartItemForm> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItemForm> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public Items getFrmCartItem() {
		return frmCartItem;
	}
	public void setFrmCartItem(Items frmCartItem) {
		this.frmCartItem = frmCartItem;
	}
	public String getFrmCartItemId() {
		return frmCartItemId;
	}

	public void setFrmCartItemId(String frmCartItemId) {
		this.frmCartItemId = frmCartItemId;
	}

	
}
