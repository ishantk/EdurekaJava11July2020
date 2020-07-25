
/*class Cab{
	
	int baseFare;
	int pricePerKm;
	
	Cab(){
		baseFare = 100;
		pricePerKm = 10;
		System.out.println("Cab Object Constructed");
	}
	
	void bookCab(String fromLocation, String toLocation) {
		System.out.println("Cab Booked from "+fromLocation+" to "+toLocation);
		System.out.println("Please Pay: \u20b9"+baseFare);
	}
	
}*/

/*
abstract class Cab{
	
	int baseFare;
	int pricePerKm;
	
	// even though the class is abstract
	// we cannot create its objects, BUT JVM will create the object as per Rule of Inheritance
	Cab(){
		baseFare = 100;
		pricePerKm = 10;
		System.out.println("Cab Object Constructed");
	}
	
	// the method definition below is also not needed
	// hence, make the method alos abstract
//	void bookCab(String fromLocation, String toLocation) {
//		System.out.println("Cab Booked from "+fromLocation+" to "+toLocation);
//		System.out.println("Please Pay: \u20b9"+baseFare);
//	}
	
	// abstract method can only be created in abstract class
	// it will have no definition :)
	// further, it acts as a RULE for children i.e. child/children must define this method
	abstract void bookCab(String fromLocation, String toLocation);
	
}*/

interface Cab{
	// Property of interface and they are constants i.e. values cannot be modified
	int baseFare = 100; // baseFare and pricePerKm cannot be modified. they are fixed i.e. constants in Interface
	int pricePerKm = 10;
	
	// we get error below: interfaces cannot have constructors
	// we cannot create its objects, and JVM will also not create its objects
	// interface cannot have OBJECTS. interface is just like class which has data associated to it as in static data
	/*Cab(){
		baseFare = 100;
		pricePerKm = 10;
		System.out.println("Cab Object Constructed");
	}*/
	
	// any method in interface is by default public abstract
	// this is once again a RULE which class implementing it, must define
	void bookCab(String fromLocation, String toLocation); // -> public abstract void bookCab(String fromLocation, String toLocation); 
	
}

class OlaMini implements Cab{ //extends Cab{
	
	String wifiUserName;
	String wifiPassword;
	int pricePerKm;
	
	OlaMini(){
		wifiUserName = "edureka";
		wifiPassword = "ishant@123";
		pricePerKm = Cab.pricePerKm + 5;
		System.out.println("OlaMini Object Constructed");
	}
	
	public void bookCab(String fromLocation, String toLocation) {
		System.out.println("OlaMini Booked from "+fromLocation+" to "+toLocation);
		System.out.println("Wifi Details: "+wifiUserName+" | "+wifiPassword);
		System.out.println("Please Pay: \u20b9"+( baseFare+ (5*pricePerKm) ) );
	}
	
}

class OlaPrimeSedan implements Cab{//extends Cab{
	
	String accessToken;
	int pricePerKm;
	
	OlaPrimeSedan(){
		accessToken = "EDUISH123";
		pricePerKm = Cab.pricePerKm + 10;
		System.out.println("OlaPrimeSedan Object Constructed");
	}
	
	public void bookCab(String fromLocation, String toLocation) {
		System.out.println("OlaPrimeSedan Booked from "+fromLocation+" to "+toLocation);
		System.out.println("Access Token: "+accessToken);
		System.out.println("Please Pay: \u20b9"+( baseFare+ (5*pricePerKm) ) );
	}
	
}


public class RTP {

	public static void main(String[] args) {
		
		/*
		Cab cRef; // Ref Variable
		cRef = new Cab(); // Object Construction
		
		cRef.bookCab("Redwood Shores", "Country Homes");*/
		
		// RTP: Parent's Ref Var can Point to the Child Object
		// RTP: Interface Ref Var can Point to the Object of class which implements it
		Cab cRef;			  // Cab Parent Ref Variable :)
		
		cRef = new OlaMini(); // Cab Parent Ref points to OlaMini Child
		cRef.bookCab("Redwood Shores", "Country Homes");
		
		System.out.println();
		
		cRef = new OlaPrimeSedan(); // Cab Parent Ref points to OlaPrimeSedan Child
		cRef.bookCab("Redwood Shores", "Country Homes");
		
		System.out.println();
		
		// Creating the Object of Parent i.e. new Cab() and executing bookCab of Parent. is it needed ? NO
		// make the Cab class as abstract
		// now as a developer, i cannot create its objects  :)
		//cRef = new Cab();
		//cRef.bookCab("Redwood Shores", "Country Homes");

	}

}

// Why Inheritance   -> Should be Clear
// RTP				 -> Should be Clear
