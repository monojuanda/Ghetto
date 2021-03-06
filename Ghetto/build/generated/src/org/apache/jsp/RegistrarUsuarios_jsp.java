package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-4-navbar.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fontawesome-all.min.css\">\r\n");
      out.write("    <title>Ghetto</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"fondo1\">\r\n");
      out.write("    <header class=\"banner\">\r\n");
      out.write("    </header>\r\n");
      out.write("    ");
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
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Empleados </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarEmpleados.html\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarEmpleados.html\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Usuarios </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarUsuarios.html\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarUsuarios.html\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Ventas </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarVentas.html\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Pedidos </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarPedidos.html\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarPedidos.html\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Inventarios\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu m\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                            <li><a class=\"dropdown-item d dropdown-toggle\" href=\"#\">Hombres</a>\n");
      out.write("                                <ul class=\"dropdown-menu m\">\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"RegistrarInventariosH.html\">Registrar</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"ListarInventariosH.html\">Listar</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a class=\"dropdown-item d dropdown-toggle\" href=\"#\">Mujeres</a>\n");
      out.write("                                <ul class=\"dropdown-menu m\">\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"RegistrarInventariosM.html\">Registrar</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"ListarInventariosM.html\">Listar</a></li>\n");
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
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarProveedores.html\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarProveedores.html\">Listar</a>\n");
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
      out.write("                        <a class=\"nav-link\" href=\"Permisos.html\" id=\"navbardrop\"> Permisos </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Logs.html\" id=\"navbardrop\"> Logs </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"> <a href=\"index.html\" class=\"nav-link\">Cerrar sesión  <span class=\"fas fa-sign-out-alt\"></span> </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("    <script src=\"js/bootstrap-4-navbar.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/Tables.js\"></script>\n");
      out.write("    <script src=\"js/Scroll.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2 class=\"myh2\">Registrar usuarios</h2>\r\n");
      out.write("        <div class=\"form\">\r\n");
      out.write("            <form action=\"Registros\" method=\"post\">\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"nom\" class=\"col-sm-2 col-form-label l-sb\">Nombres:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"nom\" placeholder=\"Ingresar nombres\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"ape\" class=\"col-sm-2 col-form-label l-sb\">Apellidos:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"ape\" placeholder=\"Ingresar apellidos\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"tipo\" class=\"col-sm-2 col-form-label l-sb\">Tipo de identificación:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <select class=\"custom-select\" id=\"tipo\">\r\n");
      out.write("                            <option selected>Elegir una identificación</option>\r\n");
      out.write("                            <option value=\"1\">Cédula de extranjería</option>\r\n");
      out.write("                            <option value=\"2\">Pasaporte</option>\r\n");
      out.write("                            <option value=\"3\">Cédula de ciudadania</option>\r\n");
      out.write("                            <option value=\"3\">Tarjeta de identidad</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"N\" class=\"col-sm-2 col-form-label l-sb\">N° de identificación</label>\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"N\" placeholder=\"Ingresar N° de identificación\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <label for=\"sexo\" class=\"col-sm-1 col-form-label l-sb\">Sexo:</label>\r\n");
      out.write("                    \r\n");
      out.write("                        <div class=\"form-check col-sm-2\">\r\n");
      out.write("                            <input class=\"form-check-input radio\" type=\"radio\" name=\"gridRadios\" id=\"sexo\" value=\"Hombre\" checked>\r\n");
      out.write("                            <label class=\"l-sb labhom\">Hombre</label>\r\n");
      out.write("                            <input class=\"form-check-input margin radio\" type=\"radio\" name=\"gridRadios\" id=\"sexo\" value=\"Mujer\">\r\n");
      out.write("                            <label class=\"l-sb labmuj\">Mujer</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"fecha\" class=\"col-sm-2 col-form- l-sb\">Fecha de nacimiento:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"date\" class=\"form-control\" id=\"fecha\" placeholder=\"Ingresar fecha de ancimiento\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"tel\" class=\"col-sm-2 col-form-label l-sb\">Télefono:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"text\" placeholder=\"Ingresar télefono\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"dir\" class=\"col-sm-2 col-form-label l-sb\">Dirección:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"dir\" placeholder=\"Ingresar contraseña\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"correo\" class=\"col-sm-2 col-form-label l-sb\">Correo electrónico:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"correo\" placeholder=\"Ingresar correo electrónico\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"con\" class=\"col-sm-2 col-form-label l-sb\">Contraseña:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"con\" placeholder=\"Repetir contraseña\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                    <label for=\"con\" class=\"col-sm-2 col-form-label l-sb\">Repetir contraseña:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"con\" placeholder=\"Ingresar dirección\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-color\">Registar usuario</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-4-navbar.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/Scroll.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
