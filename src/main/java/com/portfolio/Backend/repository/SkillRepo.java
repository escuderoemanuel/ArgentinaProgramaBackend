package com.portfolio.Backend.repository;

import com.portfolio.Backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo
    extends JpaRepository<Skill, Long> {
}
