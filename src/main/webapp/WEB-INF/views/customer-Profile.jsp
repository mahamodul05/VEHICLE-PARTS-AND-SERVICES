<%@ page import="com.domain.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<%
    Customer customer = (Customer) session.getAttribute("customer");
%>

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

<form action="update" method="post" novalidate>
    <div class="container rounded bg-white mt-5 mb-5">
        <div class="row">
            <div class="col-md-3 border-right">
                <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5"
                                                                                             width="150px"
                                                                                             src="https://cdn-icons-png.flaticon.com/512/727/727399.png?w=740&t=st=1672175974~exp=1672176574~hmac=7fa2883f427725b5cbfa9c351610c4f3e461ac02b5a2dfaa994702fb487cbfb6"><span
                        class="font-weight-bold"><%//=student.getStudentName()%></span><span
                        class="text-black-50"><%//=student.getStudentemaIL()%></span><span> </span></div>
            </div>
            <div class="col-md-5 border-right">
                <div class="p-3 py-5">
                    <div class="d-flex justify-content-between align-items-center mb-3">
                        <h4 class="text-right">Edit Profile</h4>
                    </div>
                    <div class="row mt-1">
                        <div class="col-md-6"><label class="labels">Name</label><input type="text" class="form-control"
                                                                                       name="cstname"
                                                                                       value="<%=customer.getCstname()%>" readonly>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-md-6"><label class="labels">NID</label><input type="text" class="form-control"
                                                                                       name="cstid"
                                                                                       value="<%=customer.getCstid()%>" readonly>
                        </div>
                    </div>
                    <div class="row mt-3">
                        <div class="col-md-12"><label class="labels">Address</label><input type="text" name="cstaddress"
                                                                                              class="form-control"
                                                                                              value="<%=customer.getCstaddress()%>">
                        </div>
                    </div>
                    <div class="row mt-4">
                        <div class="col-md-12"><label class="labels">Email</label><input type="text" name="cstemail"
                                                                                           class="form-control"
                                                                                           value="<%=customer.getCstemail()%>">
                        </div>
                    </div>
                    <div class="row mt-5">
                        <div class="col-md-12"><label class="labels">Password</label><input type="text" name="cstpassword"
                                                                                               class="form-control"
                                                                                               value="<%=customer.getCstpassword()%>">
                        </div>
                    </div>

                        <input type="hidden" name="cststatus"
                               class="form-control"
                               value="<%=customer.getCststatus()%>">

                        <input type="hidden" name="id"
                               class="form-control"
                               value="<%=customer.getId()%>">






                        <div class="mt-5 text-center">
                            <button type="submit" class="btn btn-primary profile-button">Update</button>
                        </div>


                    </div>
                </div>
            </div>
        </div>
    </div>





</form>
<%
    //  if (student.getStudentIsActive() == 1) {
%>
<script>
    document.getElementById("labelac").innerHTML = "Active";
    document.getElementById("labelac").style.color = "green"
</script>
<%//
//} //else {
%>
<script>
    document.getElementById("labelac").innerHTML = "Not Active"
    document.getElementById("labelac").style.color = "red"
</script>

<%
    //}
%>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
