package com.alessandrocrescimanni.GestionePrenotazioni.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alessandrocrescimanni.GestionePrenotazioni.entities.Citta;
import com.alessandrocrescimanni.GestionePrenotazioni.repositories.CittaRepository;

@Service
public class CittaService {
	
	@Autowired
	CittaRepository cr;
	
	public void saveCitta(Citta c) {
		cr.save(c);
	}
	
	public List<Citta> findAllCitta(long id){
		return cr.findAll();
	}
	
	public void deleteByIdCitta(long id) {
		cr.deleteById(id);
	}
}
