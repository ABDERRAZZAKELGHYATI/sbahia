<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Edit product</title>
		<link href="/sbahia/css/add.css" rel="stylesheet" >
	</head>
	<body>
		<h1>Edit a product</h1>
        <div class="container">
            <form action="/firstwebapp/addArticle" method="POST">

              <div class="form-group">
                <label for="productImage">Product Image</label> <br>
                <input type="text" class="form-control" id="productImage" placeholder="Enter url of image" name="articleTitle">
              </div>
              
              <div class="form-group">
                <label for="productName">Product Name</label>  <br>
                <input type="text" class="form-control" id="productName" placeholder="Enter name of product" name="articleTitle">
              </div>
              
              <div class="form-group">
                <label for="productDescription">Product Description</label>  <br>
                <input type="text" class="form-control" id="productDescription" placeholder="Enter description of product" name="articleTitle">
              </div>

              <button type="submit" class="btn btn-dark btn-block mt-2">Edit Product</button>
            </form>
        </div>
	</body>
</html>