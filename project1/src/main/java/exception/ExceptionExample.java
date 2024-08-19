package exception;

public class ExceptionExample {
	public void voting() {
		int age = 8;
		if(age>=18) {
			System.out.println(" The candidate is eligible for voting");
				
		}
		else {
			throw new ArithmeticException("The candidate is not eligible for voting");
		}
	}

	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		ee.voting();
		// TODO Auto-generated method stub

	}

}
