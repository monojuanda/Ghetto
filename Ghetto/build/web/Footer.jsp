<%-- 
    Document   : Footer
    Created on : 20/11/2018, 01:46:34 PM
    Author     : Tamayo B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/fontawesome-all.min.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" href="css/Footer.css">
        <title>JSP Page</title>
    </head>
    <body>
        <footer>
            <!-- &copy;Gheto 2018 -->
            <div class="Pagos">
                <img class="icono" src="imagenes/iconos/paypal.ico" alt="Paypal">
                <img class="icono" src="imagenes/iconos/Master.ico" alt="Master Card">
                <img class="icono" src="imagenes/iconos/Visa.ico" alt="Visa">
                <img class="icono" src="imagenes/iconos/Maestro.ico" alt="Maestro">
                <!--<img class="icono" src="imagenes/iconos/American.ico" alt="American Express">-->
                <!--<img class="icono" src="imagenes/iconos/Bitcoin.ico" alt="Bitcoin">-->
            </div>
            <div class="Personal">
                <div class="col-6 cor">
                    <ul>
                        <li><a class="contenido" href="Nosotros.jsp"><i class="fas fa-users"></i> Nosotros</a></li>
                        <li><a class="contenido" href="Contacto.jsp"><i class="fas fa-phone"></i> Contacto</a></li>
                        <li><a class="contenido" href="#"><i class="fas fa-shipping-fast"></i>Envíos</a></li>
                        <li><a class="contenido" href="#"><i class="fas fa-box-open"></i>Cambios, Garantías y Devoluciones</a></li>
                    </ul>
                </div>
            </div>
            <div class="Redes">
                <div class="fila">
                    <a class="contenido" href="#"><img class="imgicon1" src="imagenes/iconos/Facebook.ico" alt="Facebook" ></a>
                    <a class="contenido" href="#"><img class="imgicon2" src="imagenes/iconos/Messenger.ico" alt="Messenger"></a>
                    <a class="contenido" href="#"><img class="imgicon3" src="imagenes/iconos/Twitter.ico" alt="Twitter"></a>
                    <a class="contenido" href="#"><img class="imgicon4" src="imagenes/iconos/Instagram.ico" alt="Instagram"></a>
                    <a class="contenido" href="#"><img class="imgicon5" src="imagenes/iconos/Whatsapp.ico" alt="WahtsApp"></a>
                </div>
            </div>
        </footer>

        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/Scroll.js"></script>
    </body>
</html>
