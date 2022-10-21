package models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Utente {
	
	@Id
	@SequenceGenerator(name="utente_seq", sequenceName="utente_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="utente_seq")
	private Long id;
	
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private long numeroTessera;
	
	public Utente() {};
	public Utente(String nome, String cognome,LocalDate dataNascita, long numeroTessera) {
		this.nome = nome;
		this.cognome = cognome;
		this.LocalDate = dataNascita;
		this.numeroTessera = numeroTessera;
	}
	
	

}
