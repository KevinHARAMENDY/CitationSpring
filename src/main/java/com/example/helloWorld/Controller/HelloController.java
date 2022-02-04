package com.example.helloWorld.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.helloWorld.BLL.CitationManager;
import com.example.helloWorld.BLL.PersonneManager;
import com.example.helloWorld.Model.Citation;
import com.example.helloWorld.Model.CitationForm;
import com.example.helloWorld.Model.Personne;
import com.example.helloWorld.Model.PersonneForm;

@Controller
public class HelloController {
	@Autowired
	PersonneManager perMan;
	@Autowired
	CitationManager citaMan;
	
	List<String> erreurs = new ArrayList<>();
	
	@GetMapping("/hello/index")
	private String index(Model mod) {
		mod.addAttribute("hello", "Hello World !");
		mod.addAttribute("citations", citaMan.getAll());
		mod.addAttribute("personnes", perMan.getAll());
		mod.addAttribute("citation", new CitationForm());
		mod.addAttribute("soutien", new PersonneForm());
		mod.addAttribute("erreurs", erreurs);
		return "index";
	}
	
	@PostMapping("/hello/api/addCitation")
	private String addCitation(CitationForm citationForm, Model mod) {
		erreurs.clear();
		if (citationForm.getAuteur().equals("") || citationForm.getValeur().equals("")) {
			if (citationForm.getAuteur().equals("")) erreurs.add("Une citation a forcément un auteur !");
			if (citationForm.getValeur().equals("")) erreurs.add("Veuillez saisir une citation");
			
			return "redirect:/hello/index";
		}
		
		Citation c = new Citation();
		c.setAuteur(citationForm.getAuteur());
		c.setValeur(citationForm.getValeur());
		citaMan.addCitation(c);
		return "redirect:/hello/index";
	}
	
	@GetMapping("/hello/api/deleteCitation/{id}")
	private String deleteCitation(@PathVariable("id") int id) {
		citaMan.deleteCitation(citaMan.getById(id));
		return "redirect:/hello/index";
	}
	
	@PostMapping("/hello/api/editCitation/{id}")
	private String editCitation(@PathVariable("id") int id, Citation c) {
		citaMan.editCitation(c);
		return "redirect:/hello/index";
	}
	
	@PostMapping("/hello/api/addSoutien")
	private String addSoutien(PersonneForm personneForm, BindingResult errors, Model mod) {
		erreurs.clear();
		if (personneForm.getNom().equals("") || personneForm.getPrenom().equals("")) {
			if (personneForm.getNom().equals("")) erreurs.add("Tu as forcément un nom !");
			if (personneForm.getPrenom().equals("")) erreurs.add("Tu as forcément un prénom !");
			
			return "redirect:/hello/index";
		}
		
		Personne p = new Personne();
		p.setNom(personneForm.getNom());
		p.setPrenom(personneForm.getPrenom());
		perMan.addPersonne(p);
		return "redirect:/hello/index";
	}
	
}
