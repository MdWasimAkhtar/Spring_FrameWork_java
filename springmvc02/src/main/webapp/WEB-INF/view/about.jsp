<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
</head>
<body>
       <h3>about.jsp File</h3>
       
       
                   <% 
                   String name = (String) request.getAttribute("name");
                   Integer iid = (Integer) request.getAttribute("id");
                   %>
                   
         <h4>Hii How Are You today <%=name %> </h4>
         
         <%=iid %>
</body>
</html>