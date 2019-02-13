<%-- 
    Document   : Navbar
    Created on : 20/11/2018, 01:46:20 PM
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
        <link rel="stylesheet" href="css/jquery.bootstrap4.css" type="text/css" />
        <title>Ghetto</title>
    </head>
    <%
            String tipo = "#myModal1";
    %>
    <body class="fondo1">
        

        <nav class="navbar navbar-expand-lg navbar-dark mynavbar" data-toggle="sticky-onscroll">
            <a class="navbar-brand" href="Index.jsp">Ghetto</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mx-auto">
                    <li class="nav-item"> <a class="nav-link" href="Hombre.jsp">HOMBRE</a> </li>
                    <li class="nav-item"> <a class="nav-link" href="Mujer.jsp">MUJER</a> </li>
                    <li class="nav-item"> <a class="nav-link" href="Nosotros.jsp">EL BARRIO</a> </li>
                        <%  
                            
                            HttpSession se = request.getSession(true);
                            String rol = "invitado";
                            String nu = "Ingresar";
                            String msg = "Registrar";
                            String estado="";
                            if (se.getAttribute("rusuario") == null) {
                                 estado = "desactivado";
                            } else {
                                rol = (String) se.getAttribute("rusuario");
                                nu = (String) se.getAttribute("nusuario");
                                 estado = "activo";
                            }
                            
                            if (rol.equals("Admin")) {

                        %>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Empleados </a>
                        <div class="dropdown-menu m">
                            <a class="dropdown-item d" href="RegistrarEmpleados.jsp">Registrar</a>
                            <a class="dropdown-item d" href="ListarEmpleado">Listar</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Clientes </a>
                        <div class="dropdown-menu m">
                            <a class="dropdown-item d" href="RegistrarClientes.jsp">Registrar</a>
                            <a class="dropdown-item d" href="ListarCliente">Listar</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Pedidos </a>
                        <div class="dropdown-menu m">
                            <a class="dropdown-item d" href="RegistrarPedidos.jsp">Registrar</a>
                            <a class="dropdown-item d" href="ListarPedido">Listar</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Inventarios
                        </a>
                        <ul class="dropdown-menu m" aria-labelledby="navbarDropdownMenuLink">
                            <li><a class="dropdown-item d dropdown-toggle" href="#">Hombres</a>
                                <ul class="dropdown-menu m">
                                    <li><a class="dropdown-item d" href="RegistrarInventariosH.jsp">Registrar</a></li>
                                    <li><a class="dropdown-item d" href="ListarInventarioH">Listar</a></li>
                                </ul>
                            </li>
                            <li><a class="dropdown-item d dropdown-toggle" href="#">Mujeres</a>
                                <ul class="dropdown-menu m">
                                    <li><a class="dropdown-item d" href="RegistrarInventariosM.jsp">Registrar</a></li>
                                    <li><a class="dropdown-item d" href="ListarInventarioM">Listar</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <!--<li class="nav-item dropdown">-->
                    <!--    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Facturaciones </a>-->
                    <!--    <div class="dropdown-menu m">-->
                    <!--        <a class="dropdown-item d" href="#">Registrar</a>-->
                    <!--        <a class="dropdown-item d" href="#">Listar</a>-->
                    <!--    </div>-->
                    <!--</li>-->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Proveedores </a>
                        <div class="dropdown-menu m">
                            <a class="dropdown-item d" href="RegistrarProveedores.jsp">Registrar</a>
                            <a class="dropdown-item d" href="ListarProveedor">Listar</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Contactos </a>
                        <div class="dropdown-menu m">
                            <a class="dropdown-item d" href="Contacto.jsp">Registrar</a>
                            <a class="dropdown-item d" href="ListarContacto">Listar</a>
                        </div>
                    </li>
                    <!--<li class="nav-item dropdown">-->
                    <!--    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Mensajería </a>-->
                    <!--    <div class="dropdown-menu m">-->
                    <!--        <a class="dropdown-item d" href="#">Registrar</a>-->
                    <!--        <a class="dropdown-item d" href="#">Listar</a>-->
                    <!--    </div>-->
                    <!--</li>-->
                    <!--<li class="nav-item dropdown">-->
                    <!--    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Pagos </a>-->
                    <!--    <div class="dropdown-menu m">-->
                    <!--        <a class="dropdown-item d" href="#">Registrar</a>-->
                    <!--        <a class="dropdown-item d" href="#">Listar</a>-->
                    <!--    </div>-->
                    <!--</li>-->
                    <li class="nav-item">
                        <a class="nav-link" href="Permisos.jsp" id="navbardrop"> Permisos </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Logs.jsp" id="navbardrop"> Logs </a>
                    </li>
                     
                     <%                    
                        } else if (rol.equals("EmpleadoVentas")) {
                     %>
                     
                     <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Pedidos </a>
                        <div class="dropdown-menu m">
                            <a class="dropdown-item d" href="RegistrarPedidos.jsp">Registrar</a>
                            <a class="dropdown-item d" href="ListarPedido">Listar</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> Ventas </a>
                        <div class="dropdown-menu m">
                            <a class="dropdown-item d" href="ListarVentas.jsp">Listar</a>
                        </div>
                    </li>     
                     
                    
                    <%
                       } 
                     %>
                </ul>
                <ul class="navbar-nav">
                   <%                    
                        if (!(estado.equals("desactivado"))) {
                     %>
                     <li class="nav-item"> <a href="#" class="nav-link"> <span class="fas fa-user"></span> <%=nu%>   </a></li>
                       <li class="nav-item"> <a href="Logout" class="nav-link">Cerrar sesión  <span class="fas fa-sign-out-alt"></span> </a></li>
                    
                    <%                    
                        }else {
                     %>
                       <li class="nav-item"> <a class="nav-link" href="#" data-toggle="modal" data-target="#myModal1"><%=nu%> <span class="fas fa-sign-in-alt "></span> </a></li>
                       <li class="nav-item"> <a class="nav-link myitem" href="#" data-toggle="modal" data-target="#myModal2"><%=msg%></a></li>
                    <%
                       } 
                     %>
                </ul>
              
            </div>
        </nav>
                
                

        <!--Modal de ingresar-->
        <div class="modal fade" id="myModal1" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content mc">
                    <div class="modal-header ">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:40px 50px;">
                        <form action="Login" method="post">
                            <div class="form-group">
                                <label for="correo">Correo electrónico:</label>
                                <input type="email" class="form-control" id="correo" placeholder="Ingresar correo electrónico" name="ntext">
                            </div>
                            <div class="form-group">
                                <label for="con">Contraseña:</label>
                                <input type="password" class="form-control" id="con" placeholder="Ingresar contraseña" name="ptext">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" value="" checked>Recuérdame
                                </label>
                            </div>
                            <div class="modal-center">
                                <button type="submit" class="btn btco">Ingresar</button>
                            </div>
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
                        <div class="modal-center">
                            <h5 class="text-white text-center modal-title">BIENVENIDO</h5>                    
                        </div>
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>

                    <div class="modal-body" style="padding:40px 50px; ">
                        <div class="form">
                            <form action="RegistrarCliente" method="post">
                                <div class="form-group">
                                    <label for="n">Nombres</label>
                                    <input type="text" class="form-control" id="n" placeholder="Ingresar nombres" name="nombre">
                                </div>
                                <div class="form-group">
                                    <label for="a">Apellidos</label>
                                    <input type="text" class="form-control" id="a" placeholder="Ingresar nombres" name="apellido">
                                </div>
                                <div class="form-group">
                                    <label for="t">Tipo de identificación:</label>
                                    <select class="form-control" id="t" name="tipo">
                                        <option selected>Seleccionar tipo de identificación</option>
                                        <option value="Cédula de extranjería">Cédula de extranjería</option>
                                        <option value="Pasaporte">Pasaporte</option>
                                        <option value="Cédula de ciudadania">Cédula de ciudadania</option>
                                        <option value="Tarjeta de identidad">Tarjeta de identidad</option>
                                    </select> 
                                </div>
                                <div class="row">
                                    <div class="col-sm-8">
                                        <div class="form-group">
                                            <label for="nu"> N° de identificación</label>
                                            <input type="text" class="form-control" id="nu" placeholder="Ingresar N° de identificación" name="N">
                                        </div>
                                    </div>
                                    <div class="col-sm-4">
                                        <div class="form-group">
                                            <label for="s"> Sexo</label>                                            
                                            <div class="form-check">
                                                <input class="form-check-input radio" type="radio" id="s" value="Hombre" checked name="sexo">
                                                <label class="l-sb labhom">Hombre</label>
                                                <input class="form-check-input margin radio" type="radio" id="s" value="Mujer" name="sexo">
                                                <label class="l-sb labmuj">Mujer</label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="f">Fecha de nacimiento</label>
                                    <input type="date" class="form-control" id="f" name="fecha">
                                </div>
                                <div class="form-group">
                                    <label for="t">Teléfono</label>
                                    <input type="text" class="form-control" id="t" placeholder="Ingresar teléfono" name="tel">
                                </div>
                                <div class="form-group">
                                    <label for="d">Dirección</label>
                                    <input type="text" class="form-control" id="d" placeholder="Ingresar dirección" name="direc">
                                </div>
                                <div class="form-group">
                                    <label for="de">Departamento</label>
                                    <select class="custom-select" id="de" name="departamento">
                                        <option selected>Seleccionar departamento</option>
                                        <option value="Antioquia">Antioquia</option>
                                        <option value="Amazonas">Amazonas</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="c">Ciudad</label>
                                    <select class="custom-select" id="c" name="ciudad">
                                        <option selected>Seleccionar ciudad</option>
                                        <option value="Medellín">Medellín</option>
                                        <option value="Bogotá">Bogotá</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="coo">Correo</label>
                                    <input type="email" class="form-control" id="coo" placeholder="Ingresar correo electrónico" name="correo">
                                </div>
                                <div class="form-group">
                                    <label for="con">Contraseña</label>
                                    <input type="password" class="form-control" id="con" placeholder="Ingresar contraseña" name="con">
                                </div>
                                <div class="button1-margin text-center">
                                    <button type="submit" class="btn color-button">Registrar</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/bootstrap-4-navbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/Tables.js"></script>
        <script src="js/Scroll.js"></script>
    </body>

</html>

