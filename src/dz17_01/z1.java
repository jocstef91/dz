package dz17_01;

import java.util.ArrayList;
import java.util.Scanner;

public class z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Zeleni> fax = new ArrayList<Zeleni>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite podatke: ");
			Zeleni z = new Zeleni(s.next(),s.nextInt(),s.next(),s.nextInt());
			fax.add(z);
		}
		
		for (int i = 0; i < fax.size(); i++) {
			System.out.println("Student: " + fax.get(i).getStudent());
			System.out.println("Indeks: "+fax.get(i).getIndex());
			System.out.println("Profesor: "+fax.get(i).getProfesor());
			System.out.println("Ocena: "+fax.get(i).getOcena());
		}
	}

}
