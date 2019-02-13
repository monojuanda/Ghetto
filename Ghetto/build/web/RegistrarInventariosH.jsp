<%-- 
    Document   : RegistrarInventariosH
    Created on : 13/11/2018, 07:28:44 PM
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
                <h2 class="myh2">Registrar Inventario de Hombre</h2>
                <form action="RegistrarInvH" method="Post">
                    <div class="form-group row">
                        <label for="cod" class="col-sm-2 col-form-label l-sb">Item</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="cod" placeholder="Ingresar Item" name="item">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="nom" class="col-sm-2 col-form-label l-sb">Categor�a</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="nom" placeholder="Ingresar categoria" name="categoria">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="color" class="col-sm-2 col-form-label l-sb">Color:</label>
                        <div class="col-sm-6">
                            <select class="custom-select" id="color" name="color">
                                <option selected>Elegir un color</option>
                                <option value="Rojo">Rojo</option>
                                <option value="Negro">Negro</option>
                                <option value="Blanco">Blanco</option>
                                <option value="Gris">Gris</option>
                            </select>
                        </div>

                        <label for="gene" class="col-sm-1 col-form-label l-sb">G�nero:</label>

                        <div class="form-check col-sm-2">
                            <input class="form-check-input radio" type="radio" id="gene" value="Hombre" checked name="genero">
                            <label class="l-sb labhom">Hombre</label>
                            <input class="form-check-input margin radio" type="radio" id="gene" value="Mujer" name="genero">
                            <label class="l-sb labmuj">Mujer</label>
                        </div>
                    </div>                 
                    <div class="form-group row">
                        <label for="text" class="col-sm-2 col-form-label l-sb">Descripci�n:</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" id="text" rows="3" placeholder="Ingresar descripci�n"  name="descripcion"></textarea>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="ca" class="col-sm-2 col-form-label l-sb">Precio</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="ca" placeholder="Ingresar precio" name="precio">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="correo" class="col-sm-2 col-form-label l-sb">Colecci�n:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="correo" placeholder="Ingresar colecci�n"  name="coleccion">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="pre" class="col-sm-2 col-form-label l-sb">Cantidad:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="pre" placeholder="Ingresar cantidad"  name="cantidad">
                        </div>
                    </div>
                    <div class="button-principal">
                        <button type="submit" class="btn btn-color">Registar Inventario</button>
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

