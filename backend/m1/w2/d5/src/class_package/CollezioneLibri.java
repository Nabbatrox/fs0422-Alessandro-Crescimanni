package class_package;

public class CollezioneLibri {
	
	public int codiceISBN;
	public String titolo;
	public int annoPubblicazione;
	public int numeroPagine;
	public String autore;
	public String genere;
	public Periodicita periodicita;
	
	
	public int getCodiceISBN(){
		
		return codiceISBN;
		
	}
	
	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	
	public String getAutore() {
		
		return autore;
	}
	@Override
	public String toString() {
		 return codiceISBN + " " + titolo + " " +
				annoPubblicazione + " " + numeroPagine + " " +
				autore +" " + genere;}
	
	

}
