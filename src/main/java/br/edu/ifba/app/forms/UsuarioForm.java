package br.edu.ifba.app.forms;

import br.edu.ifba.app.models.Usuario;
import br.edu.ifba.app.repository.UsuarioRepository;

public class UsuarioForm {

    private String id;
    private String nome;
    private byte[] foto;

    public UsuarioForm() {
    }

    public UsuarioForm(Usuario usuario) {
        this.id   = usuario.getId();
        this.nome = usuario.getNome();
        this.foto = usuario.getFoto();
    }

    public Usuario atualiza(long id, UsuarioRepository usuarioRepository) {
        Usuario usuario = usuarioRepository.getReferenceById(id);
        usuario.setId(this.id);
        usuario.setNome(this.nome);
        usuario.setFoto(this.foto);
        return usuario;
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