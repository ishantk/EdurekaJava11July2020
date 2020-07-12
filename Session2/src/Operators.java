/*
 	Model: Data Storage
 		   Primitive Type (discussed) or Reference Type (yet to be discussed)
 		   
 	Controller: Logical Processing of Data either in Primitives or References
 		   1. Computation : with Operators
 		   2. Decisions   : with conditionals flows -> if/else
 		   3. Iterations  : with Loops 
 */

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic Operators
		// +, -, *, /, %
		
		int productPrice1 = 100;
		int productPrice2 = 200;
		
		int totalPrice = productPrice1 + productPrice2;
		
		double discount = 0.20;
		double finalAmount = totalPrice - totalPrice*discount;
		System.out.println("Final Amount to be paid is: \u20b9"+finalAmount);
		
		// Hashing Algo:
		// In memory we create buckets and we have n number of buckets
		// assuming n is 3 it means we have 3 buckets
		// now, data must be stored in these 3 buckets
		
		int numOfBuckets = 3;
		
		int user1 = 123902;
		int user2 = 345119;
		int user3 = 431890;
		
		int hashCode1 = user1 % numOfBuckets;
		int hashCode2 = user2 % numOfBuckets;
		int hashCode3 = user3 % numOfBuckets;
		
		System.out.println("user1 HashCode is "+hashCode1);
		System.out.println("user2 HashCode is "+hashCode2);
		System.out.println("user3 HashCode is "+hashCode3);
		
		// Assignment Operators
		// =, +=, -=, *=, /=, %=
		
		int n1 = 10;
		//n1 = n1 + 20;
		n1 += 20; // which means this n1 = n1 + 20; :)
		System.out.println("n1 now is: "+n1); // 30
		
		n1 /= 2;
		System.out.println("n1 now is: "+n1); // 15

		// Unary Operators : increment or decrement
		int quantity = 1;
		quantity++;	// postfix : quantity += 1	| 2
		++quantity; // prefix  : quantity += 1	| 3
		quantity--; // quantity -= 1			| 2
		
		System.out.println("Quantity is: "+quantity); // 2
		
		// Assignment: Explore the difference between prefix and postfix usage :)
		
		// Conditional Operators | they give result either true or false
		// >, <, >=, <=, ==, !=
		int wallet = 300;
		int cabFare = 375;
		
		System.out.println("Can i Book the Cab: "+(cabFare < wallet)+" Money Short: "+(wallet-cabFare));
		
		int immigrationPoints = 375;
		System.out.println("Can I apply for immigration: "+(immigrationPoints >= 375));
		
		// Logical Operators | they give result either true or false
		// && (both should be true) || (anyone should be true) ! (make true as false and false as true)
		
		boolean internetStatus = false;
		boolean gpsStatus = true;
		
		System.out.println("Can i use Google Maps to Navigate: "+(internetStatus && gpsStatus));
		
		int amount = 400;
		int promoCode = 1001;
		
		// if we wish to store the result
		boolean result = amount>=500 && promoCode == 1001;
		
		System.out.println("Can i get flat 50% off: "+result);
		System.out.println("Can i get flat 50% off: "+(amount>=500 || promoCode == 1001));
		
		// in networking and security we have bitwise operators and shift operators used
		// binary representation of decimal data i.e. 12 in binary is 1 1 0 0 :) explore in case you are un aware
		int num1 = 12;			 // 1 1 0 0 | 4 bit representation of 12 in binary
		int num2 = 8;  			 // 1 0 0 0 | 4 bit representation of 8 in binary
		
		// &, |, ^ 	(^ strictly only single 1)
		int num3 = num1 & num2;	 // 1 0 0 0 // both must be one
		int num4 = num1 | num2;  // 1 1 0 0	// any one should be 1
		int num5 = num1 ^ num2;  // 0 1 0 0 // strictly only single 1
		
		System.out.println("num3 is: "+num3);
		System.out.println("num4 is: "+num4);
		System.out.println("num5 is: "+num5);
		
		// Shift Operators
		int num6 = num1 >> 2; // divide the number by 2 power 2 i.e. 12 / 4 = 3
		int num7 = num1 << 3;  // multiple the number by 2 power 3 i.e. 12 * 8 = 96
		// base is always 2 
		System.out.println("num6 is: "+num6);
		System.out.println("num7 is: "+num7);
		
		// Ternary Operator, canIBookCab becomes true of condition satisfied else it will be false
		boolean canIBookCab = wallet > cabFare ? true : false;
		System.out.println(">> Can i Book the Cab: "+canIBookCab);
	}

}
