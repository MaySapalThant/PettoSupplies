package com.petto.business.service;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;

import com.petto.business.entity.Categories;
import com.petto.business.entity.Items;
import com.petto.business.entity.Pets;
import com.petto.dao.CategoryDao;
import com.petto.dao.ItemDao;
import com.petto.dao.PetDao;
import com.petto.presentation.form.AdminCategoryForm;
import com.petto.presentation.form.AdminForm;
import com.petto.presentation.form.AdminItemForm;
import com.petto.presentation.form.AdminPetForm;
import com.petto.presentation.form.CartForm;
import com.petto.presentation.form.CartItemForm;

public class ItemService {

	private ItemDao myItemDao;
	private CategoryDao myCategoryDao;
	private PetDao myPetDao;

	public CategoryDao getMyCategoryDao() {
		return myCategoryDao;
	}

	public void setMyCategoryDao(CategoryDao myCategoryDao) {
		this.myCategoryDao = myCategoryDao;
	}

	public PetDao getMyPetDao() {
		return myPetDao;
	}

	public void setMyPetDao(PetDao myPetDao) {
		this.myPetDao = myPetDao;
	}

	public ItemDao getMyItemDao() {
		return myItemDao;
	}

	public void setMyItemDao(ItemDao myItemDao) {
		this.myItemDao = myItemDao;
	}
	
	
	//Loading all items
	public void loadAllItems(AdminItemForm myForm){
		List<Items> itemsList = myItemDao.getAllItems();
		myForm.setItemsList(itemsList);
	}
	
	//First load before Item adding
	public void firstLoadItemAdd(AdminItemForm myForm){
		List<Categories> l = myCategoryDao.getAllCategories();
		myForm.setFrmCategoriesList(l);
		myForm.setFrmCategoryId("0");
	}
	
	//Saving new items
	public void saveNewItem(AdminItemForm myForm){
		Items myItem = new Items();
		myItem.setId(null);
		myItem.setItemName(myForm.getFrmItemName());
		myItem.setUnitPrice(Integer
				.parseInt(myForm.getFrmItemUnitPrice()));
		myItem.setStock(Integer.parseInt(myForm.getFrmItemStock()));
		myItem.setCartQty(0);
		myItem.setDescription(myForm.getFrmDescription());
		myItem.setItemImage(myForm.getFrmItemImgPath());
		Categories myCategory = myCategoryDao.getCategoryById(Integer
				.parseInt(myForm.getFrmCategoryId()));
		myItem.setCategory(myCategory);
		myItemDao.saveItem(myItem);
	}
	
	//First load before updating item
	public void editItem(AdminItemForm myForm, int id){	
		Items item = myItemDao.getItemById(id);
		//Adding old data
		myForm.setItem(item);
		myForm.setFrmItemImgPath(item.getItemImage());
		System.out.println("Description is " + myForm.getItem().getDescription());
		//myForm.setFrmItemImgPath(item.getItemImage());
		List<Categories> l = myCategoryDao.getAllCategories();
		myForm.setFrmCategoriesList(l);
	}
	
	
	//Save updated item
	public void saveUpdateItem(AdminItemForm myForm){
		Items myItem = myForm.getItem();
		myItem.setItemName(myForm.getFrmItemName());
		myItem.setStock(Integer.parseInt(myForm.getFrmItemStock()));
		myItem.setUnitPrice(Integer
				.parseInt(myForm.getFrmItemUnitPrice()));
		myItem.setDescription(myForm.getFrmDescription());
		myItem.setItemImage(myForm.getFrmItemImgPath());
		Categories myCategory = myCategoryDao.getCategoryById(Integer
				.parseInt(myForm.getFrmCategoryId()));
		myItem.setCategory(myCategory);
		myItemDao.saveItem(myItem);
	}
	
	//Delete item
	public void deleteItem(AdminItemForm myForm, int id){
		Items myItem = myItemDao.getItemById(id);
		myItemDao.deleteItem(myItem);
		
	}
	
	
	//Add to cart functions
	
