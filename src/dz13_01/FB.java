package dz13_01;

public class FB {
	
//	Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		  Od gettera i settera:
//		korisnik moze da procita bilo koji atribut 
//		ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove atribute)
//		 Konstruktore:
//			konstruktori koji su potrebni i logicni
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
	
	private String ime;
	private String prezime;
	private String PIme;
	private String PPrezime;
	private String post;
	private int brLike;
	private int brShare;
	
	FB(){
		
	}
	
	FB(String ime, String prezime, String pime, String pprezime,String objava){
		this.ime=ime;
		this.prezime=prezime;
		this.PIme=pime;
		this.PPrezime=pprezime;
		this.post=objava;
		
	}
	
	public void setIme(String ime) {
		this.ime=ime;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public void setPIme(String pime) {
		this.PIme=pime;
	}
	
	public String getPIme() {
		return this.PIme;
	}
	
	public void setPrezime(String prezime) {
		this.prezime=prezime;
	}
	
	public String getPrezime() {
		return this.prezime;
	}
	
	public void setPPrezime(String pprezime) {
		this.PPrezime=pprezime;
	}
	
	public String getPPrezime() {
		return this.PPrezime;
	}
	
	public int getLike() {
		return this.brLike;
	}
	
	public int getShare() {
		return this.brShare;
	}
	
	public void like() {
		this.brLike++;
	}
	
	public void share() {
		this.brShare++;
	}
	
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
	
	public void print() {
		System.out.println(this.ime + " " + this.prezime + ">>>" + this.PIme + " " + this.PPrezime );
		System.out.println(this.post);
		System.out.println("Likes " + this.brLike + "|" + "Shares " + this.brShare);
		
	}
}
