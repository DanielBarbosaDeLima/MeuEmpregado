package com.MeuEmpregado.dao;

import java.util.List;

import org.junit.Test;

import com.MeuEmpregado.model.Empregador;

public class Teste {
	@Test
	public void Testar(){
		EmpregadorDAO dao = new EmpregadorDAO();
		List<Empregador> empregadores = dao.listar();
		
		for(Empregador itens:empregadores){
			System.out.println(itens.getNomeCompleto()+"-"+itens.getIdEmpregador());
		}
	}
}
