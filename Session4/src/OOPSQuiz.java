
// In a Restaurant we have a Menu which contains dishes

// we will create a Dish Object
// Dish : name, quantity, price

class Dish{
	
	String name;
	int quantity;
	int price;
	
	Dish(){
		this("NA", 0, 0);
	}
	
	Dish(String name, int quantity, int price){
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	void showDish() {
		System.out.println("Name: "+name+" Quantity: "+quantity+" Price: "+(quantity*price));
	}
	
	void increment() {
		quantity++; // quantity = quantity + 1
	}
	
	void decrement() {
		quantity--; // quantity = quantity - 1
	}
}

public class OOPSQuiz {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish("Veg Burger", 1, 100);	 // Object Construction
		Dish dish2 = new Dish("Noodles", 1, 200);		 // Object Construction
		Dish dish3 = dish1;								 // Reference Copy

		// Que1: How Many Objects are constructed in memory: 2
		//       We have 3 Ref. Variables out of which dish1 and dish3 points to the same object
		dish1.increment();	// 2
		dish2.increment();  // 2
		dish3.increment();  // 3
		dish3.increment();  // 4
		
		dish1.decrement();  // 3
		
		dish1.showDish();	// d1: Veg Burger 3 300
		dish2.showDish();	// d2: Noodles    2 300 
		dish3.showDish();   // d3: Veg Burger 3 300
		
	}

}
