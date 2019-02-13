/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Servlets;

import Controlador.conexion.Conectadb;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author juandavid
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Conectadb c = new Conectadb();
            Connection con = c.conectar();
            Statement st = con.createStatement();
            

            String query = "SELECT * from Contra_empleados WHERE correo = '" + request.getParameter("ntext") + "' AND contraseña='" + request.getParameter("ptext") + "';";
            System.out.println(query);

            ResultSet rs = st.executeQuery(query);

            if (rs.first()) {
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("nusuario", rs.getString(2));
                sesion.setAttribute("rusuario", rs.getString(4));
                response.sendRedirect("ADMIN.jsp");

            } else {
                String query2 = "SELECT * from Contra_clientes WHERE correo = '" + request.getParameter("ntext") + "' AND contraseña='" + request.getParameter("ptext") + "';";
                System.out.println(query2);

                ResultSet rs2 = st.executeQuery(query2);
                if (rs2.first()) {
                    HttpSession sesion = request.getSession(true);
                    sesion.setAttribute("nusuario", rs2.getString(2));
                    sesion.setAttribute("rusuario", rs2.getString(4));
                    response.sendRedirect("Index.jsp");

                }else {
               
                response.sendRedirect("Index.jsp");

            }
              

            }
            st.close();
           
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
