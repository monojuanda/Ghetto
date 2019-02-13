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
@Table(name = "contactos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactos.findAll", query = "SELECT c FROM Contactos c")
    , @NamedQuery(name = "Contactos.findById", query = "SELECT c FROM Contactos c WHERE c.id = :id")
    , @NamedQuery(name = "Contactos.findByNombres", query = "SELECT c FROM Contactos c WHERE c.nombres = :nombres")
    , @NamedQuery(name = "Contactos.findByApellidos", query = "SELECT c FROM Contactos c WHERE c.apellidos = :apellidos")
    , @NamedQuery(name = "Contactos.findByCorreo", query = "SELECT c FROM Contactos c WHERE c.correo = :correo")
    , @NamedQuery(name = "Contactos.findByTelefono", query = "SELECT c FROM Contactos c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Contactos.findByDepartamento", query = "SELECT c FROM Contactos c WHERE c.departamento = :departamento")
    , @NamedQuery(name = "Contactos.findByCiudad", query = "SELECT c FROM Contactos c WHERE c.ciudad = :ciudad")
    , @NamedQuery(name = "Contactos.findByNumPedido", query = "SELECT c FROM Contactos c WHERE c.numPedido = :numPedido")
    , @NamedQuery(name = "Contactos.findByAsunto", query = "SELECT c FROM Contactos c WHERE c.asunto = :asunto")
    , @NamedQuery(name = "Contactos.findByComentario", query = "SELECT c FROM Contactos c WHERE c.comentario = :comentario")})
public class Contactos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "departamento")
    private String departamento;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "num_pedido")
    private String numPedido;
    @Column(name = "asunto")
    private String asunto;
    @Column(name = "comentario")
    private String comentario;

    public Contactos() {
    }

    public Contactos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
        if (!(object instanceof Contactos)) {
            return false;
        }
        Contactos other = (Contactos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Modelo.Contactos[ id=" + id + " ]";
    }
    
}
