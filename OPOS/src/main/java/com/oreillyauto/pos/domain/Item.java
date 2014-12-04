package com.oreillyauto.pos.domain;

public class Item {

	private int itemId;
	private String itemName;
	private String itemCategory;
	private String itemDesc;
	private float itemPrice;
	private int invQty;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getInvQty() {
		return invQty;
	}

	public void setInvQty(int invQty) {
		this.invQty = invQty;
	}
}
