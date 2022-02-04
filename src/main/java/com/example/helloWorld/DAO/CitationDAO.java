package com.example.helloWorld.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.helloWorld.Model.Citation;

public interface CitationDAO extends CrudRepository<Citation, Integer> {

	boolean findByValeur(String citation);

}
