package dz10_01;

public class Proizvod {
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
	
	String proizvod;
	double cena;
	double tezina;
	
	public void print() {
		System.out.println(this.proizvod+", "+this.cena+", "+this.tezina);
	}

}
