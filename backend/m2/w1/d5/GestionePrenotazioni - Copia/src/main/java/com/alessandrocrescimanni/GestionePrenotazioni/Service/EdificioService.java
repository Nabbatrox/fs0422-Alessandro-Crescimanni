package com.alessandrocrescimanni.GestionePrenotazioni.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alessandrocrescimanni.GestionePrenotazioni.entities.Edificio;
import com.alessandrocrescimanni.GestionePrenotazioni.repositories.EdificioRepository;

@Service
public class EdificioService {
	
	@Autowired
	EdificioRepository er;
	
	public void saveEdificio(Edificio e) {
		er.save(e);
	}
	
	public List<Edificio> findAllEdifici(long id){
		return er.findAll();
	}
	
	public void deleteByIdEdificio(long id) {
		er.deleteById(id);
	}

}
