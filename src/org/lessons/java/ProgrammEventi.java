package org.lessons.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
	public List getEventiData(LocalDate data) {
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
	
	
}
