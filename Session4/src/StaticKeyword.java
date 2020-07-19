
class Order{
	
	String date;
	String time;
	String email;
	String dishes;
	int price;
	
	// attribute of object, every object will have this attribute 
	// int numOfOrders = 0; // Not OK
	
	// static is property of class, which is not inside the Object and is within the class 
	// can be accessed by Class or its Object
	static int numOfOrders;
	
	Order(){
		// this will automatically make attributes as default and nulls
	}
	
	Order(String date, String time, String email, String dishes, int price) {
		numOfOrders++; // Property of Class Accessible By Object
		this.date = date;
		this.time = time;
		this.email = email;
		this.dishes = dishes;
		this.price = price;
	}
	
	// Property of Class and not of Object
	// can be accessed by Class or its Object
	static int getTotalOrders() {
		return numOfOrders;
	}
	
}

public class StaticKeyword {

	public static void main(String[] args) {
	
		Order o1 = new Order("20th July, 2020", "10:00AM", "john@example.com", "Burger, Sandwich", 300);
		Order o2 = new Order("20th July, 2020", "11:00AM", "jennie@example.com", "Noodles, Sandwich", 400);
		Order o3 = new Order("20th July, 2020", "12:00PM", "jim@example.com", "Pizza, Sandwich", 600);
		Order o4 = new Order("20th July, 2020", "13:00PM", "jack@example.com", "Coffee, Sandwich", 200);
		Order o5 = new Order("20th July, 2020", "14:00PM", "joe@example.com", "Burger, Coke", 150);
		
		// 5 Order objects are constructed in memory ?
		
		System.out.println("Total Orders: "+Order.numOfOrders);
		System.out.println("Total Orders: "+Order.getTotalOrders());
		System.out.println("Total Orders: "+o1.getTotalOrders());
		System.out.println("Total Orders: "+o5.getTotalOrders());
		

	}

}
