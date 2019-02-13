package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarInventariosM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-4-navbar.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fontawesome-all.min.css\">\n");
      out.write("    <title>Ghetto</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fondo1\">\n");
      out.write("    <header class=\"banner\">\n");
      out.write("    </header>\n");
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
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarEmpleados.jsp\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarEmpleados.jsp\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Usuarios </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarUsuarios.jsp\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarUsuarios.jsp\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Ventas </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarVentas.jsp\">Listar</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\"> Pedidos </a>\n");
      out.write("                        <div class=\"dropdown-menu m\">\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"RegistrarPedidos.jsp\">Registrar</a>\n");
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarPedidos.jsp\">Listar</a>\n");
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
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"ListarInventariosH.jsp\">Listar</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a class=\"dropdown-item d dropdown-toggle\" href=\"#\">Mujeres</a>\n");
      out.write("                                <ul class=\"dropdown-menu m\">\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"RegistrarInventariosM.jsp\">Registrar</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item d\" href=\"ListarInventariosM.jsp\">Listar</a></li>\n");
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
      out.write("                            <a class=\"dropdown-item d\" href=\"ListarProveedores.jsp\">Listar</a>\n");
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
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"> <a href=\"Index.jsp\" class=\"nav-link\">Cerrar sesión  <span class=\"fas fa-sign-out-alt\"></span> </a></li>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("        <div class=\"form\">\n");
      out.write("            <h2 class=\"myh2\">Registrar Inventario de Mujer</h2>\n");
      out.write("            <form action=\"RegistrarInvM\" method=\"post\">\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"item\" class=\"col-sm-2 col-form-label l-sb\">Item:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"item\" placeholder=\"Ingresar Item\" name=\"item\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"cate\" class=\"col-sm-2 col-form-label l-sb\">Categoría:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"cate\" placeholder=\"Ingresar categoría\" name=\"cate\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"color\" class=\"col-sm-2 col-form-label l-sb\">Color:</label>\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <select class=\"custom-select\" id=\"color\" name=\"color\">\n");
      out.write("                            <option selected>Elegir un color</option>\n");
      out.write("                            <option value=\"Rojo\">Rojo</option>\n");
      out.write("                            <option value=\"Negro\">Negro</option>\n");
      out.write("                            <option value=\"Blanco\">Blanco</option>\n");
      out.write("                            <option value=\"Gris\">Gris</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <label for=\"gene\" class=\"col-sm-1 col-form-label l-sb\">Género:</label>\n");
      out.write("\n");
      out.write("                        <div class=\"form-check col-sm-2\">\n");
      out.write("                            <input class=\"form-check-input radio\" type=\"radio\" id=\"gene\" value=\"Hombre\" checked name=\"genero\">\n");
      out.write("                            <label class=\"l-sb labhom\">Hombre</label>\n");
      out.write("                            <input class=\"form-check-input margin radio\" type=\"radio\" id=\"gene\" value=\"Mujer\" name=\"genero\">\n");
      out.write("                            <label class=\"l-sb labmuj\">Mujer</label>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"text\" class=\"col-sm-2 col-form-label l-sb\">Descripción:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <textarea class=\"form-control\" id=\"text\" rows=\"3\" placeholder=\"Ingresar descripción\"name=\"descripcion\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"pre\" class=\"col-sm-2 col-form-label l-sb\">Precio:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"pre\" placeholder=\"Ingresar precio\" name=\"precio\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"colec\" class=\"col-sm-2 col-form-label l-sb\">Colección:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"colec\" placeholder=\"Ingresar colección\" name=\"coleccion\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"cant\" class=\"col-sm-2 col-form-label l-sb\">Cantidad:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"cant\" placeholder=\"Ingresar cantidad\" name=\"cantidad\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"button-principal\"> \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-color\">Registar Inventario</button>\n");
      out.write("                </div>    \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap-4-navbar.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/Scroll.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
