package com.example.helloWorld.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.helloWorld.Model.Personne;

public interface PersonneDAO extends CrudRepository<Personne, Integer> {

}
