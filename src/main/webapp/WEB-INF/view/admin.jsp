<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body  background="resources\7.jpg">

<nav class="navbar navbar-default" style="background-color:cyan">
    <div class="container-fluid">
    <div class="navbar-header">
    </div>
    
    <ul class="nav navbar-nav">
    <li class="active"> <a href="home"><span class="glyphicon glyphicon-home"></span>HOME</a></li>
    </ul>
    
    <ul class="nav navbar-nav">
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="product">PRODUCT<span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="product">AddProduct</a></li>
        <li><a href="product">UpdateProduct</a></li>
        <li><a href="product">DelateProduct</a></li></ul>
        
      <!-- <title>Font Awesome Icons</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
          <i class="fa fa-list" style="font-size:24px"></i>--> 
         
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="category">CATEGORIES<span  class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="category">AddCategories</a></li>
        <li><a href="category">UpdateCategories</a></li>
        <li><a href="category">DelateCategories</a></li></ul>
      
  
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="supplier">SUPPLIER<span  class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="supplier">AddSupplier</a></li>
        <li><a href="supplier">UpdateSupplier</a></li>
        <li><a href="supplier">DelateSupplier</a></li>
        </ul>
        </li>
        </ul>  
       </div>
    </nav>
  
</body>
</html>
