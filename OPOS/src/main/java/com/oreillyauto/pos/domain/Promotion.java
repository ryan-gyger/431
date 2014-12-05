package com.oreillyauto.pos.domain;

import java.util.Date;

public class Promotion {

	private int promoId;
	private String promoDesc;
	private Date promoStartDate;
	private Date promoEndDate;

	public int getPromoId() {
		return promoId;
	}

	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}

	public String getPromoDesc() {
		return promoDesc;
	}

	public void setPromoDesc(String promoDesc) {
		this.promoDesc = promoDesc;
	}

	public Date getPromoStartDate() {
		return promoStartDate;
	}

	public void setPromoStartDate(Date promoStartDate) {
		this.promoStartDate = promoStartDate;
	}

	public Date getPromoEndDate() {
		return promoEndDate;
	}

	public void setPromoEndDate(Date promoEndDate) {
		this.promoEndDate = promoEndDate;
	}

	public void updateInformation() {

	}

}
