package com.alessandrocrescimanni.GestionePrenotazioni.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.alessandrocrescimanni.GestionePrenotazioni.entities.Citta;
import com.alessandrocrescimanni.GestionePrenotazioni.entities.Edificio;
import com.alessandrocrescimanni.GestionePrenotazioni.entities.Postazione;
import com.alessandrocrescimanni.GestionePrenotazioni.entities.Prenotazione;
import com.alessandrocrescimanni.GestionePrenotazioni.entities.Tipo;
import com.alessandrocrescimanni.GestionePrenotazioni.entities.Utente;

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
				.nomeEdificio("Hotel di Alessandro")
				.indirizzo("Via col vento")
				.citta(getRoma())
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Utente getUtente() {
		return new Utente();				
	}
	
	@Bean
	@Scope("protorype")
	public Utente getGiovanni() {
		return Utente.builder()
				.nomeCompleto("Giovanni Rossi")
				.email("giovannirossi@gmail.com")
				.username("gioro90")
				.build();
	}
	
	@Bean
	@Scope("protorype")
	public Utente getClara() {
		return Utente.builder()
				.nomeCompleto("Clara Bianchi")
				.email("clarabianchi@gmail.com")
				.username("bianchiclara20")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Postazione getPostazione() {
		return new Postazione();
	}
	
	@Bean
	@Scope("prototype")
	public Postazione getStanza() {
		return Postazione.builder()
				.descrizione("Stanza base Hotel")
				.tipo(Tipo.PRIVATO)
				.edificio(getHotel())
				.numeroMassimoPartecipanti(3)
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Postazione getGiardino() {
		return Postazione.builder()
				.descrizione("Giardino")
				.tipo(Tipo.OPENSPACE)
				.edificio(getEdificio())
				.numeroMassimoPartecipanti(25)
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Prenotazione getPrenotazione() {
		return new Prenotazione();
	}
	
	@Bean
	@Scope("prototype")
	public Prenotazione getPrenotazioneUno() {
		return Prenotazione.builder()
				.utente(getGiovanni())
				.giorno(LocalDate.of(2022, 10, 29))
				.postazione(getStanza())
				.build();

				
	}
}
