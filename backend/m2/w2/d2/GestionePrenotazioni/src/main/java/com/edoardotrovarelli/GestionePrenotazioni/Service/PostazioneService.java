package com.edoardotrovarelli.GestionePrenotazioni.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edoardotrovarelli.GestionePrenotazioni.entities.Edificio;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Postazione;
import com.edoardotrovarelli.GestionePrenotazioni.repositories.EdificioRepository;
import com.edoardotrovarelli.GestionePrenotazioni.repositories.PostazioneRepository;

@Service
public class PostazioneService {

	
	@Autowired
	PostazioneRepository po;
	
	public void savePostazione(Postazione p) {
		po.save(p);
	}
	
	public List<Postazione> getAllPostazione(){
		return po.findAll();
	}
	
	public void deletePostazioneById(long id) {
		po.deleteById(id);
	}
	
	
}
