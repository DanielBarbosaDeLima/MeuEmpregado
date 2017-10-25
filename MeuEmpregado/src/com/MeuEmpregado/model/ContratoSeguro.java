package com.MeuEmpregado.model;

public class ContratoSeguro {
	private PacoteSeguro seguro;
	private Empregado empregado;
	private Empregador empregador;
	
	public ContratoSeguro(PacoteSeguro seguro, Empregado empregado, Empregador empregador) {
		this.seguro = seguro;
		this.empregado = empregado;
		this.empregador = empregador;
	}
	
	public PacoteSeguro getSeguro() {
		return seguro;
	}
	public void setSeguro(PacoteSeguro seguro) {
		this.seguro = seguro;
	}
	public Empregado getEmpregado() {
		return empregado;
	}
	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}
	public Empregador getEmpregador() {
		return empregador;
	}
	public void setEmpregador(Empregador empregador) {
		this.empregador = empregador;
	}
}
