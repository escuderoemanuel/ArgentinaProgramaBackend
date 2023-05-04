package com.portfolio.Backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long idProyecto;
  private String nombreProyecto;
  private String imagenProyecto;
  private String tipoProyecto;
  private String toolsProyecto;
  private String urlRepoProyecto;
  private String urlDemoProyecto;

  // Constructores
  public Proyecto() {
  }

  public Proyecto(Long idProyecto,
                  String nombreProyecto,
                  String tipoProyecto,
                  String imagenProyecto,
                  String toolsProyecto,
                  String urlRepoProyecto,
                  String urlDemoProyecto) {
    this.idProyecto = idProyecto;
    this.nombreProyecto = nombreProyecto;
    this.tipoProyecto = tipoProyecto;
    this.imagenProyecto = imagenProyecto;
    this.toolsProyecto = toolsProyecto;
    this.urlRepoProyecto = urlRepoProyecto;
    this.urlDemoProyecto = urlDemoProyecto;
  }

  // Getters y Setters

  public Long getIdProyecto() {
    return idProyecto;
  }

  public void setIdProyecto(Long idProyecto) {
    this.idProyecto = idProyecto;
  }

  public String getNombreProyecto() {
    return nombreProyecto;
  }

  public void setNombreProyecto(String nombreProyecto) {
    this.nombreProyecto = nombreProyecto;
  }

  public String getTipoProyecto() {
    return tipoProyecto;
  }

  public void setTipoProyecto(String tipoProyecto) {
    this.tipoProyecto = tipoProyecto;
  }

  public String getImagenProyecto() {
    return imagenProyecto;
  }

  public void setImagenProyecto(String imagenProyecto) {
    this.imagenProyecto = imagenProyecto;
  }

  public String getToolsProyecto() {
    return toolsProyecto;
  }

  public void setToolsProyecto(String toolsProyecto) {
    this.toolsProyecto = toolsProyecto;
  }

  public String getUrlRepoProyecto() {
    return urlRepoProyecto;
  }

  public void setUrlRepoProyecto(String urlRepoProyecto) {
    this.urlRepoProyecto = urlRepoProyecto;
  }

  public String getUrlDemoProyecto() {
    return urlDemoProyecto;
  }

  public void setUrlDemoProyecto(String urlDemoProyecto) {
    this.urlDemoProyecto = urlDemoProyecto;
  }
}
