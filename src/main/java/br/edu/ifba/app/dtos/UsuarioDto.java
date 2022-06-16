package br.edu.ifba.app.dtos;

import br.edu.ifba.app.models.Usuario;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDto {

    private String id;
    private String nome;
    private byte[] foto;

    public UsuarioDto() {
    }

    public UsuarioDto(Usuario usuario) {
        this.id   = usuario.getId();
        this.nome = usuario.getNome();
        this.foto = usuario.getFoto();
    }

    public static List<UsuarioDto> converte(List<Usuario> usuarios) {
        return usuarios.stream().map(usuario -> new UsuarioDto(usuario)).collect(Collectors.toList());
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
