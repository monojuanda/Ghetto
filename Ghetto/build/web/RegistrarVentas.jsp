<%-- 
    Document   : RegistarPedidos
    Created on : 13/11/2018, 07:33:07 PM
    Author     : Tamayo B
--%>

<!DOCTYPE html>
<html>

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
        <%@include file="Navbar.jsp" %>

        <div class="container">
            <div class="form">
                <h2 class="myh2">Registrar Pedidos</h2>
                <form action="RegistrarVenta" method="post">
                    <div class="form-group row">
                        <label for="venta" class="col-sm-2 col-form-label l-sb">Código de venta:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="venta" placeholder="Ingresar N° Pedido" name="venta">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="produc" class="col-sm-2 col-form-label l-sb">Código de producto:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="produc" placeholder="Ingresar nombre del cliente" name="producto">
                        </div>
                    </div>
                    <div class="form-group row">
                    <label for="fecha" class="col-sm-2 col-form-label l-sb">Fecha de envío:</label>
                    <div class="col-sm-4">
                       <input type="date" class="form-control" id="fecha" name="fecha">
                    </div>
                    
                    <label for="cantidad" class="col-sm-1 col-form-label l-sb">Cantidad:</label>

                        <div class="form-check col-sm-4">
                            <input type="text" class="form-control" id="cantidad" placeholder="Ingresar cantidad" name="cantidad">
                        </div>
                </div>
                    <div class="form-group row">
                        <label for="pro" class="col-sm-2 col-form-label l-sb">Nombre del producto:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="pro" placeholder="Ingresar nombre del producto" name="Nproducto">
                      
                        </div>
                    </div>
                   <div class="form-group row">
                        <label for="desc" class="col-sm-2 col-form-label l-sb">Descripción del producto:</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" id="text" rows="3" placeholder="Ingresar descripción del producto"  name="des"></textarea>
                     
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="precio" class="col-sm-2 col-form-label l-sb">Nombre del producto:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="precio" placeholder="Ingresar precio" name="precio">
                      
                        </div>
                    </div>
                    <div class="button-principal">
                        <button type="submit" class="btn btn-color">Registar Pedido</button>
                    </div>
                </form>
            </div>
        </div>


        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap-4-navbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/Scroll.js"></script>
    </body>
</html>
