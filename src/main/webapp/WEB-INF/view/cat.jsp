<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="admin.jsp" %>
<form:form class="form-horizontal" method="post" action="cat"	commandName="CategoryDetails" >
<center>
<h1 style="color:#FFFFFF">Category Form</h1>
</center>
<fieldset>

		<div class="form-group">
				<label class="col-md-4 control-label" for="requestName" style="color:#FFFFFF">CategoryId</label>
				<div class="col-md-4">
				<form:input class="form-control input-md" path="categoryId" ></form:input>
				</div>
				</div>

				
	    <div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF">CategoryName</label>
				<div class="col-md-4">
				<form:textarea class="form-control" path="categoryName" />
				</div>
				</div>
				
		<div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF">CategoryDescription</label>
				<div class="col-md-4">
				<form:textarea class="form-control" path="categoryDescription" />
				</div>
				</div>
				
		<div class="form-group">
				<label class="col-md-4 control-label" for="submit" style="color:#FFFFFF"></label>
				<div class="col-md-4">
				<input type="submit" class="btn btn-lg btn-info" value="${bname}"></input>
				</div>
				</div>

   </fieldset>
</form:form>

<table class="table table-bordered table-hover table-striped">
<tr><th>Category Id</th>
<th>Category name</th>
<th>Category Description</th>
<th>Edit</th>
<th>Delete</th>
</tr> 
<core:forEach items="${catData}" var="category">
<tr class="success" >

                <td>${category.categoryId}</td> 
                <td>${category.categoryName}</td>
                <td>${category.categoryDescription}</td>
                
                <td><a href="updatecat?catid=${category.categoryId}">Edit</a></td>
                <td><a href="deletecat?catid=${category.categoryId}">Delete</a></td>
                
</tr>
</core:forEach>
</table>

</body>
</html>