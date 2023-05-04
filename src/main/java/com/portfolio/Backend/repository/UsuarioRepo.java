package com.portfolio.Backend.repository;

import com.portfolio.Backend.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
