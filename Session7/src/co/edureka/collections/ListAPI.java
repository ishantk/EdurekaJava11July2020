package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

// OOPS
class Song implements Comparable<Song>{
	
	String name;
	int duration;
	String artist;
	
	public Song() {
		name = "NA";
		duration = 0;
		artist = "NA";
	}
	
	public Song(String name, int duration, String artist) {
		this.name = name;
		this.duration = duration;
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", duration=" + duration + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Song o) {
		
		if(duration == o.duration) {
			return 0;
		}else if(duration > o.duration) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}

class NameComparator implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		return o1.name.compareTo(o2.name);
	}
	
}


class DurationComparator implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		if(o1.duration == o2.duration) {
			return 0;
		}else if(o1.duration > o2.duration) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

public class ListAPI {

	public static void main(String[] args) {
		
		// RTP
		/*List list = new ArrayList<String>();
		list = new LinkedList<String>();
		list = new Vector<String>();*/
		
		ArrayList list1 = new ArrayList(); // Hetrogeneous List i.e. any type of data can be added
		// Hetrogeneous List can store int, float, char, Song, String product or any other type of Object
		
		// Homogeneous List i.e. only String can be added
		ArrayList<String> list2 = new ArrayList<String>(); 		// Dynamic Array in the Memory
		//LinkedList<String> list2 = new LinkedList<String>();	// Doubly Linked in the Memory
		//Vector<String> list2 = new Vector<String>();			// Thread Safe Version of ArrayList
		
		ArrayList<Song> list3 = new ArrayList<Song>(); // Homogeneous List i.e. only Song can be added
		
		Song s1 = new Song("song1.mp3", 3, "john");
		Song s2 = new Song("song2.mp3", 4, "jennie");
		Song s3 = new Song("song3.mp3", 2, "john");
		Song s4 = new Song("song4.mp3", 1, "jim");
		Song s5 = new Song("song5.mp3", 7, "jack");
		Song s6 = new Song("song7.mp3", 9, "jack");
		

		// Operations on List:
		// 1. Add Data
		
		list1.add("John");		//0
		list1.add(10);
		list1.add(2.2);
		list1.add('A');
		list1.add(s1);			//n-1
		
		list2.add("Johnnie");		//0
		list2.add("Fionna");
		list2.add("Sia");
		list2.add("Ana");
		list2.add("Kim");
		list2.add("Dave");		//n-1
		//list2.add(10);		// error
		
		list3.add(s1);
		list3.add(s2);
		list3.add(s3);
		list3.add(s4);
		list3.add(s5);
		//list3.add("Jennie"); 	// error
		
		// 2. Print the List
		System.out.println("list1 is:");
		System.out.println(list1);
		
		System.out.println();
		System.out.println("list2 is:");
		System.out.println(list2);
		
		System.out.println();
		System.out.println("list3 is:");
		System.out.println(list3);
		
		
		// 3. Update Data in List
		list2.set(1, "Fionna Flynn");
		list3.set(4, s6);
		
		// 4. Remove Data from List
		list1.remove(2); // PS: index management i.e. +, - in indexing is taken care automatically
		
		
		// 5. Empty the List
		//list1.clear(); // remove all
		
		System.out.println();
		System.out.println("list1 is:");
		System.out.println(list1);
		
		System.out.println();
		System.out.println("list2 is:");
		System.out.println(list2);
		
		System.out.println();
		System.out.println("list3 is:");
		System.out.println(list3);
		
		// 6. Get the Data from List
		Object oRef = list1.get(1);
		System.out.println("index 1 element in list1: "+oRef);
		
		String str = list2.get(3);
		System.out.println("index 3 element in list2: "+str);
		
		Song sRef = list3.get(4);
		System.out.println("index 4 element in list3: "+sRef);
		
		// 7. Containment
		if(list2.contains("Ana")) {
			System.out.println("Ana is in the list");
		}
		
		if(list3.contains(s2)) {
			System.out.println("Song Found in the List: "+s2);
		}
		
		// 8. Length of List
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		
		// 9. Searching Indexes of Elements
		int idx = list2.indexOf("John");
		System.out.println("idx of John is: "+idx);
		
		// 10. Merge 2 lists
		ArrayList<String> names = new ArrayList<String>();
		names.add("Leo");
		names.add("Mike");
		names.add("Dan");
		names.add("George");
		
		names.addAll(list2); // All the elements from list2 will be added into names ArrayList
		
		System.out.println("names is: ");
		System.out.println(names);
		
		// 11. Iterating in the List
		// 11.1 For Loop
		System.out.println("==Iterating: Basic For Loop==");
		for(int i=0;i<list2.size();i++) {
			String name = list2.get(i);
			System.out.println(name);
		}
		
		// 11.2 Enhanced For Loop
		System.out.println("==Iterating: Enhanced For Loop==");
		for(String name : list2) {
			System.out.println(name);
		}
		
		// 11.3 Iterator API
		System.out.println("==Iterating: Iterator API==");
		Iterator<Object> itr1 = list1.iterator();
		Iterator<String> itr2 = list2.iterator();
		Iterator<Song> itr3 = list3.iterator();
		
		Object o = itr1.next();
		String n = itr2.next();
		Song s = itr3.next();
		
		System.out.println(o);
		System.out.println(n);
		System.out.println(s);
		
		System.out.println(itr2.next());
		System.out.println(itr3.next());
		
		
		while(itr2.hasNext()) {
			String str1 = itr2.next();
			System.out.println(str1);
			
			if(str1.equals("Sia")) {
				itr2.remove(); // remove function on iterator can delete the data from ArrayList
			}
			
		}
		
		// 11.4 ListIterator API -> Iterate in both directions
		System.out.println("==Iterating: ListIterator API==");
		ListIterator<String> listItr2 = list2.listIterator();
		
		while(listItr2.hasNext()) {
			String str1 = listItr2.next();
			System.out.println(str1);
		}
		System.out.println("---");
		while(listItr2.hasPrevious()) {
			String str1 = listItr2.previous();
			System.out.println(str1);
		}
		
		// 11.5 Enumeration
		System.out.println("==Iterating: Enumeration API==");
		Enumeration<String> eRef = Collections.enumeration(list2);
		while(eRef.hasMoreElements()) {
			String str1 = eRef.nextElement();
			System.out.println(str1);
		}
		
		System.out.println();
		System.out.println("List of Songs:");
		System.out.println(list3);
		
		Collections.sort(list3);
		System.out.println("List of Songs Now:");
		System.out.println(list3);
		
		System.out.println();
		
		Collections.sort(list3, new NameComparator());
		System.out.println(list3);
		
		System.out.println();
		
		Collections.sort(list3, new DurationComparator());
		System.out.println(list3);
		
		
	}

}
