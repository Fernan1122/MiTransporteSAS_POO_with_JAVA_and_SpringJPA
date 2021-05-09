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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author FERNi
 */
@Entity
@Table(name="rev_envio")
public class RevEnvio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_rev")
    Integer idRev;
    
    @Column(name="observacion", nullable=false)
    String observacionEnvio;

    @Column(name="recibido", nullable=false)
    String recibido;
    
    @OneToOne
    @JoinColumn(name="envios_id_envio", nullable=false)
    Envios idEnvio;
    
    @Column(name="fecha", nullable=false)
    Date fecha;

    public Integer getIdRev() {
        return idRev;
    }

    public void setIdRev(Integer idRev) {
        this.idRev = idRev;
    }

    public String getObservacionEnvio() {
        return observacionEnvio;
    }

    public void setObservacionEnvio(String observacionEnvio) {
        this.observacionEnvio = observacionEnvio;
    }

    public String getRecibido() {
        return recibido;
    }

    public void setRecibido(String recibido) {
        this.recibido = recibido;
    }

    public Envios getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(Envios idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "RevEnvio{" + "idRev=" + idRev + ", observacionEnvio=" + observacionEnvio + ", recibido=" + recibido + ", idEnvio=" + idEnvio + ", fecha=" + fecha + '}';
    }
    

    
}
