package dz10_01;

public class Proizvod {
//	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//	povecajCenu - koja kao parametar funkcije prima vrednost poveæanje za koju treba poveæati cenu. 
//	Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uraèuna popust.
//	Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//	racunajPostarinu - funkcije vraæa koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara,
//	a cena postarine se raèuna u zavisnosti od tezine:	
//	za tezinu do 100g, postarina iznosi 200din
//	za tezinu od 101g do 500g, postarina iznosi 400din
//	za tezinu preko 500g, postarina iznosi 1000din

	
	public String proizvod;
	public double cena;
	public double tezina;
	
	public void print() {
		System.out.println(this.proizvod+", "+this.cena+", "+this.tezina);
		
	}
	
	public double povecaj(double cenaP) {
		return this.cena=this.cena+cenaP;
	}
	
	public double popust(double cenaP) {
		double cenaSaP=0;
		if(cenaP>0 && cenaP<=100) {
			return cenaSaP=this.cena-this.cena*cenaP/100;
			}else {
				return cenaSaP;
			}
	}

	public int postarina() {
		if(this.tezina<100) {
			return 200;
			
		}else if(this.tezina>101 && this.tezina<=500) {
			return 400;
		}else {
			return 1000;
		}
	}
}
