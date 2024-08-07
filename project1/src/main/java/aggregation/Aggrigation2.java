package aggregation;

public class Aggrigation2 {
	Aggreigation1 agr;
	String name;
	public Aggrigation2(Aggreigation1 agr,String name ) {
		this.agr = agr;
		this.name = name;
	}
	public void display() {
		System.out.println(agr.a);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Aggreigation1 ag1 = new Aggreigation1(10);
		Aggrigation2 ag2 = new Aggrigation2(ag1,"Greeshma");
		ag2.display();

	}

}
