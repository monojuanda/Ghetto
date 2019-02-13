/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tamayo B
 */
@Entity
@Table(name = "contra_empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContraEmpleados.findAll", query = "SELECT c FROM ContraEmpleados c")
    , @NamedQuery(name = "ContraEmpleados.findById", query = "SELECT c FROM ContraEmpleados c WHERE c.id = :id")
    , @NamedQuery(name = "ContraEmpleados.findByCorreo", query = "SELECT c FROM ContraEmpleados c WHERE c.correo = :correo")
    , @NamedQuery(name = "ContraEmpleados.findByContrase\u00f1a", query = "SELECT c FROM ContraEmpleados c WHERE c.contrase\u00f1a = :contrase\u00f1a")
    , @NamedQuery(name = "ContraEmpleados.findByRol", query = "SELECT c FROM ContraEmpleados c WHERE c.rol = :rol")})
public class ContraEmpleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "correo")
    private String correo;
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Column(name = "rol")
    private String rol;

    public ContraEmpleados() {
    }

    public ContraEmpleados(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContraEmpleados)) {
            return false;
        }
        ContraEmpleados other = (ContraEmpleados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Modelo.ContraEmpleados[ id=" + id + " ]";
    }
    
}
