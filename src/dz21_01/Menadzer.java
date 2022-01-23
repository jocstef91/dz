package dz21_01;

public class Menadzer extends Radnik{

	
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	
	
	public Menadzer(String imeRadnika) {
		super(imeRadnika);
	}

	@Override
	public double plata() {
		double x=0;
	
		for (int i = 0; i < this.sektor.size(); i++) {
			x=x+this.sektor.get(i).getPlata();
		
		}
			
		return x;
	}
	
	

}
