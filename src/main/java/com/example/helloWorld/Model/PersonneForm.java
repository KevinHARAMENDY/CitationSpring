package com.example.helloWorld.Model;

import javax.validation.constraints.NotBlank;

public class PersonneForm {
	private int id;
	
	@NotBlank(message = "Tu as forcément un nom !")
	private String nom;
	
	@NotBlank(message = "Tu as forcément un prénom !")
	private String prenom;
	
	public PersonneForm() {}

	public PersonneForm(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
