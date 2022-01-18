package dz18_01;

public class z1 {

	public static void main(String[] args) {
		Ispit i1 = new Ispit("Matematika", 7, "Milan Milanovic");
		Ispit i2 = new Ispit("Fizika", 8, "Sanda Ilic");
		Ispit i3 = new Ispit("Elektronika", 7, "Marko Markovic");
		Ispit i4 = new Ispit("Programiranje", 10, "Filip Filipovic");
		Ispit i5 = new Ispit("Hemija", 5, "Filip Filipovic");
		
		Student s = new Student(13618, "Stefan Jocic", "OA");
		
		s.dodajIspit(i1);
		s.dodajIspit(i2);
		s.dodajIspit(i3);
		s.dodajIspit(i4);
		s.dodajIspit(i5);
		
		s.print();

	}

}
