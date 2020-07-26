package co.edureka.exceptions;

import java.io.IOException;

class MyBankingException extends RuntimeException{ // User Defined UNCHECKED EXCEPTION
	MyBankingException(String message){
		super(message);
	}
}

class YourBankingException extends Exception{ // User Defined CHECKED EXCEPTION
	YourBankingException(String message){
		super(message);
	}
}

class BankAccount{
	
	int balance;
	int minBalance;
	
	int attempts = 0;
	
	public BankAccount() {
		balance = 10000;  // Assume: 10000 is the default amount to open up bank account
		minBalance = 2000;
	}
	
	void withdraw(int amount) throws IOException, YourBankingException{
		balance -= amount; // balance = balance - amount;
		
		if(balance <= minBalance) {
			balance += amount;
			System.out.println("[Withdraw]: FAILED | Low Balance: \u20b9"+balance);
			
			attempts++;
			
		}else {
			System.out.println("[Withdraw]: SUCCESS | New Balance: \u20b9"+balance);
		}
		
		if(attempts == 3) {
			// 1. Throwing a Runtime Exception i.e. UNCHECKED EXCEPTION :)
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts");
			//throw aRef;  // Throwing an UNCHECKED Exception ourselves
			
			
			// 2. Throwing an IO Exception i.e. CHECKED EXCEPTION :)
			//IOException iRef = new IOException("Illegal Attempts");
			//throw iRef;    // // Throwing a CHECKED Exception ourselves | Compiler gives error :)
			
			YourBankingException yRef = new YourBankingException("Illegal Attempts");
			throw yRef;
		}
		
	}
	
}

public class BankingApp {

	public static void main(String[] args) {
		
		System.out.println("Banking App Started");
		
		BankAccount johnsAccount = new BankAccount();
		
		// Imagine john as a potential hacker who is trying to make banks resources to be occupied :(
		try {
			for(int i=1;i<=500;i++) {
				johnsAccount.withdraw(3000);
			}
		}catch(Exception e) {
			System.out.println("BANKING EXCEPTION: "+e);
		}
		
		
		System.out.println("Banking App Finished");
		

	}

}
