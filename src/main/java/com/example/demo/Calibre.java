package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Calibres")
public class Calibre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcalibre")
	private Integer idCalibre;
	@Column(name = "nomecalibre")
	private String nomeCalibre;
	
	public Calibre() {
		
	}
	
	public Calibre(String nomeCalibre) {
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
