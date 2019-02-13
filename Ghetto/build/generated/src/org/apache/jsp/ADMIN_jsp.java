package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ADMIN_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>         \n");
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
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark mynavbar\" data-toggle=\"sticky-onscroll\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"ADMIN.jsp\">Ghetto</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mx-auto\">\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"> <a  href=\"Logout\" class=\"nav-link\">Cerrar sesión  <span class=\"fas fa-sign-out-alt \"></span> </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        ");

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
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">    \n");
      out.write("                <div class=\"col-lg-12\" style=\"margin-top:45px;\">\n");
      out.write("                    <div class=\"card-deck\">\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <a href=\"RegistrarEmpleados.jsp\" class=\"btn separador\"><span class=\"fas fa-users fa-6x color\"></span></a>\n");
      out.write("                                <a href=\"ListarEmpleado\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Empleados</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <a href=\"RegistrarClientes.jsp\" class=\"btn separador\"><span class=\"fas fa-user fa-6x color\"></span></a>\n");
      out.write("                                <a href=\"ListarCliente\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Clientes</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- <div class=\"card mb-5\">\n");
      out.write("                             <div class=\"card-body text-center\">\n");
      out.write("                                 <a href=\"ListarVentas.jsp\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                 <div class=\"space\">\n");
      out.write("                                 <h5 class=\"card-title\">Ventas</h5>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                         </div> -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-deck\">\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <a href=\"RegistrarPedidos.jsp\" class=\"btn separador\"><span class=\"fas fa-cart-plus fa-6x color\"></span></a>\n");
      out.write("                                <a href=\"ListarPedido\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Pedidos</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center \">\n");
      out.write("                                <a href=\"RegistrarInventariosH.jsp\" class=\"btn separador\"><span class=\"fas fa-male fa-6x color\"></span></a>\n");
      out.write("                                <a href=\"ListarInventarioH\" class=\"btn \"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Inventario Hombre</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center \">\n");
      out.write("                                <a href=\"RegistrarInventariosM.jsp\" class=\"btn separador\"><span class=\"fas fa-female fa-6x color\"></span></a>\n");
      out.write("                                <a href=\"ListarInventarioM\" class=\"btn \"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Inventario Mujer</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--<div class=\"card mb-5\">-->\n");
      out.write("                        <!--    <div class=\"card-body text-center\">-->\n");
      out.write("                        <!--        <a href=\"#\" class=\"btn\"><span class=\"fas fa-file-invoice-dollar fa-6x color\"></span></a>-->\n");
      out.write("                        <!--        <a href=\"#\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>-->\n");
      out.write("                        <!--        <div class=\"space\">-->\n");
      out.write("                        <!--        <h5 class=\"card-title\">Facturación</h5>-->\n");
      out.write("                        <!--        </div>-->\n");
      out.write("                        <!--    </div>-->\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-deck\">\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <a href=\"RegistrarProveedores.jsp\" class=\"btn separador\"><span class=\"fas fa-truck fa-6x color\"></span></a>\n");
      out.write("                                <a href=\"ListarProveedor\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Proveedores</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <a href=\"Permisos.jsp\" class=\"btn\"><span class=\"fas fa-check-square fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Permisos</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <a href=\"Logs.jsp\" class=\"btn\"><img src=\"imagenes/Logs.png\" class=\"color\" alt=\"\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Logs</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--<div class=\"card mb-5\">-->\n");
      out.write("                        <!--    <div class=\"card-body text-center\">-->\n");
      out.write("                        <!--        <a href=\"#\" class=\"btn\"><span class=\"fas fa-envelope fa-6x color\"></span></a>-->\n");
      out.write("                        <!--        <a href=\"#\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>-->\n");
      out.write("                        <!--        <div class=\"space\">-->\n");
      out.write("                        <!--        <h5 class=\"card-title\">Mensajería</h5>-->\n");
      out.write("                        <!--        </div>-->\n");
      out.write("                        <!--    </div>-->\n");
      out.write("                        <!--</div>-->\n");
      out.write("                        <!--<div class=\"card mb-5\">-->\n");
      out.write("                        <!--    <div class=\"card-body text-center\">-->\n");
      out.write("                        <!--        <a href=\"#\" class=\"btn\"><span class=\"far fa-credit-card fa-6x color\"></span></a>-->\n");
      out.write("                        <!--        <a href=\"#\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>-->\n");
      out.write("                        <!--        <div class=\"space\">-->\n");
      out.write("                        <!--        <h5 class=\"card-title\">Pagos</h5>-->\n");
      out.write("                        <!--        </div>-->\n");
      out.write("                        <!--    </div>-->\n");
      out.write("                        <!--</div>-->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
        } else if (rol.equals("EmpleadoVentas")) {
        
      out.write("\n");
      out.write("        <div class=\"container\">  \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\" style=\"margin-top:45px;\">\n");
      out.write("\n");
      out.write("                    <div class=\"card-deck\">\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                    \n");
      out.write("                             <div class=\"card-body text-center\">\n");
      out.write("                                 <a href=\"ListarVentas.jsp\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                 <div class=\"space\">\n");
      out.write("                                 <h5 class=\"card-title\">Ventas</h5>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                         </div> \n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <a href=\"RegistrarPedidos.jsp\" class=\"btn separador\"><span class=\"fas fa-cart-plus fa-6x color\"></span></a>\n");
      out.write("                                <a href=\"ListarPedido\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Pedidos</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                       <!-- <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center \">\n");
      out.write("                                <a href=\"RegistrarInventariosH.jsp\" class=\"btn separador\"><span class=\"fas fa-male fa-6x color\"></span></a>\n");
      out.write("                                <a href=\"ListarInventarioH\" class=\"btn \"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Inventario Hombre</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body text-center \">\n");
      out.write("                                <a href=\"RegistrarInventariosM.jsp\" class=\"btn separador\"><span class=\"fas fa-female fa-6x color\"></span></a>\n");
      out.write("                                <a href=\"ListarInventarioM\" class=\"btn \"><span class=\"fas fa-list-ul fa-6x color\"></span></a>\n");
      out.write("                                <div class=\"space\">\n");
      out.write("                                    <h5 class=\"card-title\">Inventario Mujer</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> -->\n");
      out.write("                        <!--<div class=\"card mb-5\">-->\n");
      out.write("                        <!--    <div class=\"card-body text-center\">-->\n");
      out.write("                        <!--        <a href=\"#\" class=\"btn\"><span class=\"fas fa-file-invoice-dollar fa-6x color\"></span></a>-->\n");
      out.write("                        <!--        <a href=\"#\" class=\"btn\"><span class=\"fas fa-list-ul fa-6x color\"></span></a>-->\n");
      out.write("                        <!--        <div class=\"space\">-->\n");
      out.write("                        <!--        <h5 class=\"card-title\">Facturación</h5>-->\n");
      out.write("                        <!--        </div>-->\n");
      out.write("                        <!--    </div>-->\n");
      out.write("                        <!--</div>-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 }
      out.write("   \n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-4-navbar.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/Scroll.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
