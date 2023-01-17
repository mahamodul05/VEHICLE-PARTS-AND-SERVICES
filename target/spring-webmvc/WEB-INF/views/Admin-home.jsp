

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
<center><button type="button" class="btn btn-primary btn-lg custom"  onclick="window.location.href='Addshop'; return false;">View Shop</button></center>
<br>
<center><button type="button" class="btn btn-success btn-lg custom"  onclick="window.location.href='shopmanage'; return false;">Manage Shop</button></center>
<br>
<center><button type="button" class="btn btn-success btn-lg custom"  onclick="window.location.href='customermanage'; return false;">Manage Customer</button></center>
<br>
<center><button type="button" class="btn btn-success btn-lg custom"  onclick="window.location.href='viewcustomer'; return false;">View Customer</button></center>
<br>











</body>
</html>
