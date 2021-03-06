package br.edu.ifba.app.controllers;

import br.edu.ifba.app.dtos.UsuarioDto;
import br.edu.ifba.app.forms.UsuarioForm;
import br.edu.ifba.app.models.Usuario;
import br.edu.ifba.app.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDto> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioDto listarUsuario(@PathVariable String id) {
        return usuarioService.listarUsuario(id);
    }

    @PostMapping
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody UsuarioForm usuarioForm) {
        return usuarioService.registrarUsuario(usuarioForm);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable String id, @RequestParam("nome") String nome, @RequestPart("imagem") MultipartFile imagem) throws IOException {
        return usuarioService.atualizarUsuario(id, nome, imagem);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Usuario> deletarUsuario(@PathVariable String id) {
        return usuarioService.deletarUsuario(id);
    }
}