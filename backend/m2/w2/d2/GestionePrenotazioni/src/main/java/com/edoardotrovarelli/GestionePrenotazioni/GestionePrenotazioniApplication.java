package com.edoardotrovarelli.GestionePrenotazioni;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.edoardotrovarelli.GestionePrenotazioni.config.Config;

import com.edoardotrovarelli.GestionePrenotazioni.Service.CittaService;
import com.edoardotrovarelli.GestionePrenotazioni.Service.EdificioService;
import com.edoardotrovarelli.GestionePrenotazioni.Service.PostazioneService;
import com.edoardotrovarelli.GestionePrenotazioni.Service.PrenotazioneService;
import com.edoardotrovarelli.GestionePrenotazioni.Service.UtenteService;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Postazione;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Prenotazione;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Utente;

@SpringBootApplication
public class GestionePrenotazioniApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionePrenotazioniApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	


	

}
