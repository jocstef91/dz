package dz10_01;

public class FacebookPost {
//	3..Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
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
//
//
//		Primer stampanja:
//		Milan Jovanovic >>> Pera Peric
//		Ovo je tekst objave
//		Likes 3 | Shares 1
	
	public String objavio;
	public String objavljenoNa;
	public String tekst;
	public int brLajkova;
	public int brDeljenja;
	
	public int like() {
		return this.brLajkova++;
	}
	
	public int dislike() {
		return this.brLajkova--;
	}
	
	public int share() {
		return this.brDeljenja++;
	}
	
	public void print() {
		System.out.println(this.objavio + ">>>" + this.objavljenoNa);
		System.out.println(this.tekst);
		System.out.println("Likes" + this.brLajkova + "| Shares " + this.brDeljenja);
	}
}
