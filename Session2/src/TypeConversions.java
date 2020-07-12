
public class TypeConversions {

	public static void main(String[] args) {
		
		int johnsAge = 50;
		
		// Error
		// 32 bits of data is being copied into 8 bits of storage
		// could be a case data may not fit in
		//byte fionnasAge = johnsAge; //error
		// Down-Casting
		byte fionnasAge = (byte)johnsAge; // Explicit Conversion :) | we will be just copying 8 bits of data and data may be lost if it is more than 8 bits
		
		
		short otp = 3027;
		// here, data is copied form small container of 16 bits to 32 bits, compiler shall take care of it => Up-Casting
		int myOtp = otp;	// no error : UpCasting
				
		
		char ch = 'A';
		int number = ch; // copying char into number -> Implicit Type Conversion
		// automatically the ASCII Code of A is copied into number
		System.out.println("number is "+number);
		
	}

}
