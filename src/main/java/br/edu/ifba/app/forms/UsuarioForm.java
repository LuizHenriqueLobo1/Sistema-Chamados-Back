package br.edu.ifba.app.forms;

import br.edu.ifba.app.models.Usuario;

public class UsuarioForm {

    private String id;
    private String nome;
    private byte[] foto;

    public UsuarioForm() {
    }

    public UsuarioForm(Usuario usuario) {
        this.id   = usuario.getId();
        this.nome = usuario.getNome();
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