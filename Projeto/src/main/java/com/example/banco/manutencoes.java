package com.example.banco;

import java.sql.Date;

public class manutencoes {
	
	private Long num_quadra;
	private Date inicio;
	private Date termino;
	private String descricao;
	private Boolean bloquear_quadra;
	
	public manutencoes() {
		super();
	}

	public manutencoes(Long num_quadra, Date inicio, Date termino, String descricao, Boolean bloquear_quadra) {
		super();
		this.num_quadra = num_quadra;
		this.inicio = inicio;
		this.termino = termino;
		this.descricao = descricao;
		this.bloquear_quadra = bloquear_quadra;
	}

	public Long getNum_quadra() {
		return num_quadra;
	}

	public void setNum_quadra(Long num_quadra) {
		this.num_quadra = num_quadra;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getBloquear_quadra() {
		return bloquear_quadra;
	}

	public void setBloquear_quadra(Boolean bloquear_quadra) {
		this.bloquear_quadra = bloquear_quadra;
	}

}
