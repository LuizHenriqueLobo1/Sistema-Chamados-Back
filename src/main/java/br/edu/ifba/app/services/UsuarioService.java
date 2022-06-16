package br.edu.ifba.app.services;

import br.edu.ifba.app.dtos.UsuarioDto;
import br.edu.ifba.app.forms.UsuarioForm;
import br.edu.ifba.app.models.Usuario;
import br.edu.ifba.app.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<UsuarioDto> listarUsuarios() {
        return UsuarioDto.converte(usuarioRepository.findAll());
    }

    public UsuarioDto listarUsuario(String id) {
        return new UsuarioDto(usuarioRepository.getReferenceById(id));
    }

    public ResponseEntity<Usuario> registrarUsuario(UsuarioForm usuarioForm) {
        Usuario usuario = new Usuario(
                usuarioForm.getId(),
                usuarioForm.getNome()
        );
        usuarioRepository.save(usuario);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Usuario> atualizarUsuario(String id, String nome, MultipartFile imagem) throws IOException {
        Usuario usuario = usuarioRepository.getReferenceById(id);
        usuario.setId(id);
        usuario.setNome(nome);
        byte[] formatedImagem = imagem.getBytes();
        usuario.setFoto(formatedImagem);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Usuario> deletarUsuario(String id) {
        usuarioRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}