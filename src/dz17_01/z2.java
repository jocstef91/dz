package dz17_01;

import java.util.ArrayList;

public class z2 {

	public static void main(String[] args) {
		Racun r1 = new Racun("195-123123-01", "Stefan", 23000);
		Racun r2 = new Racun("205-521550-01", "Marko", 10000);
		

		
		Transakcija t = new Transakcija("a45fa4fsdf", r1, r2);
		t.transakcija(3000);
		t.print();
	}

}
