package com.MeuEmpregado.service;

import java.util.List;

import com.MeuEmpregado.dao.EmpregadorDAO;
import com.MeuEmpregado.model.Empregador;

public class EmpregadorService {

	EmpregadorDAO dao = new EmpregadorDAO();
	
	public void cadastrar(Empregador e){
		dao.cadastrar(e);
	}
	
	public List<Empregador>listar(){
		return dao.listar();
	}
	
	public void excluir(Empregador e){
		dao.excluir(e);
	}
}