	public void addToCartItem(CartForm myForm){
		Items item = myItemDao.getItemById(Integer.parseInt(myForm.getFrmCartItemId()));
		
		
		//System.out.println(item.getName());	
		int qty = myForm.getFrmItemQty();
		CartItemForm cartItemForm = new CartItemForm();
		cartItemForm.setCartItem(item);
		cartItemForm.setQty(qty);
		cartItemForm.getCartItem().setCartQty(qty);
		item.setCartQty(cartItemForm.getQty());
		myItemDao.saveItem(item);
		
		int totalQty = myForm.getFrmTotalQty();
		myForm.setFrmTotalQty(totalQty+qty);
		int totalPrice = myForm.getFrmTotalPrice();
		myForm.setFrmTotalPrice(totalPrice+(cartItemForm.getQty()*cartItemForm.getCartItem().getUnitPrice()));
		
		
		List<CartItemForm> cartItemList = new ArrayList<CartItemForm>();
		cartItemList.addAll(myForm.getCartItemList());
		cartItemList.add(cartItemForm);
		myForm.setCartItemList(cartItemList);
		
		//System.out.println("In Cart Item Form " + cartItemForm.getCartItem().getName());
		//System.out.println("In Cart Item Form " + cartItemForm.getQty());
		//System.out.println("In Cart Form " + myForm.getCartItemList().get(0).getCartItem().getName());
		//System.out.println("In Cart Form " + myForm.getCartItemList().get(0).getQty());
		
		/*List<CartItemForm> cartItemList = myForm.getCartItemList();
		cartItemList.add(cartItemForm);
		myForm.setCartItemList(cartItemList);*/
	}
	
	
	public boolean checkItemExistInCart(CartForm myForm, int qty){
		boolean exist = false;
		
		Items item = myItemDao.getItemById(Integer.parseInt(myForm.getFrmCartItemId()));
		CartItemForm cartItem = new CartItemForm(item,myForm.getFrmItemQty());
		
		List<CartItemForm> cartItemList = new ArrayList<CartItemForm>();
		cartItemList.addAll(myForm.getCartItemList());
		
		
		Iterator<CartItemForm> itr = cartItemList.iterator(); 
		while (itr.hasNext()) 
		{ 
			CartItemForm ct = itr.next(); 
			if (ct.getCartItem().getId() == cartItem.getCartItem().getId() || ct.getCartItem().getId().equals(cartItem.getCartItem().getId())) { 
				exist = true; 
				} 
			
			if(exist){
				ct.setQty(ct.getQty()+qty);
				item.setCartQty(ct.getQty());
				myItemDao.saveItem(item);
				int totalQty = myForm.getFrmTotalQty();
				myForm.setFrmTotalQty(totalQty+qty);
				int totalPrice = myForm.getFrmTotalPrice();
				myForm.setFrmTotalPrice(totalPrice+(qty* ct.getCartItem().getUnitPrice()));
				System.out.println("Item already exist in cart. So, add quantity.");
			}
			
		}
		return exist;
	}
	
