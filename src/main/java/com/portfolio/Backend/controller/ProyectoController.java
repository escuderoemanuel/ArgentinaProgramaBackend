package com.portfolio.Backend.controller;

import com.portfolio.Backend.models.Proyecto;
import com.portfolio.Backend.service.ProyectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto")
@CrossOrigin(origins = "https://portfoliofrontargprog.web.app")
public class ProyectoController {
  private final ProyectoService proyectoService;

  public ProyectoController(ProyectoService proyectoService) {
    this.proyectoService = proyectoService;

  }
  // Create
  @PostMapping("/add")
  public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto) {
    Proyecto nuevaProyecto= proyectoService.addProyecto(proyecto);
    return new ResponseEntity<>(nuevaProyecto, HttpStatus.CREATED);
  }

  // Read
  @GetMapping("/all")
  public ResponseEntity<List<Proyecto>> obtenerProyecto() {
    List<Proyecto> proyecto= proyectoService.buscarProyecto() ;
    return new ResponseEntity<>(proyecto, HttpStatus.OK);
  }


  // Update
  @PutMapping("/update")
  public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyecto) {
    Proyecto updateProyecto= proyectoService.editarProyecto(proyecto);
    return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
  }

  // Delete
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id) {
    proyectoService.borrarProyecto(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
