package esercizio3.classi;

public class IF {
	
	public static boolean stringaPariDispari(String x) {
			
		int lunghezzaStringa = x.length();
		
		
		if (lunghezzaStringa%2 == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		} 
	
	}
	
	public static boolean annoBisestile(int anno) {
		
		 
		 
		 if ((anno %4 == 0) || (anno % 100 == 0 && anno % 400 == 0)) {
			 
			 return true;
			 
		 }
			 
			 return false;
			 
		 
		 
		}
	
	}
		 	
		

