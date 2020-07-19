import java.util.Scanner;

/*
 
 	Principle of OOPS:
 	1. Think of an Object [Associate Data i.e. attributes]
 	2. Create Class [Mention attributes in the Class]
 	3. Create Real Time Object in the Memory i.e. RAM
 
 	Use Case : https://www.makemytrip.com/
 	
 	1. Think of an Object
 	FlightBooking [from, to, travelDate, travelers, travelClass] 
 
 */

// 2. Create Class [Mention attributes in the Class]
class FlightBooking{
	
	// Attributes: Property of Object | Instance Variables | Instance means Object
	String from;
	String to;
	String travelDate;
	short travelers;
	char travelClass; // E -> economy, B -> business
	
	
	// Special Method : same name as of class name and no return type
	// Constructor: To give initial default data to attributes of object
	FlightBooking(){
		from = "Delhi";
		to = "Bangalore";
		travelDate = "20th July, 2020";
		travelers = 1;
		travelClass = 'E';
	}
	
	// Constructor with Inputs  | Parameterized Constructor
	// (String from, String to, String travelDate, short travelers, char travelClass) -> local variables, which are property of Constructor
	// And are same name as of attributes of object i.e. instance variables
	// we need to discriminate between them
	FlightBooking(String from, String to, String travelDate, short travelers, char travelClass){
		// this.from | LHS: represents object's attribute
		// from      | RIH: represents input to constructor
		// this keyword represents object
		this.from = from;
		this.to = to;
		this.travelDate = travelDate;
		this.travelers = travelers;
		this.travelClass = travelClass;
	}
	
	void showFlightBooking() {
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("| [From: "+from+"] [To: "+to+"] [Travel Date: "+travelDate+"] [Travelers: "+travelers+"] [TravelClass: "+travelClass+"] |");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println();
	}
	
	void setFlightBookingDetails(String from, String to, String travelDate, short travelers, char travelClass){
		// this.from | LHS: represents object's attribute
		// from      | RIH: represents input to constructor
		// this keyword represents object
		this.from = from;
		this.to = to;
		this.travelDate = travelDate;
		this.travelers = travelers;
		this.travelClass = travelClass;
	}
	
	void setFlightbookingDetails() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter From Loaction:");
		from = scanner.nextLine();
		
		System.out.println("Enter To Loaction:");
		to = scanner.nextLine();
		
		System.out.println("Enter Travel Date:");
		travelDate = scanner.nextLine();
		
		System.out.println("Enter Travellers:");
		travelers = scanner.nextShort();
		
		scanner.nextLine(); // empty nextLine
		
		System.out.println("Enter Travel Class:");
		travelClass = scanner.nextLine().toCharArray()[0];
		
		scanner.close();
	}
	
	Flight[] search() { // Lets give Array of Flight Objects in Return
		
		Flight f1 = new Flight();
		Flight f2 = new Flight(1, "09:10AM", "12:10PM", 5650);
		Flight f3 = new Flight(2, "10:10AM", "14:10PM", 4650);
		Flight f4 = new Flight("6E-127", "Indigo", 2, "10:10AM", "14:10PM", 4650);
		Flight f5 = new Flight("SG-767", "SpiceJet", 1, "12:10AM", "15:10PM", 3650);
		
		Flight[] flights = {f1, f2, f3, f4, f5}; // Implicit Array Syntax : indexing for references pointing to Flight Objects
		
		return flights;
	}
	
}
		

public class OOPS {

	public static void main(String[] args) {

		// 3. Create Real Time Object in the Memory i.e. RAM
		// Default Constructor
		FlightBooking fRef1 = new FlightBooking(); 	// Object Construction
		FlightBooking fRef2 = new FlightBooking();	// Object Construction
		FlightBooking fRef3 = fRef1; 				// Reference Copy
		
		// Parameterized Constructor
		FlightBooking fRef4 = new FlightBooking("Goa", "Bangalore", "5th Aug, 2020", (short)2, 'B');
		
		System.out.println("fRef1 is: "+fRef1);
		System.out.println("fRef2 is: "+fRef2);
		System.out.println("fRef3 is: "+fRef3);
		System.out.println("fRef4 is: "+fRef4);
		
		
		// Object Operations
		// 1. Read Data from Object
//		System.out.println("From: "+fRef1.from+" To: "+fRef1.to+" Travel Date: "+fRef1.travelDate+" Travelers: "+fRef1.travelers+" TravelClass: "+fRef1.travelClass);
//		System.out.println("From: "+fRef2.from+" To: "+fRef2.to+" Travel Date: "+fRef2.travelDate+" Travelers: "+fRef2.travelers+" TravelClass: "+fRef2.travelClass);
//		System.out.println("From: "+fRef3.from+" To: "+fRef3.to+" Travel Date: "+fRef3.travelDate+" Travelers: "+fRef3.travelers+" TravelClass: "+fRef3.travelClass);
//		System.out.println("From: "+fRef4.from+" To: "+fRef4.to+" Travel Date: "+fRef4.travelDate+" Travelers: "+fRef4.travelers+" TravelClass: "+fRef4.travelClass);
		
		fRef1.showFlightBooking();
		fRef2.showFlightBooking();
		fRef3.showFlightBooking();
		fRef4.showFlightBooking();
		
		// 2. Write or Edit or Update the Data in Object
//		fRef1.from = "Chennai";
//		fRef2.from = "Chandigarh";
//		
//		fRef3.travelers = 4;
//		fRef3.travelDate = "30th July, 2020";
		
		fRef1.setFlightBookingDetails("Mumbai", "Chennai", "5th Aug, 2020", (short)2, 'B');
		
		//fRef4.setFlightbookingDetails();
		
		fRef1.showFlightBooking();
		fRef3.showFlightBooking();
		
		fRef4.showFlightBooking();
		
		System.out.println("Showing Flights from "+fRef4.from+" To "+fRef4.to);
		Flight[] flights = fRef4.search();
		for(int i=0;i<flights.length;i++) {
			flights[i].showFlight();
		}
		
		
//		System.out.println();
//		System.out.println("From: "+fRef1.from+" To: "+fRef1.to+" Travel Date: "+fRef1.travelDate+" Travelers: "+fRef1.travelers+" TravelClass: "+fRef1.travelClass);
//		System.out.println("From: "+fRef2.from+" To: "+fRef2.to+" Travel Date: "+fRef2.travelDate+" Travelers: "+fRef2.travelers+" TravelClass: "+fRef2.travelClass);
//		System.out.println("From: "+fRef3.from+" To: "+fRef3.to+" Travel Date: "+fRef3.travelDate+" Travelers: "+fRef3.travelers+" TravelClass: "+fRef3.travelClass);
		
		// PS: we can have n-number of objects as per our requirements
		//     all of them will have same attributes but values may be different
		
		// Garbage Collector in Java will delete the Objects AUTOMATICALLY
		System.gc(); // Explicitly request GC to delete unused objects from memory -> Memory Cleanup Request :)

		
		// Exploratory: In java we have Date class to represent system date time :)
	}

}
