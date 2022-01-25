package dz24_01;

public class z1 {

	public static void main(String[] args) {
//		U glavnom programu kreirati jednu 
//		Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
		
		Kartica sk = new Kartica("111", "stefan", 10);
		korpa k1= new korpa();
		Ambalaza a1 = new Tetrapak("8606123123521", "fanta", 100, 130, true, 100);
		Ambalaza a2 = new Tetrapak("8606123124444", "Kokta", 100, 130, true, 80);
		Ambalaza a3 = new Staklena("1231321", "niksicko", 1, 2, 150, true, 150);
		
		k1.dodaj(a1);
		k1.dodaj(a2);
		k1.dodaj(a3);
		a1.print();
		a2.print();
		a3.print();
		
		System.out.println(k1.cenaPopust(sk));
		
	}

}
