package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarVentas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Navbar.jsp");
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-4-navbar.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome-all.min.css\">\n");
      out.write("        <title>Ghetto</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"fondo1\">\n");
      out.write("        <header class=\"banner\">\n");
      out.write("        </header>\n");
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
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#myModal1\">");
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
      out.write("        <div class=\"modal fade\" id=\"myModal1\" role=\"dialog\">\n");
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
      out.write("                                    <label for=\"n\">Nombres</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"n\" placeholder=\"Ingresar nombres\" name=\"nombre\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"a\">Apellidos</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"a\" placeholder=\"Ingresar nombres\" name=\"apellido\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"t\">Tipo de identificación:</label>\n");
      out.write("                                    <select class=\"form-control\" id=\"t\" name=\"tipo\">\n");
      out.write("                                        <option selected>Seleccionar tipo de identificación</option>\n");
      out.write("                                        <option value=\"Cédula de extranjería\">Cédula de extranjería</option>\n");
      out.write("                                        <option value=\"Pasaporte\">Pasaporte</option>\n");
      out.write("                                        <option value=\"Cédula de ciudadania\">Cédula de ciudadania</option>\n");
      out.write("                                        <option value=\"Tarjeta de identidad\">Tarjeta de identidad</option>\n");
      out.write("                                    </select> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"nu\"> N° de identificación</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"nu\" placeholder=\"Ingresar N° de identificación\" name=\"N\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"s\"> Sexo</label>                                            \n");
      out.write("                                            <div class=\"form-check\">\n");
      out.write("                                                <input class=\"form-check-input radio\" type=\"radio\" id=\"s\" value=\"Hombre\" checked name=\"sexo\">\n");
      out.write("                                                <label class=\"l-sb labhom\">Hombre</label>\n");
      out.write("                                                <input class=\"form-check-input margin radio\" type=\"radio\" id=\"s\" value=\"Mujer\" name=\"sexo\">\n");
      out.write("                                                <label class=\"l-sb labmuj\">Mujer</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"f\">Fecha de nacimiento</label>\n");
      out.write("                                    <input type=\"date\" class=\"form-control\" id=\"f\" name=\"fecha\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"t\">Teléfono</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"t\" placeholder=\"Ingresar teléfono\" name=\"tel\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"d\">Dirección</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"d\" placeholder=\"Ingresar dirección\" name=\"direc\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"de\">Departamento</label>\n");
      out.write("                                    <select class=\"custom-select\" id=\"de\" name=\"departamento\">\n");
      out.write("                                        <option selected>Seleccionar departamento</option>\n");
      out.write("                                        <option value=\"Antioquia\">Antioquia</option>\n");
      out.write("                                        <option value=\"Amazonas\">Amazonas</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"c\">Ciudad</label>\n");
      out.write("                                    <select class=\"custom-select\" id=\"c\" name=\"ciudad\">\n");
      out.write("                                        <option selected>Seleccionar ciudad</option>\n");
      out.write("                                        <option value=\"Medellín\">Medellín</option>\n");
      out.write("                                        <option value=\"Bogotá\">Bogotá</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"coo\">Correo</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"coo\" placeholder=\"Ingresar correo electrónico\" name=\"correo\">\n");
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
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"form\">\n");
      out.write("                <h2 class=\"myh2\">Registrar Pedidos</h2>\n");
      out.write("                <form action=\"RegistrarPedido\" method=\"post\">\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"venta\" class=\"col-sm-2 col-form-label l-sb\">Código de venta:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"venta\" placeholder=\"Ingresar N° Pedido\" name=\"venta\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"produc\" class=\"col-sm-2 col-form-label l-sb\">Código de producto:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"produc\" placeholder=\"Ingresar nombre del cliente\" name=\"producto\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"fecha\">Fecha de envío:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"fecha\" name=\"fecha\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"cant\"> Cantidad:</label>                                            \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"cant\" placeholder=\"Ingresar cantidad\" name=\"cantidad\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"departamento\" class=\"col-sm-2 col-form-label l-sb\">Departamento:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <select class=\"custom-select\" id=\"departamento\" name=\"departamento\">\n");
      out.write("                                <option selected>Seleccionar departamento</option>\n");
      out.write("                                <option value=\"Antioquia\">Antioquia</option>\n");
      out.write("                                <option value=\"Amazonas\">Amazonas</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"ciudad\" class=\"col-sm-2 col-form-label l-sb\">Ciudad:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <select class=\"custom-select\" id=\"ciudad\" name=\"ciudad\">\n");
      out.write("                                <option selected>Seleccionar ciudad</option>\n");
      out.write("                                <option value=\"Medellín\">Medellín</option>\n");
      out.write("                                <option value=\"Bogotá\">Bogotá</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button-principal\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-color\">Registar Pedido</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-4-navbar.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/Scroll.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
