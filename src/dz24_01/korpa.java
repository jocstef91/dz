package dz24_01;

import java.util.ArrayList;

public class korpa {

//	Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), 
//		kao parametar funkcije se prima Super karticu iz koje se cita popust.

	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public korpa() {
		
	}

	public void dodaj(Ambalaza ambalaza) {
		this.ambalaze.add(ambalaza);
	}
	
	public void izbaci(String barkod) {
		for (int i = 0; i < this.ambalaze.size() ; i++) {
			if(this.ambalaze.get(i).getBarkod().equals(barkod)) {
				this.ambalaze.remove(i);
			}
		}
	}
	
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
	
	private double cenaSaPopustom(int popust) {
		double cena=0;
		for (int i = 0; i < this.ambalaze.size() ; i++) {
			cena=this.ambalaze.get(i).cena()+cena;
		}
		return cena-popust;
	}
		
}
