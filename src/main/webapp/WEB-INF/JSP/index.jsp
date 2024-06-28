<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>title page</title>
</head>
<body>
<h3>hello world</h3>
<ul>
<li>list 1</li>
<li>list 2</li>
<li>list 3</li>
</ul>
<h3>${map}</h3>

    <form action="/savesamples" method="POST">
        Id: <input type="text" name="id" /><br>
        Name: <input type="text" name="name" /><br>
        Age: <input type="text" name="age" /><br>
        
        <input type="submit" value="submit" />
    </form>

<div class="container">
	<table class="table table-striped">
		<caption>Your Employees are</caption>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${map}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.age}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>