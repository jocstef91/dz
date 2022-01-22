package dz20_01;

public class z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Igrac i1 = new Igrac("Stefan Jocic","1612991123123", 1991, 23, "sredina", true);
		Igrac i2 = new Igrac("Zika Markovic","1209995120023", 1991, 9, "napad", false);
		Igrac i3 = new Igrac("Ivan Ivanovic","1209995120023", 1991, 11, "napad", false);
		Igrac i4 = new Igrac("Filip Filipovic","010985120023", 1991, 19, "odbrana", false);
		Igrac i5 = new Igrac("Marko Markovic","1209995120023", 1991, 1, "golman", false);
		
		Trener t1 = new Trener("Dejan Ilic", "1231923123", 1975, 8, "glavni");
		Trener t2 = new Trener("Luka Ilic", "0101123123", 1980, 3, "pomocni");
		
		i1.print();
		i2.print();
		t1.print();
		t2.print();
	}

}
