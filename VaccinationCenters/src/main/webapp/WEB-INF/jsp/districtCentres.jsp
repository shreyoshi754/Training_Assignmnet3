<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vaccine Centres By District</title>
</head>
<body>
    <header>Vaccine Centres by District</header>
    <div id="advert">
        <div id="inner">District Search
            <form id="form" action="/district/dis" method="post">
                Enter District Name: <input class="fill" type="text" name="district"><br>
                <input class="link" type="submit" value="Search">
            </form>
        </div>
    </div>
</body>
</html>