	public void removeFromCartItem(CartForm myForm){
		System.out.println("In Item service removeFromCartItem funciton");
		Items item = myItemDao.getItemById(Integer.parseInt(myForm.getFrmCartItemId()));
		CartItemForm cartItem = new CartItemForm(item,myForm.getFrmItemQty());
		
		List<CartItemForm> cartItemList = new ArrayList<CartItemForm>();
		cartItemList.addAll(myForm.getCartItemList());
		System.out.println("Before"+cartItemList);
		
		Iterator<CartItemForm> itr = cartItemList.iterator(); 
		while (itr.hasNext()) 
		{ 
			CartItemForm ct = itr.next(); 
			if (ct.getCartItem().getId() == cartItem.getCartItem().getId() || ct.getCartItem().getId().equals(cartItem.getCartItem().getId())) { 
				itr.remove(); 
				System.out.println("inside if");
				} 		
		}

		
		System.out.println("After"+cartItemList);
		myForm.setCartItemList(cartItemList);		
		myForm.setFrmTotalQty(myForm.getFrmTotalQty()-cartItem.getQty());
		myForm.setFrmTotalPrice(myForm.getFrmTotalPrice()-(cartItem.getQty()*cartItem.getCartItem().getUnitPrice()));
		item.setCartQty(0);
		myItemDao.saveItem(item);
	}
	
	
	//Reducing Stock Quantity
	public void reduceStockQty(int stock, Items myItem){
		
		myItem.setStock(stock);
		myItemDao.saveItem(myItem);
	}
	
	
	//Increase Item Quantity in Cart
	public void increaseItemQtyInCart(CartForm myForm){
		System.out.println("In Item service increaseItemQtyInCart funciton");
		Items item = myItemDao.getItemById(Integer.parseInt(myForm.getFrmCartItemId()));
		CartItemForm cartItem = new CartItemForm(item,myForm.getFrmItemQty());
		
		List<CartItemForm> cartItemList = new ArrayList<CartItemForm>();
		cartItemList.addAll(myForm.getCartItemList());
		//System.out.println("Before"+cartItemList);
		
		Iterator<CartItemForm> itr = cartItemList.iterator(); 
		while (itr.hasNext()) 
		{ 
			CartItemForm ct = itr.next(); 
			if (ct.getCartItem().getId() == cartItem.getCartItem().getId() || ct.getCartItem().getId().equals(cartItem.getCartItem().getId())) { 
				//ct.setQty(ct.getQty());
				int qty = ct.getQty();
				int stock = ct.getCartItem().getStock();
				if(qty < stock){
					qty++;
					ct.setQty(qty);
					item.setCartQty(ct.getQty());
					myItemDao.saveItem(item);
					int totalQty = myForm.getFrmTotalQty();
					myForm.setFrmTotalQty(totalQty+1);
					int totalPrice = myForm.getFrmTotalPrice();
					myForm.setFrmTotalPrice(totalPrice+(ct.getCartItem().getUnitPrice()));
				}
				} 		
		}		
	}
	
	//Decrease Item Quantity in Cart
	public void decreaseItemQtyInCart(CartForm myForm){
		System.out.println("In Item service decreaseItemQtyInCart Funciton");
		Items item = myItemDao.getItemById(Integer.parseInt(myForm.getFrmCartItemId()));
		CartItemForm cartItem = new CartItemForm(item,myForm.getFrmItemQty());
		
		List<CartItemForm> cartItemList = new ArrayList<CartItemForm>();
		cartItemList.addAll(myForm.getCartItemList());
		//System.out.println("Before"+cartItemList);
		
		Iterator<CartItemForm> itr = cartItemList.iterator(); 
		while (itr.hasNext()) 
		{ 
			CartItemForm ct = itr.next(); 
			if (ct.getCartItem().getId() == cartItem.getCartItem().getId() || ct.getCartItem().getId().equals(cartItem.getCartItem().getId())) { 
				//ct.setQty(ct.getQty());
				int qty = ct.getQty();
				int stock = ct.getCartItem().getStock();
				if(qty > 1){
					qty--;
					ct.setQty(qty);
					item.setCartQty(ct.getQty());
					myItemDao.saveItem(item);
					int totalQty = myForm.getFrmTotalQty();
					myForm.setFrmTotalQty(totalQty-1);
					int totalPrice = myForm.getFrmTotalPrice();
					myForm.setFrmTotalPrice(totalPrice-(ct.getCartItem().getUnitPrice()));
				}	
			} 		
		}		
	}
	
	
	//Reset 0 all rows value of cart_qty in Items table
	public void clearCartQty(){
		List<Items> itemsList = myItemDao.getAllItems();
		Iterator<Items> itr = itemsList.iterator(); 
		while (itr.hasNext()) 
		{ 
			Items ct = itr.next(); 
			ct.setCartQty(0);
		}	
		myItemDao.resetCartQryToAllItems(itemsList);
	}
	
	//Getting Total Products
	public void gettingTotalProduct(AdminForm myForm){
		List<Integer> totalProductList = new ArrayList<Integer>();
		totalProductList.addAll(myItemDao.getTotalProductList());
		int totalProduct=0;
		//List<Items> itemsList = myItemDao.getAllItems();
		Iterator<Integer> itr = totalProductList.iterator(); 
		while (itr.hasNext()) 
		{ 
			totalProduct += itr.next(); 
		}
		myForm.setFrmTotalProduct(totalProduct);
	}
}
