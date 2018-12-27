<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color: green; text-align: center">Student Form</h1>
<script type="text/javascript">
	function validate() {
		var id = document.student.stdNo.value;
		var sname = document.student.stdName.value;
		var age = document.student.stdAge.value;
		var aadhar = document.student.stdAadharNo.value;
		 alert(id+sname+age+aadhar);
		return false;
	}
</script>
<form name="student" action="add" method="post" onsubmit="return validate()">
	<table align="center" border="2" cellpadding="5" cellspacing="5">
		<tr>
			<td>Student Id:</td>
			<td><input type="text" name="stdNo" /></td>
		</tr>
		<tr>
			<td>Student Name:</td>
			<td><input type="text" name="stdName" /></td>
		</tr>
		<tr>
			<td>Student Age:</td>
			<td><input type="text" name="stdAge" /></td>
		</tr>
		<tr>
			<td>Student Aadhaar:</td>
			<td><input type="text" name="stdAadharNo" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="SUBMIT" />&nbsp;<input type="reset" value="RESET" />&nbsp;<input
				type="button" value="BACK" onclick="history.back()" /></td>
		</tr>
	</table>
</form>