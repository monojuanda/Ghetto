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
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tamayo B
 */
public class RegistrarProveedor extends HttpServlet {

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
        String ni = request.getParameter("nit");
        String nom = request.getParameter("nombre");
        String ape = request.getParameter("apellido");
        String tip = request.getParameter("tipo");
        String iden = request.getParameter("identificacion");
        String sex = request.getParameter("sexo");
        String fec = request.getParameter("fecha");
        String tele = request.getParameter("telefono");
        String dir = request.getParameter("direccion");
        String dep = request.getParameter("departamento");
        String ciud = request.getParameter("ciudad");
        String emp = request.getParameter("empresa");
        String est = request.getParameter("box");

        try {
            Conectadb con = new Conectadb();
            Connection c = con.conectar();
            Statement stm = c.createStatement();

            String query = "insert into Proveedores (nit, nombres, apellidos, tipo, identificacion, sexo, fecha, telefono,direccion, departamento, ciudad,empresa, estado) values ('" + ni + "','" + nom + "','" + ape + "','" + tip + "','" + iden + "','" + sex + "','" + fec + "','" + tele + "','" + dir + "','" + dep + "','" + ciud + "','" + emp + "','" + est + "');";
            stm.executeUpdate(query);
            System.out.println(query);

            stm.close();
            c.close();
            System.out.println("Insertó");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("ListarProveedor");
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
