package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

//  Serializable is a Marker Interface used to tell the JVM that Object of Customer class can be serialized i.e. saved directly in a file :)
class Customer implements Serializable{ // if you wish to save the object directly class must implement Serializable
	
	String phone;
	String name;
	String email;
	//transient String email; // explore :)
	
	public Customer() {
		
	}
	
	public Customer(String phone, String name, String email) {
		this.phone = phone;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return phone + ","+ name + ","+email+"\n";
	}
	
}

class FileIOOperations{
	
	void writeInFile(String data) {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/customers-edureka.csv"); //csv -> comma separated value -> excel format
			
			// FileWriter -> API (Application Programming Interface) |  A built in Code For us
			//               works only for text Files
			//				 writes data in files as text
			//FileWriter writer = new FileWriter(file);     // overwrite data in file
			FileWriter writer = new FileWriter(file, true); // append the data in file | true -> enable append mode
			writer.write(data); // write data in file as text i.e. String
			writer.close(); // close the stream to release memory resources
			System.out.println("Data Written");
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
	void writeInFileAgain(String data) {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/customers-edureka-again.csv"); //csv -> comma separated value -> excel format
			
			// FileOutputStream -> API (Application Programming Interface) |  A built in Code For us
			//               works for text Files and binary files
			//				 writes data in files as bytes
			//FileOutputStream stream = new FileOutputStream(file);     // overwrite data in file
			FileOutputStream stream = new FileOutputStream(file, true); // append the data in file | true -> enable append mode
			stream.write(data.getBytes()); // write data in file as bytes :)
			stream.close(); // close the stream to release memory resources
			System.out.println("Data Written");
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
	void readFromFile() {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/customers-edureka.csv");
			FileReader reader = new FileReader(file); 			// reads char by character
			BufferedReader buffer = new BufferedReader(reader); // reads the file line by line :)
			
			String line = "";
			System.out.println("Showing the Contents:");
			while((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
	void readFromFileAgain() {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/customers-edureka-again.csv");
			FileInputStream stream = new FileInputStream(file); // reads byte by byte
			
			int i = 0;
			System.out.println("Showing the Contents:");
			while((i = stream.read()) != -1) { // read byte by byte and -1 denotes the end of file
				System.out.print((char)i); // print the byte as character
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
	void serializeCustomer(Customer customer) {
		try {
			File file = new File("/Users/ishantkumar/Downloads/customer-"+customer.phone+"-data.txt");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(customer);
			
			objectOutputStream.close();
			fileOutputStream.close();
			
			System.out.println("Object Saved");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	void deserializeCustomer() {
		try {
			File file = new File("/Users/ishantkumar/Downloads/customer-9191967676-data.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			Customer customer = (Customer)objectInputStream.readObject();
			
			System.out.println("CUSTOMER: "+customer);
			
			objectInputStream.close();
			fileInputStream.close();
			
			System.out.println("Object Saved");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}


public class CustomerManagementApp {

	public static void main(String[] args) {
		
		FileIOOperations fRef = new FileIOOperations();
		
		System.out.println("---------------------------");
		System.out.println("Welcome to CM App");
		System.out.println("1. Add Customer");
		System.out.println("2. Show All Customers");
		System.out.println("3. Show Customer By Phone");
		System.out.println("---------------------------");
		
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Choice: ");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			
			scanner.nextLine();
			
			Customer cRef = new Customer();
						
			System.out.println("Enter Customer Phone: ");
			cRef.phone = scanner.nextLine();
			
			System.out.println("Enter Customer Name: ");
			cRef.name = scanner.nextLine();
			
			System.out.println("Enter Customer Email: ");
			cRef.email = scanner.nextLine();
			
			System.out.println("--------------------------------");
			System.out.println("Customer Details:");
			System.out.println(cRef);
			System.out.println("--------------------------------");
			
			System.out.println("Do you wish to save Customer: (yes/no)");
			String save = scanner.nextLine();
			
			if(save.equals("yes")) {
				
				//fRef.writeInFile(cRef.toString());
				//fRef.writeInFileAgain(cRef.toString());
				
				fRef.serializeCustomer(cRef);
				
				System.out.println("Customer Saved in File");
			}
			
		}else if(choice == 2) {
			//fRef.readFromFile();
			//fRef.readFromFileAgain();
			
			fRef.deserializeCustomer();
		}else if (choice == 3){
			// Filter a Customer by Phone Number :)
		}else {
			System.out.println("INVALID CHOICE :(");
		}
		
		
		scanner.close();
		System.out.println("Thank You for Using CM App");
	}

}
