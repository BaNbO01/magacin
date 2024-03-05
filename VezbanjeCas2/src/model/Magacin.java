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
		
		if(artikal.getKolicina()<=0)
			throw new IllegalArgumentException("Artikal ne moze imati negativnu kolicinu");
		
		if(listaArtikla.contains(artikal))
		{
			for(Artikal art:listaArtikla) {
				if(art.equals(artikal)) {
					art.setKolicina(art.getKolicina()+artikal.getKolicina());
				}
			}
		}
		else {
			listaArtikla.add(artikal);
		}
		
	}

	@Override
	public void izbaciIzMagacina(Artikal artikal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String VratiPodatkeOArtiklu(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
