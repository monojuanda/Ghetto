package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Controlador.conexion.Conectadb;

public final class ListarUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
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
      out.write("        \n");
      out.write("        ");

            
            Conectadb con = new Conectadb();
            Connection c = con.conectar();
            PreparedStatement ps;
            ResultSet rs;
            ps = c.prepareStatement("select * from registros");
            rs = ps.executeQuery();

        
      out.write("\n");
      out.write("        <div class=\"container cont-table\">\n");
      out.write("            <h2 class=\"myh2\">Listar Usuarios</h2>\n");
      out.write("            <table id=\"table_id\" class=\"table table-hover mytable\">\n");
      out.write("                <thead class=\"thead tableTT\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">Correo electrónico</th>\n");
      out.write("                        <th scope=\"col\">Tipo de identificación</th>\n");
      out.write("                        <th scope=\"col\">N° de identificación</th>\n");
      out.write("                        <th scope=\"col\">Contraseña</th>\n");
      out.write("                        <th scope=\"col\">Acciones</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
                        while (rs.next()) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( rs.getString("correo"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString("tipo"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString("identificacion"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString("contraseña"));
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a class=\"btn btn-wh btn-sm\" data-toggle=\"modal\" data-target=\"#myModal\" onclick=\"ver('");
      out.print( rs.getString("nombres"));
      out.write("', '");
      out.print( rs.getString("apellidos"));
      out.write("', '");
      out.print( rs.getString("sexo"));
      out.write("','");
      out.print( rs.getString("telefono"));
      out.write("','");
      out.print( rs.getString("departameto"));
      out.write("', '");
      out.print( rs.getString("ciudad"));
      out.write("','");
      out.print( rs.getString("fecha"));
      out.write("')\"><span class=\"far fa-eye\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <a class=\"btn btn-bl btn-sm\" data-toggle=\"modal\" data-target=\"#myModal10\" onclick=\"Mostrar(");
      out.print( rs.getInt("id"));
      out.write(',');
      out.write('\'');
      out.print( rs.getString("nombres"));
      out.write("','");
      out.print( rs.getString("apellidos"));
      out.write("','");
      out.print( rs.getString("tipo"));
      out.write("','");
      out.print( rs.getString("identificacion") );
      out.write("','");
      out.print( rs.getString("telefono") );
      out.write("','");
      out.print( rs.getString("correo") );
      out.write("','");
      out.print( rs.getString("contraseña") );
      out.write("')\"><span class=\"fas fa-edit h\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <a class=\"btn btn-re btn-sm tamb\"><span class=\"fas fa-times h\" aria-hidden=\"true\"></span></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");

                        }

                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Ver más detalles-->\n");
      out.write("        <!--Modal-->\n");
      out.write("        ");
  
            ps = c.prepareStatement("select * from registros");
            rs = ps.executeQuery();
                 while (rs.next() == true) {

        
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content mc\">\n");
      out.write("                    <div class=\"modal-header mo\">\n");
      out.write("                        <button type=\"button\" class=\"close fas fa-times\" data-dismiss=\"modal\"></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("                        \n");
      out.write("                        <form role=\"form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"l-sb\">Nombres:</label>\n");
      out.write("                                <label id=\"nombres\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"l-sb\">Apellidos:</label>\n");
      out.write("                                <label id=\"apellidos\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"l-sb\">Sexo:</label>\n");
      out.write("                                <label id=\"sexo\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"l-sb\">Teléfono:</label>\n");
      out.write("                                <label id=\"telefono\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"l-sb\">Departamento:</label>\n");
      out.write("                                <label id=\"departamento\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"l-sb\">Ciudad:</label>\n");
      out.write("                                <label id=\"ciudad\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"l-sb\">Fecha:</label>\n");
      out.write("                                <label id=\"fecha\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- <div class=\"modal-footer\">\n");
      out.write("                <button type=\"submit\" class=\"btn btcon pull-left\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("              </div> -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>   \n");
      out.write("    ");

            }
            //System.out.println(rs.getString("nombres"));
            
    
      out.write("  \n");
      out.write("    <!--Modificar-->\n");
      out.write("\n");
      out.write("    <!-- Modal -->\n");
      out.write("     ");
  
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            ps = c.prepareStatement("select * from registros");
            rs = ps.executeQuery();
            while (rs.next()) {

        
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myModal10\" role=\"dialog\">\n");
      out.write("        <div class=\"modal-dialog modal-lg\">\n");
      out.write("\n");
      out.write("            <!-- Modal content-->\n");
      out.write("            <div class=\"modal-content mc\">\n");
      out.write("                <div class=\"modal-header mo\">\n");
      out.write("                    <button type=\"button\" class=\"close fas fa-times\" data-dismiss=\"modal\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("                    <form action=\"ActualizarUsuario\" method=\"post\">\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"id\" class=\"col-sm-2 col-form-label\">Id:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Ingresar nombres\" id=\"id\" name=\"id\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"nombre\" class=\"col-sm-2 col-form-label\">Nombres:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Ingresar nombres\" id=\"nombre\" name=\"nombre\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"apellido\" class=\"col-sm-2 col-form-label\">Apellidos:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Ingresar apellidos\" id=\"apellido\" name=\"apellido\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"tipo\" class=\"col-sm-2 col-form-label\">Tipo de identificación:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <select id=\"tipo\" class=\"custom-select\" name=\"tip\" >\n");
      out.write("                                    <option value=\"Cédula de extranjería\">Cédula de extranjería</option>\n");
      out.write("                                    <option value=\"Pasaporte\">Pasaporte</option>\n");
      out.write("                                    <option value=\"Cédula de ciudadania\">Cédula de ciudadania</option>\n");
      out.write("                                    <option value=\"Tarjeta de identidad\">Tarjeta de identidad</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"identificacion\" class=\"col-sm-2 col-form-label\">N° de identificación:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"identificacion\" placeholder=\"Ingresar N° de identificación\" name=\"N\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"telefono1\" class=\"col-sm-2 col-form-label\">Teléfono:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"telefono1\" placeholder=\"Ingresar teléfono\" name=\"telefono\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"correo\" class=\"col-sm-2 col-form-label\">Correo electrónico:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"correo\" placeholder=\"Ingresar Correo electrónico\" name=\"correo\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"contra\" class=\"col-sm-2 col-form-label\">Contraseña:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"contra\" placeholder=\"Ingresar contraseña\" name=\"cont\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-mod\">Guardar modificación</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  ");

            }
            //System.out.println(rs.getString("nombres"));
            
       
    
      out.write(" \n");
      out.write("    <script>\n");
      out.write("            function ver(nombres, apellidos, sexo,telefono, departameto, ciudad,fecha) {\n");
      out.write("                document.getElementById('myModal').style.display = 'block';\n");
      out.write("                document.getElementById('nombres').innerHTML = nombres;\n");
      out.write("                document.getElementById('apellidos').innerHTML = apellidos;\n");
      out.write("                document.getElementById('sexo').innerHTML = sexo;\n");
      out.write("                document.getElementById('telefono').innerHTML = telefono;\n");
      out.write("                document.getElementById('departamento').innerHTML = departameto;\n");
      out.write("                document.getElementById('ciudad').innerHTML = ciudad;\n");
      out.write("                document.getElementById('fecha').innerHTML = fecha;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function Mostrar(id, nombres, apellidos, tipo, identificacion, telefono, correo, contraseña, Rcontraseña) {\n");
      out.write("                document.getElementById('myModal10').style.display = 'block';\n");
      out.write("                document.getElementById('id').value = id;\n");
      out.write("                document.getElementById('nombre').value = nombres;\n");
      out.write("                document.getElementById('apellido').value = apellidos;\n");
      out.write("                document.getElementById('tipo').value = tipo;\n");
      out.write("                document.getElementById('identificacion').value = identificacion;\n");
      out.write("                document.getElementById('telefono1').value = telefono;\n");
      out.write("                document.getElementById('correo').value = correo;\n");
      out.write("                document.getElementById('contra').value = contraseña;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap-4-navbar.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"js/dataTables.bootstrap4.js\"></script>\n");
      out.write("    <script src=\"js/Tables.js\"></script>\n");
      out.write("    <script src=\"js/Scroll.js\"></script>\n");
      out.write("</body>\n");
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
