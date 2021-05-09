/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unad.poo.models;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author FERNi
 */
@Entity
@Table(name="envios")
public class Envios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_envio")
    Integer idEnvio;
    
    @Column(name="id_dest", nullable=false)
    Long idDest;
    
    @Column(name="nombre_dest", nullable=false)
    String nombreDest;
    
    @Column(name="apellido_dest", nullable=false)
    String apellidoDest;
    
    @Column(name="direccion", nullable=false)
    String direccionDest;
    
    @Column(name="cel_dest", nullable=false)
    String celularDest;
    
    @Column(name="ciudad_orig", nullable=false)
    Integer ciudadOrigen;
    
    @Column(name="ciudad_des", nullable=false)
    Integer ciudadDestino;
    
    @Column(name="fecha", nullable=false)
    Date fecha;
    
    @ManyToOne
    @JoinColumn(name="clientes_id", nullable=false)
    Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name="clasificacion_id_clas", nullable=false)
    Clasificacion idClasificacio;

    public Integer getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Long getIdDest() {
        return idDest;
    }

    public void setIdDest(Long idDest) {
        this.idDest = idDest;
    }

    public String getNombreDest() {
        return nombreDest;
    }

    public void setNombreDest(String nombreDest) {
        this.nombreDest = nombreDest;
    }

    public String getApellidoDest() {
        return apellidoDest;
    }

    public void setApellidoDest(String apellidoDest) {
        this.apellidoDest = apellidoDest;
    }

    public String getDireccionDest() {
        return direccionDest;
    }

    public void setDireccionDest(String direccionDest) {
        this.direccionDest = direccionDest;
    }

    public String getCelularDest() {
        return celularDest;
    }

    public void setCelularDest(String celularDest) {
        this.celularDest = celularDest;
    }

    public Integer getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Integer ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Integer getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Integer ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Clasificacion getIdClasificacio() {
        return idClasificacio;
    }

    public void setIdClasificacio(Clasificacion idClasificacio) {
        this.idClasificacio = idClasificacio;
    }

    @Override
    public String toString() {
        return "Envios{" + "idEnvio=" + idEnvio + ", idDest=" + idDest + ", nombreDest=" + nombreDest + ", apellidoDest=" + apellidoDest + ", direccionDest=" + direccionDest + ", celularDest=" + celularDest + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", fecha=" + fecha + ", cliente=" + cliente + ", idClasificacio=" + idClasificacio + '}';
    }
    
    
}
