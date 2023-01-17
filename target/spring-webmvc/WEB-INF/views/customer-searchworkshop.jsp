<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Shop List</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
    <jsp:include page="Customerbody.jsp"/>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@0,200;1,700&display=swap');

        h2{
            font-family: 'Roboto Mono', monospace;
        }
    </style>

</head>
<body>


<div id="ctitle">
    <h2>WorkShops List</h2>
</div>


<div id="container">

    <div id="content">

        <form:form action="searchworkshop" method="GET">
            Search Shop by Shop Type (Car/Bike/Truck/Bus): <input type="text" name="searchValue"/>
            <input type="submit" class="btn btn-success" value="Search" class="add-button"/>
        </form:form>


        <table>
            <tr>
                <th>Shop ID</th>
                <th>Shop Name</th>
                <th>Shop Address</th>
                <th>Shop Services</th>
                <th>Shop Status</th>
            </tr>

            <c:forEach var="shops" items="${shops}">

                <tr>
                    <td> ${shops.id} </td>
                    <td> ${shops.shopname} </td>
                    <td> ${shops.shopaddress} </td>
                    <td> ${shops.service}</td>
                    <td> ${shops.shopstatus}</td>
                </tr>

            </c:forEach>

        </table>

    </div>

</div>

</body>
</html>
