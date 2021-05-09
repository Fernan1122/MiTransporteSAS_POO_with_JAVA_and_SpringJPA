/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unad.poo.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author FERNi
 */
@Entity
@Table(name="clientes")
public class Cliente extends Persona {
        
    @Column(name="fecha_n", nullable=false)
    Date fecha_n;
    
    @Column(name="direccion", nullable=false)
    String direccionCliente;
    
    @ManyToOne
    @JoinColumn(name="ciudades_id_ciudades", nullable=false)
    Ciudad ciudad;

    public Date getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(Date fecha_n) {
        this.fecha_n = fecha_n;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "fecha_n=" + fecha_n + ", direccionCliente=" + direccionCliente + ", ciudad=" + ciudad + '}';
    }
    
    
}
