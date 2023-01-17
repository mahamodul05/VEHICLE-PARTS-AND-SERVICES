<%@ page import="com.domain.Shop" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Shop shop = (Shop) session.getAttribute("shop");
%>

<html>
<head>

    <title>Shop List</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
    <jsp:include page="Adminbody.jsp"/>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@0,200;1,700&display=swap');

        h2{
            font-family: 'Roboto Mono', monospace;
        }
    </style>


</head>
<body>

<div id="ctitle">
    <h2>Shop Update</h2>
</div>


<div id="container">

    <div id="content">


        <form action="updateshop" modelAttribute="shop" method="POST">

            <table>
                <tr>
                    <td>Shop ID</td>
                    <td> <input type="text" name="shopid" value= "<%=shop.getId()%>" readonly> </td>
                </tr>

                <tr>
                    <td>Shop Name</td>
                    <td> <input type="text" name="shopname" value="<%=shop.getShopname()%>" readonly> </td>
                </tr>

                <tr>
                    <td>Shop Address</td>
                    <td> <input type="text" name="shopaddress" value="<%=shop.getShopaddress()%>" readonly> </td>
                </tr>

                <tr>
                    <td>Shop Services</td>
                    <td> <input type="text" name="service" value="<%=shop.getService()%>" readonly> </td>
                </tr>

                <tr>
                    <td>Shop Status (0 = Inactive, 1 = Active)</td>
                    <td> <input type="text" name="shopstatus" value="<%=shop.getShopstatus()%>"> </td>
                </tr>

                <tr>
                    <td>Shop Owner Name</td>
                    <td> <input type="text" name="ownername" value="<%=shop.getOwnername()%>"> </td>
                </tr>

                <tr>
                    <td>Shop Owner NID</td>
                    <td> <input type="text" name="ownerid" value="<%=shop.getOwnerid()%>"> </td>
                </tr>
                <input type="hidden" name="password"
                       class="form-control" value="<%=shop.getPassword()%>">
                <input type="hidden" name="tradelicense"
                       class="form-control" value="<%=shop.getTradelicense()%>">

                <tr>
                    <td colspan="2"> <input type="submit" name="submit" value="Update"> </td>
                </tr>

            </table>

        </form>


        <br><br><br>

        <a href="${pageContext.request.contextPath}/admin/Admin">Go back</a>


    </div>

</div>






</body>
</html>
