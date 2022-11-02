package com.edoardotrovarelli.GestionePrenotazioni.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edoardotrovarelli.GestionePrenotazioni.entities.Citta;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Postazione;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Tipo;

@Repository
public interface PostazioneRepository extends JpaRepository <Postazione, Long>{

	public List<Postazione> findByTipoAndEdificioCitta(Tipo t, Citta c);
}
