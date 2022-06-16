package br.edu.ifba.app.repository;

import br.edu.ifba.app.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
