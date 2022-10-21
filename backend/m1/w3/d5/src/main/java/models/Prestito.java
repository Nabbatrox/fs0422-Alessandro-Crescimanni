package models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Prestito {
	@Id
	private long id;
	
	@ManyToOne
	private Utente utente;
	
	@ManyToOne
	private Collezione collezione;
	
	private LocalDate dateRes;
	private LocalDate startTempoPrestito;
	private LocalDate endTempoPrestito;

}
