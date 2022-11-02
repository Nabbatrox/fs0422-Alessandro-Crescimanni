package com.edoardotrovarelli.GestionePrenotazioni.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edoardotrovarelli.GestionePrenotazioni.entities.Postazione;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Prenotazione;
import com.edoardotrovarelli.GestionePrenotazioni.repositories.PostazioneRepository;
import com.edoardotrovarelli.GestionePrenotazioni.repositories.PrenotazioneRepository;

import exception.PostazionePrenotazioneException;
import exception.UtentePrenotazioneException;

@Service
public class PrenotazioneService {

	@Autowired
	PrenotazioneRepository pr;
	
	public void save(Prenotazione p) throws UtentePrenotazioneException, PostazionePrenotazioneException {
		
		if(pr.existsByUtenteAndGiorno(p.getUtente(), p.getGiorno())) {
			throw new UtentePrenotazioneException();
		}
		if(pr.existsByPostazioneAndGiorno(p.getPostazione(), p.getGiorno())) {
			throw new PostazionePrenotazioneException();
		}
		pr.save(p);
	}
	
	
	
	
}
