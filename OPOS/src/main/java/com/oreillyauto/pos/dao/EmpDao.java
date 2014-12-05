package com.oreillyauto.pos.dao;

import com.oreillyauto.pos.domain.Employee;

public class EmpDao {

	public Employee getEmp(int empNo) {

		// We are just mocking here instead of actually hitting a database
		Employee theEmployee = new Employee();
		theEmployee.setEmpId(empNo);
		theEmployee.setEmpName("Testy Tester");
		theEmployee.setEmpPhone("877-CASH-NOW");
		theEmployee.setEmpEmail("ttester@oreillyauto.com");
		return theEmployee;
	}

}
