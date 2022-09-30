package pacchetto2;

import interfaces.luminosita;
import interfaces.volume;
// estendo le classi alla superclasse ElementoMultimediale per creare un array di istanze delle classi, poi implemento le interfacce per usufruire dei metodi
public class Video extends ElementoMultimediale implements volume, luminosita {
	
		public String titolo;
		public int durata;
		public int lum;
		public int vol;
		
		
		public Video(String _titolo, int _durata, int _l, int _v) {
			titolo = _titolo;
			durata = _durata;
			lum = _l;
			vol = _v;
			
			
		}
		// cicla gli elementi per la durata dell'oggetto istanziato. Stampa in console.
		
		public void play() {
			
		for (int i=0; i < durata; i++)
		{
				
		System.out.println("In esecuzione: " + titolo + inEsclamativi() + inAsterischi());

			}		
		}
		
		// cicla per il valore numerico delle proprieta vol e lum e genera il simbolo corrispondete. 
		
		@Override
		public String inAsterischi() {
		    StringBuilder temp = new StringBuilder();
		    for(int i=0;i<lum;i++) {
		        temp.append("*");
		    }
		    return temp.toString();
		}
		@Override
		public String inEsclamativi() {
		    StringBuilder temp = new StringBuilder();
		    for(int i=0;i<vol;i++) {
		        temp.append("!");
		    }
		    return temp.toString();
		}
		
		// metodi che controllano e poi manipolano il valore numerico e, quindi, stringa, delle proprieta' dell'istanza della classe vol e lum.
		
		@Override
		public int aumentaLuminosita() {
			
			switch(lum) {
			
			case 0:
				lum++;
				System.out.printf("*");
			break;
			case 1:
				lum++;
				System.out.printf("**");
			break;	
			case 2:
				lum++;
				System.out.printf("***");
			break;	
			case 3:
				lum++;
				System.out.printf("****");
			break;	
			case 4:
				lum++;
				System.out.printf("*****");
			break;
			}
			
			return lum;
		}

		@Override
		public int diminuisciLuminosita() {
			
			switch(lum) {
			
			case 5:
				lum--;
				System.out.printf("****");
			break;
			case 4:
				lum--;
				System.out.printf("***");
			break;	
			case 3:
				lum++;
				System.out.printf("**");
			break;	
			case 2:
				lum++;
				System.out.printf("*");
			break;	
			case 1:
				lum++;
				System.out.printf("");
			break;
			}
			
			return lum;
		}


		@Override
		public int aumentaVolume() {
			
			switch(vol) {
			
			case 0:
				vol++;
				System.out.printf("!");
			break;
			case 1:
				vol++;
				System.out.printf("!!");
			break;	
			case 2:
				vol++;
				System.out.printf("!!!");
			break;	
			case 3:
				vol++;
				System.out.printf("!!!!");
			break;	
			case 4:
				vol++;
				System.out.printf("!!!!!");
			break;
			}
			
			return vol;

		}

		@Override
		public int diminuisciVolume() {
			
			switch(vol) {
			
			case 5:
				vol--;
				System.out.printf("!!!!");
			break;
			case 4:
				vol--;
				System.out.printf("!!!");
			break;	
			case 3:
				vol--;
				System.out.printf("!!");
			break;	
			case 2:
				vol--;
				System.out.printf("!");
			break;	
			case 1:
				vol--;
				System.out.printf("");
			break;
			}
			
			return vol;

		}
		


		
	
}
