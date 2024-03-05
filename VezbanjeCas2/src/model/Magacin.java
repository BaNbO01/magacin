package model;

import java.util.ArrayList;
import java.util.List;

import specifikacija_magacina.IMagacin;

public class Magacin implements IMagacin{

	List<Artikal> listaArtikla = new ArrayList<>();

	@Override
	public void dodajUMagacin(Artikal artikal) {
		if(artikal==null)
			throw new NullPointerException("Artikal ne sme biti null");
		
		if(artikal.getSifra()<=0)
			throw new IllegalArgumentException("Sifra artikla mora biti pozitivan broj");
		
		
		if(artikal.getKolicina()<=0)
			throw new IllegalArgumentException("Artikal ne moze imati negativnu kolicinu");
		
		
		if(!listaArtikla.contains(artikal))
			listaArtikla.add(artikal);
		else
		{
			for(Artikal a:listaArtikla) {
				if(a.equals(artikal))
					a.setKolicina(a.getKolicina()+artikal.getKolicina());
				return;
			}
		}
		

		
	}

	@Override
	public void izbaciIzMagacina(Artikal artikal) {
		if(artikal==null)
			new NullPointerException("Artikal ne sme biti null");
		
		if(artikal.getSifra()<=0)
			throw new IllegalArgumentException("Sifra artikla mora biti pozitivan broj");
		
		for(Artikal a:listaArtikla) {
			if(a.equals(artikal)) {
				if(a.getKolicina()-artikal.getKolicina()<=0)
					throw new IllegalArgumentException("Ne moze kolicina da spadne na negativan broj");
				
				a.setKolicina(a.getKolicina()-artikal.getKolicina());
			}
				
				
		}
		
	}

	@Override
	public String VratiPodatkeOArtiklu(int sifra) {
		if(sifra<=0)
			throw new IllegalArgumentException("Sifra mora biti pozitivan broj");
		for(Artikal a:listaArtikla) {
			if(a.getSifra()==sifra) {
				return a.toString();
			}
		}
		throw new IllegalArgumentException("Ne postoji nijedan artikal");
	}	
	
}
