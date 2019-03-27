package com.aptechglobal.web.employee.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aptechglobal.web.employee.dto.Employee;
import com.aptechglobal.web.employee.services.UserService;
import com.aptechglobal.web.employee.services.UserServiceImpl;

public class LoginServlet  extends HttpServlet{
	
	
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
//	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		UserService userService = new UserServiceImpl();
		Employee employee = userService.userInfo(userName, password);
		String destinationPg = "";
		RequestDispatcher requestDispatcher = null;
		
		if(employee != null){
			request.setAttribute("employee", employee);
			destinationPg = "jsp/dashboard.jsp";
			requestDispatcher = request.getRequestDispatcher(destinationPg);
			requestDispatcher.forward(request, response);
			
		}else{
			request.setAttribute("error", "Invalid UserName/Password");
			destinationPg = "jsp/login.jsp";
			requestDispatcher = request.getRequestDispatcher(destinationPg);
			requestDispatcher.forward(request, response);
			
		}
		
		
	} 

	
}
