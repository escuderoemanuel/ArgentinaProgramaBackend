package com.portfolio.Backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private String fechaDesdeExp;
    private String fechaHastaExp;
    private String descripcionExp;

    private String imagenExp;


    // Constructores
    public Experiencia() {
    }

    public Experiencia(Long idExp,
                       String tituloExp,
                       String fechaDesdeExp,
                       String fechaHastaExp,
                       String descripcionExp,
                       String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaDesdeExp = fechaDesdeExp;
        this.fechaHastaExp = fechaHastaExp;
        this.descripcionExp = descripcionExp;
        this.imagenExp = imagenExp;
    }

    // Getters y Setters

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public String getFechaDesdeExp() {
        return fechaDesdeExp;
    }

    public void setFechaDesdeExp(String fechaDesdeExp) {
        this.fechaDesdeExp = fechaDesdeExp;
    }

    public String getFechaHastaExp() {
        return fechaHastaExp;
    }

    public void setFechaHastaExp(String fechaHastaExp) {
        this.fechaHastaExp = fechaHastaExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }
}
