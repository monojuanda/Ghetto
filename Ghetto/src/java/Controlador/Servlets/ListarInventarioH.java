/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Servlets;

import Controlador.Modelo.InvHombre;
import Controlador.conexion.Conectadb;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juandavid
 */
//@WebServlet(name = "listar_Invhombre", urlPatterns = {"/listar_Invhombre"})
public class ListarInventarioH extends HttpServlet {

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
        
        try{
            ArrayList<InvHombre> al = new ArrayList<>();
           Conectadb gcon = new Conectadb();
           Connection c = gcon.conectar();
           Statement stm = c.createStatement();
        
            String query = "SELECT * FROM Inv_hombre; ";
            ResultSet rs = stm.executeQuery(query);
            
            
            
            while (rs.next()){
                InvHombre Invh = new InvHombre();
                Invh.setId(rs.getInt("ID"));
                Invh.setItem(rs.getString("item"));
                Invh.setCategoria(rs.getString("categoria"));
                Invh.setColor(rs.getString("color"));
                Invh.setGenero(rs.getString("genero"));
                Invh.setDescripcion(rs.getString("descripcion"));                  
                Invh.setPrecio(rs.getString("precio"));
                Invh.setColeccion(rs.getString("coleccion"));
                Invh.setCantidad(rs.getString("cantidad"));
                al.add(Invh);
            }
            
            request.setAttribute("lista", al);
            RequestDispatcher rd = request.getRequestDispatcher("ListarInventariosH.jsp");
            rd.forward(request, response);
            gcon.cierraConexion();
        }catch (SQLException slx){
            slx.printStackTrace();
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
