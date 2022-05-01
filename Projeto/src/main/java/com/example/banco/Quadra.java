package com.example.banco;

import java.sql.Date;

public class Quadra {
	
	private Long id;
	private String tipo;
	private Boolean cobertura;
	private Boolean arquibancada;
	private Boolean banco_reserva;
	private Boolean situacao;
	private Date data_cadastro;
	
	public Quadra() {
		super();
	}

	public Quadra(Long id, String tipo, Boolean cobertura, Boolean arquibancada, Boolean banco_reserva,
			Boolean situacao, Date data_cadastro) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cobertura = cobertura;
		this.arquibancada = arquibancada;
		this.banco_reserva = banco_reserva;
		this.situacao = situacao;
		this.data_cadastro = data_cadastro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getCobertura() {
		return cobertura;
	}

	public void setCobertura(Boolean cobertura) {
		this.cobertura = cobertura;
	}

	public Boolean getArquibancada() {
		return arquibancada;
	}

	public void setArquibancada(Boolean arquibancada) {
		this.arquibancada = arquibancada;
	}

	public Boolean getBanco_reserva() {
		return banco_reserva;
	}

	public void setBanco_reserva(Boolean banco_reserva) {
		this.banco_reserva = banco_reserva;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

}
