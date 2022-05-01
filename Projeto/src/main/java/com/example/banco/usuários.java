package com.example.banco;

import java.sql.Date;

public class usuários {
	
	private Long id;
	private String nome;
	private String email;
	private Boolean situacao;
	private Date data_criacao;
	private Integer prioridade;
	
	public usuários() {
		super();
	}

	public usuários(Long id, String nome, String email, Boolean situacao, Date data_criacao, Integer prioridade) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.situacao = situacao;
		this.data_criacao = data_criacao;
		this.prioridade = prioridade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}
	
}
