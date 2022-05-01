package com.example.banco;

import java.sql.Date;

public class agendamento {
	
	private Long id;
	private String nome_cliente;
	private Double cpf;
	private Date inicio;
	private Date termino;
	private Long num_quadra;
	private String tipo_pagamento;
	private Double valor_pagamento;
	
	public agendamento() {
		super();
	}

	public agendamento(Long id, String nome_cliente, Double cpf, Date inicio, Date termino, Long num_quadra,
			String tipo_pagamento, Double valor_pagamento) {
		super();
		this.id = id;
		this.nome_cliente = nome_cliente;
		this.cpf = cpf;
		this.inicio = inicio;
		this.termino = termino;
		this.num_quadra = num_quadra;
		this.tipo_pagamento = tipo_pagamento;
		this.valor_pagamento = valor_pagamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public Double getCpf() {
		return cpf;
	}

	public void setCpf(Double cpf) {
		this.cpf = cpf;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getTermino() {
		return termino;
	}

	public void setTermino(Date termino) {
		this.termino = termino;
	}

	public Long getNum_quadra() {
		return num_quadra;
	}

	public void setNum_quadra(Long num_quadra) {
		this.num_quadra = num_quadra;
	}

	public String getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	public Double getValor_pagamento() {
		return valor_pagamento;
	}

	public void setValor_pagamento(Double valor_pagamento) {
		this.valor_pagamento = valor_pagamento;
	}
	
}
