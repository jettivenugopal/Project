<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="admin.jsp" %>
<form:form class="form-horizontal" method="post" action="pro"	commandName="ProductDetails" enctype="multipart/form-data" >
<center>
<h1 style="color:#FFFFFF">Product Form</h1>
</center>
<fieldset>
			<!-- Text input-->
		<div class="form-group">
					<label class="col-md-4 control-label" for="requestName" style="color:#FFFFFF">ProductId</label>
					<div class="col-md-4">
					<form:input class="form-control input-md" path="ProductId" ></form:input>
					</div>
					</div>

				<!-- Text input-->
				

	    <div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF">ProductName</label>
				<div class="col-md-4">
				<form:textarea class="form-control" path="productname" />
				</div>
				</div>
				
		<div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF">ProductDescription
				</label>
				<div class="col-md-4">
				<form:textarea class="form-control" path="ProductDescription" />
				</div>
				</div>
		<div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF">ProductPrice
				</label>
				<div class="col-md-4">
				<form:input class="form-control" path="ProductPrice" />
				</div>
				</div>
				
				
				<div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF">Category Name
				</label>
				<div class="col-md-4">
				<form:select class="form-control" path="catId" >
				<form:option value="-1"> select category name</form:option>
                <core:forEach items="${catData}" var="cat">
                <form:option value="${cat.categoryId}">${cat.categoryName}</form:option>
                </core:forEach>
                </form:select>
				</div>
				</div>
				
				
				<div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF">Supplier Name
				</label>
				<div class="col-md-4">
				<form:select class="form-control" path="supId" >
				<form:option value="-1"> select supplier name</form:option>
                <core:forEach items="${supData}" var="sup">
                <form:option value="${sup.supplierId}">${sup.supplierName}</form:option>
                </core:forEach>
                </form:select>
				</div>
				</div>
				
				<div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF ">Upload Image</label>
				<div class="col-md-4">
				<form:input type="file" path="pImage" />
				</div>
				</div>
				
				
				
                    <div class="form-group">
					<label class="col-md-4 control-label" for="submit" style="color:#FFFFFF"></label>
					<div class="col-md-4">
					<input type="submit" class="btn btn-lg btn-info" value="submit"></input>
					</div>
				    </div>
</form:form>

<table class="table table-bordered table-hover table-striped">
<tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Price</th>
<th>Edit</th>
<th>Delete</th>
<th>Image</th>
</tr> 
<core:forEach items="${prodData}" var="product">
<tr class="success" >

                <td>${product.productId}</td> 
                <td>${product.productname}</td>
                <td>${product.supId}</td>
                <td> ${product.catId}</td>
                <td> ${product.productPrice}</td>
                <td><a href="UpdateAdmprod?adpid=${product.productId}">Edit</a></td>
                <td><a href="deleteprod?delpid=${product.productId}">Delete</a></td>
                <td><img src="./resources/images/${product.productId}.jpg" height="50px" width="50px"/></td> 

</tr>
</core:forEach>

</table>

</body>
</html>