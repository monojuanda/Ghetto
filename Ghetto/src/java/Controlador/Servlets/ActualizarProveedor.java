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
public class ActualizarProveedor extends HttpServlet {

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
        
        String id = request.getParameter("ID");
        String nom = request.getParameter("nombres");
        String ape = request.getParameter("apellidos");
        String t = request.getParameter("tipo");
        String num = request.getParameter("identificacion");
        String tel = request.getParameter("telefono");
        String dir = request.getParameter("direccion");
        String depa = request.getParameter("departamento");
        String ciud = request.getParameter("ciudad");
        String em = request.getParameter("empresa");
        String box = request.getParameter("boxes");
        
        try{
            Conectadb con1 = new Conectadb();
            Connection c = con1.conectar();
            Statement stm = c.createStatement();
            String update = "UPDATE Proveedores SET nombres = '"+ nom +"'," + "apellidos = '" + ape + "', " + "tipo = '" + t + "', " + "identificacion = '" + num + "', " + "telefono = '" + tel + "', " + "direccion = '" + dir + "', " + "departamento = '" + depa + "', " + "ciudad = '" + ciud + "', " + "empresa = '" + em + "', " + "estado = '" + box + "'" + "WHERE ID = '" + id + "';";
            stm.executeUpdate(update);
            System.out.println(update);
            
            stm.close();
            c.close();
            System.out.println("Actualizo");
        } catch(SQLException e) {
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
