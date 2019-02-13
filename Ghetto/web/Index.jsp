<%-- 
    Document   : Index
    Created on : 13/11/2018, 05:58:46 PM
    Author     : Tamayo B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="css/fontawesome-all.min.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" href="css/Footer.css">
        <title>Ghetto</title>
    </head>
    <body>
        <header class="banner">
        </header>
       
        <%@include file="Navbar.jsp" %>
        
        <section class="section1">
            <div class="container">
                <div class="flex">
                    <div class="container">
                        <div id="demo" class="carousel slide carusel" data-ride="carousel">
                            <!-- Carrusel -->
                            <ul class="carousel-indicators ">
                                <li data-target="#demo" data-slide-to="0" class="active"></li>
                                <li data-target="#demo" data-slide-to="1"></li>
                                <li data-target="#demo" data-slide-to="2"></li>
                                <li data-target="#demo" data-slide-to="3"></li>
                                <li data-target="#demo" data-slide-to="4"></li>
                            </ul>
                            <!-- The slideshow -->
                            <div class="carousel-inner text-center">
                                <div class="carousel-item active">
                                    <img class="imagen1" src="imagenes/foto.png" alt="Los Angeles">
                                </div>
                                <div class="carousel-item">
                                    <img class="imagen1" src="imagenes/F11.jpg" alt="Chicago">
                                </div>
                                <div class="carousel-item">
                                    <img class="imagen1" src="imagenes/F12.jpg" alt="390">
                                </div>
                                <div class="carousel-item">
                                    <img class="imagen1" src="imagenes/F15.jpg" alt="391">
                                </div>
                                <div class="carousel-item">
                                    <img class="imagen1" src="imagenes/F18.jpg" alt="392">
                                </div>
                            </div>
                            <!-- Left and right controls -->
                            <a class="carousel-control-prev prev-at" href="#demo" data-slide="prev">
                                <span class="carousel-control-prev-icon"></span>
                            </a>
                            <a class="carousel-control-next prev-de" href="#demo" data-slide="next">
                                <span class="carousel-control-next-icon"></span>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <%@include file="Footer.jsp" %>
            
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/Scroll.js"></script>
    </body>
</html>