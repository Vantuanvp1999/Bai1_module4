<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 6/16/2025
  Time: 8:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Ứng dụng đổi USD sang VND</h2>
<form action="convert" method="post">
  Tỉ giá (1 USD = ? VND): <input type="text" name="rate"/><br/>
  Số USD: <input type="text" name="usd"/><br/>
  <input type="submit" value="Chuyển đổi"/>
</form>
</body>
</html>
