package br.edu.ifba.app.services;

import br.edu.ifba.app.dtos.ClienteDto;
import br.edu.ifba.app.forms.ClienteForm;
import br.edu.ifba.app.models.Cliente;
import br.edu.ifba.app.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<ClienteDto> listarClientes() {
        return ClienteDto.converte(clienteRepository.findAll());
    }

    public ClienteDto listarCliente(long id) {
        return new ClienteDto(clienteRepository.getReferenceById(id));
    }

    public ResponseEntity<Cliente> registrarCliente(ClienteForm clienteForm) {
        Cliente cliente = new Cliente(
                clienteForm.getId(),
                clienteForm.getNome(),
                clienteForm.getCnpj(),
                clienteForm.getEndereco(),
                clienteForm.getData()
        );
        clienteRepository.save(cliente);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Cliente> atualizarCliente(long id, ClienteForm clienteForm) {
        clienteForm.atualiza(id, clienteRepository);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Cliente> deletaCliente(long id) {
        clienteRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
