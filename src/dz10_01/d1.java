package dz10_01;

public class d1 {

	public static void main(String[] args) {
		
		
		
		Proizvod p1 = new Proizvod();
		
		p1.cena=230.15;
		p1.proizvod="Milka";
		p1.tezina=200;
		p1.print();
		
		p1.povecaj(10.0);
		System.out.println("Cena nakon povecanja od 10 je: " + p1.cena);
		
		System.out.println("Cena sa primenjenim popustom je: " + p1.popust(100));
		
		System.out.println("Postarina bi bila: " + p1.postarina());
		
		
		
		System.out.println();
		Proizvod p2 = new Proizvod();
		
		p2.cena=45;
		p2.proizvod="hleb";
		p2.tezina=550;
		p2.print();
		
		p2.povecaj(10.0);
		System.out.println("Cena nakon povecanja od 10 je: " + p2.cena);
		
		System.out.println("Cena sa primenjenim popustom je: " + p2.popust(50));
		
		System.out.println("Postarina bi bila: " + p2.postarina());
	}

}
