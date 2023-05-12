package com.portfolio.Backend.controller;

import com.portfolio.Backend.models.Skill;
import com.portfolio.Backend.service.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
@CrossOrigin(origins = "https://argentinaprogramabackend-odvo.onrender.com")
public class SkillController {

  private final SkillService skillService;

  public SkillController(SkillService skillService) {
    this.skillService = skillService;

  }

  // Create
  @PostMapping("/add")
  public ResponseEntity<Skill> crearSkill(@RequestBody Skill skill) {
    Skill nuevaSkill = skillService.addSkill(skill);
    return new ResponseEntity<>(nuevaSkill,
        HttpStatus.CREATED);
  }

  // Read
  @GetMapping("/all")
  public ResponseEntity<List<Skill>> obtenerSkill() {
    List<Skill> skill = skillService.buscarSkill();
    return new ResponseEntity<>(skill,
        HttpStatus.OK);
  }


  // Update
  @PutMapping("/update")
  public ResponseEntity<Skill> editarSkill(@RequestBody Skill skill) {
    Skill updateSkill = skillService.editarSkill(skill);
    return new ResponseEntity<>(updateSkill,
        HttpStatus.OK);
  }

  // Delete
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> borrarSkill(@PathVariable("id") Long id) {
    skillService.borrarSkill(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
