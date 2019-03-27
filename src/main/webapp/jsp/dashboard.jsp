<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>AptechGlobal | Employee</title>
		<link rel="stylesheet" type="text/css" href="<c:url value='/css/styles.css'/>">
	</head>
	<body>
			<div id="header">
				<span> Employee</span>
			</div>
			<div style="clear:both;"></div>
			<div align="center">
				<table>
					<tr>
						<td> Employee ID</td>
						<td>${employee.emp_id}</td>
							
					</tr>
					<tr>
						<td>First Name</td>
						<td>${employee.f_name}</td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td>${employee.l_name}</td>
					</tr>
					<tr>
						<td>Email</td>
						<td>${employee.email_id }</td>
					</tr>
					<tr>
						<td>Date Of Birth</td>
						<td>${employee.dob }</td>
					</tr>
					<tr>
						<td>User Name</td>
						<td>${employee.userName }</td>
					</tr>
				
				</table>
			
			</div>

</body>
</html>