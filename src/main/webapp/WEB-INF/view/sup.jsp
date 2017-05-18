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
<%@ include file="admin.jsp" %>
<form:form class="form-horizontal" method="post" action="sup"	commandName="SupplierDetails" >
<center>
<h1 style="color:#FFFFFF">Supplier Form</h1>
</center>
<fieldset>
			<!-- Text input-->
		<div class="form-group">
					<label class="col-md-4 control-label" for="requestName" style="color:#FFFFFF">SupplierId</label>
					<div class="col-md-4">
					<form:input class="form-control input-md" path="supplierId" ></form:input>
					</div>
					</div>

				<!-- Text input-->
				

	    <div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF">SupplierName</label>
				<div class="col-md-4">
				<form:textarea class="form-control" path="supplierName" />
				</div>
				</div>
				
		<div class="form-group">
				<label class="col-md-4 control-label" for="comments" style="color:#FFFFFF">SupplierDescription
				</label>
				<div class="col-md-4">
				<form:textarea class="form-control" path="supplierDescription" />
				</div>
				</div>
		<div class="form-group">
					<label class="col-md-4 control-label" for="submit" style="color:#FFFFFF"></label>
					<div class="col-md-4">
					<input type="submit" class="btn btn-lg btn-info" value="submit"></input>
					</div>
				    </div>

</fieldset>
</form:form>

</body>
</html>