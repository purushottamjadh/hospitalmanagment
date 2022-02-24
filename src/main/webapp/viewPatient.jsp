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

<form action="ViewPatient"  name="f1" method="get" >
<label>enter patient id</label>
<input type="text" name="t1">
<input type="submit" value="SUBMIT"> 
</form>
</body>
</html>