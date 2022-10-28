package com.alessandrocrescimanni.GestionePrenotazioni.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alessandrocrescimanni.GestionePrenotazioni.entities.Utente;
import com.alessandrocrescimanni.GestionePrenotazioni.repositories.UtenteRepository;

@Service
public class UtenteService {
	
	@Autowired
	UtenteRepository ur;
	
	public void saveUtente(Utente u) {
		ur.save(u);
	}
	
	public List<Utente> findAllUtenti(long id){
		return ur.findAll();
	}
	
	public void deleteByIdUtente(long id) {
		ur.deleteById(id);
	}

}
