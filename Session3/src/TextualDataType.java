
public class TextualDataType {

	public static void main(String[] args) {
		
		char[] name1 = {'J','o', 'h', 'n'};
		System.out.println(name1); // It will not display the HashCode and will display the data directly as a word or text
		
		
		String name2 = "Jennie";			// Interned String: Points to String literal in constant pool
		String name3 = new String("Jim");	// Object String  : Points to String Object in Heap
		
		System.out.println(name2);
		System.out.println(name3);
		
		// Strings are IMMUTABLE. They cannot be modified.
		// Any Modification operation gives a new String in return
		String modifiedName2 = name2.toUpperCase(); // as the function name toUpperCase, it means convert the String to UpperCase
		String modifiedName3 = name3.toUpperCase();
		
		System.out.println("name2 now is: "+name2);
		System.out.println("name3 now is: "+name3);
		
		System.out.println("modifiedName2 is: "+modifiedName2);
		System.out.println("modifiedName3 is: "+modifiedName3);
		
		
		String name4 = "Jennie";
		String name5 = new String("JENNIE");
		
		if(name2 == name4) {
			System.out.println("name2 == name4");
		}else {
			System.out.println("name2 != name4");
		}
		
		if(name2 == name5) {
			System.out.println("name2 == name5");
		}else {
			System.out.println("name2 != name5");
		}
		
		// It means, only String literals i.e. Interned can be compared with == operator and not String objects
		// We can use String methods to compare the data
		//if(name2.equals(name5)) {
		if(name2.equalsIgnoreCase(name5)) {
			System.out.println("name2 equals name5");
		}else {
			System.out.println("name2 not equals name5");
		}
		
		//if(name2.compareTo(name5) == 0) {
		if(name2.compareToIgnoreCase(name5) == 0) {
			System.out.println("name2 not comparedTo name5");
		}
		
	}

}
