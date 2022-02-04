package com.example.helloWorld.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloWorld.BLL.CitationManager;
import com.example.helloWorld.Model.Citation;

@RestController
public class CitationWS {
	@Autowired
	CitationManager citaMan;
	
	@GetMapping("/hello/api/citations")
	private List<Citation> getAll() {
		return citaMan.getAll();
	}
	
	@GetMapping("/hello/api/citation/{id}")
	private Citation getById(@PathVariable("id") int id) {
		return citaMan.getById(id);
	}

}
