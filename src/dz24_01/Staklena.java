package dz24_01;

public class Staklena extends Ambalaza{

//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.
	private double cenaKaucije;
	private boolean kaucija;
	private double osnovnaCena;
	
	public Staklena() {
		super();
		
	}

	public Staklena(String barkod, String artikl, double neto, double bruto, double cena, boolean kaucja, double osnovna) {
		super(barkod, artikl, neto, bruto);
		this.cenaKaucije=cena;
		this.kaucija=kaucja;
		this.osnovnaCena=osnovna;
		
	}

	public double getCenaKaucije() {
		return cenaKaucije;
	}

	public void setCenaKaucije(double cenaKaucije) {
		this.cenaKaucije = cenaKaucije;
	}

	public boolean isKaucija() {
		return kaucija;
	}

	public void setKaucija(boolean kaucija) {
		this.kaucija = kaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
	
	@Override
	public double cena() {
		if(this.kaucija) {
			return this.osnovnaCena*1.2 + this.cenaKaucije;
		}else {
			return this.osnovnaCena*1.2;
		}
	}
	
	@Override
	public void print() {
		System.out.println("barkod: " + super.barkod);
		System.out.println("Naziv: " + super.artikl);
		System.out.println("Neto: " + super.neto);
		System.out.println("Bruto: " + super.bruto);
		System.out.println("Cena: " + this.cena());
	}

	
}
