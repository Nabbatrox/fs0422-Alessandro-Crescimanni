package exception;

public class PostazionePrenotazioneException extends Exception {

	public PostazionePrenotazioneException() {
		super("Impossibile creare la prenotazione, in quella data la postazione è già occupata");
	}
}
