package models;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Rivista extends Collezione {
	
	private Periodicita periodicita;
	
	public Rivista() {};
	
	
	public Rivista(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		// TODO Auto-generated constructor stub
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	
}
