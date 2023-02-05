package org.lessons.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class ProgrammEventi {
	/*
	 * Creare una classe ProgrammEventi con i seguenti attributi
	 */
	private String titolo;
	private List<Evento> eventi;
	
	//Nel costruttore valorizzare il titolo, passato come parametro, e inizializzare la lista di eventi come una nuova ArrayList
	public ProgrammEventi(String titolo) {

		this.titolo = titolo;
		this.eventi = new ArrayList<>();
	}
	
	/*
	 * 	Aggiungere i seguenti metodi :
		● un metodo che aggiunge alla lista un Evento, passato come parametro
	 */
	public void addList(Evento evento) {
		eventi.add(evento);
	}
	
	/*
	 * ● un metodo che restituisce una lista con tutti gli eventi presenti in una certa data
	 */
	public List<Evento> getEventiData(LocalDate data) {
		List<Evento> eventiData = new ArrayList<>();
		
		for (Evento evento : eventi) {
		int c = evento.getData().compareTo(data);	
			if(c == 0) {
				eventiData.add(evento);
			}
		}
		return eventiData;
	}
	
	/*
	 * ● un metodo che restituisce quanti eventi sono presenti nel programma
	 */
	public int numeroEventi() {
		return eventi.size();
	}
	
	/*
	 * ● un metodo che svuota la lista di eventi
	 */
	public void svuotaEventi() {
		eventi.clear();
	}
	
	/*
	 * 	● un metodo che restituisce una stringa che mostra il titolo del programma e tutti gli
		eventi ordinati per data nella forma:
		○ data1 - titolo1
		○ data2 - titolo2
		○ data3 - titolo3
	 */
	public String toStringProgramm() {
		DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.ITALIAN);
		Collections.sort(eventi, new CompareEventDate());
		String listString = "Programma: " + titolo + "\nEventi presenti: " + numeroEventi() + "\n";

		for (Evento evento : eventi) {
			listString += "- " + evento.getData().format(formattedDate) + " - " + evento.getTitolo() + "\n";
		}
		
		return listString;	
	}
	
}

