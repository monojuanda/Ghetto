<%-- 
    Document   : Hombre
    Created on : 13/11/2018, 07:08:21 PM
    Author     : Tamayo B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-4-navbar.css" type="text/css">
    <link rel="stylesheet" href="css/fontawesome-all.min.css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <link rel="stylesheet" href="css/hombre.css" type="text/css">

    <title>Ghetto</title>
</head>

<body class="fondo1">
    <header class="banner">
        <i class="fas fa-shopping-cart icon-cart">
            <div class="badge badge-color" id="badge-cart">0</div>
        </i>
    </header>
    
    
    <!--   <nav class="navbar navbar-expand-lg navbar-dark mynavbar" data-toggle="sticky-onscroll">
        <a class="navbar-brand" href="index.html">Ghetto</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mx-auto">
                <li class="nav-item"> <a class="nav-link" href="Hombre.jsp">HOMBRE</a> </li>
                <li class="nav-item"> <a class="nav-link" href="Mujer.jsp">MUJER</a> </li>
                <li class="nav-item"> <a class="nav-link" href="Nosotros.jsp">EL BARRIO</a> </li>
            </ul>
            <ul class="navbar-nav">
                <li class="nav-item"> <a class="nav-link" data-toggle="modal" data-target="#myModal">Cerrar sesión  <span class="fas fa-sign-out-alt "></span> </a></li>
            </ul>
        </div>
    </nav> -->
    
    <%@include file="Navbar.jsp" %>
    
    <div class="container mt-4">
        <div class="row">
            <div class="col-lg-2">
                <div class="catalogo">
                    <h3>Catálogo</h3>
                    <div class="custom-control custom-checkbox">
                        <input type="checkbox" class="custom-control-input" id="customCheck1">
                        <label class="custom-control-label label-items" for="customCheck1">Camisas</label>
                    </div>
                    <div class="custom-control custom-checkbox">
                        <input type="checkbox" class="custom-control-input" id="customCheck2">
                        <label class="custom-control-label label-items" for="customCheck2">Pantalones</label>
                    </div>
                    <div class="custom-control custom-checkbox">
                        <input type="checkbox" class="custom-control-input" id="customCheck3">
                        <label class="custom-control-label label-items" for="customCheck3">Chaquetas</label>
                    </div>
                    <div class="custom-control custom-checkbox">
                        <input type="checkbox" class="custom-control-input" id="customCheck4">
                        <label class="custom-control-label label-items" for="customCheck4">Zapatos</label>
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
                        <label class="custom-control-label label-items" for="customCheck6">L</label>
                    </div>
                    <div class="custom-control custom-checkbox">
                        <input type="checkbox" class="custom-control-input" id="customCheck7">
                        <label class="custom-control-label label-items" for="customCheck7">M</label>
                    </div>
                    <div class="custom-control custom-checkbox">
                        <input type="checkbox" class="custom-control-input" id="customCheck8">
                        <label class="custom-control-label label-items" for="customCheck8">S</label>
                    </div>
                </div>
            </div>
            <div class="col-lg-10">
                <div class="card-deck">
                    <div class="card mb-3">
                       <div class="container-1">
                              <img src="imagenes/F1.JPG" alt="Avatar" class="image"  width="284.667">
                                  <div class="overlay">
                                    <a href="#" class="icon">
                                      <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal1"></i>
                                    </a>
                                  </div>
                            </div>
                        <div class="card-body">
                            <h5 class="card-title">Camiseta blanca universo</h5>
                            <p class="card-text">$38.000.</p>
                             <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                        </div>
                    </div>
                    <div class="card mb-3">
                        <div class="container-1">
                            <img src="imagenes/F2.JPG" alt="Avatar" class="image"  width="284.667">
                                  <div class="overlay">
                                    <a href="#" class="icon">
                                      <i class="far fa-eye fa-2x icon " data-toggle="modal" data-target="#myModal2"></i>
                                    </a>
                                  </div>
                            </div>
                        <div class="card-body">
                            <h5 class="card-title">Camiseta negro Ghetto</h5>
                            <p class="card-text">$38.000</p>
                            <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                            
                        </div>
                    </div>
                    <div class="card mb-3">
                        <div class="container-1">
                              <img src="imagenes/F8.JPG" alt="Avatar" class="image"  width="284.667">
                                  <div class="overlay">
                                    <a href="#" class="icon">
                                      <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal3"></i>
                                    </a>
                                  </div>
                            </div>
                        <div class="card-body">
                            <h5 class="card-title">Camiseta negro Ghetto</h5>
                            <p class="card-text">$38.000</p>
                            <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                            
                        </div>
                    </div>
                </div>
                <div class="card-deck">
                    <div class="card mb-3">
                        <div class="container-1">
                              <img src="imagenes/F4.JPG" alt="Avatar" class="image"  width="284.667">
                                  <div class="overlay">
                                    <a href="#" class="icon">
                                      <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal4"></i>
                                    </a>
                                  </div>
                            </div>
                        <div class="card-body">
                            <h5 class="card-title">Camiseta blanca universo</h5>
                            <p class="card-text">$38.000.</p>
                            <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                            
                        </div>
                    </div>
                    <div class="card mb-3">
                        <div class="container-1">
                              <img src="imagenes/F5.JPG" alt="Avatar" class="image"  width="284.667">
                                  <div class="overlay">
                                    <a href="#" class="icon">
                                      <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal5"></i>
                                    </a>
                                  </div>
                            </div>
                        <div class="card-body">
                            <h5 class="card-title">Camiseta negro Ghetto</h5>
                            <p class="card-text">$38.000</p>
                            <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                            
                        </div>
                    </div>
                    <div class="card mb-3">
                        <div class="container-1">
                              <img src="imagenes/F.jpg" alt="Avatar" class="image"  width="284.667">
                                  <div class="overlay">
                                    <a href="#" class="icon">
                                      <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal6"></i>
                                    </a>
                                  </div>
                            </div>
                        <div class="card-body">
                            <h5 class="card-title">Camiseta negro Ghetto</h5>
                            <p class="card-text">$38.000</p>
                            <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                            
                        </div>
                    </div>
                </div>
                 <div class="card-deck">
                    <div class="card mb-3">
                        <div class="container-1">
                              <img src="imagenes/F7.JPG" alt="Avatar" class="image"  width="284.667">
                                  <div class="overlay">
                                    <a href="#" class="icon">
                                      <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal7"></i>
                                    </a>
                                  </div>
                            </div>
                        <div class="card-body">
                            <h5 class="card-title">Camiseta blanca universo</h5>
                            <p class="card-text">$38.000.</p>
                            <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                            
                        </div>
                    </div>
                    <div class="card mb-3">
                        <div class="container-1">
                              <img src="imagenes/F8.JPG" alt="Avatar" class="image"  width="284.667">
                                  <div class="overlay">
                                    <a href="#" class="icon">
                                      <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal8"></i>
                                    </a>
                                  </div>
                            </div>
                        <div class="card-body">
                            <h5 class="card-title">Camiseta negro Ghetto</h5>
                            <p class="card-text">$38.000</p>
                            <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                            
                        </div>
                    </div>
                    <div class="card mb-3">
                        <div class="container-1">
                              <img src="imagenes/F3.JPG" alt="Avatar" class="image"  width="284.667">
                                  <div class="overlay">
                                    <a href="#" class="icon">
                                      <i class="far fa-eye fa-2x icon" data-toggle="modal" data-target="#myModal9"></i>
                                    </a>
                                  </div>
                            </div>
                        <div class="card-body">
                            <h5 class="card-title">Camiseta negro Ghetto</h5>
                            <p class="card-text">$38.000</p>
                            <button class="btn btcon" type="button" id="btn-cart">Añadir al carrito</button>
                            
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
                    <img src="imagenes/F1.JPG" alt="Avatar" class="image12">
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
                            <option value="L">L</option>
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
                    <img src="imagenes/F2.JPG" alt="Avatar" class="image12">
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
                            <option value="L">L</option>
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
                    <img src="imagenes/F8.JPG" alt="Avatar" class="image12">
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
                            <option value="L">L</option>
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
                    <img src="imagenes/F4.JPG" alt="Avatar" class="image12">
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
                            <option value="L">L</option>
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
                    <img src="imagenes/F5.JPG" alt="Avatar" class="image12">
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
                            <option value="L">L</option>
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
                    <img src="imagenes/F.JPG" alt="Avatar" class="image12">
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
                            <option value="L">L</option>
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
                    <img src="imagenes/F7.JPG" alt="Avatar" class="image12">
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
                            <option value="L">L</option>
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
                    <img src="imagenes/F8.JPG" alt="Avatar" class="image12">
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
                            <option value="L">L</option>
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
                    <img src="imagenes/F3.JPG" alt="Avatar" class="image12">
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
                            <option value="L">L</option>
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
    <script src="js/hombre.js"></script>
    <script src="js/Scroll.js"></script>
</body>



</html>
