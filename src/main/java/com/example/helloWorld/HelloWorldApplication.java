package com.example.helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.helloWorld.BLL.CitationManager;
import com.example.helloWorld.Model.Citation;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {
	@Autowired
	CitationManager citaMan;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		citaMan.addCitation(new Citation("Oscar Wilde","S'aimer soi-même est le début d'une histoire d'amour qui durera toute une vie"));
		citaMan.addCitation(new Citation("Confucius","Choisissez un travail que vous aimez et vous n'aurez pas à travailler un seul jour de votre vie"));
	}

}
