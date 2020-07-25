package co.edureka.mypack;

// public class
// source file name, must be same name as of public class i.e. One.java :) 
public class One {
	
	private void pvtShow() {
		System.out.println("This is private show of One");
	}
	
	void defShow() {
		System.out.println("This is default show of One");
	}
	
	protected void protShow() {
		System.out.println("This is protected show of One");
	}
	
	public void pubShow() {
		System.out.println("This is public show of One");
	}

}

// default class
class Two{
	
	private void pvtShow() {
		System.out.println("This is private show of Two");
	}
	
	void defShow() {
		System.out.println("This is default show of Two");
	}
	
	protected void protShow() {
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow() {
		System.out.println("This is public show of Two");
	}
	
}

// Class can either be public or default
// classes cannot be private or protected
/*
private class Three{
	
}

protected class Four{
	
}
*/

// we can create as many as default classes we want
/*class Five{
	
}*/

// More than 1 public class in the same file isnt allowed
// Because, Java would have to have the file name same as that of public lcass
/*public class Six{
	
}*/
