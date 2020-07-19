// 1. Think of An Object
//    Flight : id, companyName, stops, departureTime, arrivalTime, fare

// 2. Create its Class
public class Flight {
	
	String id;
	String companyName;
	int stops;
	String departureTime;
	String arrivalTime;
	int fare;

	Flight(){
		this("6E-144", "Indigo", 1, "NA", "NA", 0); // Constructor Chaining -> Execution of 1 Constructor from Another
	}
	
	Flight(int stops, String departureTime, String arrivalTime, int fare){
		this("6E-144", "Indigo", stops, departureTime, arrivalTime, fare); // Constructor Chaining -> Execution of 1 Constructor from Another
	}
	
	Flight(String id, String companyName, int stops, String departureTime, String arrivalTime, int fare){
		//Flight(); // error: we can execute one constructor from another constructor but, name cannot be used
		//this(); // execution of default constructor
		this.id = id;
		this.companyName = companyName;
		this.stops = stops;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}
	
	void showFlight() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("| "+id +" "+companyName+" "+stops+" "+departureTime+" "+arrivalTime+ " "+fare);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
	}
	
}
