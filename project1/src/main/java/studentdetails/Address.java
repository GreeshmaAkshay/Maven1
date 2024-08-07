package studentdetails;

public class Address {
	Student st ;
	String address;
	public Address(Student st,String address) {
		this.st = st;
		this.address = address;
	}
	public void display() {
		System.out.println("Name        :"+st.name);
		System.out.println("Roll Number :"+st.roll_number);
		System.out.println("Address     :"+address);
	}
	public static void main(String[] args) {
		Student st1 = new Student("Greeshma",32);
		Address add = new Address(st1,"Greeshmam,Shanthipuram,Ayirooppara PO");
		add.display();
	}

}
