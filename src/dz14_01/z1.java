package dz14_01;

public class z1 {

	public static void main(String[] args) {
		Autor a1 = new Autor("J.K.", "Rowling");
		
		Knjiga k1= new Knjiga("1224", "Hari Poter i kamen mudrosti", 1999, a1);
		Knjiga k2= new Knjiga("8325", "Hari Poter i dvorana tajni", 2003, a1);
		Autor a2 = new Autor("William", "Shakespeare");
		Knjiga k3= new Knjiga();
		k3.setIsbn("2156");
		k3.setAutor(a2);
		k3.setNaziv("Hamlet");
		k3.setGod(1600);
		
		k1.print();
		System.out.println();
		k2.print();
		System.out.println();
		k3.print();
	}

}
