package com.portfolio.Backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Entity
public class Usuario
    implements Serializable {

  @Id
  //@GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false, updatable = false)
  private Long id;
  private String nombre;
  private String apellido;
  private String titulo;


  private String acercaDe;
  private String fotoPerfil;
  private String imagenBanner;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
  private List<Educacion> educacionList;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
  private List<Experiencia> experienciaList;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
  private List<Skill> skillList;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProyecto")
  private List<Proyecto> proyectoList;

  // Constructores
  public Usuario() {
  }

  public Usuario(Long id,
                 String nombre,
                 String apellido,
                 String titulo,
                 String acercaDe,
                 String fotoPerfil,
                 String imagenBanner) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.titulo = titulo;
    this.acercaDe = acercaDe;
    this.fotoPerfil = fotoPerfil;
    this.imagenBanner = imagenBanner;

  }

  // Getters y Setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAcercaDe() {
    return acercaDe;
  }

  public void setAcercaDe(String acercaDe) {
    this.acercaDe = acercaDe;
  }

  public String getFotoPerfil() {
    return fotoPerfil;
  }

  public void setFotoPerfil(String fotoPerfil) {
    this.fotoPerfil = fotoPerfil;
  }


  public String getImagenBanner() {
    return imagenBanner;
  }

  public void setImagenBanner(String imagenBanner) {
    this.imagenBanner = imagenBanner;
  }
}
