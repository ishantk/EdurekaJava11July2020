
public class WrapperClasses {

	public static void main(String[] args) {
		
		int i = 10; // Primitive Type: Stores value
		
		// Kind of converting primitive to a reference
		// BOXING :)
		Integer iRef = new Integer(i); // Object Construction of Class Integer
		
		System.out.println("i is: "+i);
		System.out.println("iRef is: "+iRef); // UNBOXING :)
		
		int j = iRef.intValue(); // Extracting Primitive from Object -> UNBOXING
		
		char ch = 'A';
		Character cRef = new Character(ch); // BOXING	: Represent primitives as Objects i.e. Reference Types
		char c = cRef.charValue();			// UNBOXING	: Extract primitives from Objects i.e. Reference Types
		
		
		double d = 20.22;
		Double dRef = d;	 // AUTO-BOXING | -> This will be taken care by Compiler: Double dRef = new Double(d);
		
		double e = dRef;	// AUTO-UNBOXING| -> double e = dRef.doubleValue();
		
	}

}
