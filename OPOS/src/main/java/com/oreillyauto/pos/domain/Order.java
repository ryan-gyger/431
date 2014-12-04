package com.oreillyauto.pos.domain;

import java.util.Date;

public class Order {

	private int ordId;
	private Date ordDate;
	private float ordSubtotal;
	private float ordTax;
	private float ordGrandTotal;

	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public float getOrdSubtotal() {
		return ordSubtotal;
	}

	public void setOrdSubtotal(float ordSubtotal) {
		this.ordSubtotal = ordSubtotal;
	}

	public float getOrdTax() {
		return ordTax;
	}

	public void setOrdTax(float ordTax) {
		this.ordTax = ordTax;
	}

	public float getOrdGrandTotal() {
		return ordGrandTotal;
	}

	public void setOrdGrandTotal(float ordGrandTotal) {
		this.ordGrandTotal = ordGrandTotal;
	}

	public void addItem() {

	}

	public void updateInformation() {

	}

	public void cancelOrder() {

	}

	public void getTotal() {

	}
}
