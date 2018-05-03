package com.gustavo.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.cursomc.dominio.Cliente;
import com.gustavo.cursomc.service.exceptions.ObjectNotFoundException;

import br.com.gustavo.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id:" + id + ", Tipo: " + Cliente.class.getName());
		}
		
		return obj;
	}

}
