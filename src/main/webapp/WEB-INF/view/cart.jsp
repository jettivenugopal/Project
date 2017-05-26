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
<table class="table table-bordered table-hover table-striped">
<tr><th>Cart Id</th>
<th>Cart User</th>
<th>Product Id</th>
<th>Product Name</th>
<th>Product Price</th>
<th>Total Price</th>
<th>Image</th>
</tr> 
<core:forEach items="${CartData}" var="cart">
<tr class="success" >

                <td>${cart.cartId}</td> 
                <td>${cart.cartUser}</td>
                <td>${cart.proId}</td>
                <td>${cart.proName}</td>
                <td>${cart.proPrice}</td>
                <td>${cart.totalPrice}</td>
                <td><img src="./resources/images/${cart.proId}.jpg" height="200px" width="150px"/></td>

</tr>
</core:forEach>
<%@ include file="footer.jsp" %> 
</body>
</html>