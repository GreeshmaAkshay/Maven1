package project1;

public class Child2 extends Child1{
	public void display() {
		System.out.println("Maven Project");
	}
	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		ch2.addition();
		ch2.subtraction();
		ch2.display();

	}

}
