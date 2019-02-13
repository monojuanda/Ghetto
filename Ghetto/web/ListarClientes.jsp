<%-- 
    Document   : ListarClientes
    Created on : 10/12/2018, 01:30:23 AM
    Author     : Tamayo B
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Controlador.Modelo.Clientes"%>
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
            
            ArrayList<Clientes> as = (ArrayList) request.getAttribute("Lise");

        %>
        <div class="container cont-table">
            <h2 class="myh2">Listar Clientes</h2>
            <table id="table_id" class="table table-hover mytable">
                <thead class="thead tableTT">
                    <tr>
                        <th scope="col">Nombres</th>
                        <th scope="col">Apellidos</th>
                        <th scope="col">Tipo de identificación</th>
                        <th scope="col">N° de identificación</th>
                        <th scope="col">Diección</th>
                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <%        
                        System.out.println(as);
                        for (Clientes r : as) {
                    
                    %>

                    <tr>
                        <td><%= r.getNombres() %></td>
                        <td><%= r.getApellidos() %></td>
                        <td><%= r.getTipo() %></td>
                        <td><%= r.getIdentificacion() %></td>
                        <td><%= r.getDireccion() %></td>
                        <td>
                            <a class="btn btn-wh btn-sm" data-toggle="modal" data-target="#myModal" onclick="ver('<%= r.getSexo() %>','<%= r.getTelefono() %>','<%= r.getDepartamento() %>', '<%= r.getCiudad() %>','<%= r.getFecha() %>')"><span class="far fa-eye" aria-hidden="true"></span></a>
                            <a class="btn btn-bl btn-sm" data-toggle="modal" data-target="#myModal10" onclick="Mostrar(<%= r.getId() %>,'<%= r.getNombres() %>','<%= r.getApellidos() %>','<%= r.getTipo() %>','<%= r.getIdentificacion() %>','<%= r.getTelefono() %>','<%= r.getDepartamento() %>', '<%= r.getCiudad() %>')"><span class="fas fa-edit h" aria-hidden="true"></span></a>
                            <a class="btn btn-re btn-sm tamb"><span class="fas fa-times h" aria-hidden="true"></span></a>
                        </td>
                    </tr>

                    <%
                        }

                    %>
                </tbody>

            </table>
        </div>

        <!--Ver más detalles-->
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
                                <label class="l-sb">Sexo:</label>
                                <label id="sexo"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Teléfono:</label>
                                <label id="telefono"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Departamento:</label>
                                <label id="departamento"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Ciudad:</label>
                                <label id="ciudad"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Fecha:</label>
                                <label id="fecha"></label>
                            </div>
                            

                        </form>

                    </div>

                    <!-- <div class="modal-footer">
                <button type="submit" class="btn btcon pull-left" data-dismiss="modal">Cancel</button>
              </div> -->
                </div>
            </div>

        </div>
    </div>   
    
    <!--Modificar-->

    <!-- Modal -->
    <div class="modal fade" id="myModal10" role="dialog">
        <div class="modal-dialog modal-lg">

            <!-- Modal content-->
            <div class="modal-content mc">
                <div class="modal-header mo">
                    <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                </div>
                <div class="modal-body" style="padding:40px 50px;">
                    <form action="ActualizarCliente">
                        <div class="form-group row">
                            <label for="id" class="col-sm-2 col-form-label">Id:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" placeholder="Ingresar nombres" id="id" name="id" readonly="">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="nombre" class="col-sm-2 col-form-label">Nombres:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" placeholder="Ingresar nombres" id="nombre" name="nombre">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="apellido" class="col-sm-2 col-form-label">Apellidos:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control"  placeholder="Ingresar apellidos" id="apellido" name="apellido">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="tipo" class="col-sm-2 col-form-label">Tipo de identificación:</label>
                            <div class="col-sm-10">
                                <select id="tipo" class="custom-select" name="tip" >
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
                                <input type="text" class="form-control" id="identificacion" placeholder="Ingresar N° de identificación" name="N">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telefono1" class="col-sm-2 col-form-label">Teléfono:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="telefono1" placeholder="Ingresar teléfono" name="telefono">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="tipo" class="col-sm-2 col-form-label">Departamento:</label>
                            <div class="col-sm-10">
                                <select id="depart" class="custom-select" name="departamento" >
                                    <option value="Antioquia">Antioquia</option>
                                    <option value="Amazonas">Amazonas</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="ciu" class="col-sm-2 col-form-label">Ciudad:</label>
                            <div class="col-sm-10">
                                <select id="tipo" class="custom-select" name="ciu" >
                                    <option value="Bogotá">Bogotá</option>
                                    <option value="Medellín">Medellín</option>
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
            function ver(sexo,telefono, departamento, ciudad,fecha) {
                document.getElementById('myModal').style.display = 'block';
                document.getElementById('sexo').innerHTML = sexo;
                document.getElementById('telefono').innerHTML = telefono;
                document.getElementById('departamento').innerHTML = departamento;
                document.getElementById('ciudad').innerHTML = ciudad;
                document.getElementById('fecha').innerHTML = fecha;
            }
        </script>
        <script>
            function Mostrar(id, nombres, apellidos, tip, identificacion, telefono, depa ,ciu) {
                document.getElementById('myModal10').style.display = 'block';
                document.getElementById('id').value = id;
                document.getElementById('nombre').value = nombres;
                document.getElementById('apellido').value = apellidos;
                document.getElementById('tipo').value = tip;
                document.getElementById('identificacion').value = identificacion;
                document.getElementById('telefono1').value = telefono;
                document.getElementById('depart').value = depa;
                document.getElementById('ciuda').value = ciu;
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
