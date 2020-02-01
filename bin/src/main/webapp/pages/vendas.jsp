<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- inluir elemento na página -->
	<jsp:include page="template/header.jsp"></jsp:include>

	<c:if test="${ empty sessionScope.user }">
		<jsp:forward page="../login.jsp"></jsp:forward>
	</c:if>

	<div class="container">
		<div class="row justify-content-center">
			<div class="col-10 ">
				<div class="row">
					<div class="col-4">
						<div class="card p-2 text-center" style="width: 18rem;">
							<img width="200px" alt="cart"
								src="${pageContext.request.contextPath}/img/iphone.png">
							<div class="card-body">
								<h5 class="card-title">Iphone</h5>
								<p class="card-text">texto</p>
								<a href="#" class="btn btn-success">Go somewhere</a>
							</div>
						</div>
					</div>
					<div class="col-4">
						<div class="card p-2 text-center" style="width: 18rem;">
							<img width="200px" alt="cart"
								src="${pageContext.request.contextPath}/img/iphone.png">
							<div class="card-body">
								<h5 class="card-title">Iphone</h5>
								<p class="card-text">texto</p>
								<a href="#" class="btn btn-success">Go somewhere</a>
							</div>
						</div>
					</div>
					<div class="col-4">
						<div class="card p-2 text-center" style="width: 18rem;">
							<img width="200px" alt="cart"
								src="${pageContext.request.contextPath}/img/iphone.png">
							<div class="card-body">
								<h5 class="card-title">Iphone</h5>
								<p class="card-text">texto</p>
								<a href="#" class="btn btn-success">Go somewhere</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row p-4">
				<div class="col-4">
					<div class="card p-2 text-center" style="width: 18rem;">
						<img width="200px" alt="cart"
							src="${pageContext.request.contextPath}/img/iphone.png">
						<div class="card-body">
							<h5 class="card-title">Iphone</h5>
							<p class="card-text">texto</p>
							<a href="#" class="btn btn-success">Go somewhere</a>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="card p-2 text-center" style="width: 18rem;">
						<img width="200px" alt="cart"
							src="${pageContext.request.contextPath}/img/iphone.png">
						<div class="card-body">
							<h5 class="card-title">Iphone</h5>
							<p class="card-text">texto</p>
							<a href="#" class="btn btn-success">Go somewhere</a>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="card p-2 text-center" style="width: 18rem;">
						<img width="200px" alt="cart"
							src="${pageContext.request.contextPath}/img/iphone.png">
						<div class="card-body">
							<h5 class="card-title">Iphone</h5>
							<p class="card-text">texto</p>
							<a href="#" class="btn btn-success">Go somewhere</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>