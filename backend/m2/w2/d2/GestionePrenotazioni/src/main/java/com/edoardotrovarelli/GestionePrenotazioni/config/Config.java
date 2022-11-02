package com.edoardotrovarelli.GestionePrenotazioni.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import com.edoardotrovarelli.GestionePrenotazioni.entities.Citta;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Edificio;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Postazione;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Prenotazione;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Tipo;
import com.edoardotrovarelli.GestionePrenotazioni.entities.Utente;

@Configuration
public class Config {

	@Bean
	@Scope("prototype")
	public Citta getCitta() {
		return new Citta();
	}
	
	@Bean
	@Scope("prototype")
	public Citta getRoma() {
		return Citta.builder()
				.nomeCitta("Roma")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Citta getMilano() {
		return Citta.builder()
				.nomeCitta("Milano")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Edificio getEdificio() {
		return new Edificio();
	}
	
	@Bean
	@Scope("prototype")
	public Edificio getHotel() {
		return Edificio.builder()
				.nomeEdificio("Hotel")
				.indirizzo("Via del pane 10")
				.citta(getRoma())
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Edificio getAirbnb() {
		return Edificio.builder()
				.nomeEdificio("CasaVacanze")
				.indirizzo("Via delle rane 42")
				.citta(getMilano())
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Postazione getPostazione() {
		return new Postazione();
	}
	
	@Bean
	@Scope("prototype")
	public Postazione getSalaUno() {
		return Postazione.builder()
				.descrizione("SalaUno")
				.tipo(Tipo.PRIVATO)
				.numeroMassimoPartecipanti(10)
				.edificio(getHotel())
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Postazione getSalaDue() {
		return Postazione.builder()
				.descrizione("SalaDue")
				.tipo(Tipo.OPENSPACE)
				.numeroMassimoPartecipanti(20)
				.edificio(getAirbnb())
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Utente getUtente() {
		return new Utente();				
	}
	
	@Bean
	@Scope("protorype")
	public Utente getMarioRossi() {
		return Utente.builder()
				.nomeCompleto("Mario Rossi")
				.email("mariorossi@gmail.com")
				.username("marione")
				.build();
	}
	
	@Bean
	@Scope("protorype")
	public Utente getMariaBianchi() {
		return Utente.builder()
				.nomeCompleto("Maria Bianchi")
				.email("mariabianchi@gmail.com")
				.username("mariella")
				.build();
	}
	
	@Bean
	@Scope("protorype")
	public Prenotazione getPrenotazione() {
	return new Prenotazione();
	}
	
	@Bean
	@Scope("protorype")
	public Prenotazione getPrenotazioneUno() {
	return Prenotazione.builder()
			.utente(getMarioRossi())
			.giorno(LocalDate.of(2022,01,18))
			.postazione(getSalaUno())
			.build();
	}
	
}
