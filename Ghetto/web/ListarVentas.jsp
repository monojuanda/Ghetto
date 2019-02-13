<%-- 
    Document   : ListarVentas
    Created on : 13/11/2018, 07:34:04 PM
    Author     : Tamayo B
--%>

<%@page import="Controlador.Modelo.Ventas"%>
<%@page import="java.util.ArrayList"%>
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

    <body class="fondo1">
        <header class="banner">
        </header>
        <%@include file="Navbar.jsp" %>
        
        <%
            ArrayList<Ventas> as = (ArrayList) request.getAttribute("Lise");
        %>

        <div class="container cont-table">
            <h2 class="myh2">Listar ventas</h2>
            <table id="table_id" class="table table-hover mytable">
                <thead class="thead tableTT">
                    <tr>
                        <th scope="col">Código de venta</th>
                        <th scope="col">Código del producto</th>
                        <th scope="col">Fecha de venta</th>
                        <th scope="col">Cantidad</th>

                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                      System.out.print(as.size());
                    for (Ventas r : as) {  
                    %>
                    <tr>
                        <td><%= r.getCventa() %></td> 
                        <td><%= r.getCproducto()%></td>
                        <td><%= r.getFchventa()%></td>
                        <td><%= r.getCantidad()%></td>
                        <td>
                            <a class="btn btn-wh btn-sm" data-toggle="modal" data-target="#myModal" onclick="ver('<%= r.getNproducto()%>','<%= r.getDcproducto()%>','<%= r.getPrecio() %>')"><span class="far fa-eye" aria-hidden="true"></span></a>
                            <a class="btn btn-bl btn-sm" data-toggle="modal" data-target="#myModal10"><span class="fas fa-edit h" aria-hidden="true"></span></a>
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
                                <label class="l-sb">Nombre del producto:</label>
                                <label id="producto"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Descripción del producto:</label>
                                <label id="dcproducto"></label>
                            </div>
                            <div class="form-group">
                                <label class="l-sb">Precio:</label>
                                <label id="precio"></label>
                            </div>
                        </form>
                    </div>
                    <!-- <div class="modal-footer">
                <button type="submit" class="btn btcon pull-left" data-dismiss="modal">Cancel</button>
              </div> -->
                </div>
            </div>
        </div>


        <!--Modificar-->
        <div class="modal fade" id="myModal10" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:40px 50px;">
                        <form role="form">
                            <div class="form-group row">
                                <label for="codv" class="col-sm-2 col-form-label l-sb">Código de venta:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="codv" placeholder="Ingresar Código de venta" value="01">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="cod" class="col-sm-2 col-form-label l-sb">Código de producto:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="cod" placeholder="Ingresar código del producto" value="000001">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="can" class="col-sm-2 col-form-label l-sb">Cantidad:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="can" placeholder="Ingresar cantidad" value="5">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="nom" class="col-sm-2 col-form-label l-sb">Nombre del producto:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="nom" placeholder="Ingresar Nombre del producto" value="Camisetas">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="pro" class="col-sm-2 col-form-label l-sb">Descripción del producto:</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control" id="text" rows="3" placeholder="Ingresar descripción">Rayas rojas</textarea>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="pre" class="col-sm-2 col-form-label l-sb">Precio:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="pre" placeholder="Ingresar precio" value="15.000">
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
            function ver (producto, dcproducto, precio){
                document.getElementById('myModal').style.display = 'block';
                document.getElementById('producto').innerHTML = producto;
                document.getElementById('dcproducto').innerHTML = dcproducto;
                document.getElementById('precio').innerHTML = precio;
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
