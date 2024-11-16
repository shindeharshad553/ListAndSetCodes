package MapQuestions;

import java.util.HashMap;
import java.util.Map;

//Problem Statement : Write a program that creates a Map<String,Integer> and add five key value pairs of your choice print the map
public class CreateAndPopulateMap {

	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<>();
		mp.put("Ajay", 1);
		mp.put("Ganesh",2);
		mp.put("ishwar",3);
		mp.put("Rakesh",4);
		System.out.println(mp);
		
//		Key value pair 
//		Map is a structure that store the entries in the form of key and value pair 
		System.out.println(mp.keySet());
		System.out.println(mp.values());
	}

}
