package dz24_01;

public class Tetrapak extends Ambalaza{

//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.
	
	private boolean reciklaza;
	private double osnovnaCena;
	
	
	public Tetrapak() {
		super();
		
	}
	
	


	public Tetrapak(String barkod, String artikl, double neto, double bruto, boolean reciklaza, double osnovnaCena) {
		super(barkod, artikl, neto, bruto);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}




	public boolean isReciklaza() {
		return reciklaza;
	}


	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}


	public double getOsnovnaCena() {
		return osnovnaCena;
	}


	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}


//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
	
	@Override
	public double cena() {
		double cena=0;
		if(this.reciklaza) {
			cena=super.tezina()*1.5+this.osnovnaCena;
		}else {
			cena=this.osnovnaCena;
		}
		return cena;
	}
	
	
//	metoda stampaj stampa sve podatke iz klase tetrapak.
	
	@Override
	public void print() {
		System.out.println("barkod: " + super.barkod);
		System.out.println("Naziv: " + super.artikl);
		System.out.println("Neto: " + super.neto);
		System.out.println("Bruto: " + super.bruto);
		System.out.println("Naziv: " + this.cena());
	}
	

}
