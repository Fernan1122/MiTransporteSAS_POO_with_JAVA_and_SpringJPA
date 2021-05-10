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
@Table(name="empleados")
public class Empleado extends Persona {
    
    @Column(name="fecha_n", nullable=false)
    Date fecha_n;
    
    @Column(name="correo", nullable=false)
    String correo;
    
    @Column(name="username", nullable=false)
    String username;
    
    @Column(name="contraseña", nullable=false)
    String contraseña;
    
    @Column(name="identi", nullable=false)
    char identificador;
    
    @ManyToOne
    @JoinColumn(name="ciudades_id_ciudades", nullable=false)
    Ciudad ciudad;
    
    @ManyToOne
    @JoinColumn(name="roles_id_rol", nullable=false)
    Rol rol;

    public Date getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(Date fecha_n) {
        this.fecha_n = fecha_n;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public char getIdentificador() {
        return identificador;
    }

    public void setIdentificador(char identificador) {
        this.identificador = identificador;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" + "fecha_n=" + fecha_n + ", correo=" + correo + ", username=" + username + ", contrase\u00f1a=" + contraseña + ", identificador=" + identificador + ", ciudad=" + ciudad + ", rol=" + rol + '}';
    }   
    
}
