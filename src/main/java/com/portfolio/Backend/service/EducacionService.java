package com.portfolio.Backend.service;

import com.portfolio.Backend.models.Educacion;
import com.portfolio.Backend.repository.EducacionRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
@Transactional
public class EducacionService {
  private final EducacionRepo educacionRepo;

  @Autowired
  public EducacionService(EducacionRepo educacionRepo) {
    this.educacionRepo = educacionRepo;
  }

  // Create
  public Educacion addEducacion(Educacion educacion) {
    return educacionRepo.save(educacion);
  }

  // Read
  public List<Educacion> buscarEducacion() {
    return educacionRepo.findAll();
  }

  // Update
  public Educacion editarEducacion(Educacion educacion) {
    return educacionRepo.save(educacion);
  }

  // Delete
  public void borrarEducacion(Long id) {
    educacionRepo.deleteById(id);
  }

}
