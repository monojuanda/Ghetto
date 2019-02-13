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
@Table(name = "proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")
    , @NamedQuery(name = "Proveedores.findById", query = "SELECT p FROM Proveedores p WHERE p.id = :id")
    , @NamedQuery(name = "Proveedores.findByNit", query = "SELECT p FROM Proveedores p WHERE p.nit = :nit")
    , @NamedQuery(name = "Proveedores.findByNombres", query = "SELECT p FROM Proveedores p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Proveedores.findByApellidos", query = "SELECT p FROM Proveedores p WHERE p.apellidos = :apellidos")
    , @NamedQuery(name = "Proveedores.findByTipo", query = "SELECT p FROM Proveedores p WHERE p.tipo = :tipo")
    , @NamedQuery(name = "Proveedores.findByIdentificacion", query = "SELECT p FROM Proveedores p WHERE p.identificacion = :identificacion")
    , @NamedQuery(name = "Proveedores.findBySexo", query = "SELECT p FROM Proveedores p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "Proveedores.findByFecha", query = "SELECT p FROM Proveedores p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Proveedores.findByTelefono", query = "SELECT p FROM Proveedores p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Proveedores.findByDireccion", query = "SELECT p FROM Proveedores p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Proveedores.findByDepartamento", query = "SELECT p FROM Proveedores p WHERE p.departamento = :departamento")
    , @NamedQuery(name = "Proveedores.findByCiudad", query = "SELECT p FROM Proveedores p WHERE p.ciudad = :ciudad")
    , @NamedQuery(name = "Proveedores.findByEmpresa", query = "SELECT p FROM Proveedores p WHERE p.empresa = :empresa")
    , @NamedQuery(name = "Proveedores.findByEstado", query = "SELECT p FROM Proveedores p WHERE p.estado = :estado")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "nit")
    private String nit;
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
    @Column(name = "departamento")
    private String departamento;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "estado")
    private String estado;

    public Proveedores() {
    }

    public Proveedores(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Modelo.Proveedores[ id=" + id + " ]";
    }
    
}
