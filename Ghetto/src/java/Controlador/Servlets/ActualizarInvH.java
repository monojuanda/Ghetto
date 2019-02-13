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
public class ActualizarInvH extends HttpServlet {

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
        String Cate = request.getParameter("categoria");
        String Colo = request.getParameter("color");
        String Desc = request.getParameter("descripcion");
        String Pre = request.getParameter("precio");
        String Colec = request.getParameter("coleccion");
        String Cant = request.getParameter("cantidad");
        
        try{
            Conectadb con1 = new Conectadb();
            Connection c = con1.conectar();
            Statement stm = c.createStatement();
            String update = "UPDATE Inv_hombre SET categoria = '"+ Cate +"'," + "color = '" + Colo + "', " + "descripcion = '" + Desc + "', " + "precio = '" + Pre + "', " + "coleccion = '" + Colec + "', " + "cantidad = '" + Cant + "'" + "WHERE id = '" + id + "';";
            stm.executeUpdate(update);
            System.out.println(update);
            
            stm.close();
            c.close();
            System.out.println("Actualizo");
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        response.sendRedirect("ListarInventarioH");
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
