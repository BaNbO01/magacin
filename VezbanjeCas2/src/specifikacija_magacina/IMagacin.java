package specifikacija_magacina;

import model.Artikal;

public interface IMagacin {

	void dodajUMagacin(Artikal artikal);
	void izbaciIzMagacina(Artikal artikal);
	String VratiPodatkeOArtiklu(int sifra);
}
