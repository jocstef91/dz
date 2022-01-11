package dz10_01;

public class d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartAirConditioning s1 = new SmartAirConditioning();
		
		s1.marka="Samsung";
		s1.mod=true;
		s1.temp=26;
		s1.print();
		System.out.println("Potrosnja je: " +s1.potrosnja()+"kw/h");
		System.out.println("Dugovanje je" + s1.cenaPotrosnje());
		System.out.println();
		
SmartAirConditioning s2 = new SmartAirConditioning();
		
		s2.marka="Midea";
		s2.mod=false;
		s2.temp=16;
		s2.print();
		System.out.println("Potrosnja je: " +s2.potrosnja()+"kw/h");
		System.out.println("Dugovanje je" + s2.cenaPotrosnje());
	}

}
