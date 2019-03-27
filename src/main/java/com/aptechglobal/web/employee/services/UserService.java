package com.aptechglobal.web.employee.services;

import com.aptechglobal.web.employee.dto.Employee;

public interface UserService {
	
	Employee userInfo(String userName,String password);

}
