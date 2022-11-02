package com.edoardotrovarelli.GestionePrenotazioni.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edoardotrovarelli.GestionePrenotazioni.entities.Postazione;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Prenotazione;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Utente;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

	public boolean existsByUtenteAndGiorno(Utente u, LocalDate d);
	public boolean existsByPostazioneAndGiorno(Postazione p, LocalDate d);
}
