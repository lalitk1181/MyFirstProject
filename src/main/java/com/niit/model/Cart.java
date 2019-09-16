package com.niit.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Cart implements Serializable{
	@Id
	@GeneratedValue
	private int cartId;
	private boolean grandTotal;
	
	private List<CartItem> cartItems;
	
	
	
	
	

}
