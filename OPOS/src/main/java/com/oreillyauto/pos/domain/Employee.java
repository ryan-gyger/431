package com.oreillyauto.pos.domain;

import com.oreillyauto.pos.dao.OrdDao;

public class Employee {
	private int empId;
	private String empName;
	private String empPhone;
	private String empEmail;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public void updateName() {

	}

	public void updatePhone() {

	}

	public void updateEmail() {

	}

	public Order newOrder() {
		OrdDao ordDao = new OrdDao();
		Order order = ordDao.newOrd();
		return order;
	}
}
