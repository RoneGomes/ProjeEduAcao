package br.com.eduAcao.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduAcao.model.Administrador;




public interface AdministradorRepositorio extends JpaRepository<Administrador, Long> {

    @EntityGraph(attributePaths = "endereco")
    List<Administrador> findAll();

    Optional<Administrador> findByEmail(String email);
    
}