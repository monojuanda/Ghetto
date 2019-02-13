<%-- 
    Document   : Nosotros
    Created on : 13/11/2018, 07:17:35 PM
    Author     : Tamayo B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

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
   <!-- <nav class="navbar navbar-expand-lg navbar-dark mynavbar" data-toggle="sticky-onscroll">
        <a class="navbar-brand" href="index.html">Ghetto</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mx-auto">
                <li class="nav-item"> <a class="nav-link" href="Hombre.html">HOMBRE</a> </li>
                <li class="nav-item"> <a class="nav-link" href="Mujer.html">MUJER</a> </li>
                <li class="nav-item"> <a class="nav-link" href="#">EL BARRIO</a> </li>
            </ul>
            <ul class="navbar-nav">
                <li class="nav-item"> <a class="nav-link" data-toggle="modal" data-target="#myModal">Iniciar sesión  <span class="fas fa-sign-in-alt "></span> </a></li>
                <li class="nav-item"> <a class="nav-link myitem" href="#" data-toggle="modal" data-target="#myModal2">Registrar</a></li>
            </ul>
        </div>
    </nav> -->

    <!--Modal de ingresar-->

    <div class="modal fade" id="myModal" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content mc">
                <div class="modal-header ">
                    <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                </div>
                <div class="modal-body" style="padding:40px 50px;">
                    <form role="form" action="ADMIN.html">
                        <div class="form-group">
                            <label for="correo">Correo electrónico:</label>
                            <input type="email" class="form-control" id="correo" placeholder="Ingresar correo electrónico">
                        </div>
                        <div class="form-group">
                            <label for="con">Contraseña:</label>
                            <input type="password" class="form-control" id="con" placeholder="Ingresar contraseña">
                        </div>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" value="" checked>Recuérdame
                            </label>
                        </div>
                        <button type="submit" class="btn btn-block btco">Ingresar</button>
                    </form>
                </div>
                <!-- <div class="modal-footer">
          <button type="submit" class="btn btcon pull-left" data-dismiss="modal">Cancel</button>
        </div> -->
            </div>

        </div>
    </div>

    <!--Modal de registrar-->

 <div class="modal fade" id="myModal2" role="dialog">
        <div class="modal-dialog modal-lg">

            <div class="modal-content mc">
                <div class="modal-header ">
                    <h5 class="text-white header-app">BIENVENIDO</h5>
                    <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                </div>
                <div class="modal-body" style="padding:40px 50px; ">
                        <div class="form">
                            <form action="Usuarios" method="post">
                                <div class="form-group row">
                                    <label for="nom" class="col-sm-2 col-form-label">Nombres:</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="nombre" placeholder="Ingresar nombres" name="nombre">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="ape" class="col-sm-2 col-form-label">Apellidos:</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="apellido" placeholder="Ingresar apellidos" name="apellido">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="tipo" class="col-sm-2 col-form-label">Tipo de identificación:</label>
                                    <div class="col-sm-10">
                                        <select class="custom-select" id="tipo" name="tipo">
                                            <option selected>Seleccionar tipo de identificación</option>
                                            <option value="Cédula de extranjería">Cédula de extranjería</option>
                                            <option value="Pasaporte">Pasaporte</option>
                                            <option value="Cédula de ciudadania">Cédula de ciudadania</option>
                                            <option value="Tarjeta de identidad">Tarjeta de identidad</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="N" class="col-sm-2 col-form-label">N° de identificación</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" id="N" placeholder="Ingresar N° de identificación" name="N">
                                    </div>
                                    <label for="sexo" class="col-sm-1 col-form-label">Sexo:</label>
                                    <div class="form-check col-sm-4">
                                        <input class="form-check-input radio" type="radio" id="sexo" value="Hombre" checked name="sexo">
                                        <label class="l-sb labhom">Hombre</label>
                                        <input class="form-check-input margin radio" type="radio" id="sexo" value="Mujer" name="sexo">
                                        <label class="l-sb labmuj">Mujer</label>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="fecha" class="col-sm-2 col-form-label">Fecha de nacimiento:</label>
                                    <div class="col-sm-10">
                                        <input type="date" class="form-control" id="fecha" name="fecha">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="tel" class="col-sm-2 col-form-label">Télefono:</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="tel" placeholder="Ingresar télefono" name="telefono">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="dep" class="col-sm-2 col-form-label">Departamento:</label>
                                    <div class="col-sm-10">
                                        <select class="custom-select" id="dep" name="departamento">
                                            <option selected>Seleccionar departamento</option>
                                            <option value="Antioquia">Antioquia</option>
                                            <option value="Amazonas">Amazonas</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="ciudad" class="col-sm-2 col-form-label">Ciudad:</label>
                                    <div class="col-sm-10">
                                        <select class="custom-select" id="ciudad" name="ciudad">
                                            <option selected>Seleccionar ciudad</option>
                                            <option value="Medellín">Medellín</option>
                                            <option value="Bogotá">Bogotá</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="correo" class="col-sm-2 col-form-label">Correo electrónico:</label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control" id="correo" placeholder="Ingresar correo electrónico" name="correo">
                                    </div>
                                </div> 
                                <div class="form-group row">
                                    <label for="con" class="col-sm-2 col-form-label">Contraseña:</label>
                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="con" placeholder="Ingresar contraseña" name="contraseña">
                                    </div>
                                </div> 
                                <div class="form-group row">
                                    <label for="con" class="col-sm-2 col-form-label">Repetir contraseña:</label>
                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="con" placeholder="Repetir contraseña" name="Rcontraseña">
                                    </div>
                                </div> 
                                
                        <div class="button-margin">
                            <button type="submit" class="btn btn-default btco">Ingresar</button>
                        </div>
                     </form>
                    </div>
                </div>
                
                <!-- <div class="modal-footer">
          <button type="submit" class="btn btcon pull-left" data-dismiss="modal">Cancel</button>
        </div> -->
            </div>

        </div>
    </div>
    

    <section class="section1">
        <div class="bg-overlay">
            <div class="container">
                <div class="flex">
                    <div class="flex-items">
                        <img src="imagenes/logo.png" class="imagen"></img>
                    </div>
                    <h3 class="myh">Es una marca de ropa urbana nacional con diseños exclusivos en las prendas, contamos con unos insumos de calidad que te harán sentir cómodo, y con estilo urbano paisa.</h3>
                    <h3 class="myh">Nace como inspiración a las comunas de Medellín, representando el estilo y las culturas urbanas que hay en los barrios.</h3>
                </div>
            </div>
        </div>
    </section>

    <section class="section2">
        <!--<div class="bg-overlay">-->
            <div class="container">
                <div class="flex">
                    
                    <h1 class="myh1 myh">VALORES</h1>
                    <h3 class="myh11">Nuestros valores institucionales se convierten en el potencial y factor primordial para incluir cada día nuestros productos y prestar nuestros servicio, que beneficie al sector textil del estilo urbano, es así que los pilares de GHETTO son:  </h3>
                    <h3 class="myh11">Confiabilidad: Respaldamos a confianza de nuestros clientes y proveedores con el acompañamiento diario en la protección de la cadena productiva.</h3>
                    <h3 class="myh11">Responsabilidad, Honestidad y cumplimiento:  Antes que otras alternativas, siempre esta la seguridad de cumplir nuestra palabra en lo que nos comprometemos.</h3>
                    <h3 class="myh11">Calidad y exclusividad: Ofrecemos una amplia variedad de diseños, garantizando su caidad a precios directamente proporcionales y competitivos.</h3>
                </div>
            </div>
        <!--</div>-->
    </section>

    <%@include file="Footer.jsp" %>
    
    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/Scroll.js"></script>
</body>

</html>