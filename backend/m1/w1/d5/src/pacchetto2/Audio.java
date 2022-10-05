package pacchetto2;

import interfaces.volume;

public class Audio extends ElementoMultimediale implements volume {
	
	public String titolo;
	public int durata;
	public int vol;
	
	public Audio(String _titolo,int _durata, int _v) {
		
		durata = _durata;
		titolo = _titolo;
		vol = _v;
		
	}
	public void play() {
		
		for (int i=0; i < durata; i++) {
			
		System.out.println(titolo + inEsclamativi());
		
		}

		
	}

	@Override
	public int aumentaVolume(int vol) {
		
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
	public int diminuisciVolume(int vol) {
		
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
	@Override
	public String inEsclamativi() {
	    StringBuilder temp = new StringBuilder();
	    for(int i=0;i<vol;i++) {
	        temp.append("!");
	    }
	    return temp.toString();
	}

}
