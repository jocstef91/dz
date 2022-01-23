package dz21_01;

public class z1 {

	public static void main(String[] args) {
//		U glavnom programu kreirati jednog magacionera i jednog menadzera,
//		postaviti sektore u kojima rade i ispisati platu za svakog
		
		Sektor s1 = new Sektor("proizvodnja", 60000);
		Sektor s2 = new Sektor("Kancelarija", 100000);
		Sektor s3 = new Sektor("Radionica", 30000);
		Sektor s4 = new Sektor("Stolarija", 50000);
		
		Radnik r1 = new Menadzer("Stefan");
		Radnik r2 =new Magacioner("Marko");
		
		r1.zaposli(s2);
		r1.zaposli(s1);
		
		r2.zaposli(s3);
		r2.zaposli(s4);
		
		System.out.println("Plata je: " + r1.plata());
		System.out.println("Plata je: " + r2.plata());
	}

}
