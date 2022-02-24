<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<style>
.p{
 color:#8bed4f;
 font-size:40px;
 font-weight:bold;
}
.main {
    text-align:center;   
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="main" style="background-image: url('https://static01.nyt.com/images/2017/02/16/well/doctors-hospital-design/doctors-hospital-design-superJumbo.jpg');">
<%@ include file="index.html" %>
<form class="main" action="DeletePatient"  name="f1" method="get" style="border:silver; border-width:2px; border-style:outset;">

<h2><label>enter patient id:</label></h2>
<input type="text" name="t1"><br><br>

<input type="submit" value="DELETE"> 

</form>
</body>
</html>