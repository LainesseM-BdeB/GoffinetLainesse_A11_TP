<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>JSP - Hello World</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
	<link href="style/index.css" rel="stylesheet">
</head>
<body>
	<div class="main-container">
		<div class="card main-card col-sm-12" style="width: 18rem;">
			<img src="${root}/ressources/img/Descent%20into%20fire_small.jpg" class="card-img-top" alt="moon">
			<div class="card-body">
				<h5 class="card-title">To the moon!</h5>
				<p class="card-text">This is just a picture of a moon from my favorite astrophotographer.</p>
				<a href="404.html" class="btn btn-primary">This could go somewhere interesting!</a>
			</div>
		</div>
		<div>
			<a href="hello-servlet">Hello Servlet</a>
		</div>
	</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
</html>