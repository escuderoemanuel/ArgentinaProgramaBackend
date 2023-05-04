package com.portfolio.Backend.controller;

import com.portfolio.Backend.models.Educacion;
import com.portfolio.Backend.service.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/educacion")
public class EducacionController {

  private final EducacionService educacionService;

  public EducacionController(EducacionService educacionService) {
    this.educacionService = educacionService;

  }
  // Create
  @PostMapping("/add")
  public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion) {
    Educacion nuevaEducacion= educacionService.addEducacion(educacion);
    return new ResponseEntity<>(nuevaEducacion, HttpStatus.CREATED);
  }

  // Read
  @GetMapping("/all")
  public ResponseEntity<List<Educacion>> obtenerEducacion() {
    List<Educacion> educacion= educacionService.buscarEducacion() ;
    return new ResponseEntity<>(educacion, HttpStatus.OK);
  }


  // Update
  @PutMapping("/update")
  public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion) {
    Educacion updateEducacion= educacionService.editarEducacion(educacion);
    return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
  }

  // Delete
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id) {
    educacionService.borrarEducacion(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }


}
