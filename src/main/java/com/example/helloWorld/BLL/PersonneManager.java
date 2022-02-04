package com.example.helloWorld.BLL;

import java.util.List;

import com.example.helloWorld.Model.Personne;

public interface PersonneManager {
	public void addPersonne(Personne p);
	public List<Personne> getAll();
}
