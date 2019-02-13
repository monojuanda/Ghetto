package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contacto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome-all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.bootstrap4.css\">\n");
      out.write("        <title>Ghetto</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"fondo1\">\n");
      out.write("        <header class=\"banner\">\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark mynavbar\" data-toggle=\"sticky-onscroll\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\">Ghetto</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mx-auto\">\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Hombre.jsp\">HOMBRE</a> </li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Mujer.jsp\">MUJER</a> </li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Nosotros.jsp\">EL BARRIO</a> </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#myModal\">Cerrar sesión  <span class=\"fas fa-sign-out-alt \"></span> </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"form\">\n");
      out.write("                <h2 class=\"myh2\">Contacto</h2>\n");
      out.write("                <hr class=\"myhr\">\n");
      out.write("                <form>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"l-sb\" for=\"nombre\">Nombres</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"nombre\">\n");
      out.write("                                <label class=\"l-sb\" for=\"correo\">Correo electrónico</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"correo\">\n");
      out.write("                                <label class=\"l-sb\" for=\"departamento\">Departamento</label>\n");
      out.write("                                <select class=\"custom-select\" id=\"departamento\" name=\"departamento\">\n");
      out.write("                                    <option selected>Seleccionar departamento</option>\n");
      out.write("                                    <option value=\"Antioquia\">Antioquia</option>\n");
      out.write("                                    <option value=\"Amazonas\">Amazonas</option>\n");
      out.write("                                </select>\n");
      out.write("                                <label class=\"l-sb\" for=\"pedido\">N° de pedido</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"pedido\">\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"l-sb\" for=\"apellido\">Apellidos</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"apellido\">\n");
      out.write("                                <label class=\"l-sb\" for=\"telefono\">Teléfono</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"telefono\">\n");
      out.write("                                <label class=\"l-sb\" for=\"ciudad\">Ciudad</label>\n");
      out.write("                                <select class=\"custom-select\" id=\"ciudad\" name=\"ciudad\">\n");
      out.write("                                    <option selected>Seleccionar ciudad</option>\n");
      out.write("                                    <option value=\"Medellín\">Medellín</option>\n");
      out.write("                                    <option value=\"Bogotá\">Bogotá</option>\n");
      out.write("                                </select>\n");
      out.write("                                <label class=\"l-sb\" for=\"asunto\">Asunto</label>\n");
      out.write("                                <select class=\"custom-select\" id=\"asunto\" name=\"asunto\">\n");
      out.write("                                    <option selected>Elegir un asunto</option>\n");
      out.write("                                    <option value=\"Información. Estado de pedido\">Información. Estado de pedido</option>\n");
      out.write("                                    <option value=\"Información. Cambio / Devolución de ropa\">Información. Cambio / Devolución de ropa</option>\n");
      out.write("                                    <option value=\"Información. Procesos de compras online y envíos\">Información. Estado de pedidoInformación. Procesos de compras online y envíos</option>\n");
      out.write("                                    <option value=\"Sugerencias\">Sugerencias</option>\n");
      out.write("                                    <option value=\"Otros...\">Otros...</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <label class=\"l-sb\" for=\"comentario\">Comentario</label>\n");
      out.write("                            <textarea class=\"form-control\" rows=\"5\" id=\"comment\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"btn-color1\">\n");
      out.write("                        <button type=\"submit\" class=\"btn color-button\">Enviar</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--<div class=\"form-group col-sm-6\">-->\n");
      out.write("        <!--    <label for=\"email\">Email address:</label>-->\n");
      out.write("        <!--    <input type=\"email\" class=\"form-control\" id=\"email\">-->\n");
      out.write("\n");
      out.write("        <!--    <label for=\"pwd\">Password:</label>-->\n");
      out.write("        <!--    <input type=\"password\" class=\"form-control\" id=\"pwd\">-->\n");
      out.write("        <!--</div>-->\n");
      out.write("        \n");
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
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-4-navbar.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.dataTables.js\"></script>\n");
      out.write("        <script src=\"js/dataTables.bootstrap4.js\"></script>\n");
      out.write("        <script src=\"js/Tables.js\"></script>\n");
      out.write("        <script src=\"js/Scroll.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
