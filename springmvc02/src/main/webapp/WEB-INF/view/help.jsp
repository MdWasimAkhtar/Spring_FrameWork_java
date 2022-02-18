<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %> 
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
 <h2>...page...is loading</h2>
 <%-- 
 <%
   String name = (String)request.getAttribute("name");
 %>
   <%=name %>
   
   We can fetch Directly
   
   for traversing we can use JSTL
   --%>
   
     <h1> ${name} </h1>
     <h4>${l} </h4>
     <c:forEach var="item" items="${l}"> 
           <h2> ${item} </h2>
     </c:forEach>
     

</body>
</html>