<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find flights</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container text-center">
<c:choose>
		<c:when test="${mode=='MODE_HOME' }">
			<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h1>Airline Reservation System</h1>
					<h3>Book tickets for better travel experience</h3>
				</div>
			</div>

		</c:when>
		</c:choose>
<form:form action="findMyFlight" method="POST">
<label>Source</label>
<form:input path="source"/>
<br/><br/>
<label>Destination</label>
<form:input path="destination"/>
<br/><br/>
<input type="submit" value="SEARCH">
</form:form>
</div>
</body>
</html>