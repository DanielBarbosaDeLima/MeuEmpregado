package com.MeuEmpregado.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.MeuEmpregado.model.Empregado;

public class EmpregadoDAO {
	EntityManagerFactory emf = Conexao.getInstance();
	
	public void cadastrar(Empregado e) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
		em.close();	
	}

	
	public void excluir(Empregado e) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Empregado empregado = em.find(Empregado.class, e.getIdEmpregado());
		em.remove(empregado);
		em.getTransaction().commit();
		
		em.close();	
	}

	
	public List<Empregado> listar() {
		EntityManager em = Conexao.getInstance().
				createEntityManager();
		Query q = em.createQuery("from Empregado");
		
		return q.getResultList();
	}
}
