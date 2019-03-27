package com.aptechglobal.web.employee.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.aptechglobal.web.employee.dto.Employee;

public class EmployeeDAO extends BaseDAO{
	
	private PreparedStatement ps = null;
	
	private ResultSet rs = null;
	
	public static String USER_INFO_SQL = "SELECT * FROM EMPLOYEE.EMPLOYEES WHERE USERNAME=? AND PWD=?";	
	public Employee userInfo(String userName, String password){
		Employee employee = null;
		int colIndex = 1;
		
		try{
			ps = prepareStatement(USER_INFO_SQL);
			ps.setString(1, userName);
			ps.setString(2, password);
			rs = query();
			if(rs != null){
				
				while (rs.next()){
					employee = new Employee();
					employee.setEmp_id(rs.getInt(colIndex++));
					employee.setF_name(rs.getString(colIndex++));
					employee.setL_name(rs.getString(colIndex++));
					employee.setEmail_id(rs.getString(colIndex++));
					employee.setDob(rs.getDate(colIndex++));
					employee.setUserName(rs.getString(colIndex++));
					employee.setPassword(rs.getString(colIndex++));
				}
			}
					
		}catch(Exception ex){
			System.out.println("Unable to to execute SQL Statement "+ USER_INFO_SQL + "with input : userName="+userName+", password="+password);
			ex.printStackTrace();
		}finally{
			try {
				cleanup();
			} catch (Exception e) {
				System.out.println("Unable to close the connection");
				e.printStackTrace();
			}
		}
		
		return employee;
	}

}
