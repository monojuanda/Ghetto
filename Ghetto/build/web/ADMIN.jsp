<%-- 
    Document   : ADMIN
    Created on : 13/11/2018, 06:56:22 PM
    Author     : Tamayo B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
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
        <%@include file="Navbar.jsp"%>
         
        
        
        <%
            
            if (se.getAttribute("rusuario") == null) {
                rol = "invitado";
            } else {
                rol = (String) se.getAttribute("rusuario");
                nu = (String) se.getAttribute("nusuario");
                msg = "Activo";
            }
            if (rol.equals("Admin")) {

        %>
        <div class="container">

            <div class="row">    
                <div class="col-lg-12" style="margin-top:45px;">
                    <div class="card-deck">
                        <div class="card mb-5">
                            <div class="card-body text-center">
                                <a href="RegistrarEmpleados.jsp" class="btn separador"><span class="fas fa-users fa-6x color"></span></a>
                                <a href="ListarEmpleado" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Empleados</h5>
                                </div>
                            </div>
                        </div>
                        <div class="card mb-5">
                            <div class="card-body text-center">
                                <a href="RegistrarClientes.jsp" class="btn separador"><span class="fas fa-user fa-6x color"></span></a>
                                <a href="ListarCliente" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Clientes</h5>
                                </div>
                            </div>
                        </div>
                        <!-- <div class="card mb-5">
                             <div class="card-body text-center">
                                 <a href="ListarVentas.jsp" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>
                                 <div class="space">
                                 <h5 class="card-title">Ventas</h5>
                                 </div>
                             </div>
                         </div> -->
                    </div>
                    <div class="card-deck">
                        <div class="card mb-5">
                            <div class="card-body text-center">
                                <a href="RegistrarPedidos.jsp" class="btn separador"><span class="fas fa-cart-plus fa-6x color"></span></a>
                                <a href="ListarPedido" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Pedidos</h5>
                                </div>
                            </div>
                        </div>

                        <div class="card mb-5">
                            <div class="card-body text-center ">
                                <a href="RegistrarInventariosH.jsp" class="btn separador"><span class="fas fa-male fa-6x color"></span></a>
                                <a href="ListarInventarioH" class="btn "><span class="fas fa-list-ul fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Inventario Hombre</h5>
                                </div>
                            </div>
                        </div>
                        <div class="card mb-5">
                            <div class="card-body text-center ">
                                <a href="RegistrarInventariosM.jsp" class="btn separador"><span class="fas fa-female fa-6x color"></span></a>
                                <a href="ListarInventarioM" class="btn "><span class="fas fa-list-ul fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Inventario Mujer</h5>
                                </div>
                            </div>
                        </div>
                        <!--<div class="card mb-5">-->
                        <!--    <div class="card-body text-center">-->
                        <!--        <a href="#" class="btn"><span class="fas fa-file-invoice-dollar fa-6x color"></span></a>-->
                        <!--        <a href="#" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>-->
                        <!--        <div class="space">-->
                        <!--        <h5 class="card-title">Facturación</h5>-->
                        <!--        </div>-->
                        <!--    </div>-->
                        <!--</div>-->

                    </div>
                    <div class="card-deck">
                        <div class="card mb-5">
                            <div class="card-body text-center">
                                <a href="RegistrarProveedores.jsp" class="btn separador"><span class="fas fa-truck fa-6x color"></span></a>
                                <a href="ListarProveedor" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Proveedores</h5>
                                </div>
                            </div>
                        </div>
                        <div class="card mb-5">
                            <div class="card-body text-center">
                                <a href="Permisos.jsp" class="btn"><span class="fas fa-check-square fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Permisos</h5>
                                </div>
                            </div>
                        </div>
                        <div class="card mb-5">
                            <div class="card-body text-center">
                                <a href="Logs.jsp" class="btn"><img src="imagenes/Logs.png" class="color" alt=""></a>
                                <div class="space">
                                    <h5 class="card-title">Logs</h5>
                                </div>
                            </div>
                        </div>
                        <!--<div class="card mb-5">-->
                        <!--    <div class="card-body text-center">-->
                        <!--        <a href="#" class="btn"><span class="fas fa-envelope fa-6x color"></span></a>-->
                        <!--        <a href="#" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>-->
                        <!--        <div class="space">-->
                        <!--        <h5 class="card-title">Mensajería</h5>-->
                        <!--        </div>-->
                        <!--    </div>-->
                        <!--</div>-->
                        <!--<div class="card mb-5">-->
                        <!--    <div class="card-body text-center">-->
                        <!--        <a href="#" class="btn"><span class="far fa-credit-card fa-6x color"></span></a>-->
                        <!--        <a href="#" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>-->
                        <!--        <div class="space">-->
                        <!--        <h5 class="card-title">Pagos</h5>-->
                        <!--        </div>-->
                        <!--    </div>-->
                        <!--</div>-->
                    </div>

                </div>
            </div>
        </div>
        <%        } else if (rol.equals("EmpleadoVentas")) {
        %>
        <div class="container">  
            <div class="row">
                <div class="col-lg-12" style="margin-top:45px;">

                    <div class="card-deck">
                        <div class="card mb-5">
                    
                             <div class="card-body text-center">
                                 <a href="ListarVentas.jsp" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>
                                 <div class="space">
                                 <h5 class="card-title">Ventas</h5>
                                 </div>
                             </div>
                         </div> 
                        <div class="card mb-5">
                            <div class="card-body text-center">
                                <a href="RegistrarPedidos.jsp" class="btn separador"><span class="fas fa-cart-plus fa-6x color"></span></a>
                                <a href="ListarPedido" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Pedidos</h5>
                                </div>
                            </div>
                        </div>

                       <!-- <div class="card mb-5">
                            <div class="card-body text-center ">
                                <a href="RegistrarInventariosH.jsp" class="btn separador"><span class="fas fa-male fa-6x color"></span></a>
                                <a href="ListarInventarioH" class="btn "><span class="fas fa-list-ul fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Inventario Hombre</h5>
                                </div>
                            </div>
                        </div>
                        <div class="card mb-5">
                            <div class="card-body text-center ">
                                <a href="RegistrarInventariosM.jsp" class="btn separador"><span class="fas fa-female fa-6x color"></span></a>
                                <a href="ListarInventarioM" class="btn "><span class="fas fa-list-ul fa-6x color"></span></a>
                                <div class="space">
                                    <h5 class="card-title">Inventario Mujer</h5>
                                </div>
                            </div>
                        </div> -->
                        <!--<div class="card mb-5">-->
                        <!--    <div class="card-body text-center">-->
                        <!--        <a href="#" class="btn"><span class="fas fa-file-invoice-dollar fa-6x color"></span></a>-->
                        <!--        <a href="#" class="btn"><span class="fas fa-list-ul fa-6x color"></span></a>-->
                        <!--        <div class="space">-->
                        <!--        <h5 class="card-title">Facturación</h5>-->
                        <!--        </div>-->
                        <!--    </div>-->
                        <!--</div>-->

                    </div>
                </div>
            </div>
        </div>
        <% }%>   
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap-4-navbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/Scroll.js"></script>
    </body>



</html>
