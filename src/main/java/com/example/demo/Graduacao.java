package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Graduacoes")
public class Graduacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idgraduacao")
	private int idGraduacao;
	@Column(name = "nomegraduacao")
	private String nomeGraduacao;
	@Column(name = "siglagraduacao")
	private String siglaGraduacao;
	
	public Graduacao() {
		
	}
	
	public Graduacao(String nomeGraduacao, String siglaGraduacao) {
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
