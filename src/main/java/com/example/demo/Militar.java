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
@Table(name = "Militares")
public class Militar {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idmilitar")
	private int idMilitar;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "graduacao")
	private Graduacao graduacao;
	
	@Column(name = "nomemilitar")
	private String nomeMilitar;
	
	public Militar() {
		
	}
	
	public Militar(Graduacao graduacao, String nomeMilitar) {
		this.graduacao = graduacao;
		this.nomeMilitar = nomeMilitar;
	}
	
	public int getIdMilitar() {
		return idMilitar;
	}
	
	public void setIdMilitar(int idMilitar) {
		this.idMilitar = idMilitar;
	}
	
	public String getNomeMilitar() {
		return nomeMilitar;
	}
	
	public void setNomeMilitar(String nomeMilitar) {
		this.nomeMilitar = nomeMilitar;
	}
	
	public Graduacao getGraduacao() {
		return this.graduacao;
	}
}
