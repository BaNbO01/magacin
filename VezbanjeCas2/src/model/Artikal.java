package model;

public abstract class Artikal {

	private int sifra;
	private String naziv;
	private String opis;
	private int kolicina;
	
	public Artikal() {
		
	}
	
	public Artikal(int sifra, String naziv, String opis, int kolicina) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.opis = opis;
		this.kolicina = kolicina;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	
	
	
}
