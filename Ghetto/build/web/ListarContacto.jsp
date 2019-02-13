<%-- 
    Document   : ListarEmpleados
    Created on : 13/11/2018, 07:16:26 PM
    Author     : Tamayo B
--%>

<%@page import="Controlador.Modelo.Contactos"%>
<%@page import="java.util.ArrayList"%>
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
            ArrayList<Contactos> as = (ArrayList) request.getAttribute("Lise");
        %>

        <div class="container cont-table">
            <h2 class="myh2">Listar contactos</h2>
            <table id="table_id" class="table table-hover mytable">
                <thead class="thead tableTT">
                    <tr>
                        <th scope="col">Correo</th>
                        <th scope="col">Teléfono</th>
                        <th scope="col">N° de pedido</th>
                        <th scope="col">Asunto</th>
                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        System.out.println(as);
                        for (Contactos r : as) {

                    %>
                    <tr>
                        <td><%= r.getCorreo()%></td>
                        <td><%= r.getTelefono()%></td>
                        <td><%= r.getNumPedido()%></td>
                        <td><%= r.getAsunto()%></td>
                        <td>
                            <a class="btn btn-wh btn-sm" data-toggle="modal" data-target="#myModal" onclick="ver('<%= r.getNombres()%>', '<%= r.getApellidos()%>', '<%= r.getDepartamento()%>', '<%= r.getCiudad()%>', '<%= r.getComentario()%>')"><span class="far fa-eye" aria-hidden="true"></span></a>
                            <a class="btn btn-bl btn-sm" data-toggle="modal" data-target="#myModal10" onclick="Mostrar(<%= r.getId()%>, '<%= r.getNombres()%>', '<%= r.getApellidos()%>', '<%= r.getCorreo()%>', '<%= r.getTelefono()%>', '<%= r.getDepartamento()%>', '<%= r.getCiudad()%>', '<%= r.getNumPedido()%>', '<%= r.getAsunto()%>', '<%= r.getComentario()%>')"><span class="fas fa-edit h" aria-hidden="true"></span></a>
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
                                <label class="l-sb">Nombres:</label>
                                <label id="nombre"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Apellidos:</label>
                                <label id="apellido"></label>
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
                                <label class="l-sb">Comentario:</label>
                                <label id="comentario"></label>
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
                        <form action="ActualizarContacto" role="form" >
                            <div class="form-group row">
                                <label for="ID" class="col-sm-2 col-form-label">ID</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="id" name="id" readonly="">
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
                                <label for="email" class="col-sm-2 col-form-label">Correo electrónico:</label>
                                <div class="col-sm-10">
                                    <input type="email" class="form-control" id="email" placeholder="Ingresar correo electrónico" name="email">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="tel" class="col-sm-2 col-form-label">Teléfono:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="tel" placeholder="Ingresar teléfono" name="telefono">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="depart" class="col-sm-2 col-form-label">Departamento:</label>
                                <div class="col-sm-10">
                                    <select class="custom-select" id="depart" name="departamento">
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
                                <label for="ped" class="col-sm-2 col-form-label">N° de pedido</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="ped" placeholder="Ingresar N° de pedido" name="pedido">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="asun" class="col-sm-2 col-form-label">Asunto:</label>
                                <div class="col-sm-10">
                                    <select class="custom-select" id="asun" name="asunto">
                                        <option selected>Seleccionar un asunto</option>
                                        <option value="Información. Estado de pedido">Información. Estado de pedido</option>
                                        <option value="Información. Cambio / Devolución de ropa">Información. Cambio / Devolución de ropa</option>
                                        <option value="Información. Procesos de compras online y envíos">Información. Estado de pedidoInformación. Procesos de compras online y envíos</option>
                                        <option value="Sugerencias">Sugerencias</option>
                                        <option value="Otros...">Otros...</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="comen" class="col-sm-2 col-form-label">Comentario:</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control" rows="5" id="comen" name="comentario"></textarea>
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
            function ver(nombre, apellido, departamento, ciudad, comentario) {
                document.getElementById('myModal').style.display = 'block';
                document.getElementById('nombre').innerHTML = nombre;
                document.getElementById('apellido').innerHTML = apellido;
                document.getElementById('departamento').innerHTML = departamento;
                document.getElementById('ciudad').innerHTML = ciudad;
                document.getElementById('comentario').innerHTML = comentario;
            }
        </script>
        <script>
            function Mostrar(id, nombres, apellidos, email, tel, depart, ciu, ped, asun, comen){
               document.getElementById('myModal10').style.display = 'block'; 
               document.getElementById('id').value = id;
               document.getElementById('nombres').value = nombres;
               document.getElementById('apellidos').value = apellidos;
               document.getElementById('email').value = email;
               document.getElementById('tel').value = tel;
               document.getElementById('depart').value = depart;
               document.getElementById('ciu').value = ciu;
               document.getElementById('ped').value = ped;
               document.getElementById('asun').value = asun;
               document.getElementById('comen').value = comen;
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
