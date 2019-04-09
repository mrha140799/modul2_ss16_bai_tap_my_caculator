<%--
  Created by IntelliJ IDEA.
  User: TrongHa
  Date: 4/9/2019
  Time: 8:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <form method="post" action="/caculator">
    <input type="text" width="175px" name="so1" height="15px">
    <input type="text" width="175px" name="so2" height="15px">
    <br>
    <input type="submit" name="choise" value="+">
    <input type="submit" value="-" name="choise">
    <input type="submit" value="x" name="choise">
    <input type="submit" value="/" name="choise">
  </form>
  <h1>Result = ${rel}</h1>
  </body>
</html>
