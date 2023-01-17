<%@ page import="com.domain.Shop" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<%
    Shop shop = (Shop) session.getAttribute("shop");
%>

<!DOCTYPE html>

<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8">

    <link rel="stylesheet" href="CSS/Votersregstyle.css"/>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/studentreg.css"/>

    <link rel="icon" href="${pageContext.request.contextPath}/resources/Images/ulogo.jpg" type="image/icon type">



    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>



    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Workshop Registration</title>

</head>
<body>
<div class="container">
    <input type="checkbox" id="flip">
    <div class="cover">
        <div class="front">
            <div class="text">
                <span class="text-1"><br></span>
                <span class="text-2"></span>
            </div>
        </div>
        <div class="back">
            <!--     <img class="backImg" src="${pageContext.request.contextPath}/resources/Images/ulogo.jpg" alt="">
           -->

            <div class="text">
                <span class="text-1"> <br> </span>
                <span class="text-2"></span>
            </div>
        </div>
    </div>
    <div class="forms">
        <div class="form-content">
            <div class="login-form">
                <div class="title">Workshop Login</div>


                <form action="workshoplogin" method="post">
                    <div class="input-boxes">
                        <div class="input-box">
                            <i class="fas fa-user"></i>
                            <input type="text" name="ownerid" placeholder="Enter WorkShop Owner NID" required>
                        </div>
                        <div class="input-box">
                            <i class="fas fa-lock"></i>
                            <input type="password" name="password" placeholder="Enter Password" required>
                        </div>

                        <div class="button input-box">
                            <input type="submit" value="Submit">
                        </div>
                        <div class="text sign-up-text">Don't have an account? <label for="flip">Sigup now</label></div>
                    </div>
                </form>

                <br>
                <a href="http://localhost:8080/spring_webmvc_war_exploded/">Go to Homepage</a>
            </div>


            <div class="signup-form">
                <div class="title">Signup</div>
                <form:form action="createworkshop" modelAttribute="shop" method="POST">
                    <div class="input-boxes">
                        <div class="input-box">
                            <i class="fas fa-user"></i>
                                <%--                            <td><label>Workshopname</label></td>--%>
                            <td><form:input path="shopname" name = "shopname" required="required" placeholder='Write Shop Name'/></td>
                        </div>
                        <div class="input-box">
                            <i class="fas fa-envelope"></i>
                                <%--                            <td><label>Workshopaddress:</label></td>--%>
                            <td><form:input path="shopaddress" name="shopaddress" required="required" placeholder='Write Shop Address' /></td>
                        </div>
                        <div class="input-box">
                            <i class="fas fa-envelope"></i>
                                <%--                            <td><label>Workshopaddress:</label></td>--%>
                            <td><form:input path="tradelicense" name="tradelicense" required="required" placeholder='Trade Licence' /></td>
                        </div>
                        <div class="input-box">
                            <i class="fas fa-address-book"></i>
                                <%--                            <td><label>Password:</label></td>--%>
                            <td><form:input path="service" name="service" required="required" placeholder='(Car/Bus/Bike/Truck)'/></td>
                            .

                        </div>
                        <div class="input-box">
                            <i class="fas fa-map-marker-alt"></i>
                                <%--                            <td><label>Password:</label></td>--%>
                            <td><form:input path="ownername" name="ownername" required="required" placeholder='Owner Name'/></td>
                            .

                        </div>
                        <div class="input-box">
                            <i class="fas fa-clock"></i>
                                <%--                            <td><label>Password:</label></td>--%>
                            <td><form:input path="ownerid" name="ownerid" required="required" placeholder='Owner NID'/></td>
                            .

                        </div>
                        <div class="input-box">
                            <i class="fas fa-key"></i>
                                <%--                            <td><label>Password:</label></td>--%>
                            <td><form:input path="password" name="password" required="required" placeholder='Password'/></td>
                            .

                        </div>



                        <input type="hidden" name="shopstatus"
                               class="form-control" value="1">

                        <div class="button input-box">
                            <input type="submit" class="btn btn-info" value="Save" class="save"/>
                        </div>
                        <div class="text sign-up-text">Already have an account? <label for="flip">Login now</label></div>
                    </div>
                </form:form>

                <br>
                <a href="http://localhost:8080/spring_webmvc_war_exploded/">Go to Homepage</a>

            </div>
        </div>
    </div>
</div>


<%
    if (request.getAttribute("msg")=="failed") {


%>

<script>
    Swal.fire({
        icon: 'error',
        title: 'Wrong Password',
        text: 'Try Again!',

    })

</script>
<%

    }

%>

</body>
</html>