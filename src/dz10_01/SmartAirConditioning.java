package dz10_01;

public class SmartAirConditioning {

//	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//	atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//	atribut za mod (hladi/greje)
//	metodu za stampu - stampa u formatu 

	String marka;
	int temp;
	char mod;
	
	public void print() {
		System.out.println("model: "+ this.marka);
		System.out.println("temperatura: "+ this.temp);
		System.out.println("mod" + this.mod);
	}
}
