package esercizio_2;

import java.util.ArrayList;
import java.util.Random;



public class esercizio2 {
	
	private static void print (Object a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
			ArrayList<Integer> res = new ArrayList<>();
			Random random = new Random();
			
			for(int i = 1; i <= 3000; i++) {
				res.add(i);
			}
			
			
			myThread t1 = new myThread(0,res);
			myThread t2 = new myThread(1000, res);
			myThread t3 = new myThread(2000, res);
			
			Thread tr1 = new Thread(t1,"primo");
			Thread tr2 = new Thread(t2,"secondo");
			Thread tr3 = new Thread(t3,"terzo");
			
			tr1.start();
			
			tr2.start();
		
			tr3.start();
			
			try {
				
				tr1.join();
				tr2.join();
				tr3.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			print(myThread.sommaTotale);
			
	}

}

class myThread implements Runnable{

	int inizio;
	int fine;
	ArrayList<Integer> numeri;
	int somma;
	static int sommaTotale;
	
	public myThread(int inizio, ArrayList<Integer> numeri) {
		this.inizio = inizio;
		this.numeri = numeri;
		this.fine =inizio+1000;
		
	}
	
	public int getSomma() {
		
		return somma;
		
	}
	
	private static void print (Object a) {
		System.out.println(a);
	}
	
	@Override
	public void run() {
        
        
        for(int i = inizio; i < this.fine; i++) {
            
            this.somma += numeri.get(i);
                
        }
        this.sommaTotale += somma;
        print("that's "+" "+Thread.currentThread().getName()+" "+ somma);
        print("--------------------------");
    }
	
}