package com.portfolio.Backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skill {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long idSkill;
  private String nombreSkill;
  private String imagenSkill;
  private int porcentajeSkill;

  // Constructores


  public Skill() {
  }

  public Skill(Long idSkill,
               String nombreSkill,
               String imagenSkill,
               int porcentajeSkill) {
    this.idSkill = idSkill;
    this.nombreSkill = nombreSkill;
    this.imagenSkill = imagenSkill;
    this.porcentajeSkill = porcentajeSkill;
  }

  // Getters y Setters

  public Long getIdSkill() {
    return idSkill;
  }

  public void setIdSkill(Long idSkill) {
    this.idSkill = idSkill;
  }

  public String getNombreSkill() {
    return nombreSkill;
  }

  public void setNombreSkill(String nombreSkill) {
    this.nombreSkill = nombreSkill;
  }

  public String getImagenSkill() {
    return imagenSkill;
  }

  public void setImagenSkill(String imagenSkill) {
    this.imagenSkill = imagenSkill;
  }

  public int getPorcentajeSkill() {
    return porcentajeSkill;
  }

  public void setPorcentajeSkill(int porcentajeSkill) {
    this.porcentajeSkill = porcentajeSkill;
  }
}
