package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Calibres")
public class Calibre {
	@Id
	private int idCalibre;
	
	private String nomeCalibre;
	
	public Calibre() {
		
	}
	
	public Calibre(int idCalibre, String nomeCalibre) {
		this.idCalibre = idCalibre;
		this.nomeCalibre = nomeCalibre;
	}
	
	//GETs e SETs
	public int getIdCalibre() {
		return idCalibre;
	}
	
	public void setIdGraduacao(int idCalibre) {
		this.idCalibre = idCalibre;
	}
	
	public String getNomeCalibre() {
		return nomeCalibre;
	}

	public void setNomeCalibre(String nomeCalibre) {
		this.nomeCalibre = nomeCalibre;
	}
}
