package abstraction;

public class InterfaceClass implements InterfaceExample,InterfaceExample2{//InterfaceClass-->Class name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass ic = new InterfaceClass();
		ic.display();
		ic.fullname();
		
		
		//InterfaceName in = new ClassName//Object creation of Interface
		InterfaceExample ie = new InterfaceClass();
		ie.display();
		
		
		InterfaceExample2 ie2 = new InterfaceClass();
		ie2.fullname();
	}

	public void display() {
		// TODO Auto-generated method stub
		int c = a+b;
		System.out.println(c);
	}

	public void fullname() {
		// TODO Auto-generated method stub
		System.out.println(first_name+" "+last_name);
	}

}
