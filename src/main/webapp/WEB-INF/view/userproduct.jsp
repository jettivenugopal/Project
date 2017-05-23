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
<%@ include file="userHeader.jsp" %>
<form:form class="form-horizontal" method="post" action="pro"	commandName="ProductDetails" enctype="multipart/form-data" >
<center>
<h1 style="color:#FFFFFF">Product Details</h1>
</center>
<fieldset>
<table class="table table-bordered table-hover table-striped">
<tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Stock</th>
<th>Price</th>
<th>Image</th>
</tr> 
<core:forEach items="${prodData}" var="product">
<tr class="success" >

                <td>${product.productId}</td> 
                <td>${product.productname}</td>
                <td>${product.supId}</td>
                <td> ${product.catId}</td>
                <td> ${product.productPrice}</td>
                <td>${product.productStock}</td>
                <td><a href="image?img=${product.productId}">
               
                <img src="./resources/images/${product.productId}.jpg" height="50px" width="50px"/></a></td>

</tr>
</core:forEach>
</table>

</fieldset>
</form:form>
</body>
</html>