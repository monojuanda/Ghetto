package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Navbar.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome-all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Footer.css\">\n");
      out.write("        <title>Ghetto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"banner\">\n");
      out.write("        </header>\n");
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-4-navbar.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome-all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.bootstrap4.css\" type=\"text/css\" />\n");
      out.write("        <title>Ghetto</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"fondo1\">\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark mynavbar\" data-toggle=\"sticky-onscroll\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Ghetto</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mx-auto\">\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Hombre.jsp\">HOMBRE</a> </li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Mujer.jsp\">MUJER</a> </li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Nosotros.jsp\">EL BARRIO</a> </li>\n");
      out.write("                        ");

                            HttpSession se = request.getSession(true);
                            String rol = "invitado";
                            String nu = "Ingresar";
                            String msg = "Registrar";
                            if (se.getAttribute("rusuario") == null) {
                                rol = "invitado";
                            } else {
                                rol = (String) se.getAttribute("rusuario");
                                nu = (String) se.getAttribute("nusuario");
                                msg = "Activo";
                            }
                            if (rol.equals("Admin")) {

                        
      out.write("\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Empleados </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarEmpleados.jsp\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarEmpleado\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Clientes </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarClientes.jsp\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarCliente\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Pedidos </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarPedidos.jsp\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarPedido\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Inventarios\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu m\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                            <li><a class=\"dropdown-item d dropdown-toggle\" href=\"#\">Hombres</a>\n");
      out.write("                                <ul class=\"dropdown-menu m\">\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"RegistrarInventariosH.jsp\">Registrar</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"ListarInventarioH\">Listar</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a class=\"dropdown-item d dropdown-toggle\" href=\"#\">Mujeres</a>\n");
      out.write("                                <ul class=\"dropdown-menu m\">\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"RegistrarInventariosM.jsp\">Registrar</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"ListarInventarioM\">Listar</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!--<li class=\"nav-item dropdown\">-->\n");
      out.write("                    <!--    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Facturaciones </a>-->\n");
      out.write("                    <!--    <div class=\"dropdown-menu m\">-->\n");
      out.write("                    <!--        <a class=\"dropdown-item d\" href=\"#\">Registrar</a>-->\n");
      out.write("                    <!--        <a class=\"dropdown-item d\" href=\"#\">Listar</a>-->\n");
      out.write("                    <!--    </div>-->\n");
      out.write("                    <!--</li>-->\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Proveedores </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarProveedores.jsp\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarProveedor\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Contactos </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"Contacto.jsp\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarContacto\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <!--<li class=\"nav-item dropdown\">-->\n");
      out.write("                    <!--    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Mensajería </a>-->\n");
      out.write("                    <!--    <div class=\"dropdown-menu m\">-->\n");
      out.write("                    <!--        <a class=\"dropdown-item d\" href=\"#\">Registrar</a>-->\n");
      out.write("                    <!--        <a class=\"dropdown-item d\" href=\"#\">Listar</a>-->\n");
      out.write("                    <!--    </div>-->\n");
      out.write("                    <!--</li>-->\n");
      out.write("                    <!--<li class=\"nav-item dropdown\">-->\n");
      out.write("                    <!--    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Pagos </a>-->\n");
      out.write("                    <!--    <div class=\"dropdown-menu m\">-->\n");
      out.write("                    <!--        <a class=\"dropdown-item d\" href=\"#\">Registrar</a>-->\n");
      out.write("                    <!--        <a class=\"dropdown-item d\" href=\"#\">Listar</a>-->\n");
      out.write("                    <!--    </div>-->\n");
      out.write("                    <!--</li>-->\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Permisos.jsp\" id=\"navbardrop\"> Permisos </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Logs.jsp\" id=\"navbardrop\"> Logs </a>\n");
      out.write("                    </li>\n");
      out.write("                     <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"> <a href=\"Logout\" class=\"nav-link\">Cerrar sesión  <span class=\"fas fa-sign-out-alt\"></span> </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                     ");
                    
                        } else if (rol.equals("EmpleadoVentas")) {
                     
      out.write("\n");
      out.write("                     \n");
      out.write("                     <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Pedidos </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarPedidos.jsp\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarPedido\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Ventas </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarVentas.jsp\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>     \n");
      out.write("                     <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"> <a href=\"Logout\" class=\"nav-link\">Cerrar sesión  <span class=\"fas fa-sign-out-alt\"></span> </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    ");

                       } 
                     
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#myModal\">");
      out.print(nu);
      out.write(" <span class=\"fas fa-sign-in-alt \"></span> </a></li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link myitem\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal2\">");
      out.print(msg);
      out.write("</a></li>\n");
      out.write("                </ul>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("        <!--Modal de ingresar-->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content mc\">\n");
      out.write("                    <div class=\"modal-header \">\n");
      out.write("                        <button type=\"button\" class=\"close fas fa-times\" data-dismiss=\"modal\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("                        <form action=\"Login\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"correo\">Correo electrónico:</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"correo\" placeholder=\"Ingresar correo electrónico\" name=\"ntext\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"con\">Contraseña:</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"con\" placeholder=\"Ingresar contraseña\" name=\"ptext\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"checkbox\" value=\"\" checked>Recuérdame\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-center\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btco\">Ingresar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- <div class=\"modal-footer\">\n");
      out.write("                       <button type=\"submit\" class=\"btn btcon pull-left\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                       </div> -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--Modal de registrar-->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal2\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\">\n");
      out.write("                <div class=\"modal-content mc\">\n");
      out.write("                    <div class=\"modal-header \">\n");
      out.write("                        <div class=\"modal-center\">\n");
      out.write("                            <h5 class=\"text-white text-center modal-title\">BIENVENIDO</h5>                    \n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"button\" class=\"close fas fa-times\" data-dismiss=\"modal\"></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\" style=\"padding:40px 50px; \">\n");
      out.write("                        <div class=\"form\">\n");
      out.write("                            <form action=\"RegistrarUsuario\" method=\"post\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"nombre\">Nombres</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"nombre\" placeholder=\"Ingresar nombres\" name=\"nombre\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"apellido\">Apellidos</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"apellido\" placeholder=\"Ingresar nombres\" name=\"apellido\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"tipo\">Tipo de identificación:</label>\n");
      out.write("                                    <select class=\"form-control\" id=\"tipo\" name=\"tipo\">\n");
      out.write("                                        <option selected>Seleccionar tipo de identificación</option>\n");
      out.write("                                        <option value=\"Cédula de extranjería\">Cédula de extranjería</option>\n");
      out.write("                                        <option value=\"Pasaporte\">Pasaporte</option>\n");
      out.write("                                        <option value=\"Cédula de ciudadania\">Cédula de ciudadania</option>\n");
      out.write("                                        <option value=\"Tarjeta de identidad\">Tarjeta de identidad</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"N\"> N° de identificación</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"N\" placeholder=\"Ingresar N° de identificación\" name=\"N\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"sexo\"> Sexo</label>                                            \n");
      out.write("                                            <div class=\"form-check\">\n");
      out.write("                                                <input class=\"form-check-input radio\" type=\"radio\" id=\"sexo\" value=\"Hombre\" checked name=\"sexo\">\n");
      out.write("                                                <label class=\"l-sb labhom\">Hombre</label>\n");
      out.write("                                                <input class=\"form-check-input margin radio\" type=\"radio\" id=\"sexo\" value=\"Mujer\" name=\"sexo\">\n");
      out.write("                                                <label class=\"l-sb labmuj\">Mujer</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"fecha\">Fecha de nacimiento</label>\n");
      out.write("                                    <input type=\"date\" class=\"form-control\" id=\"fecha\" name=\"fecha\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"telef\">Teléfono</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"telef\" placeholder=\"Ingresar teléfono\" name=\"tel\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"dir\">Dirección</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"dir\" placeholder=\"Ingresar dirección\" name=\"direc\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"dep\">Departamento</label>\n");
      out.write("                                    <select class=\"custom-select\" id=\"dep\" name=\"departamento\">\n");
      out.write("                                        <option selected>Seleccionar departamento</option>\n");
      out.write("                                        <option value=\"Antioquia\">Antioquia</option>\n");
      out.write("                                        <option value=\"Amazonas\">Amazonas</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"ciudad\">Ciudad</label>\n");
      out.write("                                    <select class=\"custom-select\" id=\"ciudad\" name=\"ciudad\">\n");
      out.write("                                        <option selected>Seleccionar ciudad</option>\n");
      out.write("                                        <option value=\"Medellín\">Medellín</option>\n");
      out.write("                                        <option value=\"Bogotá\">Bogotá</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"correo\">Correo</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"correo\" placeholder=\"Ingresar correo electrónico\" name=\"correo\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"con\">Contraseña</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"con\" placeholder=\"Ingresar contraseña\" name=\"con\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"button1-margin text-center\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn color-button\">Registrar</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/bootstrap-4-navbar.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/Tables.js\"></script>\n");
      out.write("        <script src=\"js/Scroll.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <section class=\"section1\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"flex\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div id=\"demo\" class=\"carousel slide carusel\" data-ride=\"carousel\">\n");
      out.write("                            <!-- Carrusel -->\n");
      out.write("                            <ul class=\"carousel-indicators \">\n");
      out.write("                                <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("                                <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("                                <li data-target=\"#demo\" data-slide-to=\"3\"></li>\n");
      out.write("                                <li data-target=\"#demo\" data-slide-to=\"4\"></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <!-- The slideshow -->\n");
      out.write("                            <div class=\"carousel-inner text-center\">\n");
      out.write("                                <div class=\"carousel-item active\">\n");
      out.write("                                    <img class=\"imagen1\" src=\"imagenes/foto.png\" alt=\"Los Angeles\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img class=\"imagen1\" src=\"imagenes/F11.jpg\" alt=\"Chicago\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img class=\"imagen1\" src=\"imagenes/F12.jpg\" alt=\"390\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img class=\"imagen1\" src=\"imagenes/F15.jpg\" alt=\"391\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img class=\"imagen1\" src=\"imagenes/F18.jpg\" alt=\"392\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Left and right controls -->\n");
      out.write("                            <a class=\"carousel-control-prev prev-at\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("                                <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"carousel-control-next prev-de\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("                                <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome-all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Footer.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("            <!-- &copy;Gheto 2018 -->\n");
      out.write("            <div class=\"Pagos\">\n");
      out.write("                <img class=\"icono\" src=\"imagenes/iconos/paypal.ico\" alt=\"Paypal\">\n");
      out.write("                <img class=\"icono\" src=\"imagenes/iconos/Master.ico\" alt=\"Master Card\">\n");
      out.write("                <img class=\"icono\" src=\"imagenes/iconos/Visa.ico\" alt=\"Visa\">\n");
      out.write("                <img class=\"icono\" src=\"imagenes/iconos/Maestro.ico\" alt=\"Maestro\">\n");
      out.write("                <!--<img class=\"icono\" src=\"imagenes/iconos/American.ico\" alt=\"American Express\">-->\n");
      out.write("                <!--<img class=\"icono\" src=\"imagenes/iconos/Bitcoin.ico\" alt=\"Bitcoin\">-->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"Personal\">\n");
      out.write("                <div class=\"col-6 cor\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a class=\"contenido\" href=\"Nosotros.jsp\"><i class=\"fas fa-users\"></i> Nosotros</a></li>\n");
      out.write("                        <li><a class=\"contenido\" href=\"Contacto.jsp\"><i class=\"fas fa-phone\"></i> Contacto</a></li>\n");
      out.write("                        <li><a class=\"contenido\" href=\"#\"><i class=\"fas fa-shipping-fast\"></i>Envíos</a></li>\n");
      out.write("                        <li><a class=\"contenido\" href=\"#\"><i class=\"fas fa-box-open\"></i>Cambios, Garantías y Devoluciones</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"Redes\">\n");
      out.write("                <div class=\"fila\">\n");
      out.write("                    <a class=\"contenido\" href=\"#\"><img class=\"imgicon1\" src=\"imagenes/iconos/Facebook.ico\" alt=\"Facebook\" ></a>\n");
      out.write("                    <a class=\"contenido\" href=\"#\"><img class=\"imgicon2\" src=\"imagenes/iconos/Messenger.ico\" alt=\"Messenger\"></a>\n");
      out.write("                    <a class=\"contenido\" href=\"#\"><img class=\"imgicon3\" src=\"imagenes/iconos/Twitter.ico\" alt=\"Twitter\"></a>\n");
      out.write("                    <a class=\"contenido\" href=\"#\"><img class=\"imgicon4\" src=\"imagenes/iconos/Instagram.ico\" alt=\"Instagram\"></a>\n");
      out.write("                    <a class=\"contenido\" href=\"#\"><img class=\"imgicon5\" src=\"imagenes/iconos/Whatsapp.ico\" alt=\"WahtsApp\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/Scroll.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/Scroll.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
