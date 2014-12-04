package com.oreillyauto.pos.domain;

public class ReturnOrder {

	private int returnId;
	private String returnItem;
	private String returnDesc;
	private float returnAmount;

	public int getReturnId() {
		return returnId;
	}

	public void setReturnId(int returnId) {
		this.returnId = returnId;
	}

	public String getReturnItem() {
		return returnItem;
	}

	public void setReturnItem(String returnItem) {
		this.returnItem = returnItem;
	}

	public String getReturnDesc() {
		return returnDesc;
	}

	public void setReturnDesc(String returnDesc) {
		this.returnDesc = returnDesc;
	}

	public float getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(float returnAmount) {
		this.returnAmount = returnAmount;
	}

	public void updateQty() {

	}

	public void tenderRefund() {

	}
}
