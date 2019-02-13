<%-- 
    Document   : Mujer
    Created on : 13/11/2018, 06:58:14 PM
    Author     : Tamayo B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="css/bootstrap-4-navbar.css" type="text/css">
        <link rel="stylesheet" href="css/fontawesome-all.min.css">
        <link rel="stylesheet" href="css/mujer.css">
        <title>Ghetto</title>
    </head>

    <body class="fondo1">
        <header class="banner">
            <i id="theFixed" class="fas fa-shopping-cart icon-cart">
                <div class="badge badge-color" id="badge-cart">0</div>
            </i>
        </header>

        <%@include file="Navbar.jsp" %>

        <div class="container mt-4">
            <div class="row">
                <div class="col-lg-2">
                    <div class="catalogo">
                        <h3>Catálogo</h3>
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customCheck1">
                            <label class="custom-control-label label-items" for="customCheck1">Top's</label>
                        </div>
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customCheck1.1">
                            <label class="custom-control-label label-items" for="customCheck1.1">Joggers</label>
                        </div>
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customCheck3">
                            <label class="custom-control-label label-items" for="customCheck3">Camisas</label>
                        </div>
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customCheck4">
                            <label class="custom-control-label label-items" for="customCheck4">Faldas</label>
                        </div>
                    </div>
                    <div class="catalogo mt-1">
                        <h3>Talla</h3>
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customCheck5">
                            <label class="custom-control-label label-items" for="customCheck5">XL</label>
                        </div>
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customCheck6">
                            <label class="custom-control-label label-items" for="customCheck6">XS</label>
                        </div>
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customCheck7">
                            <label class="custom-control-label label-items" for="customCheck7">S</label>
                        </div>
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customCheck8">
                            <label class="custom-control-label label-items" for="customCheck8">M</label>
                        </div>
                    </div>
                </div>
                <div class="col-lg-10">
                    <div class="card-deck">
                        <div class="card mb-3">
                            <div class="container-1">
                                <img src="imagenes/2.jpg" alt="Avatar" class="image"  width="284.667">
                                <div class="overlay">
                                    <a href="#" class="icon">
                                        <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal1"></i>
                                    </a>
                                </div>
                            </div>  
                            <!--<div class="card-body">-->
                            <!--    <h5 class="card-title">Card title</h5>-->
                            <!--    <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
                            <!--    <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>-->
                            <!--    <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>-->
                            <!--    <button class="btn btcon" type="button" id="btn-cart9"> <span class="fas fa-times"></span></button>-->
                            <!--</div>-->
                            <div class="card-body">
                                <h5 class="card-title">Camiseta blanca universo</h5>
                                <p class="card-text">$38.000.</p>

                            </div>
                        </div>
                        <div class="card mb-3">
                            <div class="container-1">
                                <img src="imagenes/2.jpg" alt="Avatar" class="image"  width="284.667">
                                <div class="overlay">
                                    <a href="#" class="icon">
                                        <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal2"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Camiseta blanca universo</h5>
                                <p class="card-text">$38.000.</p>

                            </div>
                        </div>
                        <div class="card mb-3">
                            <div class="container-1">
                                <img src="imagenes/2.jpg" alt="Avatar" class="image"  width="284.667">
                                <div class="overlay">
                                    <a href="#" class="icon">
                                        <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal3"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Camiseta blanca universo</h5>
                                <p class="card-text">$38.000.</p>

                            </div>
                        </div>
                    </div>
                    <div class="card-deck">
                        <div class="card mb-3">
                            <div class="container-1">
                                <img src="imagenes/2.jpg" alt="Avatar" class="image"  width="284.667">
                                <div class="overlay">
                                    <a href="#" class="icon">
                                        <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal4"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Camiseta blanca universo</h5>
                                <p class="card-text">$38.000.</p>

                            </div>
                        </div>
                        <div class="card mb-3">
                            <div class="container-1">
                                <img src="imagenes/2.jpg" alt="Avatar" class="image"  width="284.667">
                                <div class="overlay">
                                    <a href="#" class="icon">
                                        <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal5"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Camiseta blanca universo</h5>
                                <p class="card-text">$38.000.</p>

                            </div>
                        </div>
                        <div class="card mb-3">
                            <div class="container-1">
                                <img src="imagenes/2.jpg" alt="Avatar" class="image"  width="284.667">
                                <div class="overlay">
                                    <a href="#" class="icon">
                                        <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal6"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Camiseta blanca universo</h5>
                                <p class="card-text">$38.000.</p>

                            </div>
                        </div>
                    </div>
                    <div class="card-deck">
                        <div class="card mb-3">
                            <div class="container-1">
                                <img src="imagenes/2.jpg" alt="Avatar" class="image"  width="284.667">
                                <div class="overlay">
                                    <a href="#" class="icon">
                                        <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal7"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Camiseta blanca universo</h5>
                                <p class="card-text">$38.000.</p>

                            </div>
                        </div>
                        <div class="card mb-3">
                            <div class="container-1">
                                <img src="imagenes/2.jpg" alt="Avatar" class="image"  width="284.667">
                                <div class="overlay">
                                    <a href="#" class="icon">
                                        <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal8"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Camiseta blanca universo</h5>
                                <p class="card-text">$38.000.</p>

                            </div>
                        </div>
                        <div class="card mb-3">
                            <div class="container-1">
                                <img src="imagenes/2.jpg" alt="Avatar" class="image"  width="284.667">
                                <div class="overlay">
                                    <a href="#" class="icon">
                                        <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal9"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Camiseta blanca universo</h5>
                                <p class="card-text">$38.000.</p>

                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal1" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:25px 20px;">
                        <div class="col-lg-6 float-margin">
                            <img src="imagenes/2.jpg" alt="Avatar" class="image">
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 float">
                            <h3 class="l-sb">Camisa blanca universo</h3>
                            <label class="l-sb tama-letra">Codigo:</label>
                            <label class="tama-letra">00001</label>
                            <h4 class="l-sb">$38.000</h4>
                            <label for="talla">Talla</label>
                            <div class="bottom">
                                <select class="custom-select" id="talla" name="tipo" style="width:190px;">
                                    <option selected>Elige una opción</option>
                                    <option value="XL">XL</option>
                                    <option value="XS">XS</option>
                                    <option value="S">S</option>
                                    <option value="M">M</option>
                                </select>
                            </div>
                            <label for="cantidad">Cantidad</label>
                            <input type="text" class="form-control col-sm-2 text-center" id="cantidad" value="1">
                            <div class="top">
                                <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal2" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:25px 20px;">
                        <div class="col-lg-6 float-margin">
                            <img src="imagenes/2.jpg" alt="Avatar" class="image">
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 float">
                            <h3 class="l-sb">Camisa blanca universo</h3>
                            <label class="l-sb tama-letra">Codigo:</label>
                            <label class="tama-letra">00002</label>
                            <h4 class="l-sb">$38.000</h4>
                            <label for="talla">Talla</label>
                            <div class="bottom">
                                <select class="custom-select" id="talla" name="tipo" style="width:190px;">
                                    <option selected>Elige una opción</option>
                                    <option value="XL">XL</option>
                                    <option value="XS">XS</option>
                                    <option value="S">S</option>
                                    <option value="M">M</option>
                                </select>
                            </div>
                            <label for="cantidad">Cantidad</label>
                            <input type="text" class="form-control col-sm-2 text-center" id="cantidad" value="1">
                            <div class="top">
                                <button class="btn btcon" type="button" id="btn-cart1">Añadir al carrito</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal3" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:25px 20px;">
                        <div class="col-lg-6 float-margin">
                            <img src="imagenes/2.jpg" alt="Avatar" class="image">
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 float">
                            <h3 class="l-sb">Camisa blanca universo</h3>
                            <label class="l-sb tama-letra">Codigo:</label>
                            <label class="tama-letra">00003</label>
                            <h4 class="l-sb">$38.000</h4>
                            <label for="talla">Talla</label>
                            <div class="bottom">
                                <select class="custom-select" id="talla" name="tipo" style="width:190px;">
                                    <option selected>Elige una opción</option>
                                    <option value="XL">XL</option>
                                    <option value="XS">XS</option>
                                    <option value="S">S</option>
                                    <option value="M">M</option>
                                </select>
                            </div>
                            <label for="cantidad">Cantidad</label>
                            <input type="text" class="form-control col-sm-2 text-center" id="cantidad" value="1">
                            <div class="top">
                                <button class="btn btcon" type="button" id="btn-cart2">Añadir al carrito</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal4" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:25px 20px;">
                        <div class="col-lg-6 float-margin">
                            <img src="imagenes/2.jpg" alt="Avatar" class="image">
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 float">
                            <h3 class="l-sb">Camisa blanca universo</h3>
                            <label class="l-sb tama-letra">Codigo:</label>
                            <label class="tama-letra">00004</label>
                            <h4 class="l-sb">$38.000</h4>
                            <label for="talla">Talla</label>
                            <div class="bottom">
                                <select class="custom-select" id="talla" name="tipo" style="width:190px;">
                                    <option selected>Elige una opción</option>
                                    <option value="XL">XL</option>
                                    <option value="XS">XS</option>
                                    <option value="S">S</option>
                                    <option value="M">M</option>
                                </select>
                            </div>
                            <label for="cantidad">Cantidad</label>
                            <input type="text" class="form-control col-sm-2 text-center" id="cantidad" value="1">
                            <div class="top">
                                <button class="btn btcon" type="button" id="btn-cart3">Añadir al carrito</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal5" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:25px 20px;">
                        <div class="col-lg-6 float-margin">
                            <img src="imagenes/2.jpg" alt="Avatar" class="image">
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 float">
                            <h3 class="l-sb">Camisa blanca universo</h3>
                            <label class="l-sb tama-letra">Codigo:</label>
                            <label class="tama-letra">00005</label>
                            <h4 class="l-sb">$38.000</h4>
                            <label for="talla">Talla</label>
                            <div class="bottom">
                                <select class="custom-select" id="talla" name="tipo" style="width:190px;">
                                    <option selected>Elige una opción</option>
                                    <option value="XL">XL</option>
                                    <option value="XS">XS</option>
                                    <option value="S">S</option>
                                    <option value="M">M</option>
                                </select>
                            </div>
                            <label for="cantidad">Cantidad</label>
                            <input type="text" class="form-control col-sm-2 text-center" id="cantidad" value="1">
                            <div class="top">
                                <button class="btn btcon" type="button" id="btn-cart4">Añadir al carrito</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal6" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:25px 20px;">
                        <div class="col-lg-6 float-margin">
                            <img src="imagenes/2.jpg" alt="Avatar" class="image">
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 float">
                            <h3 class="l-sb">Camisa blanca universo</h3>
                            <label class="l-sb tama-letra">Codigo:</label>
                            <label class="tama-letra">00006</label>
                            <h4 class="l-sb">$38.000</h4>
                            <label for="talla">Talla</label>
                            <div class="bottom">
                                <select class="custom-select" id="talla" name="tipo" style="width:190px;">
                                    <option selected>Elige una opción</option>
                                    <option value="XL">XL</option>
                                    <option value="XS">XS</option>
                                    <option value="S">S</option>
                                    <option value="M">M</option>
                                </select>
                            </div>
                            <label for="cantidad">Cantidad</label>
                            <input type="text" class="form-control col-sm-2 text-center" id="cantidad" value="1">
                            <div class="top">
                                <button class="btn btcon" type="button" id="btn-cart5">Añadir al carrito</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal7" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:25px 20px;">
                        <div class="col-lg-6 float-margin">
                            <img src="imagenes/2.jpg" alt="Avatar" class="image">
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 float">
                            <h3 class="l-sb">Camisa blanca universo</h3>
                            <label class="l-sb tama-letra">Codigo:</label>
                            <label class="tama-letra">00007</label>
                            <h4 class="l-sb">$38.000</h4>
                            <label for="talla">Talla</label>
                            <div class="bottom">
                                <select class="custom-select" id="talla" name="tipo" style="width:190px;">
                                    <option selected>Elige una opción</option>
                                    <option value="XL">XL</option>
                                    <option value="XS">XS</option>
                                    <option value="S">S</option>
                                    <option value="M">M</option>
                                </select>
                            </div>
                            <label for="cantidad">Cantidad</label>
                            <input type="text" class="form-control col-sm-2 text-center" id="cantidad" value="1">
                            <div class="top">
                                <button class="btn btcon" type="button" id="btn-cart6">Añadir al carrito</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal8" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:25px 20px;">
                        <div class="col-lg-6 float-margin">
                            <img src="imagenes/2.jpg" alt="Avatar" class="image">
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 float">
                            <h3 class="l-sb">Camisa blanca universo</h3>
                            <label class="l-sb tama-letra">Codigo:</label>
                            <label class="tama-letra">00008</label>
                            <h4 class="l-sb">$38.000</h4>
                            <label for="talla">Talla</label>
                            <div class="bottom">
                                <select class="custom-select" id="talla" name="tipo" style="width:190px;">
                                    <option selected>Elige una opción</option>
                                    <option value="XL">XL</option>
                                    <option value="XS">XS</option>
                                    <option value="S">S</option>
                                    <option value="M">M</option>
                                </select>
                            </div>
                            <label for="cantidad">Cantidad</label>
                            <input type="text" class="form-control col-sm-2 text-center" id="cantidad" value="1">
                            <div class="top">
                                <button class="btn btcon" type="button" id="btn-cart7">Añadir al carrito</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myModal9" role="dialog">
            <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content mc">
                    <div class="modal-header mo">
                        <button type="button" class="close fas fa-times" data-dismiss="modal"></button>
                    </div>
                    <div class="modal-body" style="padding:25px 20px;">
                        <div class="col-lg-6 float-margin">
                            <img src="imagenes/2.jpg" alt="Avatar" class="image">
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 float">
                            <h3 class="l-sb">Camisa blanca universo</h3>
                            <label class="l-sb tama-letra">Codigo:</label>
                            <label class="tama-letra">00009</label>
                            <h4 class="l-sb">$38.000</h4>
                            <label for="talla">Talla</label>
                            <div class="bottom">
                                <select class="custom-select" id="talla" name="tipo" style="width:190px;">
                                    <option selected>Elige una opción</option>
                                    <option value="XL">XL</option>
                                    <option value="XS">XS</option>
                                    <option value="S">S</option>
                                    <option value="M">M</option>
                                </select>
                            </div>
                            <label for="cantidad">Cantidad</label>
                            <input type="text" class="form-control col-sm-2 text-center" id="cantidad" value="1">
                            <div class="top">
                                <button class="btn btcon" type="button" id="btn-cart8">Añadir al carrito</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%@include file="Footer.jsp" %>

        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap-4-navbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/mujer.js"></script>
        <script src="js/Scroll.js"></script>
    </body>
</html>

