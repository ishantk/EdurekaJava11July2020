/*
 	This is a multi-line comment
 	
 	Use Case: Flipkart HDFC Credit Card Offer
 	Problem: HDFC has given offer on iPhone and Bosch Washing Machine
 			 HDFC bank wish to know where customer spends or uses credit card more ?
 			 So that they can put up some stall and start selling the cards on the stores !!
 	
 	Its a 3 Day Offer
 	
 	Day		iPhone[Profit: 1000 Offer: 500]		HomeAppliance [Profit: 200 | Offer: 100]	
 	1		150 units							120 units			
 	2		250 units							220 units
 	3		100 units							180 units
 	
 	Analysis : Where should HDFC advertise More ?
 			   1. Money Spent By Customer
 			   2. Number of Customers -> HDFC wish to create more customers
 
 */

public class HDFCCreditCardUsageAnalysis {
	
	// instance variable : created in class
	int users;
	
	// static variable : created in class with static keyword
	static int cardUsages;

	public static void main(String[] args) {
		
		// MODEL VIEW CONTROLLER 

		// Model is Data -> We need storage containers to store data
		// Storage Container Creation Statements
		// We are creating storage containers in RAM for our Program to store the data
		// Data for Apple iPhone
		// local variables : created inside the main
		int iPhoneDay1 = 150;
		int iPhoneDay2 = 250;
		int iPhoneDay3 = 100;
		
		int iPhoneProfitsToFK = 1000;
		int iPhoneHdfcOffer = 500;
		
		// Data for Home Appliances
		int homeAppDay1 = 120;
		int homeAppDay2 = 220;
		int homeAppDay3 = 180;
		
		int homeAppProfitsToFK = 200;
		int homeAppHdfcOffer = 100;
		
		// Controller is Computation or Logic
		// Computational Expression Statement
		int totalSalesForIPhone = iPhoneDay1 + iPhoneDay2 + iPhoneDay3;
		int totalSalesForhomeApp = homeAppDay1 + homeAppDay2 + homeAppDay3;
		
		// View is either showing the data or reading the data to and from user
		// As of now, we will show the data and its a Textual Interface
		// Printing Statements
		System.out.println("3 day total Sales For IPhone is: "+totalSalesForIPhone);
		System.out.println("3 day total Sales For Home App is: "+totalSalesForhomeApp);
		
		// Controller is Computation or Logic
		// Logical Statement, check where we have more customers either in iPhone sales or in Home App
		if(totalSalesForIPhone > totalSalesForhomeApp) {
			System.out.println("More Customers for iPhone Sales were found on 3 Day Sale");
		}else {
			System.out.println("More Customers "+totalSalesForhomeApp+" for Home App Sales were found on 3 Day Sale by "+(totalSalesForhomeApp-totalSalesForIPhone));
		}

	}
	
	// Assignments: 
	// 1. Where did HDFC Bank Spent More in giving offers as in amount spent more
	// 2. How much profits were made by Flipkart. Will FK make more money in selling iphones or home appliances
	// 3. Create an Account on Github and explore how to install and link Github account with Eclipse :)

}
