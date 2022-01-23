package dz21_01;

public class Magacioner extends Radnik {
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	public Magacioner(String imeRadnika) {
		super(imeRadnika);
	}
	
	private double prosek() {
		double prosecnaPlata=0;
		int brojac=0;
		for (int i = 0; i < this.sektor.size(); i++) {
			//if(this.imeRadnika.equals(ime)) {
				prosecnaPlata=prosecnaPlata+this.sektor.get(i).getPlata();
				brojac++;
			//}
			
		}
		
		return prosecnaPlata/(brojac)*0.5;
	}

	

	@Override
	public double plata() {
		
		return this.prosek()/(this.sektor.size()+1);
		
		}
	
	
	
}
