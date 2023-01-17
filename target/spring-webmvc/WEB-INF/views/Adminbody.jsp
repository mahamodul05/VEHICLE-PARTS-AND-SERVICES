<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/navbar.css"/>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="icon" href="${pageContext.request.contextPath}/resources/Images/ulogo.jpg" type="image/icon type">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto+Mono:wght@200&display=swap');
   li{
       font-family: 'Roboto Mono', monospace;
   }


    </style>

</head>
<body>
<div class="menu-bar">
    <h1 class="logo"><img src="${pageContext.request.contextPath}/resources/Images/ulogo.jpg"  width="50" height="50" alt="logo"><span>VSC</span></h1>


    <ul>
        <li><a href="${pageContext.request.contextPath}/admin/Admin">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/admin/login">Logout</a></li>
    </ul>

</div>



</body>
</html>