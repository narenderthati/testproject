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
			<div id="body">
			
				<ul id="menu">
					<li><a href='<c:url value="jsp/login.jsp"/>'>Login</a>  </li>
					<li><a href='<c:url value="jsp/register.jsp"/>'>Register</a></li>
					<li><a href='<c:url value="jsp/dashboard.jsp"/>'>Dashboard</a></li>
				</ul>
			</div>
			<div id="footer"></div>
	</body>
</html>