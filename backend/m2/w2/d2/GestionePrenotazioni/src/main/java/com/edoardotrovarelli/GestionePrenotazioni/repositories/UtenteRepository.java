package com.edoardotrovarelli.GestionePrenotazioni.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.edoardotrovarelli.GestionePrenotazioni.entities.Utente;



@Repository
public interface UtenteRepository extends PagingAndSortingRepository <Utente, Long>{

	
	
	   @Query(
	            nativeQuery = true,
	            value = "SELECT * FROM utente WHERE lower(username) LIKE %:n% OR WHERE lower(email) LIKE %:n%"
	    )
	    public Page<Utente> findByUtenteAndPaginate(@Param("n") String n, Pageable p);

	   
	 
	}


