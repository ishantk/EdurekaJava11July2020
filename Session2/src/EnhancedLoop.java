
public class EnhancedLoop {

	public static void main(String[] args) {
		
		// Roll Numbers of Top 5 Students in some school
		int[] students = {101, 750, 123, 455, 689};
		
		// Basic For Loop
		for(int i=0;i<5;i++) {
			System.out.println(students[i]); // read the element on the basis of index one by one
		}
		
		System.out.println();
		
		// Enhanced For Loop shall not use indexes. It directly reads data into variable
		for(int rollNumber : students) {
			System.out.println(rollNumber);
		}

		// with Enhanced For Loop: Skip Indexing and work on data of Array directly :)
	}

}
