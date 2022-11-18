package es.http.service.service;

import java.util.List;

import es.http.service.dto.Chollo;



public interface ICholloService {

	public List<Chollo> listaChollo();

	public Chollo addChollo(Chollo chollo);
	
	public Chollo updateChollo(Chollo chollo);
	
	public Chollo getCholloById(int id);

	public void deleteChollo(int id);
}
