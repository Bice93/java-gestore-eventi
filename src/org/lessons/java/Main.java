package org.lessons.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Si chiede all’utente di inserire un nuovo evento con tutti i parametri.
		System.out.println("Inserisci il tuo Evento!\nInserisci il nome dell'evento: ");
		String titolo = s.nextLine();
		
		System.out.println("Inserisci la data dell'evento(dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(s.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		
		System.out.println("Inserisci il numero totale dei posti disponibili per l'evento: ");
		int numeroPostiTotale = Integer.parseInt(s.nextLine());
		
		Evento evento = null;
		try {
			evento = new Evento(titolo, data, numeroPostiTotale);
		} catch (Exception e) {
			System.out.println("Non è possibile inserire l'evento! " + e.getMessage());
		} finally {
			s.close();
		}
		
		System.out.println(evento.toString());
		
		
		

	}

}
