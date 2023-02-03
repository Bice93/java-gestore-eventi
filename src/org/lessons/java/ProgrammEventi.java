package org.lessons.java;

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
	
	
}
