package br.edu.ifba.app.forms;

import br.edu.ifba.app.models.Cliente;
import br.edu.ifba.app.repository.ClienteRepository;

public class ClienteForm {

    private long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String data;

    public ClienteForm() {}

    public ClienteForm(Cliente cliente) {
        this.id       = cliente.getId();
        this.nome     = cliente.getNome();
        this.cnpj     = cliente.getCnpj();
        this.endereco = cliente.getEndereco();
        this.data     = cliente.getData();
    }

    public Cliente atualiza(long id, ClienteRepository clienteRepository) {
        Cliente cliente = clienteRepository.getReferenceById(id);
        cliente.setId(this.id);
        cliente.setNome(this.nome);
        cliente.setCnpj(this.cnpj);
        cliente.setEndereco(this.endereco);
        cliente.setData(this.data);
        return cliente;
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