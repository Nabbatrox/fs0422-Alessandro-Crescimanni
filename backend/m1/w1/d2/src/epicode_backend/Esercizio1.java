package epicode_backend;

import java.util.Arrays;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim s1 = new Sim("3389233516", 46);
		s1.printSim();
		
	}
	
	
	

}
	class Sim {
		
		
		String phoneNumber;
		int credito;
		int[] listaChiamate = {};
		int costoChiamata;
		
		Sim(String _phoneNumber, int _credito){
						
			this.phoneNumber  = _phoneNumber;
			this.credito = _credito;
				
		}
		
		public void printSim() {
			 System.out.printf(this.phoneNumber);
			 System.out.print(this.credito);
		}
		
	}
	
	class Chiamata {
		
		double durataCall;
		String numCalled;
		
		Chiamata(double _durataCall, String _numCalled){
			this.durataCall = _durataCall;
			this.numCalled = _numCalled;
			
		}
		

		
	}
	