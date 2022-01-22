package dz20_01;

public class Trener extends Osoba{

//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

	private int iskustvo;
	private String tipTrenera;
	public Trener() {
		super();
		
	}
	public Trener(String osoba, String jmbg, int god, int isk, String tip) {
		super(osoba, jmbg, god);
		this.iskustvo=isk;
		this.tipTrenera=tip;
	}
	public int getIskustvo() {
		return iskustvo;
	}
	public void setIskustvo(int iskustvo) {
		this.iskustvo = iskustvo;
	}
	public String getTipTrenera() {
		return tipTrenera;
	}
	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}
	
	public void print() {
		System.out.println("Trener: ");
		super.print();
		System.out.println("God iskustva: " + this.iskustvo + " Tip trenera: " +this.iskustvo);
	}
	
	
}
