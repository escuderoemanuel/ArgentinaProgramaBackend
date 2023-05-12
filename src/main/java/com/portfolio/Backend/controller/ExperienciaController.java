package com.portfolio.Backend.controller;

import com.portfolio.Backend.models.Experiencia;
import com.portfolio.Backend.service.ExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "https://argentinaprogramabackend-odvo.onrender.com")
public class ExperienciaController {

  private final ExperienciaService experienciaService;

  public ExperienciaController(ExperienciaService experienciaService) {
    this.experienciaService = experienciaService;

  }

  // Create
  @PostMapping("/add")
  public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia) {
    Experiencia nuevaExperiencia = experienciaService.addExperiencia(experiencia);
    return new ResponseEntity<>(nuevaExperiencia,
        HttpStatus.CREATED);
  }

  // Read
  @GetMapping("/all")
  public ResponseEntity<List<Experiencia>> obtenerExperiencia() {
    List<Experiencia> experiencia = experienciaService.buscarExperiencia();
    return new ResponseEntity<>(experiencia,
        HttpStatus.OK);
  }


  // Update
  @PutMapping("/update")
  public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia) {
    Experiencia updateExperiencia = experienciaService.editarExperiencia(experiencia);
    return new ResponseEntity<>(updateExperiencia,
        HttpStatus.OK);
  }

  // Delete
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id) {
    experienciaService.borrarExperiencia(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
