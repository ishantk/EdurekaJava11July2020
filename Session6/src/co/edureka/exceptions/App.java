package co.edureka.exceptions;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		System.out.println("App Started");
		
		int[] cashBacks = {100, 50, 70, 90, 30, 12, 99, 35, 60, 33};
		int num = 0;
		int additionalCashBack = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Lucky Number:");
		int luckyNumber = scanner.nextInt();
		try {
			System.out.println("You Have Won a CashBack of \u20b9"+cashBacks[luckyNumber]);
			
			additionalCashBack = cashBacks[luckyNumber]/num;
			System.out.println("Additional CashBack Won is: \u20b9"+additionalCashBack);
			
		}/*catch(ArrayIndexOutOfBoundsException aRef) {
			System.out.println("CashBack Lucky Number Error: "+aRef);
		}catch(ArithmeticException aRef) {
			System.out.println("Additional CashBack Error: "+aRef);
		}*/
		catch(Exception e) { // e as reference variable of Parent Exception class can point to any child object :)
			System.out.println("Something went Wrong: "+e);
			// instanceOf Operator in Java -> this may help to differentiate between the exceptions :)
		}finally {
			// finally will be executed even in case you have not handled exceptions :)
			System.out.println("This must be executed :)");
		}
		
		// releasing the memory resources :)
		scanner.close();
		
		System.out.println("App Finished");
		

	}

}

// Exception: is an error which occurs when our program is in execution phase
//            whatever line number it occurs, below written lines of code will not be executed and program is terminated abnormally
//			  Unfortunately, App stopped Working :(

// Solution : try and catch block => catch will handle error in case it occurs in try block :)

// PS: in try whenever error occurs, statements below that line of code wont be executed as control directly transfers to catch block



/*
 	try{
 	
 	} error
 	
 	try{
 	
 	}catch(){ // here exception is handled and program wont crash
 	
 	} OK
 	
 	try{
 	
 	}finally(){ // here exception wont be handled and program shall crash
 	
 	} OK
 	
 	try{
 	
 	}catch(){ 
 	
 	}finally{
 	
 	}
 	
 	try{
 	
 		try{
 	
	 	}catch(){ 
	 	
	 	}finally{
	 	
	 	}
 	
 	}catch(){ 
 	
 	 	try{
 	
	 	}catch(){ 
	 	
	 	}finally{
	 	
	 	}
 	
 	}finally{
 	 	
 	 	try{
 	
	 	}catch(){ 
	 	
	 	}finally{
	 	
	 	}
 	}
 	
 */
