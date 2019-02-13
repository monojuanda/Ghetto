/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Conectadb{
 
 
//variables miembro
 
    private String usuario;
    private String clave;
    private String url;
    private String host;
    private String db;
    private String driverClassName;
    private Connection conn = null;
    private Statement estancia;
 
//CONSTRUCTORES
 
    //Constructor que toma los datos de conexion por medio de parametros
    public Conectadb(String usuario, String clave, String url, String driverClassName) {
        this.usuario = usuario;
        this.clave = clave;
        this.url = url;
        this.driverClassName = driverClassName;
    }
 
    //Constructor que crea la conexion sin parametros con unos definidos en la clase
    //(meter los datos correspondientes)
    public Conectadb() {
        //poner los datos apropiados
        this.db ="Ghetto";
        this.host = "jdbc:mysql://localhost:3306/";
        this.usuario = "Juan";
        this.clave = "";
        this.url = host + db + "?user=" + usuario + "&password="+clave;
        this.driverClassName = "com.mysql.jdbc.Driver";
    }
 
    //metodos para recuperar los datos de conexion
    public String getClave() {
        return clave;
    }
 
    public String getUrl() {
        return url;
    }
 
    public String getUsuario() {
        return usuario;
    }
 
    public Connection getConn() {
        return conn;
    }
 
    public String getDriverClassName() {
        return driverClassName;
    }
 
    //metodos para establecer los valores de conexion
    public void setClave(String clave) {
        this.clave = clave;
    }
 
    public void setUrl(String url) {
        this.url = url;
    }
 
    public void setUsuario(String usuario) throws SQLException {
        this.usuario = usuario;
    }
 
    public void setConn(Connection conn) {
        this.conn = conn;
    }
 
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
 
//la conexion propiamente dicha
 
    public Connection conectar() {
        try {
            Class.forName(this.driverClassName);
            this.conn = DriverManager.getConnection(this.url, this.usuario, this.clave );
 
        } catch (Exception err) {
            System.out.println("Error " + err.getMessage());
        }
        return conn;
        
    }
    //Cerrar la conexion
 
    public void cierraConexion() throws SQLException {
        this.conn.close();
    }
}
