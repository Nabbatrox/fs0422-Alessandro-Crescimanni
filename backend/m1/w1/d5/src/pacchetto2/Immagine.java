package pacchetto2;

import interfaces.luminosita;

public class Immagine extends ElementoMultimediale implements luminosita {
	
	public String titolo;
	public int lum;
	
	
	public Immagine(String _titolo, int _l) {
		titolo = _titolo;
		lum = _l;

		
		
	}
	
	public void show() {
		
		System.out.print(titolo);
		for(int i = 0; i < lum; i++) {
			
			System.out.print("*");
			
		}
		
	};
	
	@Override
	public String inAsterischi() {
	    StringBuilder temp = new StringBuilder();
	    for(int i=0;i<lum;i++) {
	        temp.append("*");
	    }
	    return temp.toString();
	}

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

}
