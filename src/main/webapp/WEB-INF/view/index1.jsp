<!DOCTYPE html>
<html lang="en">
<head>
 
</head>
<body>
<%@ include file="userHeader.jsp" %>
<div class="container">
  <h2>Carousel Example</h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
   
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

   
    <div class="carousel-inner">
      <div class="item active">
        <img src="resources/1.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="resources/2.jpg" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="resources/3.jpg" alt="New york" style="width:100%;">
      </div>
      
      <div class="item">
        <img src="resources/4.jpg" alt="New york" style="width:100%;">
      </div>
      
      <div class="item">
        <img src="resources/5.jpg" alt="New york" style="width:100%;">
      </div>
    </div>

    
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>