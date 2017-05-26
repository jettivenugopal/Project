<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="userHeader.jsp" %>
<form method="post" action="perform_login">
<center>
<h1 style="color:#FFFFFF">Login Form</h1>
</center>
<fieldset>


	    <div class="form-group">
	    <div class="col-md-4">
				<label class="col-md-4 control-label" style="color:#FFFFFF">UserName</label>
				<input type="text" class="form-control" name="username" />
				</div>
				<br>
				<br>
				<br>
				
				</div>
				
		<div class="form-group">
		<div class="col-md-4">
				<label class="col-md-4 control-label" style="color:#FFFFFF">Password</label>
				<input type="password" class="form-control" name="password" />
				</div>
				<br>
				<br>
				<br>
			
				</div>
				
						
		<div class="form-group">
		<div class="col-md-4">
				<label class="col-md-4 control-label"  style="color:#FFFFFF"></label>
				<input type="submit" class="btn btn-lg btn-info" value="LOGIN"></input>
				<input type="checkbox" checked="checked" style="color:#FFFFFF" >Remember me
				</div>
				<br>
				<br>
				<br>
			
				</div>

      <div class="container" style="background-color:#ffffff">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button><>
      <span class="psw">Forgot <a href="#">password?</a></span>
      </div>

   </fieldset>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>