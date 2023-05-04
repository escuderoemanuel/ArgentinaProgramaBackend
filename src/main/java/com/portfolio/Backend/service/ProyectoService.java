package com.portfolio.Backend.service;

import com.portfolio.Backend.models.Proyecto;
import com.portfolio.Backend.repository.ProyectoRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProyectoService {

  private final ProyectoRepo proyectoRepo;

  @Autowired
  public ProyectoService(ProyectoRepo proyectoRepo) {
    this.proyectoRepo = proyectoRepo;
  }

  // Create
  public Proyecto addProyecto(Proyecto proyecto) {
    return proyectoRepo.save(proyecto);
  }

  // Read
  public List<Proyecto> buscarProyecto() {
    return proyectoRepo.findAll();
  }

  // Update
  public Proyecto editarProyecto(Proyecto proyecto) {
    return proyectoRepo.save(proyecto);
  }

  // Delete
  public void borrarProyecto(Long id) {
    proyectoRepo.deleteById(id);
  }

}
