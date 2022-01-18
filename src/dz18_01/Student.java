package dz18_01;

import java.util.ArrayList;

public class Student {

//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	private int index;
	private String student;
	private String tipStudija;
	private ArrayList<Ispit> ispiti= new ArrayList<Ispit>();
	
	public Student() {
		
	}

	public Student(int index, String student, String tipStudija) {
		super();
		this.index = index;
		this.student = student;
		this.tipStudija = tipStudija;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void setIspiti(ArrayList<Ispit> ispiti) {
		this.ispiti = ispiti;
	}

	public String getTipStudija() {
		return tipStudija;
	}
	
	public void dodajIspit(Ispit ispiti) {
		this.ispiti.add(ispiti);
	}
	//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
	
	public double prosek() {
		
		double prosek=0;
		int brojac=0;
		for (int i = 0; i < this.ispiti.size(); i++) {
			if(this.ispiti.get(i).getOcena()>5) {
				prosek=prosek+this.ispiti.get(i).getOcena();
				brojac++;
			}
		}
		prosek=prosek/brojac;
		return prosek;
	}
	
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
	
	public void print() {
		System.out.println(this.index + " - " + this.student + " - " + this.tipStudija);
		System.out.println("Predmeti");
		for (int i = 0; i < this.ispiti.size(); i++) {
			System.out.println(this.ispiti.get(i).getPredmet() + " - " + this.ispiti.get(i).getProfesor() 
					+ " - " + this.ispiti.get(i).getOcena());
			
		}
		System.out.print("Prosecna ocena: ");
		System.out.println(this.prosek());
		
	}
	
}
