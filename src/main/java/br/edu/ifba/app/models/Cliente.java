package br.edu.ifba.app.models;

import javax.persistence.*;

@Entity(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String data;

    public Cliente() {}

    public Cliente(long id, String nome, String cnpj, String endereco, String data) {
        this.id       = id;
        this.nome     = nome;
        this.cnpj     = cnpj;
        this.endereco = endereco;
        this.data     = data;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getData() {
        return data;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setData(String data) {
        this.data = data;
    }
}