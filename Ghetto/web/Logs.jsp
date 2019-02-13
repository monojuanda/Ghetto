<%-- 
    Document   : Logs
    Created on : 13/11/2018, 07:18:15 PM
    Author     : Tamayo B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" href="css/fontawesome-all.min.css">
    <link rel="stylesheet" href="css/jquery.bootstrap4.css">
    <title>Ghetto</title>
</head>

<body class="fondo1">
    <header class="banner">
    </header>
    <%@include file="Navbar.jsp" %>
    
<div class="container ">
    <h2 class="myh2">Logs</h2>
    <div class="table-responsive">
    <table id="table_id" class="table table-hover mytable">
        <thead class="thead tableTT">
            <tr>
                <th scope="col">Usuario</th>
                <th scope="col">Fecha</th>
                <th scope="col">Hora</th>
                <th scope="col">IP</th>
                <th scope="col">Acción</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Empleado</td>
                <td>08/10/2018</td>
                <td>05:30:08</td>
                <td>56.321.4.7.89</td>
                <td>Actualizar</td>
            </tr>
            <tr>
                <td>Administrador</td>
                <td>05/08/2018</td>
                <td>04:30:22</td>
                <td>56.321.4.7.89</td>
                <td>Registrar</td>
            </tr>
            
        </tbody>
    </table>
    </div>
</div>


    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap-4-navbar.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.dataTables.js"></script>
    <script src="js/dataTables.bootstrap4.js"></script>
    <script src="js/Tables.js"></script>
    <script src="js/Scroll.js"></script>
</body>

</html>
