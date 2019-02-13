<%-- 
    Document   : Permisos
    Created on : 13/11/2018, 07:17:02 PM
    Author     : Tamayo B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="css/bootstrap-4-navbar.css" type="text/css">
        <link rel="stylesheet" href="css/fontawesome-all.min.css">
        <title>Ghetto</title>
    </head>

    <body class="fondo1">
        <header class="banner">
        </header>
        <%@include file="Navbar.jsp" %>
        <div class="container">  
            <h2 class="myh2">Permisos</h2>
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th scope="col"></th>
                            <th scope="col">Ver</th>
                            <th scope="col">Modificar</th>
                            <th scope="col">Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">Administrador</th>
                            <td><input type="checkbox" name="check" checked></td>
                            <td><input type="checkbox" name="check" checked></td>
                            <td><input type="checkbox" name="check" checked></td>
                        </tr>
                        <tr>
                            <th scope="row">Empleado</th>
                            <td><input type="checkbox" name="check" checked></td>
                            <td><input type="checkbox" name="check" checked></td>
                            <td><input type="checkbox" name="check"></td>
                        </tr>
                        <tr>
                            <th scope="row">Cliente</th>
                            <td><input type="checkbox" name="check" checked></td>
                            <td><input type="checkbox" name="check"></td>
                            <td><input type="checkbox" name="check"></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap-4-navbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/Scroll.js"></script>
    </body>



</html>

