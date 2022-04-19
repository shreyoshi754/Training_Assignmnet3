<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Vaccination Centres</title>
</head>
<body>
<h1 style="font-size:60px;">All Vaccination Centre Details</h1>
	<table border="2" width="70%" cellpadding="2">
        <tr>
        	<th>Centre Id</th>
            <th>Centre Name</th>
            <th>Pincode</th>
            <th>District</th>
            <th>State</th>
        </tr>
        <c:forEach var="lst" items="${list}">
            <tr>
                <td>${lst.id}</td>
                <td>${lst.cName}</td>
                <td>${lst.cPincode}</td>
                <td>${lst.cDistrict}</td>
                <td>${lst.cState()}</td>
            </tr>
        </c:forEach>
    </table>
<br>
 		<a class="link" href="/api/v1/dist">Search by District</a>
        <br><br>
        <a  class="link" href="/api/v1/pin">Search by Pincode</a>
        <br><br>
        <a class="link" href="/">Home</a>
</body>
</html>