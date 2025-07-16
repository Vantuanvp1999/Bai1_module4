<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 7/16/2025
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <style>
        table {
            border: 1px solid #000;
        }

        th, td {
            border: 1px dotted #555;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>ID:</th><td>${customer.id}</td></tr>
       <tr> <th>Name:</th><td>${customer.name}</td></tr>
        <tr><th>Email:</th><td>${customer.email}</td></tr>
       <tr> <th>Address:</th><td>${customer.address}</td></tr>

</table>
<a href="/customers" >Back to customers list</a>
</body>
</html>
