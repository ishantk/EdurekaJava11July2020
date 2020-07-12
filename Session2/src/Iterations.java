// In Java, we follow naming conventions
// Class Names begin from Upper Case Alphabet and variables form lower Case
public class Iterations {

	public static void main(String[] args) {
		// COVID-19 Real time data
		// State wise active cases
		
		// Considering active Covid Cases
		int maharashtra = 103516;
		int tamilNadu = 46413;
		int delhi = 19155;
		int gujarat = 10662;
		int uttarPradesh = 12208;
		
		// As a developer if i have to write data for n number of states its gonna be n number of lines
		// we have to create n number of variables to store data
		
		// Array: Multi Value Container
		//        Homogeneous i.e. data can be only int for its elements
		//		  It is indexed from 0 to n-1
		//							  0		 1       2     3       4
		int[] covid19IndiaCases = {103516, 46413, 19155, 10662, 12208};
		
		System.out.println("maharashtra: "+maharashtra); 			 // 103516
		System.out.println("covid19IndiaCases: "+covid19IndiaCases); // HashCode
		
		// covid19IndiaCases is a REFERENCE VARIBALE (in Stack) which holds the HashCode of Array
		// Array is available in the HEAP Area
		
		int totalCases = 0;
		
		totalCases = maharashtra + tamilNadu + delhi + gujarat + uttarPradesh;
		System.out.println("Total Cases (Variables): "+totalCases);
		
		totalCases = covid19IndiaCases[0] + covid19IndiaCases[1] + covid19IndiaCases[2] + covid19IndiaCases[3] + covid19IndiaCases[4];
		System.out.println("Total Cases (Array):"+totalCases);
		
		// Loops:
		totalCases = 0;
		
		int idx = 0; // idx is created in main, and is destroyed when main finishes
		
		while(idx < 5) { // condition is checked in the beginning i.e. at entry
			totalCases += covid19IndiaCases[idx];
			idx++;
		}
		
		System.out.println("Total Cases (While Loop):"+totalCases);
		
		totalCases = 0;
		idx = 0;
		
		do {
			totalCases += covid19IndiaCases[idx];
			idx++;
		}while(idx < 5); // condition is checked in the end i.e. at exit
		
		System.out.println("Total Cases (do While Loop):"+totalCases);
		
		totalCases = 0;
		
		// use for loop for better memory optimizations
		for(int i=0;i<5;i++) { // i will be created when loop is created and is destroyed when loop finishes
			totalCases += covid19IndiaCases[i];
		}
		
		System.out.println("Total Cases (for Loop):"+totalCases);

	}

}
