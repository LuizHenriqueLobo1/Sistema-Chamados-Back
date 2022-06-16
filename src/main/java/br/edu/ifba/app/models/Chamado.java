package br.edu.ifba.app.models;

import javax.persistence.*;

@Entity(name = "chamado")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Cliente cliente;
    @Enumerated(EnumType.STRING)
    private Assunto assunto;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String complemento;
    private String data;

    public Chamado() {}

    public Chamado(long id, Cliente cliente, Assunto assunto, Status status, String complemento, String data) {
        this.id          = id;
        this.cliente     = cliente;
        this.assunto     = assunto;
        this.status      = status;
        this.complemento = complemento;
        this.data        = data;
    }

    public long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Assunto getAssunto() {
        return assunto;
    }

    public Status getStatus() {
        return status;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getData() {
        return data;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setData(String data) {
        this.data = data;
    }
}