<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Happy Shop Homepage</title>

  <!-- Bootstrap core CSS -->
  <link href="/resources/res/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="/resources/res/css/shop-homepage.css" rel="stylesheet">
  
  <script>

  </script>

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Happy Shop</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3">

        <h1 class="my-4">Happy Shop</h1>

        
        <div class="dropdown">
		  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		    Category
		  </button>
		  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
		    <c:forEach var = "category" items="${categoryList}">
				<a class="dropdown-item" href="/${category.category_id}">${category.category_name}</a>
			</c:forEach>
		  </div>
		</div>
		<p></p>
		<div class="list-group">
          <a href="/priceUnder/20" class="list-group-item">$20 and Under</a>
          <a href="/priceUnder/40" class="list-group-item">$40 and Under</a>
          <a href="/priceUnder/60" class="list-group-item">$60 and Under</a>
        </div>

      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

        <!-- <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
              <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Third slide">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div> -->
        

	        <div class=dropdown style="text-align: right;" >			  
			  <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
			   Sort by <span class="caret"></span>
			  </button>
			  
			  <ul class="dropdown-menu" role="menu">
			    <li><a class="dropdown-item" href="/sortBy/PriceDesc">Price High to Low</a></li>
    			<li><a class="dropdown-item" href="/sortBy/PriceAsc">Price Low to High</a></li>
			  </ul>
			</div>


        <div class="row">
	        <c:forEach var = "prodcuct" items="${productList}">
				<div class="col-lg-4 col-md-6 mb-4">
		            <div class="card h-100">
		              <a href="#"><img class="card-img-top" src="/resources/res/img/${prodcuct.product_img}.JPG" alt=""></a>
		              <div class="card-body">
		                <h4 class="card-title">
		                  <a href="#">${prodcuct.product_name}</a>
		                </h4>
		                <h5>$${prodcuct.product_price}</h5>
		                <!-- <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p> -->
		              </div>
		              <div class="card-footer">
		               <!--  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small> -->
		              </div>
		            </div>
	            </div>
	
			</c:forEach>
        </div>
        <!-- /.row -->

      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->
  
  

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="/resources/res/vendor/jquery/jquery.min.js"> </script>
  <script src="/resources/res/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
