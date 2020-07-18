
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		String str = new String("Hello");
		String newStr = str.concat(" World"); // concat will not modify old string
		
		System.out.println("str is: "+str);
		System.out.println("newStr is: "+newStr);

		
		// StringBuffer : MUTABLE Version of String     | THREAD-SAFE
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		
		System.out.println("buffer is: "+buffer);
		
		
		// StringBuilder : MUTABLE Version of String	| NOT THREAD-SAFE
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		
		System.out.println("builder is: "+builder);
		
		// Thread Safety is Future Discussion
		
	}

}
