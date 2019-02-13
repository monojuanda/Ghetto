<%-- 
    Document   : ListarPedidos
    Created on : 13/11/2018, 07:33:40 PM
    Author     : Tamayo B
--%>

<%@page import="Controlador.Modelo.Pedidos"%>
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
            ArrayList<Pedidos> al = (ArrayList) request.getAttribute("Lise");
        %>
    
<div class="container cont-table">
     <h2 class="myh2">Listar pedidos</h2>   
    <table id="table_id" class="table table-hover mytable">
        <thead class="thead tableTT">
            <tr>
                <th>N° Pedido</th>
                <th>Items</th>
                <th>Cliente</th>
                <th>Dirección</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
             <% 
                 System.out.print(al.size());
                    for (Pedidos p : al) {
             %>
            <tr>
                <td><%= p.getNpedido() %></td>                
                <td><%= p.getItems() %></td>
                <td><%= p.getCliente() %></td>
                <td><%= p.getDireccion() %></td>
            <td>
                <a class="btn btn-wh btn-sm" data-toggle="modal" data-target="#myModal" onclick="ver('<%= p.getDepartamento() %>', '<%= p.getCiudad() %>')"><span class="far fa-eye" aria-hidden="true"></span></a>
                <a class="btn btn-bl btn-sm" data-toggle="modal" data-target="#myModal10" onclick="Mostrar(<%= p.getId() %>, '<%= p.getNpedido() %>', '<%= p.getCliente() %>', '<%= p.getItems() %>', '<%= p.getDireccion() %>', '<%= p.getDepartamento() %>', '<%= p.getCiudad() %>',)"><span class="fas fa-edit h" aria-hidden="true"></span></a>
                    <a class="btn btn-re btn-sm tamb"><span class="fas fa-times h" aria-hidden="true"></span></a>
                </td>
            </tr>
              <%}%>          
        </tbody>
    </table>
</div>

<!--Ver más detalle-->

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
                            <label class="l-sb">Departamento:</label>
                            <label id="departamento"></label>
                        </div>
                        <div class="form-group">
                            <label class="l-sb">Ciudad:</label>
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
                    <form action="ActualizarPedido">
                        <div class="form-group row">
                            <label for="id" class="col-sm-2 col-form-label">Id:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="id" name="id" readonly="">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="pedido" class="col-sm-2 col-form-label">N° Pedido:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" placeholder="Ingresar N° pedido" id="pedido" name="pedido">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="cliente" class="col-sm-2 col-form-label">Nombre del cliente</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control"  placeholder="Ingresar nombre del liente" id="cliente" name="cliente">
                            </div>
                        </div>
                        
                        <div class="form-group row">
                            <label for="item" class="col-sm-2 col-form-label">Items:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="item" placeholder="Ingresar items" name="items">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="direccion" class="col-sm-2 col-form-label">Dirección:</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="direccion" placeholder="Ingresar dirección" name="direccion">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="depart" class="col-sm-2 col-form-label">Departamento:</label>
                            <div class="col-sm-10">
                                <select id="depart" class="custom-select" name="departamento" >
                                    <option value="Antioquia">Antioquia</option>
                                    <option value="Amazonas">Amazonas</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="ciud" class="col-sm-2 col-form-label">Ciudad:</label>
                            <div class="col-sm-10">
                                <select id="ciud" class="custom-select" name="ciudad" >
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
        function ver(depa, ciud){
            document.getElementById('myModal').style.display = 'block';
            document.getElementById('departamento').innerHTML = depa;
            document.getElementById('ciudad').innerHTML = ciud;
        }
    </script>
    <script>
        function Mostrar(id, pedido, cliente, item, direccion, depart, ciuda){
            document.getElementById('myModal10').style.display = 'block';
            document.getElementById('id').value = id;
            document.getElementById('pedido').value = pedido;
            document.getElementById('cliente').value = cliente;
            document.getElementById('item').value = item;
            document.getElementById('direccion').value = direccion;
            document.getElementById('depart').value = depart;
            document.getElementById('ciud').value = ciuda;
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