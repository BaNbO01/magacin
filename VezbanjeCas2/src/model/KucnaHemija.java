package model;

import java.time.LocalDate;

public class KucnaHemija extends Artikal {

	private LocalDate rokTrajanja;
		
	

	public KucnaHemija() {

	}

	public KucnaHemija(int sifra, String naziv, String opis, int kolicina) {
		super(sifra, naziv, opis, kolicina);
	}
	
	public LocalDate getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(LocalDate rokTrajanja) {
		if(rokTrajanja==null)
			throw new NullPointerException("Rok ne sme biti null");
		if(rokTrajanja.isBefore(LocalDate.now()))
			throw new IllegalArgumentException("Rok trajanja mora biti posle sadasnjeg trenutka");
		this.rokTrajanja = rokTrajanja;
	}
}
