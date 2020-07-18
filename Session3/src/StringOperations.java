
public class StringOperations {

	public static void main(String[] args) {
					  //0123456.....
		String names = "John, Jennie, Jim, Jack, Joe";
		System.out.println(">> names is: "+names);
		int length = names.length();
		System.out.println(">> length of names is: "+length);
		
		char ch = names.charAt(0);
		System.out.println("ch is: "+ch); // J
		
		ch = names.charAt(length-1); // length-1 is 28-1 i.e. 27 and hence e
		System.out.println("ch now is: "+ch); // e
		
		int idx = names.indexOf('o');
		System.out.println(">> index of o is: "+idx); // 1
		
		idx = names.lastIndexOf('o');
		System.out.println(">> last index of o is: "+idx); // 26
		
		String anotherNames = names.substring(6);
		System.out.println("anotherNames: "+anotherNames);
		System.out.println("names: "+names);
		
		String name = names.substring(6, 12); // start from 6 till 11 i.e. less than 12
		System.out.println("name: "+name);
		
		String[] splittedNames = names.split(",");
		for(int i=0;i<splittedNames.length;i++) {
			System.out.println(splittedNames[i].trim());
		}
		
		String replacedNames = names.replace('J', 'K');
		System.out.println("replacedNames: "+replacedNames);
		System.out.println("names: "+names);
		
		String email = "johnexample.com";
		String password = "12AB";
		
		if(email.contains("@") && email.contains(".")) {
			System.out.println("Valid Eamil");
		}else {
			System.out.println("Invalid Email");
		}
		
		if(password.isEmpty()) {
			System.out.println("Please enter Your Password");
		}else {
			if(password.length()<5) {
				System.out.println("Password needs to be at least 5 characters");
			}
		}
		
		String chatMessage = "Hey Sia, I hope you remeber my address: 2144-B20, Redwood Shores";
		if(chatMessage.contains("address")) {
			System.out.println("Show the Chat Message With Address");
			int i = chatMessage.indexOf("address");
			String adrs = chatMessage.substring(i);
			System.out.println(adrs);
		}
		
		String fileName = "Hello.mp3";
		if(fileName.endsWith(".mp3")) {
			System.out.println("We can Play the Audio File");
		}
		
		String[] phoneNumbers = {
				
				"+91 98765 12341",
				"+91 99765 11221",
				"+91 91265 22987",
				"+91 98141 12456",
				"+91 98567 98709",
		};
		
		String toSearch = "987";
		
		for(int i=0;i<phoneNumbers.length;i++) {
			if(phoneNumbers[i].contains(toSearch)) {
				System.out.println(phoneNumbers[i]);
			}
		}
	}

}
