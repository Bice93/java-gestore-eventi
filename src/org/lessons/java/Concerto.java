package org.lessons.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{
	// attributi
	LocalTime ora;
	BigDecimal prezzo;
	
	public Concerto(String titolo, LocalDate data, int numeroPostiToatle, LocalTime ora, BigDecimal prezzo) throws Exception {
		super(titolo, data, numeroPostiToatle);
		// TODO Auto-generated constructor stub
		setOra(ora);
		setPrezzo(prezzo);
		
	}

	// implementare getter e setter
	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	

}
