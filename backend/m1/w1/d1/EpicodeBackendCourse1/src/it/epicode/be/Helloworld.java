package it.epicode.be;
import java.util.Arrays;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		
		int a = moltiplica(10, 5);
		System.out.println(a);
		
		String b = concatena("Ciao a tutti, sono Alessandro ed ho ", 28);
		System.out.println(b);
		
		String c = Arrays.toString(inserisciInArray("prosciutto "));
		System.out.println("ingredienti per la pizza: " + c);
		
		int e = perimetroRettangolo(6, 8);
		System.out.println("il perimetro del rettangolo e'" + e);
		
		String f = pariDispari(46);
		System.out.println("Il numero e' " + f);
		
		double g = areaTriangolo(35, 25, 25 );
		System.out.println("L'area del triangolo e'" + g);
		
		}
		
		public static int moltiplica(int x, int y) {
		return x * y;
		}
		
		public static String concatena( String s1, int s2 ) {
		return s1 + s2 + " anni";
		}
		
		public static String[] inserisciInArray (String x) {
		String arr[] = new String[5];
		arr[0] = "pasta ";
		arr[1] = "pomodoro ";
		arr[2] = "basilico ";
		arr[3] = "olio ";
		arr[4] = "mozzarella ";
				
		String[] toPrint = {arr[0] + arr[1] + arr[2] + x + arr[3] + arr[4]};		
		
		return toPrint;
					
		}
		
		public static int perimetroRettangolo(int latoA, int latoB) {
			
			return (latoA + latoB)*2;
		}
		
		public static String pariDispari(int x) {
			
			return (x%2 == 0) ? "pari" : "dispari";
			
		}
		
		public static double areaTriangolo (double a, double b, double c) {
			
			double semiPerimetro = (a + b + c)/2;
			
			return Math.sqrt(semiPerimetro*(semiPerimetro - a)*(semiPerimetro - b)*(semiPerimetro - c));
			
			// Su wikipedia ho trovato una sezione che parla di formula specifica per la stabilita' numerica.
			// Sara' per questo che con alcuni numeri ricevo NaN o 0.0? a>=b>=c
		}
}



