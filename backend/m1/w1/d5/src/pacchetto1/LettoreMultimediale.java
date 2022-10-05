package pacchetto1;

import java.util.Scanner;

import pacchetto2.Audio;
import pacchetto2.ElementoMultimediale;
import pacchetto2.Immagine;
import pacchetto2.Video;

		// Fare riferimento alla classe Video per i commenti generali

public class LettoreMultimediale {

	public static void main(String[] args) {

		//istanze test classi
		
		Video v1 = new Video("Pulp Fiction", 4, 2, 4);
		Video v2 = new Video("V per Vendetta", 5, 1, 2);
		Video v3 = new Video("Una Notte Da Leoni", 6, 2, 5);
		
		Audio a1 = new Audio("Queen - Bohemian Rapsody", 3, 4);
		Audio a2 = new Audio("Lorn - Transmute", 1, 1);
		Audio a3 = new Audio("Polyphia - Ego Death", 3, 3);
		
		Immagine i1 = new Immagine("Leonardo Da Vinci - Gioconda", 4);
		Immagine i2 = new Immagine("Vincent Van Gogh - Notte Stellata", 2);
		Immagine i3 = new Immagine("Gustav Klimt - Il Bacio", 3);
		
		
		ElementoMultimediale[] arr = {a1, a2, i1, i2, v2};

		System.out.println("Quale elemento vuoi riprodurre?");
		Scanner player = new Scanner(System.in);		
		int input = player.nextInt();
			
		ElementoMultimediale e = arr[input -1];
		
		if (e instanceof Immagine) {
			
			((Immagine)e).show();
			
		}else if (e instanceof Audio){
			
			((Audio)e).play();
			
		}else {
			
			((Video)e).play();
			
		}
					
		player.close();
	}	

}
