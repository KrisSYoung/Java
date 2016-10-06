<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
		<title>UPDATE EMPLOYEE</title>
	</head>
	<body>
		<form action="SaveEmployee" method="post">
			<table width="300">
				<tr>
					<td><input type="hidden" name="id" value="${emp.id}"/></td>
				</tr>
				<tr>
					<td>code:</td>
					<td><input type="text" name="empCode" value="${emp.code}"/></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="empName" value="${emp.name}"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save"/></td>
				</tr>
			</table>
		</form>
	</body>
</html>
