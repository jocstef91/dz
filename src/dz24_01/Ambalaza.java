package dz24_01;

public abstract class Ambalaza {
//	Kreirati abstraktnu klasu Ambalaza koja ima:
//		barkod (primer: 328232-2823)
//		naziv artikla
//		neto tezinu
//		bruto tezinu
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere
//		metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//		abstraktnu metodu koja vraca cenu artikla
//		abstraktnu metodu stampaj

	protected String barkod;
	protected String artikl;
	protected double neto;
	protected double bruto;
	
	public Ambalaza() {
		
	}

	public Ambalaza(String barkod, String artikl, double neto, double bruto) {
		
		this.barkod = barkod;
		this.artikl = artikl;
		this.neto = neto;
		this.bruto = bruto;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getArtikl() {
		return artikl;
	}

	public void setArtikl(String artikl) {
		this.artikl = artikl;
	}

	public double getNeto() {
		return neto;
	}

	public void setNeto(double neto) {
		this.neto = neto;
	}

	public double getBruto() {
		return bruto;
	}

	public void setBruto(double bruto) {
		this.bruto = bruto;
	}
	
	public double tezina() {
		double tezina=this.bruto-this.neto;
		return tezina;
	}
	
	public abstract double cena();
	
	public abstract void print();
}
