package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GraduacaoRepositorioJPA implements GraduacaoRepositorio{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void inserir(Graduacao g) {
		em.persist(g);
	}
	
	@Override
	public Graduacao consultarPorId(int idGraduacao) {
		return em.find(Graduacao.class, idGraduacao);
	}
	
	@Override
	public List<Graduacao> consultarTodos(){
		return em.createQuery("select g from Graduacao g", Graduacao.class).getResultList();
	}
}
