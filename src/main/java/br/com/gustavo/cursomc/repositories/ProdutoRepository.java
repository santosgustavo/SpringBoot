package br.com.gustavo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.cursomc.dominio.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	

}
