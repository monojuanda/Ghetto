<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" href="css/bootstrap-4-navbar.css" type="text/css">
        <link rel="stylesheet" href="css/fontawesome-all.min.css">

        <title>Ghetto</title>
    </head>

    <body class="fondo1">
        <header class="banner">
        </header>
        <%@include file="Navbar.jsp" %>

        <div class="container">
            <div class="form">
                <h2 class="myh2">Registrar empleados</h2>
                <form action="RegistrarEmpleado" method="Post">
                    <div class="form-group row">
                        <label for="nom" class="col-sm-2 col-form-label l-sb">Nombres:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="nom" placeholder="Ingresar nombres" name="nombre">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="ape" class="col-sm-2 col-form-label l-sb">Apellidos:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="ape" placeholder="Ingresar apellidos" name="apellido">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="tipo" class="col-sm-2 col-form-label l-sb">Tipo de identificación:</label>
                        <div class="col-sm-10">
                            <select class="custom-select" id="tipo" name="tipo">
                                <option selected>Selecionar tipo</option>
                                <option value="Cédula de extranjería">Cédula de extranjería</option>
                                <option value="Cédula de ciudadania">Cédula de ciudadania</option>
                                <option value="Tarjeta de identidad">Tarjeta de identidad</option>
                                <option value="Pasaporte">Pasaporte</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="N" class="col-sm-2 col-form-label l-sb">N° de identificación</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="N" placeholder="Ingresar N° de identificación" name="identificacion">
                        </div>

                        <label for="sexo" class="col-sm-1 col-form-label l-sb">Sexo:</label>

                        <div class="form-check col-sm-2">
                            <input class="form-check-input radio" type="radio" id="sexo" value="Hombre" checked name="sexo">
                            <label class="l-sb labhom">Hombre</label>
                            <input class="form-check-input margin radio" type="radio" id="sexo" value="Mujer" name="sexo">
                            <label class="l-sb labmuj">Mujer</label>
                        </div>

                    </div>

                    <div class="form-group row">
                        <label for="fecha" class="col-sm-2 col-form-label l-sb">Fecha de nacimiento:</label>
                        <div class="col-sm-10">
                            <input type="date" class="form-control" id="fecha" name="fecha">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="tel" class="col-sm-2 col-form-label l-sb">Télefono:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="text" placeholder="Ingresar télefono" name="telefono">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="dir" class="col-sm-2 col-form-label l-sb">Dirección:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="dir" placeholder="Ingresar dirección" name="direccion">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="ocupacion" class="col-sm-2 col-form-label l-sb">Ocupación:</label>
                        <div class="col-sm-10">
                            <select class="custom-select" id="ocupacion" name="ocupacion">
                                <option selected>Tipo de ocupación</option>
                                <option value="Vendedor">Vendedor</option>
                                <option value="Cajero">Cajero</option>
                                <option value="Proveedor">Proveedor</option>
                                <option value="Administrador">Administrador</option>
                                <option value="Gerente">Gerente</option>
                            </select>
                        </div>
                    </div>
                    <div class="button-principal">
                        <button type="submit" class="btn btn-color">Registar empleado</button>
                    </div>
                </form>
            </div>
        </div>

        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap-4-navbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>

</html>