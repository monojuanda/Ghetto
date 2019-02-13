<%-- 
    Document   : Contacto
    Created on : 13/11/2018, 07:39:59 PM
    Author     : Tamayo B
--%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" href="css/fontawesome-all.min.css">
        <link rel="stylesheet" href="css/jquery.bootstrap4.css">
        <title>Ghetto</title>
    </head>

    <body class="fondo1">
        <header class="banner">
        </header>

   <!--     <nav class="navbar navbar-expand-lg navbar-dark mynavbar" data-toggle="sticky-onscroll">
            <a class="navbar-brand" href="Index.jsp">Ghetto</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mx-auto">
                    <li class="nav-item"> <a class="nav-link" href="Hombre.jsp">HOMBRE</a> </li>
                    <li class="nav-item"> <a class="nav-link" href="Mujer.jsp">MUJER</a> </li>
                    <li class="nav-item"> <a class="nav-link" href="Nosotros.jsp">EL BARRIO</a> </li>
                </ul>
                <ul class="navbar-nav">
                    <li class="nav-item"> <a class="nav-link" data-toggle="modal" data-target="#myModal">Cerrar sesión  <span class="fas fa-sign-out-alt "></span> </a></li>
                </ul>
            </div>
        </nav> -->
     
   
     
        <div class="container">
            <div class="form">
                <h2 class="myh2">Contacto</h2>
                <hr class="myhr">
                <form action="RegistrarContacto" method="Post">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="l-sb" for="nombre">Nombres</label>
                                <input type="text" class="form-control" id="nombre" name="nombres">
                                <label class="l-sb" for="correo">Correo electrónico</label>
                                <input type="email" class="form-control" id="correo" name="correo">
                                <label class="l-sb" for="departamento">Departamento</label>
                                <select class="custom-select" id="departamento" name="departamento">
                                    <option selected>Seleccionar departamento</option>
                                    <option value="Antioquia">Antioquia</option>
                                    <option value="Amazonas">Amazonas</option>
                                </select>
                                <label class="l-sb" for="pedido">N° de pedido</label>
                                <input type="text" class="form-control" id="pedido" name="num_pedido">
                            </div>  
                        </div>
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="l-sb" for="apellido">Apellidos</label>
                                <input type="text" class="form-control" id="apellido" name="apellidos">
                                <label class="l-sb" for="telefono">Teléfono</label>
                                <input type="text" class="form-control" id="telefono" name="telefono">
                                <label class="l-sb" for="ciudad">Ciudad</label>
                                <select class="custom-select" id="ciudad" name="ciudad">
                                    <option selected>Seleccionar ciudad</option>
                                    <option value="Medellín">Medellín</option>
                                    <option value="Bogotá">Bogotá</option>
                                </select>
                                <label class="l-sb" for="asunto">Asunto</label>
                                <select class="custom-select" id="asunto" name="asunto">
                                    <option selected>Selecionar un asunto</option>
                                    <option value="Información. Estado de pedido">Información. Estado de pedido</option>
                                    <option value="Información. Cambio / Devolución de ropa">Información. Cambio / Devolución de ropa</option>
                                    <option value="Información. Procesos de compras online y envíos">Información. Estado de pedidoInformación. Procesos de compras online y envíos</option>
                                    <option value="Sugerencias">Sugerencias</option>
                                    <option value="Otros...">Otros...</option>
                                </select>
                            </div> 
                        </div>
                        <div class="container">
                            <label class="l-sb" for="comentario">Comentario</label>
                            <textarea class="form-control" rows="5" id="comment" name="comentario"></textarea>
                        </div>
                    </div>
                    <div class="btn-color1">
                        <button type="submit" class="btn color-button">Enviar</button>
                    </div>
                </form>
            </div>
        </div>


        <!--<div class="form-group col-sm-6">-->
        <!--    <label for="email">Email address:</label>-->
        <!--    <input type="email" class="form-control" id="email">-->

        <!--    <label for="pwd">Password:</label>-->
        <!--    <input type="password" class="form-control" id="pwd">-->
        <!--</div>-->
        
        <%@include file="Footer.jsp" %>

        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap-4-navbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.dataTables.js"></script>
        <script src="js/dataTables.bootstrap4.js"></script>
        <script src="js/Tables.js"></script>
        <script src="js/Scroll.js"></script>
    </body>

</html>