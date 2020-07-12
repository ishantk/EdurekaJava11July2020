import java.util.Scanner; // Scanner is built in class i.e. java program from java.util package to read data from user on console

public class SwitchStatement {

	public static void main(String[] args) {
		
		// MODEL
		int baseFare = 50;
		int kmCharge = 8;
		int distance = 7;
		
		int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		int olaBike = 4;
		int olaShared = 5;
		
		int amountToPay = 0;
		
		// VIEW [Textual Console Based View]
		// Show Data to User
		System.out.println("==================");
		System.out.println("Select the Type Of Cab");
		System.out.println("1. Ola Micro");
		System.out.println("2. Ola Mini");
		System.out.println("3. Ola Sedan");
		System.out.println("4. Ola Bike");
		System.out.println("5. Ola Shared");
		System.out.println("==================");
		
		System.out.println("Enter Your Choice: ");
		
		// Take Data from User
		// Scanner Object Construction Statement
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt(); // reads any integer entered by user on the console
		System.out.println("choice entered by you is: "+choice);
		
		scanner.close(); // Release the memory resources for us :) 
		
		switch(choice) {
			case 1:
				baseFare += 10;
				amountToPay = baseFare + (kmCharge*distance);
				System.out.println("OLA Micro Booked. Please Pay \u20b9"+amountToPay);
				break; // break means come out of switch block. anf in case we dont put it, other case will be executed :)
				
			case 2:
				baseFare += 20;
				amountToPay = baseFare + (kmCharge*distance);
				System.out.println("OLA Mini Booked. Please Pay \u20b9"+amountToPay);
				break;
				
			case 3:
				baseFare += 30;
				amountToPay = baseFare + (kmCharge*distance);
				System.out.println("OLA Sedan Booked. Please Pay \u20b9"+amountToPay);
				break;
				
			case 4:
				baseFare -= 20;
				amountToPay = baseFare + (kmCharge*distance);
				System.out.println("OLA Bike Booked. Please Pay \u20b9"+amountToPay);
				break;
				
			case 5:
				baseFare -= 25;
				amountToPay = baseFare + (kmCharge*distance);
				System.out.println("OLA Shared Booked. Please Pay \u20b9"+amountToPay);
				break;
				
			default:
				System.out.println("Please Select the Cab First");
				break;
		}
		
		
		// Integrate the code snippet where user can apply coupons to get some discounts :)
		// switch case can internally have if/else and vice versa

	}

}
