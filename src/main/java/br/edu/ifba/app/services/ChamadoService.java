package br.edu.ifba.app.services;

import br.edu.ifba.app.dtos.ChamadoDto;
import br.edu.ifba.app.forms.ChamadoForm;
import br.edu.ifba.app.models.Chamado;
import br.edu.ifba.app.repository.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadoService {

    @Autowired
    ChamadoRepository chamadoRepository;

    public List<ChamadoDto> listarChamados() {
        return ChamadoDto.converte(chamadoRepository.findAll());
    }

    public ChamadoDto listarChamado(long id) {
        return new ChamadoDto(chamadoRepository.getReferenceById(id));
    }

    public ResponseEntity<Chamado> registrarChamado(ChamadoForm chamadoForm) {
        Chamado chamado = new Chamado(
                chamadoForm.getId(),
                chamadoForm.getCliente(),
                chamadoForm.getAssunto(),
                chamadoForm.getStatus(),
                chamadoForm.getComplemento(),
                chamadoForm.getData()
        );
        chamadoRepository.save(chamado);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Chamado> atualizarChamado(long id, ChamadoForm chamadoForm) {
        chamadoForm.atualiza(id, chamadoRepository);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Chamado> deletarChamado(long id) {
        chamadoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}