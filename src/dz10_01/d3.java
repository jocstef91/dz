package dz10_01;

public class d3 {

	public static void main(String[] args) {
		
		FacebookPost fb1 =new FacebookPost();
		fb1.objavio="Pera Peric";
		fb1.objavljenoNa="Mika Mikic";
		fb1.tekst="Srecan rodjendan";
		fb1.like();
		fb1.like();
		fb1.dislike();
		fb1.like();
		fb1.share();
		fb1.share();
		fb1.print();

		
		FacebookPost fb2 =new FacebookPost();
		fb2.objavio="Ivan Antic";
		fb2.objavljenoNa="Milan Milosevic";
		fb2.tekst="Zdravooooooo";
		fb2.like();
		fb2.like();
		fb2.dislike();
		fb2.dislike();
		fb2.share();
		fb2.share();
		fb2.like();
		fb2.like();
		fb2.share();
		fb2.print();
	}

}
