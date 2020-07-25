final class AmazonPay{ // it cannot be extended
	// final method cannot be overrided :)
	final void transact(int pay) {
		System.out.println("Transaction Initiated. Please Pay: \u20b9"+pay);
	}
}

class MyApp{// extends AmazonPay{ // cannot extend a final class
	/*void transact(int pay) { // cannot override a final method
		pay+=100;
		System.out.println("Transaction Initiated by Amazon. Please Pay: \u20b9"+pay);
	}*/
}



public class FinalKeyword {

	public static void main(String[] args) {
		
		// final is the one which cannot be modified
		final int salary = 100000;
		//salary += 50000; error
		
		System.out.println("Salary is: "+salary);
		
		//MyApp app = new MyApp();
		//app.transact(5000);
		

	}

}
