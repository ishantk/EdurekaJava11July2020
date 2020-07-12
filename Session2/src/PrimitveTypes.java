// class denotes a Java program
public class PrimitveTypes {

	// main method is executed when we will run this program
	public static void main(String[] args) {
		// whatever we write in main, is executed in a sequence one by one
		
		// Storing Data
		// Primitive Types stores Single Value
		
		// Number Storage : integers and floating points
		int age = 20; 		// 32 bits in memory
		byte b1 = 10;		// 8 bits
		short s1 = 20;		// 16 bits
		long l1 = 1082842;  // 64 bits
		
		// if byte takes 8 bits -> 2 power 8 will be the capacity i.e. 256
		// we will divide it by 2 to store positive and negative numbers
		// -128 to 0 to 127 | Limits for integral data in byte container
		
		//byte b2 = 200; // error: as 200 is out of range of byte
		
		float pi = 3.14f;				// 32 bits
		double shoePrice = 2350.77;		// 64 bits
		
		// float is data type
		// it tells what the container will contains
		// what will be the size of container
		// pi is the name of container, also known as variable
		// 3.14f is data in the container, also known as literal
		
		char gender = 'M';	// stores a single character and is 16 bits in memory
		// update container
		gender = 'F';		// data in the container i.e. literal is updated to a new value :)

		System.out.println("age is: "+age);
		System.out.println("pi is: "+pi);
		System.out.println("gender is: "+gender);
		
		// unicode for indian symbol of rupee
		char rupee = '\u20b9';
		char a = '\u0905';
		System.out.println("rupee is: "+rupee);
		System.out.println("a is: "+a);
		
		// assignment: print your name in your regional language using unicodes :)
		
		// can have values either true or false
		// 8 bits but from 8 bits only 1 bit is used as 1 or 0 internally
		boolean internetStatus = true;
		internetStatus = false;	// updated the data in boolean variable
		
		System.out.println("Is Internet On: "+internetStatus);
		
		// Reference Type: Holds lot of data
		// name contains a string literal which is collection of characters i.e. name is a multi value container
		String name = "John Watson";
		String email = "john@example.com";
		
		name = "John Cena";
		System.out.println("name is: "+name);
		
		// Reference Types: Future Discussion
		
	}

}
