package com.example.helloWorld.Model;

import javax.validation.constraints.NotBlank;

import com.example.helloWorld.Annotation.Not2CitationInBDD;

public class CitationForm {
	private int id;
	
	@NotBlank(message = "La citation ne peut pas être vide !")
	@Not2CitationInBDD
	private String valeur;
	
	@NotBlank(message = "Toute citation a forcément un auteur !")
	private String auteur;
	
	public CitationForm() {}

	public CitationForm(String valeur, String auteur) {
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
