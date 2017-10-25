package com.MeuEmpregado.service;

import java.util.List;

import com.MeuEmpregado.dao.PacoteSeguroDAO;
import com.MeuEmpregado.model.PacoteSeguro;

public class PacoteSeguroService {
	
	PacoteSeguroDAO dao = new PacoteSeguroDAO();
	
	public void cadastrar(PacoteSeguro p){
		dao.cadastrar(p);
	}
	
	public List<PacoteSeguro>listar(){
		return dao.listar();
	}
	
	public void excluir(PacoteSeguro p){
		dao.excluir(p);
	}
}
