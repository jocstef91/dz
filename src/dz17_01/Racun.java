package dz17_01;

public class Racun {
//	broj racuna (npr: 170-289328923-23)
//	ime i prezime osobe
//	trenutno stanje na racunu (npr: 100, 1220)
//	gettere i setter za sve atribute, sem settera za stanje na racunu
//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	private String racun;
	private String osoba;
	private int stanje;
	
	public Racun() {

	}

	public Racun(String racun, String osoba, int stanje) {
		super();
		this.racun = racun;
		this.osoba = osoba;
		this.stanje = stanje;
	}

	public String getRacun() {
		return racun;
	}

	public void setRacun(String racun) {
		this.racun = racun;
	}

	public String getOsoba() {
		return osoba;
	}

	public void setOsoba(String osoba) {
		this.osoba = osoba;
	}

	public int getStanje() {
		return stanje;
	}

	public void setStanje(int stanje) {
		this.stanje = stanje;
	}
	
	public void promeniStanje(int x) {
		if((this.stanje-x)>0) {
			this.stanje=this.stanje+x;
		}
	}
	
	public void print() {
		System.out.println(this.osoba + " " + this.racun);
		System.out.println(this.racun);
	}
	

}
