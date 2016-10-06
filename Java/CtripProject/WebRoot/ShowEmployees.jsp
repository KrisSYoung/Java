<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<%@ page import="com.ctrip.model.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SHOW EMPLOYEES</title>
</head>
<body>
	<table width="400" border="1">
		<thead>
			<tr>
				<td>CODE</td>
				<td>NAME</td>
				<td>Modify</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${empsList}" var="emp">
				<tr>
					<td><c:out value="${emp.code}"/></td>
					<td><c:out value="${emp.name}"/></td>
					<td><a href="UpdateEmployee?id=${emp.id}">Modify</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<%
		List<Employee> list = (List<Employee>) request.getAttribute("empsList");
		for(Employee emp : list) {
			out.println(emp.getCode());
			out.println(emp.getName());
		}
	%>
</body>
</html>