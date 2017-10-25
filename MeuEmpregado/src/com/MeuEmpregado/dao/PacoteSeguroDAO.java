package com.MeuEmpregado.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.MeuEmpregado.model.PacoteSeguro;

public class PacoteSeguroDAO {
	EntityManagerFactory emf = Conexao.getInstance();
	
	public void cadastrar(PacoteSeguro s) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		
		em.close();	
	}

	
	public void excluir(PacoteSeguro s) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		PacoteSeguro pacote = em.find(PacoteSeguro.class, s.getId());
		em.remove(pacote);
		em.getTransaction().commit();
		
		em.close();	
	}

	
	public List<PacoteSeguro> listar() {
		EntityManager em = Conexao.getInstance().
				createEntityManager();
		Query q = em.createQuery("from PacoteSeguro");
		
		return q.getResultList();
	}
}
