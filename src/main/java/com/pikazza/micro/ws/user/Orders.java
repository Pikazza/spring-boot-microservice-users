package com.pikazza.micro.ws.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Orders {

	String orderId;
	String userId;
	String itemId;
	String itemName;
	String itemImage;
	String itemQty;
	String itemPrice;
	
	public Orders(){
		
	}
	
	public Orders(String userId, String itemId, String itemName, String itemImage, String itemQty, String itemPrice) {
		super();
		this.userId = userId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemImage = itemImage;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}
	
}
