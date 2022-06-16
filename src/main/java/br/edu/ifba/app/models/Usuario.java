package br.edu.ifba.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Usuario {

    @Id
    private String id;
    private String nome;
    @Lob
    private byte[] foto;

    public Usuario() {
    }

    public Usuario(String id, String nome, byte[] foto) {
        this.id   = id;
        this.nome = nome;
        this.foto = foto;
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
