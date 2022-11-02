package exception;


public class UtentePrenotazioneException extends Exception {

	public UtentePrenotazioneException() {
		super("Impossibile creare la prenotazione, in quella data la postazione è già occupata");
	}
}
