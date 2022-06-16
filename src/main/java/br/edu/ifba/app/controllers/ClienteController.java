package br.edu.ifba.app.controllers;

import br.edu.ifba.app.dtos.ClienteDto;
import br.edu.ifba.app.forms.ClienteForm;
import br.edu.ifba.app.models.Cliente;
import br.edu.ifba.app.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    public List<ClienteDto> listarClientes() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public ClienteDto listarCliente(@PathVariable long id) {
        return clienteService.listarCliente(id);
    }

    @PostMapping
    public ResponseEntity<Cliente> registrarCliente(@RequestBody ClienteForm clienteForm) {
        return clienteService.registrarCliente(clienteForm);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable long id, @RequestBody ClienteForm clienteForm) {
        return clienteService.atualizarCliente(id, clienteForm);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Cliente> deletaCliente(@PathVariable long id) {
        return clienteService.deletaCliente(id);
    }
}
