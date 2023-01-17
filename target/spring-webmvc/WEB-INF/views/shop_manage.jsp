

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="Adminbody.jsp"/>
<html>
<head>
    <title>ADMIN- HOME </title>
    <style>
        .custom {
            width: 300px !important;
        }
        @import url('https://fonts.googleapis.com/css2?family=Roboto+Mono:wght@200&display=swap');
        .btn{
            font-family: 'Roboto Mono', monospace;
        }
    </style>
</head>
<body>

<br><br><br>

<form action="updatesearchshop" method="POST">
    Search user by Shop ID: <input type="text" name="shopid"/>
    <input type="submit" class="btn btn-success" value="Search" class="add-button"/>
</form>










</body>
</html>
