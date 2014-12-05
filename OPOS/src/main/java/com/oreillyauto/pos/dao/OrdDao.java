package com.oreillyauto.pos.dao;

import java.util.Date;

import com.oreillyauto.pos.domain.Order;

public class OrdDao {

	public Order newOrd() {

		Order theOrder = new Order();
		// Yay, Mock Data!
		theOrder.setOrdId(42);
		theOrder.setOrdDate(new Date());

		return theOrder;

	}

}
