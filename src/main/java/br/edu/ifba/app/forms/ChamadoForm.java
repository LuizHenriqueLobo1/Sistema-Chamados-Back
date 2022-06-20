package br.edu.ifba.app.forms;

import br.edu.ifba.app.models.Assunto;
import br.edu.ifba.app.models.Chamado;
import br.edu.ifba.app.models.Cliente;
import br.edu.ifba.app.models.Status;
import br.edu.ifba.app.repository.ChamadoRepository;
import br.edu.ifba.app.repository.ClienteRepository;

public class ChamadoForm {

    private long id;
    private long cliente;
    private Assunto assunto;
    private Status status;
    private String complemento;
    private String data;

    public ChamadoForm() {}

    public ChamadoForm(Chamado chamado) {
        this.id          = chamado.getId();
        this.cliente     = chamado.getCliente().getId();
        this.assunto     = chamado.getAssunto();
        this.status      = chamado.getStatus();
        this.complemento = chamado.getComplemento();
        this.data        = chamado.getData();
    }

    public Chamado atualiza(long id, ChamadoRepository chamadoRepository, ClienteRepository clienteRepository) {
        Chamado chamado = chamadoRepository.getReferenceById(id);
        chamado.setId(this.id);
        chamado.setCliente(clienteRepository.getReferenceById(this.cliente));
        chamado.setAssunto(this.assunto);
        chamado.setStatus(this.status);
        chamado.setComplemento(this.complemento);
        chamado.setData(this.data);
        return chamado;
    }

    public long getId() {
        return id;
    }

    public long getCliente() {
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

    public void setCliente(long cliente) {
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
