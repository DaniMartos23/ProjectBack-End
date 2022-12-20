package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICholloDAO;
import com.crud.h2.dto.Chollo;


@Service
public class CholloSeviceImpl implements ICholloService {

	@Autowired
	ICholloDAO iCholloDAO;
	
	
	@Override
	public List<Chollo> listaChollo() {
		// TODO Auto-generated method stub
		return iCholloDAO.findAll(Sort.by(Direction.ASC, "fechacaducidad"));
	}

	@Override
	public Chollo addChollo(Chollo chollo) {
		// TODO Auto-generated method stub
		return iCholloDAO.save(chollo);
	}

	@Override
	public Chollo updateChollo(Chollo chollo) {
		// TODO Auto-generated method stub
		return iCholloDAO.save(chollo);
	}

	@Override
	public Chollo getCholloById(int id) {
		// TODO Auto-generated method stub
		return iCholloDAO.findById(id).get();
	}

	@Override
	public void deleteChollo(int id) {
		// TODO Auto-generated method stub
		iCholloDAO.deleteById(id);
	}

}
