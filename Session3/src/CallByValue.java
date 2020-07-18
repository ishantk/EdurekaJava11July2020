
public class CallByValue {

	static void squareOfNumber(int number) { // number here in squareOfNumber method input is property of squareOfNumber method
		
		System.out.println("[squareOfNumber] number is: "+number);     // 10
		number = number * number;								       // 100	
		System.out.println("[squareOfNumber] number now is: "+number); // 100
		// here we have nothing further, so function finishes from memory
	}
	
	public static void main(String[] args) {
		
		int number = 10; // number is a variable created in the main method and is the property of main method
		System.out.println("[main] number is "+number);     // 10
		CallByValue.squareOfNumber(number); // Call By Value is passing the value i.e. data in some variable of main to variable of method
		System.out.println("[main] number now is "+number); // 10
		// here we have nothing further, so main function finishes from memory
	}
	
	// LOCAL VARIABLES:
	// Any Variable created within the method or in its input belongs to that method
	// It is always temporary as the method execution finishes, they are removed from memory

}
