package com.oreillyauto.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.oreillyauto.pos.dao.CustDao;
import com.oreillyauto.pos.dao.EmpDao;
import com.oreillyauto.pos.domain.Customer;
import com.oreillyauto.pos.domain.Employee;
import com.oreillyauto.pos.domain.Order;

@Controller
public class NewSaleController {

	@Autowired
	EmpDao empDao;

	@Autowired
	CustDao custDao;

	public String newSale(int empNo, int custNo, ModelMap model) {

		Employee employee = empDao.getEmp(empNo);
		Customer customer = custDao.getCust(custNo);

		Order order = employee.newOrder();

		model.addAttribute("emp", employee);
		model.addAttribute("cust", customer);
		model.addAttribute("ord", order);

		return "newSale";

	}
}
