<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="sform" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sform:form action="login" modelAttribute="loginform">
EmailAddress<sform:input path="email"/>
Password<sform:input path="password" type="password"/>
<input type="submit" value="Go"/>

</sform:form>
<h1>${Wronguser}</h1>

</body>
</html>