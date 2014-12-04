package com.oreillyauto.pos.domain;

public class SaleItem {

	private int saleItemId;
	private String saleItemName;
	private int itemQty;
	private float itemPrice;

	public int getSaleItemId() {
		return saleItemId;
	}

	public void setSaleItemId(int saleItemId) {
		this.saleItemId = saleItemId;
	}

	public String getSaleItemName() {
		return saleItemName;
	}

	public void setSaleItemName(String saleItemName) {
		this.saleItemName = saleItemName;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public void updateInformation() {

	}

	public void cancelItem() {

	}
}
