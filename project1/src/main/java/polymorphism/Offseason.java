package polymorphism;

public class Offseason extends Onseason{
	int discount1;
	public void discount(int rate) {
		discount1 = rate * 15/100;
		System.out.println("Offseason discount "+discount1);
		super.discount(rate);
	}
	public static void main(String[] args) {
		Offseason off = new Offseason();
		off.discount(150);
		
	}

}
