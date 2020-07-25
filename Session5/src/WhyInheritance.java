// In Java, every class is by default the Child of Object class
// Object class is a Built in class and every class i.e. built in or user defined is child of Object
//class FlightBooking extends Object{ // write it	
class FlightBooking{				  // or do not write it, it will be child of Object class
	// One Way
	String from;
	String to;
	String travelDate;
	int travellers;
	char travelClass;
	
	public FlightBooking() {
		System.out.println("DEFAULT CONSTRUCTOR: FlightBooking Object Constructed");
	}
	
	public FlightBooking(String from, String to, String travelDate, int travellers, char travelClass) {
		System.out.println("PARAMETERIZED CONSTRUCTOR: FlightBooking Object Constructed");
		// this.from in LHS is attribute of object
		// from in RHS is input to the constructor
		this.from = from;
		this.to = to;
		this.travelDate = travelDate;
		this.travellers = travellers;
		this.travelClass = travelClass;
	}

	@Override
	public String toString() { // is from the parent, Object which we have over-rided in FlightBooking Child :)
		return "FlightBooking [from=" + from + ", to=" + to + ", travelDate=" + travelDate + ", travellers="
				+ travellers + ", travelClass=" + travelClass + "]";
	}
	
	void showFlightBookingDetails() {
		System.out.println("Flight Booking Details:");
		System.out.println(from+" | "+to);
		System.out.println(travelDate+" | "+travellers+" | "+travelClass);
	}
	
	
}

/*
class FlightBookingWithReturn{				  // or do not write it, it will be child of Object class
	// Round Trip
	String from;
	String to;
	String travelDate;
	String returnDate;
	int travellers;
	char travelClass;
	
	public FlightBookingWithReturn() {
		System.out.println("DEFAULT CONSTRUCTOR: FlightBookingWithReturn Object Constructed");
	}
	
	public FlightBookingWithReturn(String from, String to, String travelDate, String returnDate, int travellers, char travelClass) {
		System.out.println("PARAMETERIZED CONSTRUCTOR: FlightBookingWithReturn Object Constructed");
		// this.from in LHS is attribute of object
		// from in RHS is input to the constructor
		this.from = from;
		this.to = to;
		this.travelDate = travelDate;
		this.returnDate = returnDate;
		this.travellers = travellers;
		this.travelClass = travelClass;
	}

	@Override
	public String toString() {
		return "FlightBookingWithReturn [from=" + from + ", to=" + to + ", travelDate=" + travelDate + ", returnDate="
				+ returnDate + ", travellers=" + travellers + ", travelClass=" + travelClass + "]";
	}

	
}

class MultipleFlightBookingWithReturn{				  // or do not write it, it will be child of Object class
	
	// Multi City
	
	String from;
	String to;
	String travelDate;
	String returnDate;
	int travellers;
	char travelClass;
	
	String anotherFrom;
	String anotherTo;
	String anotherTravelDate;
	String anotherReturnDate;
	int anotherTravellers;
	char anotherTravelClass;
	
	public MultipleFlightBookingWithReturn() {
		System.out.println("DEFAULT CONSTRUCTOR: MultipleFlightBookingWithReturn Object Constructed");
	}

	public MultipleFlightBookingWithReturn(String from, String to, String travelDate, String returnDate, int travellers,
			char travelClass, String anotherFrom, String anotherTo, String anotherTravelDate, String anotherReturnDate,
			int anotherTravellers, char anotherTravelClass) {
		System.out.println("PARAMETERIZED CONSTRUCTOR: MultipleFlightBookingWithReturn Object Constructed");
		this.from = from;
		this.to = to;
		this.travelDate = travelDate;
		this.returnDate = returnDate;
		this.travellers = travellers;
		this.travelClass = travelClass;
		this.anotherFrom = anotherFrom;
		this.anotherTo = anotherTo;
		this.anotherTravelDate = anotherTravelDate;
		this.anotherReturnDate = anotherReturnDate;
		this.anotherTravellers = anotherTravellers;
		this.anotherTravelClass = anotherTravelClass;
	}

	@Override
	public String toString() {
		return "MultipleFlightBookingWithReturn [from=" + from + ", to=" + to + ", travelDate=" + travelDate
				+ ", returnDate=" + returnDate + ", travellers=" + travellers + ", travelClass=" + travelClass
				+ ", anotherFrom=" + anotherFrom + ", anotherTo=" + anotherTo + ", anotherTravelDate="
				+ anotherTravelDate + ", anotherReturnDate=" + anotherReturnDate + ", anotherTravellers="
				+ anotherTravellers + ", anotherTravelClass=" + anotherTravelClass + "]";
	}
	
}
*/

