package br.edu.ifba.app.repository;

import br.edu.ifba.app.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
