package br.com.gustavo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.cursomc.dominio.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
