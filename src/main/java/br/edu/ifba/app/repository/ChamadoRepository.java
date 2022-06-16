package br.edu.ifba.app.repository;

import br.edu.ifba.app.models.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {
}
