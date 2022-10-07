package main_package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import class_package.CollezioneLibri;
import class_package.Libro;


public class Biblioteca {
	
	public static void main(String[] args) {
		
		List<CollezioneLibri> ListaLibri = new ArrayList<>();
		int seleziona;
		int ISBN;
		boolean disponibile = false;
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
					Iterator<CollezioneLibri> iterator1 = ListaLibri.iterator();
					while(iterator1.hasNext()) {
						CollezioneLibri e = iterator1.next();
						if (e.getCodiceISBN() == ISBN);
						iterator1.remove();
						disponibile = true;
						System.out.println("il libro e' stato rimosso dallo scaffale");
					}
					if (!disponibile) {
						
						System.out.println("Il libro che hai cercato non e' stato trovato.");
					}
					break;
					
					
				case 3:
					
					Iterator<CollezioneLibri> iterator2 = ListaLibri.iterator();
					while(iterator2.hasNext()) {
						CollezioneLibri e = iterator2.next();
						System.out.println(e);
					}
				case 4:					
					System.out.println("Inserisci l'ISBN del libro che stai cercando: ");
					codiceISBN = perNumeri.nextInt();
					Stream<CollezioneLibri> s1 = ListaLibri.stream();
					List<CollezioneLibri> l1 = ListaLibri.stream()
							.filter(c -> c.getCodiceISBN() == codiceISBN)
							.collect(Collectors.toList());
					break;
				case 5:					
					System.out.println("Inserisci l'anno di pubblicazione del libro che stai cercando: ");
					annoPubblicazione = perNumeri.nextInt();
					Stream<CollezioneLibri> s2 = ListaLibri.stream();
					List<CollezioneLibri> l2 = ListaLibri.stream()
							.filter(c -> c.getAnnoPubblicazione() == annoPubblicazione)
							.collect(Collectors.toList());
					break;
					
				case 6:					
					disponibile = false;
					System.out.println("Inserisci l'autore del libro che stai cercando: ");
					autore = perStringhe.nextLine();
					Iterator<CollezioneLibri> iterator4 = ListaLibri.iterator();
					while(iterator4.hasNext()) {
						CollezioneLibri e = iterator4.next();
						if (e.getAutore() == autore);
						System.out.println(e);
						disponibile = true;
					}
					
					if (!disponibile) {
						
						System.out.println("Il libro che hai cercato non e' stato trovato.");
					}
					break;	
				}
			
		}
		while(seleziona != 0);

	
	
	}	

}
