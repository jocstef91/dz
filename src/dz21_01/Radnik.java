package dz21_01;

import java.util.ArrayList;

public abstract class Radnik {
//	 ime i prezime
//	 niz sektora u kojima radi
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	protected String imeRadnika;
	protected ArrayList<Sektor> sektor = new ArrayList<Sektor>();
	
	
	
	
	public Radnik(String imeRadnika) {
		this.imeRadnika = imeRadnika;
	}
	
	

	public String getImeRadnika() {
		return imeRadnika;
	}



	public void setImeRadnika(String imeRadnika) {
		this.imeRadnika = imeRadnika;
	}



	public ArrayList<Sektor> getSektor() {
		return sektor;
	}



	public void setSektor(ArrayList<Sektor> sektor) {
		this.sektor = sektor;
	}



	public abstract double plata();
	
	public void zaposli(Sektor sektor) {
		this.sektor.add(sektor);
	}
}
