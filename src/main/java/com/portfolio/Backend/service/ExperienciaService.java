package com.portfolio.Backend.service;

import com.portfolio.Backend.models.Experiencia;
import com.portfolio.Backend.repository.ExperienciaRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class ExperienciaService {
  private final ExperienciaRepo experienciaRepo;

  @Autowired
  public ExperienciaService(ExperienciaRepo experienciaRepo) {
    this.experienciaRepo = experienciaRepo;
  }

  // Create
  public Experiencia addExperiencia(Experiencia experiencia) {
    return experienciaRepo.save(experiencia);
  }

  // Read
  public List<Experiencia> buscarExperiencia() {
    return experienciaRepo.findAll();
  }

  // Update
  public Experiencia editarExperiencia(Experiencia experiencia) {
    return experienciaRepo.save(experiencia);
  }

  // Delete
  public void borrarExperiencia(Long id) {
    experienciaRepo.deleteById(id);
  }
}
