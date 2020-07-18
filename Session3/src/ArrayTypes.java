
public class ArrayTypes {

	public static void main(String[] args) {
		
		int[] covid19IndiaCases16July = {1351, 9413, 9155, 7662, 6208};
		int[] covid19IndiaCases17July = {103516, 46413, 19155, 10662, 212208};
		int[] covid19IndiaCases18July = {113516, 59413, 229155, 17662, 56208};
		
		// Multi Dim Arrays
		// Array of Arrays
		// we got 3 arrays, where each array is having 5 elements
		int[][] covid19IndiaCaseJuly = {
				// 0     1    2     3      4
				{1351, 9413, 9155, 7662, 6208},				// 0
				{103516, 46413, 19155, 10662, 212208},		// 1
				{113516, 59413, 229155, 17662, 56208}		// 2
		};
	
		System.out.println("Length of covid19IndiaCaseJuly is: "+covid19IndiaCaseJuly.length); 		 // 3
		System.out.println("Length of covid19IndiaCaseJuly[0] is: "+covid19IndiaCaseJuly[0].length); // 5
		System.out.println("Length of covid19IndiaCaseJuly[1] is: "+covid19IndiaCaseJuly[1].length); // 5
		System.out.println("Length of covid19IndiaCaseJuly[2] is: "+covid19IndiaCaseJuly[2].length); // 5
		
		System.out.println(covid19IndiaCaseJuly[1][4]); // 212208
		
		for(int i=0;i<covid19IndiaCaseJuly.length;i++) { // i: 0, 1, 2
			
			// i:0, j: 0 to 4 
			// i:1, j: 0 to 4 
			// i:2, j: 0 to 4 
			for(int j=0;j<covid19IndiaCaseJuly[i].length;j++) {
				System.out.print(covid19IndiaCaseJuly[i][j]+" "); // printing ith array jth index
			}
			System.out.println();
		}

		int[][][] yearlyCases = {
				// jan month data								// 0
				{
					{1351, 9413, 9155, 7662, 6208},				// day1 | 0				
					{103516, 46413, 19155, 10662, 212208},		// day2	| 1
					{113516, 59413, 229155, 17662, 56208}		// day3 | 2
				},
				// feb month data								// 1
				{
					{1351, 9413, 9155, 7662, 6208},				
					{103516, 46413, 19155, 10662, 212208},		
					{113516, 59413, 229155, 17662, 56208}	
				},
				// so on and so forth
		};
		
		// Assignment: Find the max from 2-D and 3-D Array :)
		
	}

}
