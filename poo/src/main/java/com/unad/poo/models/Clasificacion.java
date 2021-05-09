/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unad.poo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author FERNi
 */
@Entity
@Table(name="clasificaciones")
public class Clasificacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_clas")
    Integer idClasificacion;
    
    @Column(name="nombre", nullable=false)
    String nombre;
    
    @Column(name="peso", nullable=false)
    Integer peso;
    
    @Column(name="precio", nullable=false)
    Integer precio;

    public Integer getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(Integer idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Clasificacion{" + "idClasificacion=" + idClasificacion + ", nombre=" + nombre + ", peso=" + peso + ", precio=" + precio + '}';
    }
    
}
