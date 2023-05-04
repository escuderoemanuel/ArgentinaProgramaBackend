package com.portfolio.Backend.repository;

import com.portfolio.Backend.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
}
