<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<br><br>
<center><form action="Add" method="post">
<div>patient ID
<input type="number" name="ptid"/><br>
</div><br>
<div>patient Name
<input type="text" name="ptname"/><br>
</div><br>
<div>patient Address
<input type="text" name="ptaddr"/><br>
</div><br>
<div>patient Phone
<input type="number" name="phno"/><br>
</div><br>
<input type="submit" value="save"/>
</form>
<b><%= request.getAttribute("result") %></b></center>
</body>
</html>
