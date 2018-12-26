<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color: green; text-align: center">Home Page</h1>

<table align="center" border="2" cellpadding="5" cellspacing="5">
	<tr>
		<td colspan="3" align="center"><h3
				style="color: green; text-align: center">Student Data</h3></td>
		<td align="center" colspan="3"><form action="showForm">
				<input type="submit" value="Add" />
			</form></td>
	</tr>
	<student:if test="${!empty listDTO}">
		<tr>
			<td><h4>Student No</h4></td>
			<td><h4>Student Name</h4></td>
			<td><h4>Age</h4></td>
			<td><h4>Student Aadhar No</h4></td>
			<td><h4>EDIT</h4></td>
			<td><h4>DELETE</h4></td>
		</tr>
		<student:forEach var="dto" items="${listDTO}">

			<tr>
				<td>${dto.stdNo}</td>
				<td>${dto.stdName}</td>
				<td>${dto.stdAge}</td>
				<td>${dto.stdAadharNo}</td>
				<td><form action="editForm" method="post">
				       <input type="hidden" name="stdNo" value="${dto.stdNo}" />
						<input type="submit" value="EDIT" />
					</form></td>
				<td><form action="deleteForm" method="post">
				        <input type="hidden" name="stdNo" value="${dto.stdNo}" />
						<input type="submit" value="DELETE" />
					</form></td>
			</tr>
		</student:forEach>
	</student:if>

</table>