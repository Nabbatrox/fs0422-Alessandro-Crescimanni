package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "collezione") 
public class Collezione {
	
	@Id
	private int codiceISBN;
	
	private String titolo;
	private int annoPubblicazione;
	private int numeroPagine;
	
	@ManyToOne
	private Libro libro;
	
	@ManyToOne
	private Rivista rivista;
	
	public Collezione() {
	}
	
	public Collezione(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine) {
		super();
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;	
	}
	
	public int getCodiceISBN() {
		return codiceISBN;
	}
	public void setCodiceISBN(int codiceISBN) {
		this.codiceISBN = codiceISBN;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}


}
