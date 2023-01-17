<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>HOME PAGE</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="icon" href="resources/Images/ulogo.jpg" type="image/icon type">

    <style type="text/css">

        body{
            margin: 0; height: 100%; overflow: hidden;

        }
        .col-md-12{
            margin-top: 200px;
        }

    </style>
	
	<style>
	body {
  background-image: linear-gradient(rgb(103 78 78 / 45%), rgb(24 13 13 / 56%)),url('resources/Images/Home2.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>

<body>

<div class="row">
    <div class="col-md-12">
        <center><img class="logo" src="resources/Images/ulogo.jpg" width="400" length="200"></center>
        <br>
        <center><h1 style="color:white;font-size:70px">Vehicle Parts and Services</h1></center>
        <center><h1 style="color:white;font-size:20px">One stop solution for automobile</h1></center>
    </div>
</div><br><br>
<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8">

        <p align="middle">
            <a class="btn btn-warning btn-lg" onclick="window.location.href='admin/login'; return false;">ADMIN</a>
            <a class="btn btn-danger btn-lg" onclick="window.location.href='customer/registration'; return false;">CUSTOMER</a>
            <a class="btn btn-primary btn-lg" onclick="window.location.href='workshop/registration'; return false;">SHOP OWNER</a>
        </p>
    </div>
    <div class="col-md-2"></div>
</div>






</footer>

</body>
</html>