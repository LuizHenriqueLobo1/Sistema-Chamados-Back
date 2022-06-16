package br.edu.ifba.app.controllers;

import br.edu.ifba.app.forms.ChamadoForm;
import br.edu.ifba.app.models.Chamado;
import br.edu.ifba.app.dtos.ChamadoDto;
import br.edu.ifba.app.services.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    @Autowired
    ChamadoService chamadoService;

    @GetMapping
    public List<ChamadoDto> listarChamados() {
        return chamadoService.listarChamados();
    }

    @GetMapping("/{id}")
    public ChamadoDto listarChamado(@PathVariable long id) {
        return chamadoService.listarChamado(id);
    }

    @PostMapping
    public ResponseEntity<Chamado> registrarChamado(@RequestBody ChamadoForm chamadoForm) {
        return chamadoService.registrarChamado(chamadoForm);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Chamado> atualizarChamado(@PathVariable long id, @RequestBody ChamadoForm chamadoForm) {
        return chamadoService.atualizarChamado(id, chamadoForm);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Chamado> deletarChamado(@PathVariable long id) {
        return chamadoService.deletarChamado(id);
    }
}
