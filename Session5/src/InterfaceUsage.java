
interface Notification{
	void notifyWithMessage(String message);
}

class User implements Notification{
	
	String name;
	String phone;
	String email;
	
	public User() {
		
	}
	
	public User(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public void notifyWithMessage(String message) {
		System.out.println("--------------------------------");
		System.out.println("Dear, "+name);
		System.out.println("New Notification: "+message);
		System.out.println("--------------------------------");
		System.out.println();
	}
	
}

class Order{
	
	User user; // Order Has-A User Object's Reference
	int state; // 0 means order placed, 1 means restaurant accepted, 2 means delivery person is on the way, 3 means order delivered
	
	String[] message = {"order placed","restaurant accepted", "delivery person is on the way", "order delivered"}; 
	
	// Reference Variable to Some Object which will implement Notification Interface
	Notification notification;
	
	
	Order(){
		
	}
	
	Order(User user){
		this.user = user; // attach user with order -> Has-A Relationship :)
	}
	
	void changeState(int state){
		this.state = state; // change state of Order
		notification.notifyWithMessage(message[state]);
	}
	
	//									RTP:  notification ref shall point to the Object of User, who is implementing it :)
	void registerForNotifications(Notification notification) {
		this.notification = notification;
	}
	
}



public class InterfaceUsage {

	public static void main(String[] args) {
		
		User uRef = new User("John", "99999 11111", "john@example.com");
		
		Order order = new Order(uRef);
		order.registerForNotifications(uRef); // In my order object i will make user to be registered to receive notifications :)
		
		order.changeState(0);
		
		order.changeState(1);
		
		order.changeState(2);
		
		order.changeState(3);
		
	}

}

// With RTP, we can notify some other object if something changes in one object :)
