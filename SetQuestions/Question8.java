package SetQuestions;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

//Problem Statement : Implement a code to convert a List<String> to a Set<String> to remove duplicates 
public class Question8 {

	public static void copyToSet(List<String> l, Set<String> s) {
		for (String val : l) {
			s.add(val);
		}
//		System.out.println("The values in the set are : " + s);
	}

	public static void main(String[] args) {
		// Create a List<String>
		List<String> l = new ArrayList<>();
		// Add elements into List
		l.add("Ram");
		l.add("Lakshman");
		l.add("Bharat");
		l.add("Shatrugna");
		l.add("Ram");
		l.add("Sita");
		l.add("Hanuman");

		// Create a Set<String>
		Set<String> s = new HashSet<>();
		// Copy the elements from List to Set
		copyToSet(l, s);
		System.out.println("The values in set are : " + s);
	}

}
