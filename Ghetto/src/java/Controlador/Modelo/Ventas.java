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
@Table(name = "ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")
    , @NamedQuery(name = "Ventas.findById", query = "SELECT v FROM Ventas v WHERE v.id = :id")
    , @NamedQuery(name = "Ventas.findByCventa", query = "SELECT v FROM Ventas v WHERE v.cventa = :cventa")
    , @NamedQuery(name = "Ventas.findByCproducto", query = "SELECT v FROM Ventas v WHERE v.cproducto = :cproducto")
    , @NamedQuery(name = "Ventas.findByFchventa", query = "SELECT v FROM Ventas v WHERE v.fchventa = :fchventa")
    , @NamedQuery(name = "Ventas.findByCantidad", query = "SELECT v FROM Ventas v WHERE v.cantidad = :cantidad")
    , @NamedQuery(name = "Ventas.findByNproducto", query = "SELECT v FROM Ventas v WHERE v.nproducto = :nproducto")
    , @NamedQuery(name = "Ventas.findByDcproducto", query = "SELECT v FROM Ventas v WHERE v.dcproducto = :dcproducto")
    , @NamedQuery(name = "Ventas.findByPrecio", query = "SELECT v FROM Ventas v WHERE v.precio = :precio")})
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "cventa")
    private String cventa;
    @Column(name = "cproducto")
    private String cproducto;
    @Column(name = "fchventa")
    @Temporal(TemporalType.DATE)
    private Date fchventa;
    @Column(name = "cantidad")
    private String cantidad;
    @Column(name = "nproducto")
    private String nproducto;
    @Column(name = "dcproducto")
    private String dcproducto;
    @Column(name = "precio")
    private String precio;

    public Ventas() {
    }

    public Ventas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCventa() {
        return cventa;
    }

    public void setCventa(String cventa) {
        this.cventa = cventa;
    }

    public String getCproducto() {
        return cproducto;
    }

    public void setCproducto(String cproducto) {
        this.cproducto = cproducto;
    }

    public Date getFchventa() {
        return fchventa;
    }

    public void setFchventa(Date fchventa) {
        this.fchventa = fchventa;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getNproducto() {
        return nproducto;
    }

    public void setNproducto(String nproducto) {
        this.nproducto = nproducto;
    }

    public String getDcproducto() {
        return dcproducto;
    }

    public void setDcproducto(String dcproducto) {
        this.dcproducto = dcproducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Modelo.Ventas[ id=" + id + " ]";
    }
    
}
