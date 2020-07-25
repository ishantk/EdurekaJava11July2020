interface PayTM{
	
	// a default method in interface can have definition | supported in JDK 8+
	default void transact(int payment) {
		System.out.println("Transaction Initiated by PAYTM for amount of:\u20b9"+payment);
	}
	
	// a static method in interface can have definition  | supported in JDK 8+
	static void processPayment() {
		System.out.println("Payments Processed and User Notified");
	}
	
	void onSuccess();
	void onFailure();
}

interface GooglePay{
	void onSuccess();
	void onPaymentFailed();
}

// An interface can extend another interface and also in multiple structure
interface Payments extends PayTM, GooglePay{
	
}


// MMT shall use 3rd Part Payment Collection Libraries in its App so that users can pay
// 1 Single Class cannot Extend Multiple Classes
// 1 Single Class can Implement Multiple Interfaces
class MMTApp implements Payments{//PayTM, GooglePay{
	
	void pay(int amount) {
		System.out.println("Transaction Initiated for Amount: \u20b9"+amount);
	}
	
	public void onSuccess() {
		System.out.println("Payment Succesfully Done");
	}
	
	public void onFailure() {
		System.out.println("Payment Failed");
	}

	public void onPaymentFailed() {
		System.out.println("Payment Failed");
	}
	
}


public class Interfaces {

	public static void main(String[] args) {
		
		PayTM pRef = new MMTApp();
		//pRef.pay(1000); // we would be able to access only the methods which MMTApp will be implementing from PayTM
		pRef.onSuccess();
		pRef.onFailure();
		pRef.transact(3000); // execute a method with definition | default method to be executed by reference variable
		//PayTM.transact(3000); // error
		PayTM.processPayment(); // No error						 | static method to be executed by Interface
		
		System.out.println();
		
		GooglePay gRef = new MMTApp();
		gRef.onSuccess();
		gRef.onPaymentFailed();
		
		System.out.println();
		
		MMTApp app = new MMTApp();
		app.pay(1000);
		app.onSuccess();
		app.onFailure();
		app.onPaymentFailed();
		
		
		//Payments payRef = new MMTApp();
		

	}

}
