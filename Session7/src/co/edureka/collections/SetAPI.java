package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Reference Link: https://www.cs.usfca.edu/~galles/visualization/OpenHash.html

public class SetAPI {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jennie");
		names.add("Jim");
		names.add("John");
		names.add("Sia");
		names.add("Kim");
		names.add("Sia");
		
		System.out.println("names are: "+names);
		
		//Set<String> set = new HashSet<String>();		// Polymorphic Statement
		//HashSet<String> set = new HashSet<String>();	// Direct Object Construction
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("John");
		set.add("Jennie");
		set.add("Jim");
		set.add("John");
		set.add("Sia");
		set.add("Kim");
		set.add("Sia");
		set.add("Ana");
		set.add("Dave");
		
		System.out.println("set is: "+set);
		
		// We can Iterate in Set with Iterator :)
		// Every element in set is added as per hashcodes and hence we cannot iterate as we dont have hashcodes and ofcourse no idexes here
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		
		if(set.contains("Ana")) {
			System.out.println("Ana is in the Set");
		}
		
		set.remove("Jim");
		
		System.out.println("Size of Set is:"+set.size());

	}

}
