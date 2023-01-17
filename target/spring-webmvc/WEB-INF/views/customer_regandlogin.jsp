<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

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
    <title>Registration</title>

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
         <!--   <img class="backImg" src="${pageContext.request.contextPath}/resources/Images/home3.jpg" alt="">
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
                <div class="title">Customer Login</div>


                <form action="customerlogin" method="post">
                    <div class="input-boxes">
                        <div class="input-box">
                            <i class="fas fa-user"></i>
                            <input type="text" name="customerid" placeholder="Enter your NID" required>
                        </div>
                        <div class="input-box">
                            <i class="fas fa-lock"></i>
                            <input type="password" name="password" placeholder="Enter your password" required>
                        </div>

                        <div class="button input-box">
                            <input type="submit" value="Submit">
                        </div>
                        <div class="text sign-up-text">Don't have an account? <label for="flip">Sigup now</label></div>

                        <br>
                        <a href="http://localhost:8080/spring_webmvc_war_exploded/">Go to Homepage</a>


                    </div>
                </form>




            </div>


            <div class="signup-form">
                <div class="title">Customer Signup</div>
                <form:form action="createcustomer" modelAttribute="customer" method="POST">
                    <div class="input-boxes">
                        <div class="input-box">
                            <i class="fas fa-user"></i>
<%--                            <td><label>ID:</label></td>--%>
                            <td><form:input path="cstid" placeholder="Enter your NID" required="required"/></td>
                        </div>
                        <div class="input-box">
                            <i class="fas fa-user"></i>
                                <%--                            <td><label>ID:</label></td>--%>
                            <td><form:input path="cstname" placeholder="Enter your Name" required="required"/></td>
                        </div>
                        <div class="input-box">
                            <i class="fas fa-envelope"></i>
                                <%--                            <td><label>Email:</label></td>--%>
                            <td><form:input path="cstaddress" placeholder="Enter your address" required="required"/></td>
                        </div>
                        <div class="input-box">
                            <i class="fas fa-envelope"></i>
<%--                            <td><label>Email:</label></td>--%>
                            <td><form:input path="cstemail" placeholder="Enter your email" required="required"/></td>
                        </div>

                        <div class="input-box">
                            <i class="fas fa-lock"></i>
<%--                            <td><label>Password:</label></td>--%>
                            <td><form:input path="cstpassword" placeholder="Enter your password" required="required"/></td>
                            .
                        </div>
                        <div class="button input-box">
                            <input type="submit" class="btn btn-info" value="Save" class="save"/>
                        </div>
                        <div class="text sign-up-text">Already have an account? <label for="flip">Login now</label></div>

                        <br>
                        <a href="http://localhost:8080/spring_webmvc_war_exploded/">Go to Homepage</a>


                    </div>

                    </form:form>
            </div>
        </div>
    </div>
</div>




</body>
</html>