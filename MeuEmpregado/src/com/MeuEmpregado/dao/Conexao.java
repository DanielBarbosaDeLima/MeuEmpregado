package com.MeuEmpregado.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("MeuEmpregado");
	

	public static EntityManagerFactory getInstance() {
		return emf;
	}
}
