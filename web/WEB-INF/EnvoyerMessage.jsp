<%-- 
    Document   : contact
    Created on : 3 mars 2021, 23:02:05
    Author     : Huawei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">
         <link rel="stylesheet"
                  href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css"
                  integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous"> 
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menuuser.jsp" %>
                 <img class="wave" src="img/wave.png">
         <img class="img" src="img/bg.svg">
         <div class="container">
            <br>
            <form action="SendEmail" method="Post">
                <center> 
                <table     >
                    <tr>
                        <td>Name</td>
                        <td><input type="text" required="" placeholder="Name" name="name" class="form-control"></td>
                    </tr>

                    <tr>
                        <td>Email</td>
                        <td><input type="email" required="" placeholder="Email" name="email" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>Sujet</td>
                        <td><input type="text" required="" placeholder="Subject" name="sujet" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>Message</td>
                        <td><textarea name="message" required="" rows="5" cols="100" placeholder="Ton Message"></textarea></td>
                    </tr>
                    <tr>
                        <td><input type="submit" id="submit" class="btn btn-primary active" value="Submit"></td>
                    </tr>
                </table>
                    </center>
            </form>

        </div>
    </body>
</html>
