package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Chollo;



public interface ICholloService {

	public List<Chollo> listaChollo();

	public Chollo addChollo(Chollo chollo);
	
	public Chollo updateChollo(Chollo chollo);
	
	public Chollo getCholloById(int id);

	public void deleteChollo(int id);
}
