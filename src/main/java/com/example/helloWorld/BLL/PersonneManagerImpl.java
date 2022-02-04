package com.example.helloWorld.BLL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.helloWorld.DAO.PersonneDAO;
import com.example.helloWorld.Model.Personne;

@Service
public class PersonneManagerImpl implements PersonneManager {
	@Autowired
	PersonneDAO dao;

	@Override
	public void addPersonne(Personne p) {
		dao.save(p);
	}

	@Override
	public List<Personne> getAll() {
		return (List<Personne>) dao.findAll();
	}

}
