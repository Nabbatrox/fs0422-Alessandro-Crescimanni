package com.edoardotrovarelli.GestionePrenotazioni.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edoardotrovarelli.GestionePrenotazioni.entities.Citta;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Edificio;
import com.edoardotrovarelli.GestionePrenotazioni.repositories.CittaRepository;
import com.edoardotrovarelli.GestionePrenotazioni.repositories.EdificioRepository;

@Service
public class EdificioService {

	@Autowired
	EdificioRepository ed;
	
	public void saveEdificio(Edificio e) {
		ed.save(e);
	}
	
	public List<Edificio> getAllEdifico(){
		return ed.findAll();
	}
	
	public void deleteEdificioById(long id) {
		ed.deleteById(id);
	}
	
}
