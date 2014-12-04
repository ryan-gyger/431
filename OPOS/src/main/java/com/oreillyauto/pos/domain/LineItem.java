package com.oreillyauto.pos.domain;

public class LineItem {

	private int itemId;
	private int saleItemId;
	private int lineItemQty;
	private float extPrice;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getSaleItemId() {
		return saleItemId;
	}

	public void setSaleItemId(int saleItemId) {
		this.saleItemId = saleItemId;
	}

	public int getLineItemQty() {
		return lineItemQty;
	}

	public void setLineItemQty(int lineItemQty) {
		this.lineItemQty = lineItemQty;
	}

	public float getExtPrice() {
		return extPrice;
	}

	public void setExtPrice(float extPrice) {
		this.extPrice = extPrice;
	}

}
