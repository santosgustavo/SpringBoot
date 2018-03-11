package com.gustavo.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.cursomc.dominio.Categoria;
import com.gustavo.cursomc.service.exceptions.ObjectNotFoundException;

import br.com.gustavo.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id:" + id + ", Tipo: " + Categoria.class.getName());
		}
		
		return obj;
	}

}
