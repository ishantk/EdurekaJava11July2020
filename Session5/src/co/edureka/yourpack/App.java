package co.edureka.yourpack;

import co.edureka.mypack.One;
//import co.edureka.*; // import all the classes here -> not a good practice as we may import unused classes

//error : default is only accessible within the same package and not outside it
//import co.edureka.mypack.Two; 

// Inheritance across the package
class CA extends One{
	
	void show() {
		// lets access parent's methods
		//pvtShow(); // error
		//defShow(); // error
		// only within child class boundary :)
		protShow(); // allowed : Child can access protected properties outside the package :)
		pubShow();  // allowed
	}
	
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow(); // error: only within class
		//oRef.defShow(); // error: only within the package
		//oRef.protShow();// error: only within the package BUT, inheritable outside the package
		oRef.pubShow(); // OK   : accessible anywhere and everywhere
		
		CA cRef = new CA();
		cRef.show();
		//cRef.pubShow();  // Direct Access Allowed
		//cRef.protShow(); // Direct Access Not Allowed
		
	}

}
