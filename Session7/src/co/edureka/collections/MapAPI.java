package co.edureka.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Reference: https://api.covid19india.org/data.json

public class MapAPI {

	public static void main(String[] args) {
	
		//Map<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("active", 73218);
		map.put("confirmed", 129287);
		map.put("deaths", 2412);
		map.put("deltaconfirmed", 5172);
		map.put("deltadeaths", 98);
		map.put("deltarecovered", 3860);
		
		map.put("confirmed", 130287);	// Update operation
		// Map will always contain unique keys but values may be duplicated
		
		map.put(null, 1000);
		map.put("mykey", null);
		
		System.out.println("map is:");
		System.out.println(map);
		
		int confirmedCases = map.get("confirmed");
		System.out.println("confirmed cases: "+confirmedCases);
		
		if(map.containsKey("deltaconfirmed")) {
			System.out.println("deltaconfirmed key is in the Map");
		}
		
		if(map.containsValue(130287)) {
			System.out.println("130287 value is in the Map");
		}
		
		map.remove("deltadeaths");
		System.out.println(map);
		
		Set<String> keys = map.keySet(); // will return Set of Keys
		System.out.println("keys in map:");
		System.out.println(keys);
		
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);
			System.out.println(key+" \t "+value);
		}

		// Hashtable is Thread-Safe
		// it will not allow null key and null values
	
		//Hashtable<Integer, String> employees = new Hashtable<Integer, String>();
		TreeMap<Integer, String> employees = new TreeMap<Integer, String>();
		employees.put(101, "John");
		employees.put(201, "Ana");
		employees.put(301, "Kim");
		employees.put(401, "Sia");
		employees.put(501, "Dave");
		//employees.put(null, "Harry");	// error
		//employees.put(601, null); 	// error
		
		System.out.println(employees);
		
	}

}
