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
 * @author adsi5
 */
public class RegistrarEmpleado extends HttpServlet {

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
        try {
            String nom = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String tipo = request.getParameter("tipo");            
            String iden = request.getParameter("identificacion");
            String sex = request.getParameter("sexo");
            String fec = request.getParameter("fecha");
            String telefono = request.getParameter("telefono");
            String dir = request.getParameter("direccion");            
            String ocu = request.getParameter("ocupacion");

            Conectadb gcon = new Conectadb();
            Connection c = gcon.conectar();
            Statement stm = c.createStatement();

            String query = "INSERT INTO Empleados(nombres, apellidos, tipo, identificacion, sexo, fecha, telefono, direccion,ocupacion) VALUES ('" + nom + "', '" + apellido + "', '"+tipo+"','"+iden+"','"+sex+"', '"+fec+"', '"+telefono+"', '"+dir+"','"+ocu+"');";
            System.out.println(query);

            stm.execute(query);

            stm.close();
            gcon.cierraConexion();
            System.out.println("Insertó");
            System.out.println(query);
        } catch (SQLException slx) {
            System.out.println("No insertó");
            slx.printStackTrace();
        }
        
        response.sendRedirect("ListarEmpleado");
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
