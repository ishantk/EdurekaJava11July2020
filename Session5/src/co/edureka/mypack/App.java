package co.edureka.mypack;

public class App {

	public static void main(String[] args) {
		
		// We can create objects of classes in each other if in the same package
		One oRef = new One();
		Two tRef = new Two();
		
		//oRef.pvtShow();
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();

		//tRef.pvtShow();
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
		// private : not accessible outside the class
		// everyone else is accessible, iff the package is same :)

		// Encapsulation is hiding something in class/object and not allowing it to be used
		// achieved by making either attribute or the method as private :)
		
	}

}
