package com.alessandrocrescimanni.GestionePrenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alessandrocrescimanni.GestionePrenotazioni.entities.Citta;

@Repository
public interface CittaRepository extends JpaRepository<Citta, Long> {

}
