package br.edu.ifba.app.dtos;

import br.edu.ifba.app.models.Cliente;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteDto {

    private long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String data;

    public ClienteDto() {}

    public ClienteDto(Cliente cliente) {
        this.id       = cliente.getId();
        this.nome     = cliente.getNome();
        this.cnpj     = cliente.getCnpj();
        this.endereco = cliente.getEndereco();
        this.data     = cliente.getData();
    }

    public static List<ClienteDto> converte(List<Cliente> clientes) {
        return clientes.stream().map(cliente -> new ClienteDto(cliente)).collect(Collectors.toList());
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

    private void setData(String data) {
        this.data = data;
    }
}
