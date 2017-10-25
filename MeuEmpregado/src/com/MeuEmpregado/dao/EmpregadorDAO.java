package com.MeuEmpregado.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.MeuEmpregado.model.Empregador;

public class EmpregadorDAO {
	EntityManagerFactory emf = Conexao.getInstance();
	
	public void cadastrar(Empregador e) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
		em.close();	
	}

	
	public void excluir(Empregador e) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Empregador empregador = em.find(Empregador.class, e.getIdEmpregador());
		em.remove(empregador);
		em.getTransaction().commit();
		
		em.close();	
	}

	
	public List<Empregador> listar() {
		EntityManager em = Conexao.getInstance().
				createEntityManager();
		Query q = em.createQuery("from Empregador");
		
		return q.getResultList();
	}
}
