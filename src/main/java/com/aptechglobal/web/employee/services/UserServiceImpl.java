package com.aptechglobal.web.employee.services;

import com.aptechglobal.web.employee.dao.EmployeeDAO;
import com.aptechglobal.web.employee.dto.Employee;

public class UserServiceImpl implements UserService {

	public Employee userInfo(String userName, String password) {
		
		EmployeeDAO empDAO = new EmployeeDAO();
		Employee employee = empDAO.userInfo(userName, password);
		return employee;
	}

}
