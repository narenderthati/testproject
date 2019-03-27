<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>AptechGlobal | Employee | login</title>
		<link rel="stylesheet" type="text/css" href="<c:url value='/css/styles.css'/>">
	</head>
	<body>
			<div id="header">
				<span> Employee</span>
			</div>
			<div id="login-css" align="center">
			<form action="/employee/login.do" method="post">
				<table id="login">
					<tr>
						<td><input type="text" placeholder=" Username" name="userName"/></td>
					</tr>
					<tr>
						<td><input type="password" placeholder=" password" name="password"/></td>
					</tr>
					<tr>
						<td>
							<input type="submit" name="Login" title="login" value="Login"/>
							 <a href='<c:url value="/register.jsp"/>'>New? click here to register</a>
						</td>
					</tr>
					
				</table>
				</form>
			</div>
</body>
</html>