<%-- 
    Document   : ListarProveedores
    Created on : 13/11/2018, 07:24:01 PM
    Author     : Tamayo B
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controlador.Modelo.Proveedores"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="css/bootstrap-4-navbar.css" type="text/css">
        <link rel="stylesheet" href="css/fontawesome-all.min.css">
        <link rel="stylesheet" href="css/jquery.bootstrap4.css" type="text/css" />
        <title>Ghetto</title>
    </head>

    <body class="fondo1">
        <header class="banner">
        </header>
        <%@include file="Navbar.jsp" %>

        <%
            ArrayList<Proveedores> as = (ArrayList) request.getAttribute("Lise");
        %>

        <div class="container ">
            <h2 class="myh2">Listar proveedores</h2>
            <div class="table-responsive">
                <table id="table_id" class="table table-hover  mytable ">
                    <thead class="thead tableTT">
                        <tr>
                            <th scope="col">Nit </th>
                            <th scope="col">Tipo de identificaión</th>
                            <th scope="col">N° de identificación</th>
                            <th scope="col">Nombre de la empresa</th>
                            <th scope="col">Estado</th>
                            <th scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            System.out.println(as);
                            for (Proveedores c : as) {

                        %>
                        <tr>
                            <td><%= c.getNit()%></td>
                            <td><%= c.getTipo()%></td>
                            <td><%= c.getIdentificacion()%></td>
                            <td><%= c.getEmpresa()%></td>
                            <td><%= c.getEstado()%></td>
                            <td>
                                <a class="btn btn-wh btn-sm" data-toggle="modal" data-target="#myModal" onclick="ver('<%= c.getNombres()%>', '<%= c.getApellidos()%>', '<%= c.getSexo()%>', '<%= c.getFecha()%>', '<%= c.getTelefono()%>', '<%= c.getDireccion()%>', '<%= c.getDepartamento()%>', '<%= c.getCiudad()%>')"><span class="far fa-eye " aria-hidden="true"></span></a>
                                <a class="btn btn-bl btn-sm" data-toggle="modal" data-target="#myModal10" onclick="Mostrar(<%= c.getId()%>, '<%= c.getNombres()%>', '<%= c.getApellidos()%>', '<%= c.getTipo()%>', '<%= c.getIdentificacion()%>', '<%= c.getTelefono()%>', '<%= c.getDireccion()%>', '<%= c.getDepartamento()%>', '<%= c.getCiudad()%>', '<%= c.getEmpresa()%>', '<%= c.getEstado()%>')"><span class="fas fa-edit h" aria-hidden="true"></span></a>
                                <a class="btn btn-re btn-sm tamb"><span class="fas fa-times h" aria-hidden="true"></span></a>
                            </td>
                        </tr>  

                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>

        <!--Ver detalles-->
        <!--Modal-->

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
                                <label class="l-sb">Nombres:</label>
                                <label id="nombre"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Apellidos:</label>
                                <label id="apellido"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Sexo:</label>
                                <label id="sexo"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Fecha de nacimiento:</label>
                                <label id="fecha"></label>
                            </div>
                            <div class="form-group">
                                <label for="est" class="l-sb">Telefono:</label>
                                <label id="telefono"></label>
                            </div>
                            <div class="form-group">
                                <label for="est" class="l-sb">Dirección</label>
                                <label id="direccion"></label>
                            </div>
                            <div class="form-group">
                                <label for="est" class="l-sb">Departamento</label>
                                <label id="depar"></label>
                            </div>
                            <div class="form-group">
                                <label for="est" class="l-sb">Ciudad:</label>
                                <label id="ciudad"></label>
                            </div>
                        </form>
                    </div>
                    <!-- <div class="modal-footer">
                <button type="submit" class="btn btcon pull-left" data-dismiss="modal">Cancel</button>
              </div> -->
                </div>
            </div>
        </div>



        <!--modificar-->
        <!-- Modal -->
        <div class="modal fade" id="myModal10" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:40px 50px;">
                        <form action="ActualizarProveedor" role="form" >
                            <div class="form-group row">
                                <label for="ID" class="col-sm-2 col-form-label">ID</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="ID" name="ID" readonly="" >
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="nombres" class="col-sm-2 col-form-label">Nombres:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="nom" placeholder="Ingresar nombres" name="nombres">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="ape" class="col-sm-2 col-form-label">Apellidos:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="ape" placeholder="Ingresar apellidos" name="apellidos">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="tipo" class="col-sm-2 col-form-label">Tipo de identificación</label>
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
                                <label for="iden" class="col-sm-2 col-form-label">N° de identificación:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="iden" placeholder="Ingresar N° de identificación" name="identificacion" >
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="tel" class="col-sm-2 col-form-label">Télefono:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="tel" placeholder="Ingresar teléfono" name="telefono" >
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="dir" class="col-sm-2 col-form-label">Dirección:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="dir" placeholder="Ingresar dirección" name="direccion">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="depar" class="col-sm-2 col-form-label">Departamento:</label>
                                <div class="col-sm-10">
                                    <select class="custom-select" id="departamento" name="departamento">
                                        <option selected>Seleccionar departamento</option>
                                        <option value="Antioquia">Antioquia</option>
                                        <option value="Amazonas">Amazonas</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="ciu" class="col-sm-2 col-form-label">Ciudad:</label>
                                <div class="col-sm-10">
                                    <select class="custom-select" id="ciu" name="ciudad">
                                        <option selected>Seleccionar ciudad</option>
                                        <option value="Medellín">Medellín</option>
                                        <option value="Bogotá">Bogotá</option>
                                    </select>
                                </div>
                            </div>       
                            <div class="form-group row">
                                <label for="em" class="col-sm-2 col-form-label">Nombre de la empresa:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="em" placeholder="Ingresar nombre de la empresa" name="empresa">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="check" class="col-sm-2 col-form-label">Estado:</label>
                                <div class="col-sm-10">
                                    <div class="form-check col-sm-4">
                                        <input class="form-check-input radio" type="radio" id="check" value="Activo" name="boxes">
                                        <label class="l-sb labhom">Activo</label>
                                        <input class="form-check-input margin radio" type="radio" id="check" value="Inactivo" name="boxes">
                                        <label class="l-sb labmuj">Inactivo</label>
                                    </div> 
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
            function ver(nombre, apellido, sexo, fecha, telefono, direccion, departamento, ciudad) {
                document.getElementById('myModal').style.display = 'block';
                document.getElementById('nombre').innerHTML = nombre;
                document.getElementById('apellido').innerHTML = apellido;
                document.getElementById('sexo').innerHTML = sexo;
                document.getElementById('fecha').innerHTML = fecha;
                document.getElementById('telefono').innerHTML = telefono;
                document.getElementById('direccion').innerHTML = direccion;
                document.getElementById('depar').innerHTML = departamento;
                document.getElementById('ciudad').innerHTML = ciudad;

            }
        </script>
        <script>
            function Mostrar(ID, nombres, apellidos, tipo, iden, telefono, direccion, depar, ciud, empr, est) {
                document.getElementById('myModal10').style.display = 'block';
                document.getElementById('ID').value = ID;
                document.getElementById('nom').value = nombres;
                document.getElementById('ape').value = apellidos;
                document.getElementById('tipo').value = tipo;
                document.getElementById('iden').value = iden;
                document.getElementById('tel').value = telefono;
                document.getElementById('dir').value = direccion;
                document.getElementById('departamento').value = depar;
                document.getElementById('ciu').value = ciud;
                document.getElementById('em').value = empr;
                document.getElementById('check').checked = est;
                
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
