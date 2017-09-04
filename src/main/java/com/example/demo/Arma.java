package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Armas")
public class Arma {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idarma")
	private int idArma;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name= "calibre")
	private Calibre calibre;
	
	@Column(name = "nomearma")
	private String nomeArma;
	
	public Arma() {
		
	}
	
	public Arma(Calibre calibre, String nomeArma) {
		this.calibre = calibre;
		this.nomeArma = nomeArma;
	}
	
	public int getIdArma() {
		return idArma;
	}
	
	public void setIdArma(int idArma) {
		this.idArma = idArma;
	}
	
	public String getNomeArma() {
		return nomeArma;
	}
	
	public void setNomeArma(String nomeArma) {
		this.nomeArma = nomeArma;
	}
	
	public Calibre getCalibre() {
		return this.calibre;
	}

	public void setCalibre(Calibre calibre) {
		this.calibre = calibre;
	}
}
