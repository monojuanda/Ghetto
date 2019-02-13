<%-- 
    Document   : RegistrarProveedores
    Created on : 13/11/2018, 07:22:54 PM
    Author     : Tamayo B
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
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
            <div class="form">
                <h2 class="myh2">Registrar Proveedores</h2>
                <form action="RegistrarProveedor" method="post">
                    <div class="form-group row">
                        <label for="nit" class="col-sm-2 col-form-label l-sb">Nit:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="nit" placeholder="Ingresar nit" name="nit">
                        </div>
                    </div>
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
                        <label for="tipo" class="col-sm-2 col-form-label l-sb">Tipo de identificación</label>
                        <div class="col-sm-10">
                            <select class="custom-select" id="tipo" name="tipo">
                                <option selected>Elegir tipo de identificación</option>
                                <option value="Cédula de ciudadania">Cédula de ciudadania</option>
                                <option value="Cédula de extranjería">Cédula de exanjería</option>
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
                        <label for="fec" class="col-sm-2 col-form-label l-sb">Fecha de nacimiento</label>
                        <div class="col-sm-10">
                            <input type="date" class="form-control" id="fec" name="fecha">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="tel" class="col-sm-2 col-form-label l-sb">Télefono:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="tel" placeholder="Ingresar télefono" name="telefono">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="dir" class="col-sm-2 col-form-label l-sb">Dirección:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="dir" placeholder="Ingresar dirección" name="direccion">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="depar" class="col-sm-2 col-form-label l-sb">Departamento:</label>
                        <div class="col-sm-10">
                            <select class="custom-select" id="depar" name="departamento">
                                <option selected>Seleccionar departamento</option>
                                <option value="Antioquia">Antioquia</option>
                                <option value="Amazonas">Amazonas</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="ciu" class="col-sm-2 col-form-label l-sb">Ciudad:</label>
                        <div class="col-sm-10">
                            <select class="custom-select" id="ciu" name="ciudad">
                                <option selected>Seleccionar ciudad</option>
                                <option value="Medellín">Medellín</option>
                                <option value="Bogotá">Bogotá</option>
                            </select>
                        </div>
                    </div>               
                    <div class="form-group row">
                        <label for="em" class="col-sm-2 col-form-label l-sb">Nombre de la empresa:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="em" placeholder="Ingresar nombre de la empresa" name="empresa">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="est" class="col-sm-2 col-form-label l-sb">Estado:</label>
                        <div class="col-sm-10">
                            <div class="form-check col-sm-4">
                                <input class="form-check-input radio" type="radio" name="box" id="check" value="Activo" checked>
                                <label class="l-sb labhom">Activo</label>
                                <input class="form-check-input margin radio" type="radio" name="box" id="check" value="Inactivo">
                                <label class="l-sb labmuj">Inactivo</label>
                            </div> 
                        </div>
                    </div>
                    <div class="button-principal">
                        <button type="submit" class="btn btn-color">Registar proveedor</button>
                    </div>
                </form>
            </div>
        </div>

        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap-4-navbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/Scroll.js"></script>
    </body>



</html>
