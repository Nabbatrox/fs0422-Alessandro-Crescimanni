package com.edoardotrovarelli.GestionePrenotazioni.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edoardotrovarelli.GestionePrenotazioni.entities.Citta;
import com.edoardotrovarelli.GestionePrenotazioni.repositories.CittaRepository;


@Service
public class CittaService {

	@Autowired
	CittaRepository ci;
	
	public void saveCitta(Citta c) {
		ci.save(c);
	}
	
	public List<Citta> getAllCitta(){
		return ci.findAll();
	}
	
	public void deleteCittaById(long id) {
		ci.deleteById(id);
	}
	
}
