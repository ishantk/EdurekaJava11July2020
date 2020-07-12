
public class SelectiveStatements {

	public static void main(String[] args) {
		
		// MODEL
		
		// we will map promo codes to some integer number
		int HSBC500 = 1;
		int PAYZAPP100 = 2;
		
		double amountToPay = 1635.0;
		
		// CONTROLLER
		
		// Simple if/else
		/*
		if(amountToPay >= 250) {
			System.out.println("You are Eligible for applying Promo Code");
		}else {
			System.out.println("Sorry!! You cannot apply promo Code");
			System.out.println("Please pay \u20b9"+amountToPay);
		}*/
		
		int promoCode = PAYZAPP100;

		// Nested if/else
		/*
		if(amountToPay >= 250) {
			System.out.println("You are Eligible for applying Promo Code");
			if(promoCode == HSBC500 && amountToPay >= 500) {
				double discount = 0.15 * amountToPay;
				if(discount >= 125) {
					discount = 125;
				}
				System.out.println("Promo Code Applied and Dicsount is: "+discount);
				System.out.println("Please Pay \u20b9 "+(amountToPay-discount));		
			}else {
				System.out.println("Sorry HSBC500 cannot be Used");
			}
		}else {
			System.out.println("Sorry!! You cannot apply promo Code");
			System.out.println("Please pay \u20b9"+amountToPay);
		}*/
		
		// Ladder if/else
		if(amountToPay >= 250) {
			System.out.println("You are Eligible for applying Promo Code");
			if(promoCode == HSBC500 && amountToPay >= 500) {
				double discount = 0.15 * amountToPay;
				if(discount >= 125) {
					discount = 125;
				}
				System.out.println("Promo Code Applied and Dicsount is: "+discount);
				System.out.println("Please Pay \u20b9 "+(amountToPay-discount));		
			}else if(promoCode == PAYZAPP100) {
				double discount = 0.15 * amountToPay;
				if(discount >= 100) {
					discount = 100;
				}
				System.out.println("Promo Code Applied and Dicsount is: "+discount);
				System.out.println("Please Pay \u20b9 "+(amountToPay-discount));
			}else {
				System.out.println("Sorry Promo Code cannot be Used");
			}
		}else {
			System.out.println("Sorry!! You cannot apply promo Code");
			System.out.println("Please pay \u20b9"+amountToPay);
		}
		
		// Assignment: 1. Suggest user the promo code if user has applied a wrong one
		//			   2. Suggest user the promo code which delivers mode discounts in case user has applied a promo code with less discounts

	}

}
