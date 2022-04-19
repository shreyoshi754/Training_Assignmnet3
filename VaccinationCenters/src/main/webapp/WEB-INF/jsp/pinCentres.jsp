<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vaccine Centres By Pincode</title>
</head>
<body>
    <header>Vaccine Centres by Pincode</header>
    <div id="advert">
        <div id="inner">PinCode Search
            <form id="form" action="/pincode/pin" method="post">
                Enter PinCode: <input class="fill" type="number" name="pincode"><br>
                <input class="link" type="submit" value="Search">
            </form>
        </div>
    </div>
</body>
</html>