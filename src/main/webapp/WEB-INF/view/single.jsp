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

<center>
<h1 style="color:#FFFFFF">Product Details</h1>
</center>
<fieldset>
<table class="table table-bordered table-hover table-striped">
<tr><th>Image</th>

<th>Product name</th>
<th>Product Description</th>
<th>Price</th>
<th>Stock</th>

<th>Add Cart</th>
</tr> 
<core:forEach items="${ProductDetails}" var="product">
<tr class="success" >

                <td><img src="./resources/images/${product.productId}.jpg" style="height: 300px; width:350px"/></td>
                
                
                
                <td>${product.productname}</td>
                <th>${product.productDescription}</th>
                <td> ${product.productPrice}</td>
                <td>${product.productStock}</td>
                <input type="hidden" name="adpid" value=${product.productId }/>Quantity<input type="text" name="d" value="" />
                <td><a href="addCart?cart=${product.productId}"><button>Add Cart</button></a></td>

</tr>
</core:forEach>
</table>
</fieldset>
<%@ include file="footer.jsp" %>
</body>
</html>