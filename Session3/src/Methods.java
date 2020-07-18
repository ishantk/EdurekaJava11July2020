
public class Methods {
	
	
	// Function or Method
	// Method -> Created inside the class
	
	// void -> return type, return nothing
	// showMaxNumber1 is the name of the method
	// (int[] array) -> input list, array as reference variable is passed as input :)
	// Since, no static keyword, Method is known as NON-STATIC Method
	void showMaxNumber1(int[] array) {
		
		int max = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("MAX is: "+max);
		
	}
	
	// everything is same, instead a static keyword in front of method
	// Hence, Method is known as STATIC Method
	static void showMaxNumber2(int[] array) {
		
		int max = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("MAX is: "+max);
		
	}
	
	// Non-Static 
	// Return Typ here is int
	// Method must return something, where it is executed and that something must be integer
	// also, return shall be the last statement in the method
	int getMaxNumber1(int[] array) {
		
		int max = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
		
	}
	
	static int getMaxNumber2(int[] array) {
		
		int max = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
		
	}
	
	int addNumbers(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	// PS: public private protected default i.e. modifiers for the access will be discussed later :)
	
	public static void main(String[] args) {
		
										//  0		1      2     3       4
		int[] covid19IndiaCases17July = {103516, 46413, 19155, 10662, 212208};
		int[] covid19IndiaCases18July = {113516, 59413, 229155, 17662, 56208};
		
		int[] iplTeamPoints = {135, 175, 443, 189, 567};
		

		/*
		int max17July = covid19IndiaCases17July[0]; // 103516
		int max18July = covid19IndiaCases18July[0]; // 113516
		
		for(int i=0;i<5;i++) {
			if(covid19IndiaCases17July[i] > max17July) {
				max17July = covid19IndiaCases17July[i];
			}
		}
		
		for(int i=0;i<5;i++) {
			if(covid19IndiaCases18July[i] > max18July) {
				max18July = covid19IndiaCases18July[i];
			}
		}
		
		System.out.println("max17July cases: "+max17July);
		System.out.println("max18July cases: "+max18July);
		*/
		
		// From above solution, we can see the same code statements are repeated to solve the problem
		// i.e. in an array, if we need to find max number, we need to write the same logic again and again anytime :)
		// Create a Method which can be executed again and again so as to give us back the same result, instead of repeating code snippet
		
		// 1. Execute a NON-STATIC Method
		//    We need to create an Object of the Class to execute a Non-Static Method
		//    Object Construction Statement -> ClassName refVar = new ClassName();
		
		// Object Construction Statement for class Methods -> new creates an object and gives the HashCode back in refVar
		Methods refVar = new Methods();
		//System.out.println(refVar);
		refVar.showMaxNumber1(covid19IndiaCases17July);
		refVar.showMaxNumber1(covid19IndiaCases18July);
		refVar.showMaxNumber1(iplTeamPoints);
		
		System.out.println();
		
		// 2. Execute Static Method
		//    Use the Class Name. No Need to create Objects. Accessible Without Objects :)
		Methods.showMaxNumber2(covid19IndiaCases17July);
		Methods.showMaxNumber2(covid19IndiaCases18July);
		Methods.showMaxNumber2(iplTeamPoints);
		
		// PS: non static has to do something with Object
		//     static has something to do with class 
		//     upcoming discussion on class and object shall solve this query :)
		
		// Execution of Methods which return
		// They will return back some data which we must capture somewhere for eg: in the result variable below:

		int result1 = refVar.getMaxNumber1(iplTeamPoints);
		int result2 = Methods.getMaxNumber2(iplTeamPoints);
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		
		// Directly display the returned result
		System.out.println("covid19IndiaCases18July: "+refVar.getMaxNumber1(covid19IndiaCases18July));
		System.out.println("covid19IndiaCases18July: "+Methods.getMaxNumber2(covid19IndiaCases18July));
		
		// Sorting Algorithms: insertion sort, bubble sort, quick sort, merge sort, heap sort, radix sort :)

		System.out.println("Sum of 10 and 20 is: "+refVar.addNumbers(10, 20));
		System.out.println("Sum of 101 and 121 is: "+refVar.addNumbers(101, 121));
		
	}

}
