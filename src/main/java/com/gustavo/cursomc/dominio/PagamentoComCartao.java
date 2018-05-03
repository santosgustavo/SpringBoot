package com.gustavo.cursomc.dominio;

import javax.persistence.Entity;

import com.gustavo.cursomc.dominio.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pagamento pagamento, Pedido pedido, Integer numeroParcelas) {
		super(id, estado, pagamento, pedido);
		// TODO Auto-generated constructor stub
		this.numeroDeParcelas = numeroParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
}
