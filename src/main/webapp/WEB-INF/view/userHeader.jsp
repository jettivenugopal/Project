<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <title>Font Awesome Icons</title>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body background="resources\7.jpg">

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
    <div class="navbar-header">
    <a class="navbar-brand" style="color:#FFFFFF" href="#"><i><b>eBOOK STORE</b></i>  <span class="fa fa-book" style="font-size:24px;color:Gray" ></span></a>
    </div>
   
    
    <ul class="nav navbar-nav">
          <li class="active"> <a href="home"><span class="fa fa-home" style="font-size:26px" ></span></a></li>
          <li class="dropdown"><a href="admn">ADMINSTRATOR</a></li>
          <li class="dropdown"><a href="userpro">PRODUCT</a>
         </li>
        </ul>
        
      
    <form class="navbar-form navbar-left">
      <div class="input-group">
             <input type="text" class="form-control" size="50" placeholder="Search for Books" required>
             <div class="input-group-btn">
             <button type="button" class="btn btn-default" type="submit">
             <i class="glyphicon glyphicon-search"></i>
             </button>
            </div>
           </div>
          </form>
      
   <ul class="nav navbar-nav navbar-right">
       <li class="hidden-sm hidden-xs"></li>
             <li><a href="login" class="link-button-color"><span class="glyphicon glyphicon-log-in"></span> Log In</a></li>
             <li><a href="reg" class="link-button-color"><span class="glyphicon glyphicon-user"></span> Register</a></li>
             </ul>
            </div>
           </nav>
</body>
</html>
