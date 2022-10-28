package com.alessandrocrescimanni.GestionePrenotazioni.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alessandrocrescimanni.GestionePrenotazioni.entities.Prenotazione;
import com.alessandrocrescimanni.GestionePrenotazioni.repositories.PrenotazioneRepository;

@Service
public class PrenotazioneService {
	
	@Autowired
	PrenotazioneRepository prr;
	
	public void savePrenotazione(Prenotazione booking) {
		prr.save(booking);
	}
	
	public List<Prenotazione> findAllPrenotazioni(long id){
		return prr.findAll();
	}
	
	public void deleteByIdPrenotazione(long id) {
		prr.deleteById(id);
	}

}
