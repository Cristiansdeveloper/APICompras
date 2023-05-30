package com.piso.pisoapp.pisoapp.modelo;

import jakarta.persistence.*;



@Entity
@Table(name="articulo_necesario")
public class Solicitud {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_necesidad")
   private int idSolicitud;
    @Column(name="necesidad")
    private String necesidad;
    @Column(name="id_usuario")
    private int id_usuario;
    @Column(name="finalizado")
    private boolean finalizado=false;

    public int getId_necesidad() {
        return idSolicitud;
    }

    public String getNecesidad() {
        return necesidad;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setId_necesidad(int id_necesidad) {
        this.idSolicitud = id_necesidad;
    }

    public void setNecesidad(String necesidad) {
        this.necesidad = necesidad;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Solicitud() {

    }
}
