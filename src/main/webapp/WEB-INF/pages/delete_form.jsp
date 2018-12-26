<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color: green; text-align: center">Student Form</h1>
<form action="delete" method="post">
	<table align="center" border="2" cellpadding="5" cellspacing="5">
		<tr>
			<td>Student Id: </td>
			<td><input type="text" name="stdNo" value="${dto.stdNo}"/></td>
		</tr>
		<tr>
			<td>Student Name: </td>
			<td><input type="text" name="stdName" value="${dto.stdName}"/></td>
		</tr>
		<tr>
			<td>Student Age:</td>
			<td><input type="text" name="stdAge" value="${dto.stdAge}"/></td>
		</tr>
		<tr>
			<td>Student Aadhaar: </td>
			<td><input type="text" name="stdAadharNo" value="${dto.stdAadharNo}"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="DELETE"/>&nbsp;<input type="button" value="BACK" onclick="history.back()"/> </td>
		</tr>
	</table>
</form>