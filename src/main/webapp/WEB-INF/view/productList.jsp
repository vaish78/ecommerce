<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>All Products</h1>

            <p class="lead">Checkout all the awesome products available now!</p>
      

        <table class="table table-striped table-hover">
            <thead>
                <tr class="bg-success">
                    
                    <th>Product Name</th>
                    <th>description</th>
                 
                    <th>Price</th>
                    
                </tr>
            </thead>
            <c:forEach items="${products}" var="product">
                <tr>
                  
                    <td>${product.prod_name}</td>
                    <td>${product.prod_description}</td>
                    <td>${product.price}</td>
                    <td><a href="<spring:url value="/product/viewProduct/${product.prod_id}" />"><span class="glyphicon glyphicon-info-sign"></span></a></td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>