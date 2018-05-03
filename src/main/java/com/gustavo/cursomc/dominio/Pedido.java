package com.gustavo.cursomc.dominio;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date instante;
	
	private Cliente cliente;
	private Endereco enderecoDeEntrega;
	
	public Pedido(){
				
	}

	public Pedido(Integer id, Date instante, Cliente cliente, Endereco enderecoDeEntrega) {
		super();
		this.id = id;
		this.instante = instante;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((enderecoDeEntrega == null) ? 0 : enderecoDeEntrega.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((instante == null) ? 0 : instante.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (enderecoDeEntrega == null) {
			if (other.enderecoDeEntrega != null)
				return false;
		} else if (!enderecoDeEntrega.equals(other.enderecoDeEntrega))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (instante == null) {
			if (other.instante != null)
				return false;
		} else if (!instante.equals(other.instante))
			return false;
		return true;
	}
	
	
}
