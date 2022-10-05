package esercizio_1;

import java.util.Iterator;

public class esercizio1 {

	public static void main(String[] args) {
		myThread t1 = new myThread("#");
		myThread t2 = new myThread("*");
		
		Thread tr1 = new Thread(t1);
		Thread tr2 = new Thread(t2);
		
		tr1.start();
		tr2.start();
		

	}

}

class myThread implements Runnable{
	private static void print(Object a) {
		System.out.println(a);
	}
	
	String simbolo;
	
		
	public myThread(String simbolo) {
		
		this.simbolo=simbolo;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i<10; i++) {
			print(simbolo);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			}
	}
	
	
}
