package com.alessandrocrescimanni.GestionePrenotazioni.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alessandrocrescimanni.GestionePrenotazioni.entities.Postazione;
import com.alessandrocrescimanni.GestionePrenotazioni.repositories.PostazioneRepository;

@Service
public class PostazioneService {
	
	@Autowired
	PostazioneRepository pr;
	
	public void savePostazione(Postazione p) {
		pr.save(p);
	}
	
	public List<Postazione> findAllPostazioni(long id){
		return pr.findAll();
	}
	
	public void deleteByIdPostazione(long id) {
		pr.deleteById(id);
	}

}
