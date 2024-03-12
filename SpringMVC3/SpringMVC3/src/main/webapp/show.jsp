<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html> <body>
<h2> List of ${CourseName} Courses </h2>
<ul>
<c:forEach var="cou" items="${MyCourses}">
<li> ${cou}</li>
</c:forEach>
</ul>
</body> 
</html>