package com.MeuEmpregado.service;

import java.util.List;

import com.MeuEmpregado.dao.EmpregadoDAO;
import com.MeuEmpregado.model.Empregado;

public class EmpregadoService {

	EmpregadoDAO dao = new EmpregadoDAO();
	
	public void cadastrar(Empregado e){
		dao.cadastrar(e);
	}
	
	public List<Empregado>listar(){
		return dao.listar();
	}
	
	public void excluir(Empregado e){
		dao.excluir(e);
	}
}
