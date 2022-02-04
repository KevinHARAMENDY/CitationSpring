package com.example.helloWorld.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Citation {
	@Id
	@GeneratedValue
	private int id;
	private String valeur;
	private String auteur;
	
	public Citation() {}

	public Citation(String auteur, String valeur) {
		super();
		this.valeur = valeur;
		this.auteur = auteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
}
