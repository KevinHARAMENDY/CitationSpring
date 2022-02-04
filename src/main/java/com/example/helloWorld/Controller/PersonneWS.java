package com.example.helloWorld.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloWorld.BLL.PersonneManager;
import com.example.helloWorld.Model.Personne;

@RestController
public class PersonneWS {
	 @Autowired
	 PersonneManager perMan;
	 
	 @GetMapping("/hello/api/personnes")
	 private List<Personne> getAll() {
		 return perMan.getAll();
	 }

}
