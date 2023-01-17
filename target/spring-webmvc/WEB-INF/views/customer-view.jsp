<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Customer List</title>
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
    <h2>Customer List</h2>
</div>


<div id="container">

    <div id="content">

        <form:form action="customermanage" method="GET">
            <input type="submit" class="btn btn-success" value="Update Customer" class="add-button"/>
        </form:form>


        <table>
            <tr>
                <th>SL NO</th>
                <th>Customer NID</th>
                <th>Customer Name</th>
                <th>Customer Address</th>
                <th>Customer Email</th>
                <th>Customer Status</th>
            </tr>

            <c:forEach var="customers" items="${customers}">

                <tr>
                    <td> ${customers.id} </td>
                    <td> ${customers.cstid} </td>
                    <td> ${customers.cstname} </td>
                    <td> ${customers.cstaddress}</td>
                    <td> ${customers.cstemail}</td>
                    <td> ${customers.cststatus}</td>

                </tr>

            </c:forEach>

        </table>

    </div>

</div>

</body>
</html>
