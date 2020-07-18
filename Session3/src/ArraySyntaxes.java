
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// Implicit Syntax
		// Create array with the elements and size is automatically allocated
		int[] a1 = {10, 20, 30, 40, 50};	// Compiler will translate this syntax into explicit one eg: int[] a1 = new int[]{10, 20, 30, 40, 50};
		int a2[] = {10, 20, 30, 40, 50};
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		// Explicit Syntax
		// Create array with the elements and size is automatically allocated
		int[] a3 = new int[]{10, 20, 30, 40, 50};
		int a4[] = new int[]{10, 20, 30, 40, 50};
		
		// Create array with a Size and it will have all the elements as 0
		int[] a5 = new int[5];
		a5[1] = 111;
		a5[4] = 444;
		System.out.println("a5 is: "+a5);
		
		/*System.out.println("a5[0] is: "+a5[0]);
		System.out.println("a5[1] is: "+a5[1]);
		System.out.println("a5[2] is: "+a5[2]);
		System.out.println("a5[3] is: "+a5[3]);
		System.out.println("a5[4] is: "+a5[4]);*/
		
		for(int i=0;i<a5.length;i++) {
			System.out.println("element at "+i+" idx is: "+a5[i]);
		}

		int a6[], a7[];
		a6 = new int[5];
		a7 = new int[10];
		
		int[] a8, a9;
		a8 = new int[5];
		a9 = new int[10];
		
	}

}
