class Parent{
	
	String fname;
	String lname;
	int wealth;
	
	Parent(){
		fname = "John";
		lname = "Watson";
		wealth = 100000;
		System.out.println("Parent Object Constructed");
	}
	
	void showDetails() {
		System.out.println("Fname: "+fname+"\nLname: "+lname+"\nWealth: \u20b9"+wealth);
	}
}

// extends keywords create Inheritance Relationship

// Inheritance Rule #1
// Before the Child Object is Constructed, Parent Object will be constructed in the Memory
// Parent Child Relationship: Whatever Parent has, and if child does not have it, child can access it :)
class Child extends Parent{
	
	String fname;
	int wealth;
	String company;
	
	Child(){
		fname = "Fionna";
		wealth = 30000;
		company = "ABC Constructions";
		System.out.println("child Object Constructed");
	}
	
	// Same method of Parent, Re-Defined by Child : Overriding
	void showDetails() {
		super.showDetails(); // Access Parent's Properties from the Child with super keyword
		System.out.println("Fname: "+fname+"\nLname: "+lname+"\nWealth: \u20b9"+wealth+"\nCompany: "+company);
	}
}

class CA{
	
}

class CB extends CA{ // Single Level
	
}

class CC extends CB{ // Multi Level
	
}

class CD extends CA{ // Hierarchy | CB and CD are Children of CA
	
}

// Explore and find Use Cases from make My trip web site where are these used :)


public class WhatIsInheritances {

	public static void main(String[] args) {
		

		//Parent pRef = new Parent(); // Object Construction Statement
		//pRef.showDetails();
		
		Child cRef = new Child();
		cRef.wealth -= 5000;	// updated wealth attribute in the Parent Object
		cRef.showDetails(); 	// Child has no method showDetails(), its their in the Parent. So Parent's showDetails() is executed
		
	}

}
