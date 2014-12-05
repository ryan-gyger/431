package com.oreillyauto.pos.domain;

import java.sql.Date;

public class RestockOrder {

	private int reorderId;
	private Date reorderDate;
	private String reorderItem;
	private int reorderQty;

	public int getReorderId() {
		return reorderId;
	}

	public void setReorderId(int reorderId) {
		this.reorderId = reorderId;
	}

	public Date getReorderDate() {
		return reorderDate;
	}

	public void setReorderDate(Date reorderDate) {
		this.reorderDate = reorderDate;
	}

	public String getReorderItem() {
		return reorderItem;
	}

	public void setReorderItem(String reorderItem) {
		this.reorderItem = reorderItem;
	}

	public int getReorderQty() {
		return reorderQty;
	}

	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}

	public void updateOrder() {

	}
}
