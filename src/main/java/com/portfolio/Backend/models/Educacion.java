package com.portfolio.Backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private String fechaEdu;
    private String descripcionEdu;
    private String imagenEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, String fechaEdu, String descripcionEdu,
                     String imagenEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descripcionEdu = descripcionEdu;
        this.imagenEdu = imagenEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(String fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }




}
