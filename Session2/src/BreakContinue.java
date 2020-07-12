import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		int[] students = {101, 750, 123, 455, 689};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Roll Number to check if you are in Top 5: ");
		int rollNumber = scanner.nextInt();
		scanner.close();
		
		// Linear Search Algo in Arrays :)
		for(int i=0;i<5;i++) {
			System.out.println("Comparing "+rollNumber+" with "+students[i]);
			if(rollNumber == students[i]) {
				System.out.println("You are in Top5");
				break; // break terminates the loop
			}
		}
		
		System.out.println();
		
		// i=1 start
		// i=10 end
		// i++ is increment step by 1 for the loop
		for(int i=1;i<=10;i++) {
			
			if(i<=5) {
				continue; // skips the statements below and take the loop in next iteration :)
			}
			
			System.out.println("i is: "+i);
			
		}

		// Assignment: Explore Nested Loops
		//			   Labels on Loops
		
	}

}
