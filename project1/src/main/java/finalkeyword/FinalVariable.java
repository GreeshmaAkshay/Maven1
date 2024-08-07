package finalkeyword;

public class FinalVariable extends FinalExample{
	final int a = 10;
	/*public FinalVariable() {
		a = 10;
	}*/
	public final void add() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable();
		fv.add();
		System.out.println(fv.a);
		fv.sum();

	}

}
