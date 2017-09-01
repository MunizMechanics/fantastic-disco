package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Graduacoes")
public class Graduacao {
	@Id
	private int idGraduacao;
	private String nomeGraduacao;
	private String siglaGraduacao;
	
	public Graduacao() {
		
	}
	
	public Graduacao(int idGraduacao, String nomeGraduacao, String siglaGraduacao) {
		this.idGraduacao = idGraduacao;
		this.nomeGraduacao = nomeGraduacao;
		this.siglaGraduacao = siglaGraduacao;	
	}
	
	//GETs e SETs
	public int getIdGraduacao() {
		return idGraduacao;
	}
	
	public void setIdGraduacao(int idGraduacao) {
		this.idGraduacao = idGraduacao;
	}
	
	public String getNomeGraduacao() {
		return nomeGraduacao;
	}

	public void setNomeGraduacao(String nomeGraduacao) {
		this.nomeGraduacao = nomeGraduacao;
	}

	public String getSiglaGraduacao() {
		return siglaGraduacao;
	}

	public void setSiglaGraduacao(String siglaGraduacao) {
		this.siglaGraduacao = siglaGraduacao;
	}
	
	
	

}
