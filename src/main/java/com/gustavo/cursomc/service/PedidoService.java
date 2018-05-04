package com.gustavo.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.cursomc.dominio.Pedido;
import com.gustavo.cursomc.service.exceptions.ObjectNotFoundException;

import br.com.gustavo.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido busca(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto Não encontrado, id: " + id + "Tipo: "  + Pedido.class.getName());
		}
		return obj;
	}
}
