package br.edu.ifba.app.dtos;

import br.edu.ifba.app.models.Chamado;
import br.edu.ifba.app.models.Cliente;
import br.edu.ifba.app.models.Status;
import br.edu.ifba.app.models.Assunto;

import java.util.List;
import java.util.stream.Collectors;

public class ChamadoDto {

    private long id;
    private Cliente cliente;
    private Assunto assunto;
    private Status status;
    private String complemento;
    private String data;

    public ChamadoDto() {}

    public ChamadoDto(Chamado chamado) {
        this.id           = chamado.getId();
        this.cliente      = chamado.getCliente();
        this.assunto      = chamado.getAssunto();
        this.status       = chamado.getStatus();
        this.complemento  = chamado.getComplemento();
        this.data         = chamado.getData();
    }

    public static List<ChamadoDto> converte(List<Chamado> chamados) {
        return chamados.stream().map(chamado -> new ChamadoDto(chamado)).collect(Collectors.toList());
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