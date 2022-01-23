package dz21_01;

public class Sektor {
//	Zadatak  
//	Kreirati klasu Sektor koja ima:
//	 naziv sektora
//	 platu koja je za taj sektor
	
	protected String sektor;
	protected int plata;
	
	public Sektor() {
	}
	public Sektor(String sektor, int plata) {
		this.sektor = sektor;
		this.plata = plata;
	}
	public String getSektor() {
		return sektor;
	}
	public void setSektor(String sektor) {
		this.sektor = sektor;
	}
	public int getPlata() {
		return plata;
	}
	public void setPlata(int plata) {
		this.plata = plata;
	}
	
	

}
