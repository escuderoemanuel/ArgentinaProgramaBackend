package com.portfolio.Backend.controller;

import com.portfolio.Backend.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.portfolio.Backend.models.Usuario;
import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "https://argentinaprogramabackend-odvo.onrender.com")
public class UsuarioController {

  private final UsuarioService usuarioService;

  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  // Crear Usuario
  @PostMapping("/add")
  @ResponseBody
  public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
    Usuario nuevoUsuario = usuarioService.addUsuario(usuario);
    return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
  }


  // Traer Lista de Usuarios
  @GetMapping("/all")
  public List<Usuario> getUsuario() {
    return usuarioService.buscarUsuario();
  }


  // Traer Usuario por ID
  @GetMapping("/id/{id}")
  public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id) {
    Usuario usuario = usuarioService.buscarUsuarioPorId(id);
    return new ResponseEntity<>(usuario,
            HttpStatus.OK);
  }

  // Editar Usuario
  @PutMapping("/update")
  public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario) {
    Usuario updateUsuario = usuarioService.editarUsuario(usuario);
    return new ResponseEntity<>(updateUsuario,
            HttpStatus.OK);
  }
  
  // Borrar Usuario
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> borrarUsuario(@PathVariable("id") Long id) {
    usuarioService.borrarUsuario(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
