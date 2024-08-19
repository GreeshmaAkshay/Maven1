package exception;

public class TryCatch {
	public void division() {
		try {
			int a = 10/0;
			System.out.println(a);
		}
		catch(Exception e){
			System.out.println("Exception handled"+e);
		}
		finally {
			System.out.println("Hello Java");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatch tc = new TryCatch();
		tc.division();
	}

}
