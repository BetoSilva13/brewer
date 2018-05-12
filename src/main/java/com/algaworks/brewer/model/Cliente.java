package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {

	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	@NotBlank(message = "CPF/CGC é obrigatório")
	private Integer cpfCgc;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpfCgc() {
		return cpfCgc;
	}

	public void setCpfCgc(Integer cpfCgc) {
		this.cpfCgc = cpfCgc;
	}
	
}
