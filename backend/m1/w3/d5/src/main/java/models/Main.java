package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {
	
	private static final String persistName = "Esercizio_5_w3_d5"; 

	public static void main(String[] args) {
	
//		Per ricordarmi la struttura del codice.
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistName);
//		EntityManager em = emf.createEntityManager();
//		
//		em.close();
//		emf.close();
		
		//Interazione utente/database
		
		List<Collezione> ListaLibri = new ArrayList<>();
		
		int seleziona;
		int ISBN;
		
		Scanner perNumeri = new Scanner(System.in);
		Scanner perStringhe = new Scanner(System.in);
		
		System.out.println("Benvenuto nella nostra Biblioteca Interattiva\n");
		System.out.println("Seleziona una delle seguenti scelte: \n");
		do {
				System.out.println("1: Consegna un libro o rivista");
				System.out.println("2: Prendi in prestito un libro o rivista");
				System.out.println("3: Controlla la lista dei libri o riviste");
				System.out.println("4: Cerca per ISBN");
				System.out.println("5: Cerca per anno di pubblicazione");
				System.out.println("6: Cerca per autore\n");
				System.out.println("0: Esci dal portale");
				
				System.out.println("Inserisci il numero corrispondente");
				seleziona = perNumeri.nextInt();
				
				switch(seleziona) {
					
				case 0:					
					System.out.println("Grazie per averci scelti! Alla prossima");
					perNumeri.close();
					perStringhe.close();
					break;
					
				case 1:
					System.out.println("Inserisci il codice ISBN: ");
					int codiceISBN = perNumeri.nextInt();
					
					System.out.println("Inserisci il titolo: ");
					String titolo = perStringhe.nextLine();
					
					System.out.println("Inserisci l'anno di pubblicazione: ");
					int annoPubblicazione = perNumeri.nextInt();
					
					System.out.println("Inserisci il numero di pagine: ");
					int numeroPagine = perNumeri.nextInt();
					
					System.out.println("Inserisci l'autore: ");
					String autore = perStringhe.nextLine();
					
					System.out.println("Inserisci il genere: ");
					String genere = perStringhe.nextLine();
					
					ListaLibri.add(new Libro(codiceISBN, titolo, annoPubblicazione, numeroPagine, autore, genere ));
					break;
					
				case 2:
					System.out.println("Inserisci l'ISBN del libro che stai prendendo: ");
					ISBN = perNumeri.nextInt();
					
					break;
					
					
				case 3:
					
					
				case 4:					
					System.out.println("Inserisci l'ISBN del libro che stai cercando: ");
					codiceISBN = perNumeri.nextInt();
					
					break;
				case 5:					
					System.out.println("Inserisci l'anno di pubblicazione del libro che stai cercando: ");
					annoPubblicazione = perNumeri.nextInt();
					
					break;
					
				case 6:					
					
					System.out.println("Inserisci l'autore del libro che stai cercando: ");
					autore = perStringhe.nextLine();
					
					break;	
				}
			
		}
		while(seleziona != 0);
		
	}

}
