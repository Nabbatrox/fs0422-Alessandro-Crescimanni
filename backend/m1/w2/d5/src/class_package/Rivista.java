package class_package;

public class Rivista extends CollezioneLibri{
	
	public Rivista(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
		this.periodicita = periodicita;
	}
	
	
		
		
	public static Rivista addRivistaSettimanale(int codiceISBN, String title, int pubDate, int pageNum) {
		
		return new Rivista(codiceISBN, title, pubDate, pageNum, Periodicita.SETTIMANALE);	
	}
	
	public static Rivista addRivistaMensile(int codiceISBN, String title, int pubDate, int pageNum) {
		
		return new Rivista(codiceISBN, title, pubDate, pageNum, Periodicita.MENSILE);
	}
	
	public static Rivista addRivistaSemestrale(int codiceISBN, String title, int pubDate, int pageNum) {
		
		return new Rivista(codiceISBN, title, pubDate, pageNum, Periodicita.SEMESTRALE);
	}




}
