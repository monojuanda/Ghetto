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
            <form action="RegistrarPedido" method="post">
                <div class="form-group row">
                    <label for="ped" class="col-sm-2 col-form-label l-sb">N° Pedido:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="ped" placeholder="Ingresar N° Pedido" name="pedido">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="cli" class="col-sm-2 col-form-label l-sb">Cliente:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="cli" placeholder="Ingresar nombre del cliente" name="cliente">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="item" class="col-sm-2 col-form-label l-sb">Items:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="item" placeholder="Ingresar item" name="item">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="dir" class="col-sm-2 col-form-label l-sb">Dirección:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="dir" placeholder="Ingresar dirección" name="direccion">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="departamento" class="col-sm-2 col-form-label l-sb">Departamento:</label>
                    <div class="col-sm-10">
                        <select class="custom-select" id="departamento" name="departamento">
                            <option selected>Seleccionar departamento</option>
                            <option value="Antioquia">Antioquia</option>
                            <option value="Amazonas">Amazonas</option>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="ciudad" class="col-sm-2 col-form-label l-sb">Ciudad:</label>
                    <div class="col-sm-10">
                        <select class="custom-select" id="ciudad" name="ciudad">
                            <option selected>Seleccionar ciudad</option>
                            <option value="Medellín">Medellín</option>
                            <option value="Bogotá">Bogotá</option>
                        </select>
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
