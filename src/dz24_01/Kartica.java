package dz24_01;

public class Kartica {
//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)
	
	private String brojKartice;
	private String ime;
	private int popust;
	
	
	
	public Kartica() {
		
	}



	public Kartica(String brojKartice, String ime, int popust) {
		
		this.brojKartice = brojKartice;
		this.ime = ime;
		this.popust = popust;
	}



	public String getBrojKartice() {
		return brojKartice;
	}



	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}



	public String getIme() {
		return ime;
	}



	public void setIme(String ime) {
		this.ime = ime;
	}



	public int getPopust() {
		return popust;
	}



	public void setPopust(int popust) {
		this.popust = popust;
	}
	
	public void print() {
		System.out.println("Kartica: " + this.brojKartice);
		System.out.println("Vlasnik: " + this.ime);
		
	}
	

}
