package com.example.helloWorld.BLL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.helloWorld.DAO.CitationDAO;
import com.example.helloWorld.Model.Citation;

@Service
public class CitationManagerImpl implements CitationManager {
	@Autowired
	CitationDAO dao;

	@Override
	public List<Citation> getAll() {
		return (List<Citation>) dao.findAll();
	}

	@Override
	public void addCitation(Citation c) {
		dao.save(c);
	}

	@Override
	public void deleteCitation(Citation c) {
		dao.deleteById(c.getId());
	}

	@Override
	public Citation getById(int id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void editCitation(Citation c) {
		dao.save(c);
	}

	@Override
	public boolean isExistByVal(String citation) {
		if (dao.findByValeur(citation)) return true;
		else return false;
	}

}
