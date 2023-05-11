package com.portfolio.Backend.controller;

import com.portfolio.Backend.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.portfolio.Backend.models.Usuario;


@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "bteh26eoqzwbqmerrfmn-mysql.services.clever-cloud.com")
public class UsuarioController {

  private final UsuarioService usuarioService;

  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  @GetMapping("/id/{id}")
  public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id) {
    Usuario usuario = usuarioService.buscarUsuarioPorId(id);
    return new ResponseEntity<>(usuario,
        HttpStatus.OK);
  }

  @PutMapping("/update")
  public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario) {
    Usuario updateUsuario = usuarioService.editarUsuario(usuario);
    return new ResponseEntity<>(updateUsuario,
        HttpStatus.OK);
  }
}
