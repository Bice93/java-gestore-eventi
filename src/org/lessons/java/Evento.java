package org.lessons.java;

import java.time.LocalDate;

public class Evento {
	// proprietà:
	private String titolo;
	private LocalDate data;
	private int numeroPostiTotale;
	private int numeroPostiPrenotati;
	
	// gli attributi devono essere tutti valorizzati nel costruttore , tranne posti prenotati che va inizializzato a 0
	public Evento(String titolo, LocalDate data, int numeroPostiToatle) throws Exception {
		
		
		setTitolo(titolo);
		setData(data);
		
		// Inserire il controllo che il numero di posti totali sia positivo.
		if (numeroPostiToatle < 0) {
			throw new Exception("Il numero di posti totali deve essere maggiore di 0!");
		}
		this.numeroPostiTotale = numeroPostiToatle;
		this.numeroPostiPrenotati = 0;
	}
	
	// Aggiungere metodi getter e setter
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) throws Exception {
		// Inserire il controllo che la data non sia già passata 
		LocalDate now = LocalDate.now();
		if (data.isBefore(now)) {
			throw new Exception("La data inserita è errata!");
		}
		this.data = data;
	}

	public int getNumeroPostiTotale() {
		return numeroPostiTotale;
	}

	public int getNumeroPostiPrenotati() {
		return numeroPostiPrenotati;
	}
	
	
}