// WhyInheritance -> When we are writing objects which will have 
//					 common attributes or methods, we will use Inheritance for code reuse
//					 To Save Development Time

class FlightBookingWithReturn extends FlightBooking{
	
	String returnDate;

	public FlightBookingWithReturn() {
		System.out.println("DEFAULT CONSTRUCTOR: FlightBookingWithReturn Object Constructed");
	}
	
	public FlightBookingWithReturn(String returnDate) {
		System.out.println("PARAMETERIZED CONSTRUCTOR: FlightBookingWithReturn Object Constructed");
		this.returnDate = returnDate;
	}
	
	public FlightBookingWithReturn(String from, String to, String travelDate, String returnDate, int travellers, char travelClass) {
		super(from, to, travelDate, travellers, travelClass); // we will use parent's attributes and hence, code reuse :)
		this.returnDate = returnDate;
		System.out.println("PARAMETERIZED CONSTRUCTOR WITH SUPER: FlightBookingWithReturn Object Constructed");
	}

	@Override
	public String toString() {
		return "FlightBookingWithReturn [returnDate=" + returnDate + ", from=" + from + ", to=" + to + ", travelDate="
				+ travelDate + ", travellers=" + travellers + ", travelClass=" + travelClass + "]";
	}
	
	void showFlightBookingDetails() {
		super.showFlightBookingDetails();
		System.out.println("Return: "+returnDate);
	}
	
}

/*
 
 	Mobile
 		pid
 		name
 		brandName
 		price
 		color
 		ram
 		os
 		memory
 		
 	TV
 		pid
 		name
 		brandName
 		price
 		color
 		technology
 		
 	Shoe
 		pid
 		name
 		brandName
 		color
 		shoeSize
 		type
 		
 		
 	Product
 		pid
 		name
 		brandName
 		price
 		color
 		
 	Mobile extends Product
 		ram
 		os
 		memory
 		
 	TV extends Product
 		technology
 		
 	Shoe extends Product
 		shoeSize
 		type 		
 		
 
 */


public class WhyInheritance {

	public static void main(String[] args) {
		
		/*
		FlightBooking fRef1 = new FlightBooking("Delhi", "Bangalore", "30th July, 2020", 4, 'E');
		System.out.println(fRef1); // toString will be executed automatically
		
		System.out.println();
		
		FlightBookingWithReturn fRef2 = new FlightBookingWithReturn("Delhi", "Bangalore", "30th July, 2020", "10th Aug, 2020" ,4, 'E');
		System.out.println(fRef2);
		
		System.out.println();
		
		MultipleFlightBookingWithReturn fRef3 = new MultipleFlightBookingWithReturn("Delhi", "Bangalore", "30th July, 2020", "10th Aug, 2020" ,4, 'E', "Bangalore", "Goa", "11th Aug, 2020", "15th Aug, 2020" ,4, 'B');
		System.out.println(fRef3);
		*/
		
		FlightBookingWithReturn fRef2 = new FlightBookingWithReturn("Delhi", "Bangalore", "30th July, 2020", "10th Aug, 2020" ,4, 'E');
		System.out.println(fRef2);
		
		
		fRef2.showFlightBookingDetails();
		
	}

}
