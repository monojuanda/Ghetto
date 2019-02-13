/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tamayo B
 */
@Entity
@Table(name = "empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findById", query = "SELECT e FROM Empleados e WHERE e.id = :id")
    , @NamedQuery(name = "Empleados.findByNombres", query = "SELECT e FROM Empleados e WHERE e.nombres = :nombres")
    , @NamedQuery(name = "Empleados.findByApellidos", query = "SELECT e FROM Empleados e WHERE e.apellidos = :apellidos")
    , @NamedQuery(name = "Empleados.findByTipo", query = "SELECT e FROM Empleados e WHERE e.tipo = :tipo")
    , @NamedQuery(name = "Empleados.findByIdentificacion", query = "SELECT e FROM Empleados e WHERE e.identificacion = :identificacion")
    , @NamedQuery(name = "Empleados.findBySexo", query = "SELECT e FROM Empleados e WHERE e.sexo = :sexo")
    , @NamedQuery(name = "Empleados.findByFecha", query = "SELECT e FROM Empleados e WHERE e.fecha = :fecha")
    , @NamedQuery(name = "Empleados.findByTelefono", query = "SELECT e FROM Empleados e WHERE e.telefono = :telefono")
    , @NamedQuery(name = "Empleados.findByDireccion", query = "SELECT e FROM Empleados e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Empleados.findByOcupacion", query = "SELECT e FROM Empleados e WHERE e.ocupacion = :ocupacion")})
public class Empleados implements Serializable {

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
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "identificacion")
    private String identificacion;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "ocupacion")
    private String ocupacion;

    public Empleados() {
    }

    public Empleados(Integer id) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Modelo.Empleados[ id=" + id + " ]";
    }
    
}
