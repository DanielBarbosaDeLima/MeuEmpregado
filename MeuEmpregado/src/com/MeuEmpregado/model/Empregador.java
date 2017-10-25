package com.MeuEmpregado.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empregador {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer idEmpregador;
	private String nomeCompleto;
	private String dataNascimento;
	private String cpf;
	private String rg;
	private String orgaoEmissor;
	private String telefoneFixo;
	private String telefonCelular;
	private String email;
	private String senha;
	private String sexo;
	
	public Empregador(){
		
	}
	public Empregador(Integer idEmpregador, String nomeCompleto, String dataNascimento, String cpf, String rg,
			String orgaoEmissor, String telefoneFixo, String telefonCelular, String email, String senha, String sexo) {
		this.idEmpregador = idEmpregador;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.orgaoEmissor = orgaoEmissor;
		this.telefoneFixo = telefoneFixo;
		this.telefonCelular = telefonCelular;
		this.email = email;
		this.senha = senha;
		this.sexo = sexo;
	}
	public Integer getIdEmpregador() {
		return idEmpregador;
	}
	public void setIdEmpregador(Integer idEmpregador) {
		this.idEmpregador = idEmpregador;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefonCelular() {
		return telefonCelular;
	}
	public void setTelefonCelular(String telefonCelular) {
		this.telefonCelular = telefonCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
