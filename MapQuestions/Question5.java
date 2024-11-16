package MapQuestions;

import java.util.HashMap;
import java.util.Map;

//create a map add some key value pair and remove the specific key value pair from the map. Print the map before and after removal.
public class Question5 {

	public static void main(String[] args) {
		Map<String, String> Employee = new HashMap<>();
		Employee.put("Abhishekh", "Java Developer");
		Employee.put("Athrav", "Software Developer");
		Employee.put("Kalpesh", "Cloud Engineer");
		Employee.put("Jitesh", "Software tester");
		Employee.put("Jitesh", "Frontend developer");

		System.out.println("Before Key removal : " + Employee);
		Employee.remove("Kalpesh", "Cloud Engineer");// return true or false
		System.out.println("After key removal : " + Employee);
	}

}
