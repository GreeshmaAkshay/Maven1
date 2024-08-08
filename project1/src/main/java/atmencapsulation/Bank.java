package atmencapsulation;

public class Bank {
	 private int pin;

	    public void setPin(int pin) {
	        this.pin = pin;
	    }

	    public boolean validatePin() {
	        int validpin[] = {1001, 1234, 1212}; 
	        for (int i = 0; i < validpin.length; i++) {
	            if (validpin[i] == this.pin) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public void withdraw(int amount) {
	        if (validatePin()) {
	            System.out.println("Withdrawal amount  :" + amount);
	        } else {
	            System.out.println("Invalid pin, Can't withdraw amount.");
	        }
	    }
	
}
