package dz20_01;

public class Osoba {

//	Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
	
	protected String osoba;
	protected String jmbg;
	protected int god;
	public Osoba() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Osoba(String osoba, String jmbg, int god) {
		super();
		this.osoba = osoba;
		this.jmbg = jmbg;
		this.god = god;
	}
	public String getOsoba() {
		return osoba;
	}
	public void setOsoba(String osoba) {
		this.osoba = osoba;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public int getGod() {
		return god;
	}
	public void setGod(int god) {
		this.god = god;
	}
	
	public void print() {
		System.out.println(this.osoba + " "+this.jmbg+" " + this.god);
	}

}
