<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>enter book details...</h2>
<form action="save" method="post">

<pre>
id<input type="text" name="id"/>

author<input type="text" name="author"/>
title<input type="text" name="title"/>
<input type="submit" value="save"/>
</pre>

</form>
${msg }
</div>
</body>
</html>