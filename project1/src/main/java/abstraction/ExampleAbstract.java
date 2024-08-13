package abstraction;

public class ExampleAbstract extends AbstractExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleAbstract eb = new ExampleAbstract();
		eb.add();
		eb.display();
		eb.print();
		eb.sub();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Hello Greeshma");
	}
	public void sub() {
		System.out.println("Hello world");
	}

}
