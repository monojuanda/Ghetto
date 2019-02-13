<%-- 
    Document   : ListarEmpleados
    Created on : 13/11/2018, 07:16:26 PM
    Author     : Tamayo B
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Controlador.Modelo.Empleados"%>
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

        <%@include file="Navbar.jsp" %> 

        <%

            ArrayList<Empleados> as = (ArrayList) request.getAttribute("Lise");

        %>
        <div class="container cont-table">
            <h2 class="myh2">Listar empleados</h2>
            <table id="table_id" class="table table-hover mytable">
                <thead class="thead tableTT">
                    <tr>
                        <th scope="col">Nombres</th>
                        <th scope="col">Apellidos</th>
                        <th scope="col">Tipo de identificación</th>
                        <th scope="col">N° de identificación</th>
                        <th scope="col">Teléfono</th>
                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <%                        
                        System.out.println(as);
                        for (Empleados c : as) {

                    %>

                    <tr>
                        <td><%= c.getNombres()%></td>
                        <td><%= c.getApellidos()%></td>
                        <td><%= c.getTipo()%></td>
                        <td><%= c.getIdentificacion()%></td>
                        <td><%= c.getTelefono()%></td>
                        <td>
                            <a class="btn btn-wh btn-sm" data-toggle="modal" data-target="#myModal" onclick="ver('<%= c.getSexo()%>', '<%= c.getFecha()%>', '<%= c.getDireccion()%>', '<%= c.getOcupacion()%>')"><span class="far fa-eye" aria-hidden="true"></span></a>
                            <a class="btn btn-bl btn-sm" data-toggle="modal" data-target="#myModal10" onclick="Mostrar(<%= c.getId()%>, '<%= c.getNombres()%>', '<%= c.getApellidos()%>', '<%= c.getTipo()%>', '<%= c.getIdentificacion()%>', '<%= c.getTelefono()%>', '<%= c.getDireccion()%>','<%= c.getOcupacion()%>')"><span class="fas fa-edit h" aria-hidden="true"></span></a>
                            <a class="btn btn-re btn-sm tamb"><span class="fas fa-times h" aria-hidden="true"></span></a>
                        </td>
                    </tr>

                    <%
                        }

                    %>
                </tbody>

            </table>
        </div>


        <!--Más detalle-->
        <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:40px 50px;">
                        <form role="form">
                            <div class="form-group">
                                <label class="l-sb">Sexo:</label>
                                <label id="Sexo"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Fecha:</label>
                                <label id="Fecha"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Direción:</label>
                                <label id="Direccion"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Ocupación:</label>
                                <label id="Ocupacion"></label>
                            </div>
                        </form>
                    </div>
                    <!-- <div class="modal-footer">
                <button type="submit" class="btn btcon pull-left" data-dismiss="modal">Cancel</button>
              </div> -->
                </div>
            </div>
        </div>


        <!--Editar-->
        <!-- Modal -->
        <div class="modal fade" id="myModal10" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:40px 50px;">
                        <form action="ActualizarEmpleado" role="form" >
                            <div class="form-group row">
                                <label for="ID" class="col-sm-2 col-form-label">ID</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="ID" name="id" readonly="">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="nombres" class="col-sm-2 col-form-label">Nombres:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="nombres" placeholder="Ingresar nombres" name="nombre">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="apellidos" class="col-sm-2 col-form-label">Apellidos:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="apellidos" placeholder="Ingresar apellidos" name="apellido">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="tipo" class="col-sm-2 col-form-label">Tipo de identificación:</label>
                                <div class="col-sm-10">
                                    <select class="custom-select" id="tipo" name="tipo">
                                        <option value="Cédula de extranjería">Cédula de extranjería</option>
                                        <option value="Cédula de ciudadania">Cédula de ciudadania</option>
                                        <option value="Tarjeta de identidad">Tarjeta de identidad</option>
                                        <option value="Pasaporte">Pasaporte</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="identificacion" class="col-sm-2 col-form-label">N° de identificación:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="iden" placeholder="Ingresar N° de identificación" name="N">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="telefono" class="col-sm-2 col-form-label">Teléfono:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="telefono" placeholder="Ingresar teléfono" name="tel">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="direccion" class="col-sm-2 col-form-label">Dirección:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="direccion" placeholder="Ingresar dirección" name="direc">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="tipo" class="col-sm-2 col-form-label">Ocupación:</label>
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
                               <button type="submit" class="btn btn-mod">Guardar modificación</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script>
            function ver(Sexo, Fecha, Direccion, Ocupacion) {
                document.getElementById('myModal').style.display = 'block';
                document.getElementById('Sexo').innerHTML = Sexo;
                document.getElementById('Fecha').innerHTML = Fecha;
                document.getElementById('Direccion').innerHTML = Direccion;
                document.getElementById('Ocupacion').innerHTML = Ocupacion;
            }
        </script>
        <script>
            function Mostrar(ID, nombres, apellidos, tipo, identificacion, telefono, direccion, ocupacion) {
                document.getElementById('myModal10').style.display = 'block';
                document.getElementById('ID').value = ID;
                document.getElementById('nombres').value = nombres;
                document.getElementById('apellidos').value = apellidos;
                document.getElementById('tipo').value = tipo;
                document.getElementById('iden').value = identificacion;
                document.getElementById('telefono').value = telefono;
                document.getElementById('direccion').value = direccion;
                document.getElementById('ocupacion').value = ocupacion;
            }
        </script>
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap-4-navbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.dataTables.js"></script>
        <script src="js/dataTables.bootstrap4.js"></script>
        <script src="js/Tables.js"></script>
        <script src="js/Scroll.js"></script>
    </body>

</html>
