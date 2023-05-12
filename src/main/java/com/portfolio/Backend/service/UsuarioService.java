package com.portfolio.Backend.service;

import com.portfolio.Backend.Exception.UserNotFoundException;
import com.portfolio.Backend.models.Usuario;
import com.portfolio.Backend.repository.UsuarioRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioService {

  private final UsuarioRepo usuarioRepo;

  @Autowired
  public UsuarioService(UsuarioRepo usuarioRepo) {
    this.usuarioRepo = usuarioRepo;
  }

  // Create
  public Usuario addUsuario(Usuario usuario) {
    return usuarioRepo.save(usuario);
  }
  
 

  // Read
  public List<Usuario> buscarUsuario() {
    return usuarioRepo.findAll();
  }

  // Read by ID
  public Usuario buscarUsuarioPorId(Long id) {
    return usuarioRepo.findById(id).orElseThrow(() ->
        new UserNotFoundException("Usuario no encontrado"));
  }

  // Edit
  public Usuario editarUsuario(Usuario usuario) {
    return usuarioRepo.save(usuario);
  }

  // Delete
  public void borrarUsuario(Long id) {
    usuarioRepo.deleteById(id);
  }

}
