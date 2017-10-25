package com.MeuEmpregado.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PacoteSeguro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;
	private Double indenizacao;
	private Double valorMensal;
	
	public PacoteSeguro(){
		
	}
	public PacoteSeguro(Integer id, String nome, String descricao, Double indenizacao, Double valorMensal) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.indenizacao = indenizacao;
		this.valorMensal = valorMensal;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getIndenizacao() {
		return indenizacao;
	}
	public void setIndenizacao(Double indenizacao) {
		this.indenizacao = indenizacao;
	}
	public Double getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(Double valorMensal) {
		this.valorMensal = valorMensal;
	}
}
