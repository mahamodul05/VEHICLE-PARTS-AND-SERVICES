<%@ page import="com.domain.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Customer customer = (Customer) session.getAttribute("customer");
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
    <h2>Customer Update</h2>
</div>


<div id="container">

    <div id="content">


        <form action="updatecustomer" modelAttribute="customer" method="POST">

            <table>
                <tr>
                    <td>Customer Name</td>
                    <td> <input type="text" name="cstname" value="<%=customer.getCstname()%>" readonly> </td>
                </tr>

                <tr>
                    <td>Customer NID</td>
                    <td> <input type="text" name="cstid" value="<%=customer.getCstid()%>" readonly> </td>
                </tr>

                <tr>
                    <td>Customer Address</td>
                    <td> <input type="text" name="cstaddress" value="<%=customer.getCstaddress()%>" readonly> </td>
                </tr>

                <tr>
                    <td>Customer Status (0 = Inactive, 1 = Active)</td>
                    <td> <input type="text" name="cststatus" value="<%=customer.getCststatus()%>"></td>
                </tr>


                <input type="hidden" name="id"
                       class="form-control" value="<%=customer.getId()%>">

                <input type="hidden" name="cstemail"
                       class="form-control" value="<%=customer.getCstemail()%>">
                <input type="hidden" name="cstpassword"
                       class="form-control" value="<%=customer.getCstpassword()%>">



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
