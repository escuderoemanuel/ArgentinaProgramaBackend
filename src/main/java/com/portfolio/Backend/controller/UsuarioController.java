package com.portfolio.Backend.controller;

import com.portfolio.Backend.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.portfolio.Backend.models.Usuario;
import java.util.List;

@RestController
@RequestMapping("/usuario")
//@CrossOrigin(origins = "https://argentinaprogramabackend-odvo.onrender.com")
public class UsuarioController {

  private final UsuarioService usuarioService;

  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  // Crear usuario
  @PostMapping("/add")
  @ResponseBody
  public String crearUsuario(@RequestBody Usuario usuario) {
    usuarioService.addUsuario(usuario);
    return "Usuario creado";
  }

  // Crear usuario 2
  @PostMapping("/addd")
  @ResponseBody
  public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
    Usuario nuevoUsuario = usuarioService.addUsuario(usuario);
    return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
  }

  // Crear usuario 3
  @PostMapping("/adddd")
  @ResponseBody
  public Usuario crearNuevoUsuario(@RequestBody Usuario usuario) {
    return usuarioService.addUsuario(usuario);
  }

  // Traer Usuario
  @GetMapping("/all")
  public List<Usuario> getUsuario() {
    return usuarioService.buscarUsuario();
  }

  // Prueba
  @GetMapping("/prueba")
  public String saludar() {
    return "Funcionando!!!";
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
