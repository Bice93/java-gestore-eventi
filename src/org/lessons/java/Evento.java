package org.lessons.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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
		if (numeroPostiToatle <= 0) {
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
	
	/*
	 * 	Vanno inoltre implementati dei metodi public che svolgono le seguenti funzioni:
		1. prenota : aggiunge uno ai posti prenotati. Se l’evento è già passato o non ha posti
		disponibili deve sollevare un’eccezione.	
	 */
	public void prenota() throws Exception {
		if( (data.isBefore(LocalDate.now()) ) || (numeroPostiPrenotati == numeroPostiTotale) ) {
			throw new Exception("Non è più possibile prenotare per questo evento!");
		}
		numeroPostiTotale--;
		numeroPostiPrenotati++;
	}
	
	/*
	 * 	2. disdici : riduce di uno i posti prenotati. Se l’evento è già passato o non ci sono
		prenotazioni deve sollevare un’eccezione
	 */
	public void disdici() throws Exception {
		if( (data.isBefore(LocalDate.now()) ) || (numeroPostiPrenotati == 0) ) {
			throw new Exception("Non è più possibile disdire per questo evento!");
		}
		numeroPostiTotale++;
		numeroPostiPrenotati--;
	}
	
	/*
	 * 3. l’override del metodo toString() in modo che venga restituita una stringa
		contenente: data formattata - titolo
	 */
	
	DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.ITALIAN);
	
	@Override
	public String toString() {
		return "Evento: [ Data: " + data.format(formattedDate) + " - Titolo: " + titolo + " ]";
	}
	
		
	
}
