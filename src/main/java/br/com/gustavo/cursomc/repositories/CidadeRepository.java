package br.com.gustavo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.cursomc.dominio.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
