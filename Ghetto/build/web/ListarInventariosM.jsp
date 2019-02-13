<%-- 
    Document   : ListarInventariosM
    Created on : 13/11/2018, 07:31:41 PM
    Author     : Tamayo B
--%>

<%@page import="Controlador.Modelo.Invmujer"%>
<%@page import="java.util.ArrayList"%>
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

            ArrayList<Invmujer> as = (ArrayList) request.getAttribute("Lise");

        %>
        <div class="container cont-table">
            <h2 class="myh2">Listar inventario de Mujer</h2>
            <table id="table_id" class="table table-hover mytable">
                <thead class="thead tableTT">
                    <tr>
                        <th scope="col">Item</th>
                        <th scope="col">Categoría</th>
                        <th scope="col">Descripción</th>
                        <th scope="col">Cantidad</th>
                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <%                        System.out.println(as);
                        for (Invmujer r : as) {

                    %>
                    <tr>
                        <td><%= r.getItem()%></td>
                        <td><%= r.getCategoria()%></td>
                        <td><%= r.getDescripcion()%></td>
                        <td><%= r.getCantidad()%></td>
                        <td>
                            <a class="btn btn-wh btn-sm" data-toggle="modal" data-target="#myModal" onclick="ver('<%= r.getColor()%>', '<%= r.getGenero()%>', '<%= r.getPrecio()%>', '<%= r.getColeccion()%>')"><span class="far fa-eye" aria-hidden="true"></span></a>
                            <a class="btn btn-bl btn-sm" data-toggle="modal" data-target="#myModal10" onclick="Mostrar(<%= r.getId()%>, '<%= r.getCategoria()%>', '<%= r.getColor()%>', '<%= r.getDescripcion()%>', '<%= r.getPrecio()%>', '<%= r.getColeccion()%>', '<%= r.getCantidad()%>')"><span class="fas fa-edit h" aria-hidden="true"></span></a>
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
                        <div class="form-group">
                            <label class="l-sb">Color:</label>
                            <label id="color"></label>
                        </div>
                        <div class="form-group">
                            <label class="l-sb">Género:</label>
                            <label id="genero"></label>
                        </div>
                        <div class="form-group">
                            <label class="l-sb">Colección:</label>
                            <label id="coleccion"></label>
                        </div>
                        <div class="form-group">
                            <label class="l-sb">Precio:</label>
                            <label id="precio"></label>
                        </div>                        
                    </div>
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
                        <form action="ActualizarInvM">
                            <div class="form-group row">
                                <label for="id" class="col-sm-2 col-form-label">ID:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="id" name="ID" readonly="">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="categ" class="col-sm-2 col-form-label">Categoria:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="categ" placeholder="Ingresar categoría" name="categoria">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="col" class="col-sm-2 col-form-label">Color:</label>
                                <div class="col-sm-10">
                                    <select id="col" class="custom-select" name="color" >
                                        <option value="Negro">Negro</option>
                                        <option value="Rojo">Rojo</option>
                                        <option value="Blanco">Blanco</option>
                                        <option value="Gris">Gris</option>

                                    </select>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="desc" class="col-sm-2 col-form-label">Descripción:</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control" id="desc" rows="3" placeholder="Ingresar descripción" name="descripcion"></textarea>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="pre" class="col-sm-2 col-form-label">Precio:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="pre" placeholder="Ingresar precio" name="precio" >
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="colec" class="col-sm-2 col-form-label">Colección:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="colec" placeholder="Ingresar colección" name="coleccion">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="cant" class="col-sm-2 col-form-label">Cantidad:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="cant" placeholder="Ingresar cantidad" name="cantidad">
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
            function ver(color, genero, precio, coleccion) {
                document.getElementById('myModal').style.display = 'block';
                document.getElementById('color').innerHTML = color;
                document.getElementById('genero').innerHTML = genero;
                document.getElementById('precio').innerHTML = precio;
                document.getElementById('coleccion').innerHTML = coleccion;
            }
        </script>
        <script>
            function Mostrar(id, cate, col, desc, pre, colec, cant) {
                document.getElementById('myModal10').style.display = 'block';
                document.getElementById('id').value = id;
                document.getElementById('categ').value = cate;
                document.getElementById('col').value = col;
                document.getElementById('desc').value = desc;
                document.getElementById('pre').value = pre;
                document.getElementById('colec').value = colec;
                document.getElementById('cant').value = cant;
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

