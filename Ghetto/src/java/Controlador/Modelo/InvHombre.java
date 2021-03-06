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
@Table(name = "inv_hombre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvHombre.findAll", query = "SELECT i FROM InvHombre i")
    , @NamedQuery(name = "InvHombre.findById", query = "SELECT i FROM InvHombre i WHERE i.id = :id")
    , @NamedQuery(name = "InvHombre.findByItem", query = "SELECT i FROM InvHombre i WHERE i.item = :item")
    , @NamedQuery(name = "InvHombre.findByCategoria", query = "SELECT i FROM InvHombre i WHERE i.categoria = :categoria")
    , @NamedQuery(name = "InvHombre.findByColor", query = "SELECT i FROM InvHombre i WHERE i.color = :color")
    , @NamedQuery(name = "InvHombre.findByGenero", query = "SELECT i FROM InvHombre i WHERE i.genero = :genero")
    , @NamedQuery(name = "InvHombre.findByDescripcion", query = "SELECT i FROM InvHombre i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "InvHombre.findByPrecio", query = "SELECT i FROM InvHombre i WHERE i.precio = :precio")
    , @NamedQuery(name = "InvHombre.findByColeccion", query = "SELECT i FROM InvHombre i WHERE i.coleccion = :coleccion")
    , @NamedQuery(name = "InvHombre.findByCantidad", query = "SELECT i FROM InvHombre i WHERE i.cantidad = :cantidad")})
public class InvHombre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "item")
    private String item;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "color")
    private String color;
    @Column(name = "genero")
    private String genero;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private String precio;
    @Column(name = "coleccion")
    private String coleccion;
    @Column(name = "cantidad")
    private String cantidad;

    public InvHombre() {
    }

    public InvHombre(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
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
        if (!(object instanceof InvHombre)) {
            return false;
        }
        InvHombre other = (InvHombre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Modelo.InvHombre[ id=" + id + " ]";
    }
    
}
