package com.MeuEmpregado.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empregado {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer idEmpregado;
	private String nomeCompleto;
	private String dataNascimento;
	private String cpf;
	private String rg;
	private String telefoneFixo;
	private String telefonCelular;
	private String cep;
	private String enderecoRua;
	private Integer enderecoNumero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String email;
	private String senha;
	private String disponivel;
	private String status;
	private String sexo;
	
	public Empregado(){
		
	}
	public Empregado(Integer idEmpregado, String nomeCompleto, String dataNascimento, String cpf, String rg,
			String telefoneFixo, String telefonCelular, String cep, String enderecoRua, Integer enderecoNumero,
			String complemento, String bairro, String cidade, String uf, String email, String senha, String disponivel,
			String status, String sexo) {
		this.idEmpregado = idEmpregado;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.telefoneFixo = telefoneFixo;
		this.telefonCelular = telefonCelular;
		this.cep = cep;
		this.enderecoRua = enderecoRua;
		this.enderecoNumero = enderecoNumero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.email = email;
		this.senha = senha;
		this.disponivel = disponivel;
		this.status = status;
		this.sexo = sexo;
	}
	public Integer getIdEmpregado() {
		return idEmpregado;
	}
	public void setIdEmpregado(Integer idEmpregado) {
		this.idEmpregado = idEmpregado;
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
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEnderecoRua() {
		return enderecoRua;
	}
	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}
	public Integer getEnderecoNumero() {
		return enderecoNumero;
	}
	public void setEnderecoNumero(Integer enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
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
	public String getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
