package dz10_01;

public class SmartAirConditioning {




	String marka;
	int temp;
	boolean mod;
	int greje;
	int hladi;
	
	
	public void print() {
		System.out.println("model: "+ this.marka);
		System.out.println("temperatura: "+ this.temp);
		if(this.mod) {
			System.out.println("greje");
			
		}else {
			System.out.println("hladi");
		}
	}
	
	public boolean mod() {
		if(this.mod) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public int potrosnja() {
		int cena;
		
		if(mod()) {
			cena=30*15*1;
		}else {
			cena=30*15*2;
		}
		return cena;
	}
	

	
	public int cenaPotrosnje() {
			int suma;
			return suma =350*6+(this.potrosnja()-350)*9;
		}
		
	
}
