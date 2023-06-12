CREATE DATABASE portfolio;

CREATE TABLE usuario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255),
  apellido VARCHAR(255),
  titulo VARCHAR(255),
  acercaDe VARCHAR(1000),
  fotoPerfil VARCHAR(255),
  imagenBanner VARCHAR(255)
);

CREATE TABLE skills (
  idSkill INT AUTO_INCREMENT PRIMARY KEY,
  nombreSkill VARCHAR(255),
  imagenSkill VARCHAR(255),
  porcentajeSkill INT
);

CREATE TABLE proyectos (
  idProyecto INT AUTO_INCREMENT PRIMARY KEY,
  nombreProyecto VARCHAR(255),
  imagenProyecto VARCHAR(255),
  tipoProyecto VARCHAR(255),
  toolsProyecto VARCHAR(255),
  urlRepoProyecto VARCHAR(255),
  urlDemoProyecto VARCHAR(255)
);

CREATE TABLE experiencia (
  idExp INT AUTO_INCREMENT PRIMARY KEY,
  tituloExp VARCHAR(255),
  lugarExp VARCHAR(255),
  fechaDesdeExp VARCHAR(10),
  fechaHastaExp VARCHAR(10),
  descripcionExp VARCHAR(255),
  imagenExp VARCHAR(255)
);

CREATE TABLE educacion (
  idEdu INT AUTO_INCREMENT PRIMARY KEY,
  tituloEdu VARCHAR(255),
  lugarEdu VARCHAR(255),
  fechaEdu VARCHAR(10),
  descripcionEdu VARCHAR(255),
  imagenEdu VARCHAR(255)
);


