package com.portfolio.Backend.service;

import com.portfolio.Backend.models.Skill;
import com.portfolio.Backend.repository.SkillRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class SkillService {
  private final SkillRepo skillRepo;

  @Autowired
  public SkillService(SkillRepo skillRepo) {
    this.skillRepo = skillRepo;
  }

  // Create
  public Skill addSkill(Skill skill) {
    return skillRepo.save(skill);
  }

  // Read
  public List<Skill> buscarSkill() {
    return skillRepo.findAll();
  }

  // Update
  public Skill editarSkill(Skill skill) {
    return skillRepo.save(skill);
  }

  // Delete
  public void borrarSkill(Long id) {
    skillRepo.deleteById(id);
  }
}
