package dz17_01;

import java.util.ArrayList;

public class Transakcija {

//	id transakcije
//	racun sa kog se prenose sredstva
//	racun na koji se prenose sredstva
//	gettere i settere
//	konstruktore

//	
//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//	Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//	a na drugi racun dodaje samo (trazena suma).
//	(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//	metodu koja stampa podatke o transakciji u formatu:
//	id transkacije
//	Racun sa: Ime i prezime  -  broj racuna
//	Racun na: Ime i prezime  -  broj racuna
	
	private String id;
	private Racun racunSa;
	private Racun racunNa;
	
	
	
public Transakcija(String id, Racun racunSa, Racun racunNa) {
		
		this.id = id;
		this.racunNa=racunNa;
		this.racunSa=racunSa;
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public Racun getRacunNa() {
		return racunNa;
	}


	public void setRacunNa(Racun racunNa) {
		this.racunNa = racunNa;
	}
	
	
	
	
//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//	ako je prenos sredstava manji od 4500, provizija je fiksna 45
//	ako je prenos sredstava veci od 4500, provizija je 1% 
//	S obzirom da se provizija racuna na osnovu visine transakcije, 
//	znaci da metoda prima parametar koji predstavlja visinu transakcije
	
	public Racun getRacunSa() {
		return racunSa;
	}


	public void setRacunSa(Racun racunSa) {
		this.racunSa = racunSa;
	}


	
	private int provizija(int prenos) {
		
		
		if(prenos<4500) {
			return 45;
		}else {
			return prenos*1/100;
		}
	}
	
	
//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//	Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//	a na drugi racun dodaje samo (trazena suma).
	
	public void transakcija(int prenos) {
		
			this.racunNa.promeniStanje(prenos);
			
		}
//	metodu koja stampa podatke o transakciji u formatu:
//	id transkacije
//	Racun sa: Ime i prezime  -  broj racuna
//	Racun na: Ime i prezime  -  broj racuna
	
	public void print() {
		System.out.println(this.id);
		System.out.println(this.racunNa.getOsoba() + " " + this.getRacunNa().getRacun());
		System.out.println(this.racunSa.getOsoba() + " " + this.getRacunSa().getRacun());
	}
	
	}

	
	
	
	
	


