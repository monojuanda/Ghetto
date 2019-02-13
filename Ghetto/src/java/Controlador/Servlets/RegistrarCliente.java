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
public class RegistrarCliente extends HttpServlet {

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
            String nom = request.getParameter("nombre");
            String ape = request.getParameter("apellido");
            String tipo = request.getParameter("tipo");
            String iden = request.getParameter("N");
            String sexo = request.getParameter("sexo");
            String fecha = request.getParameter("fecha");
            String tele = request.getParameter("tel");
            String dir = request.getParameter("direc");
            String departamento = request.getParameter("departamento");
            String ciudad = request.getParameter("ciudad");
            String correo = request.getParameter("correo");
            String contra = request.getParameter("con");
            try{
            Conectadb con = new Conectadb();
            Connection c = con.conectar();
            Statement stm = c.createStatement();
            
            String query = "insert into Clientes (nombres, apellidos, tipo, identificacion, sexo, fecha, telefono,direccion, departamento, ciudad, correo) values ('"+nom+"','"+ape+"','"+tipo+"','"+iden+"','"+sexo+"','"+fecha+"','"+tele+"','"+dir+"','"+departamento+"','"+ciudad+"','"+correo+"');";
            stm.executeUpdate(query);
            System.out.println(query);
            
            String query2 = "insert into Contra_clientes (correo, contraseña, rol) values ('"+correo+"','"+contra+"','Cliente');";
            stm.executeUpdate(query2);
            System.out.println(query2);
            stm.close();
            c.close();
            System.out.println("Insertó");
        }catch(SQLException e){
            e.printStackTrace();
        }
            response.sendRedirect("Index.jsp");
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
