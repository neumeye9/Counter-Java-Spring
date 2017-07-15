<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Current visit count</title>
	</head>
	<body>
		<p> You have visited <a href="/">http://localhost:8080</a> <c:out value ="${counter2}"/></p>
		<br>
		<br>
		<a href="/">Test another visit?</a>
	</body>
</html>