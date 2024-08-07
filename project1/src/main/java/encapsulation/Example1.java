package encapsulation;

public class Example1 {
 private int a;
 private int b;
 public void setter(int a,int b) {
	 this.a = a;
	 this.b = b;
 }
 public void getter() {
	 System.out.println(a+","+b);
	 //System.out.println(b);
 }
}
