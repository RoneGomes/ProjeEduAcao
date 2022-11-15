package br.com.eduAcao.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduAcao.model.Ong;

public interface OngRepositorio extends JpaRepository<Ong, Long> {

    @EntityGraph(attributePaths = {"doador"})
    List<Ong> findAll();
    
}

