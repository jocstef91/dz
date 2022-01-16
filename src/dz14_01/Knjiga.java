package dz14_01;

public class Knjiga {

//	Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
	
	private String isbn;
	private String naziv;
	private int god;
	private Autor autor;
	
	public Knjiga(String isbn, String naziv, int god, Autor autor) {
		this.isbn=isbn;
		this.naziv=naziv;
		this.god=god;
		this.autor=autor;
	}
	
	public Knjiga() {
		
	}
	

	public String getIsbn() {
		return this.isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn=isbn;
	}
	
	public String getNaziv() {
		return this.naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv=naziv;
	}
	
	public int getGod() {
		return this.god;
	}
	public void setGod(int god) {
		this.god=god;
	}
	
	public Autor getAutor() {
		return this.autor;
	}
	public void setAutor(Autor autor) {
		this.autor=autor;
	}
	
//	-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 
	
	public void print() {
		System.out.println("ISBN: "+this.isbn);
		System.out.println("Naziv knjige: " + this.naziv + " - " + this.god);
		System.out.println("Autor:" + this.autor.getIme() + " " + this.autor.getPrezime());
		
	}
	
	

}
