package com.edoardotrovarelli.GestionePrenotazioni.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.edoardotrovarelli.GestionePrenotazioni.entities.Prenotazione;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Utente;
import com.edoardotrovarelli.GestionePrenotazioni.repositories.PrenotazioneRepository;
import com.edoardotrovarelli.GestionePrenotazioni.repositories.UtenteRepository;



@Service
public class UtenteService {

	@Autowired
	UtenteRepository ut;
	
	public void savePrenotazione(Utente u) {
		ut.save(u);
	}
	
	
	
	public Iterable<Utente> getAllUtente(){
		return ut.findAll();
	}
	
	public void deleteUtenteById(long id) {
		ut.deleteById(id);
	}
	
	  public Page<Utente> getByUtenteAndPaginate(String n, Pageable p){
	        return ut.findByUtenteAndPaginate(n, p);
	    }

	   
		public void addUtente(Utente u) {
			ut.save(u);
			
		}
		
}
