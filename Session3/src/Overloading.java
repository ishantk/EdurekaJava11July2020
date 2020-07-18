
public class Overloading { // Overloading is class name which can be any name of your choice

	// Overloading is a Funda:  same method name with different inputs
	
	void processPayment(String userName, String password, int amountToPay) {
		System.out.println(">> ONLINE BANKING PAYMENT");
		System.out.println(">> PROCESSING Paymets for User "+userName);
		System.out.println(">> THANK YOU for making a payment of "+amountToPay);
		System.out.println();
	}
	
	void processPayment(String cardNumber, int cvv, int amountToPay) {
		System.out.println(">> ONLINE CARD PAYMENT");
		System.out.println(">> PROCESSING Paymets for Card "+cardNumber);
		System.out.println(">> THANK YOU for making a payment of "+amountToPay);
		System.out.println();
	}
	
	void processPayment(String upi, int amountToPay) {
		System.out.println(">> UPI PAYMENT");
		System.out.println(">> PROCESSING Paymets for UPI "+upi);
		System.out.println(">> THANK YOU for making a payment of "+amountToPay);
		System.out.println();
	}
	
	// We can use the Same function name : Overloading
	// Condition -> INPUTS MUST BE DIFFERENT i.e. UNIQUE
	//              RETURN TYPE HAS NO ROLE TO PLAY
	
	/*
	Errors:
	void add(int num1, int num2) {
		
	}
	
	int add(int num1, int num2) {
		
	}
	
	void add(int n1, int n2) {
		
	}
	*/
	
	public static void main(String[] args) {
		
		Overloading oRef = new Overloading();
		oRef.processPayment("9090909090@apl.com", 2000);
		oRef.processPayment("5656 4444 1111 2222", 345, 10000);
		oRef.processPayment("john.watson", "john@123", 5000);

	}

}
