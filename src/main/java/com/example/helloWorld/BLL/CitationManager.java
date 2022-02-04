package com.example.helloWorld.BLL;

import java.util.List;

import com.example.helloWorld.Model.Citation;

public interface CitationManager {
	public List<Citation> getAll();
	public Citation getById(int id);
	public boolean isExistByVal(String citation);
	public void addCitation(Citation c);
	public void deleteCitation(Citation c);
	public void editCitation(Citation c);
}
