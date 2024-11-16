package MapQuestions;

import java.util.HashMap;
import java.util.Map;

//create a map add some key value pair and remove the specific key value pair from the map. Print the map before and after removal.
public class Question6 {

	public static void main(String[] args) {
		Map<String, String> Employee = new HashMap<>();
		Employee.put("Abhishekh", "Java Developer");
		Employee.put("Atharv", "Software Developer");
		Employee.put("Kalpesh", "Cloud Engineer");
		Employee.put("Jitesh", "Software tester");

//		use the loop to iterate over map and print all the key and values
	
		for (String k : Employee.keySet()) {
			System.out.println(k + " : " + Employee.get(k));
			System.out.println();
		}

	}

}
