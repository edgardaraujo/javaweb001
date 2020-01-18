<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
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
			<div class="col-10">
				<div class="row pt-4">
					<div class="col-sm-4">
						<div class="card">
							<div class="card-body">
								<h5 class="card-title">Minhas contas</h5>
								<p class="card-text">With supporting text below as a natural
									lead-in to additional content.</p>
								<a href="#" class="btn btn-success">Voltar</a>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="card">
							<div class="card-body">
								<h5 class="card-title">Gestão de produtos</h5>
								<p class="card-text">With supporting text below as a natural
									lead-in to additional content.</p>
								<a href="#" class="btn btn-success">Voltar</a>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="card">
							<div class="card-body">
								<h5 class="card-title">Gestão de usuários</h5>
								<p class="card-text">With supporting text below as a natural
									lead-in to additional content.</p>
								<a href="#" class="btn btn-success">Voltar</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	home</br>
	${ sessionScope.user } </br> 
	${ sessionScope.pass }
</body>
</html>