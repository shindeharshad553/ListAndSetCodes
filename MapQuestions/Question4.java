package MapQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//create a map add some key value pair and update the value for an existing key and print the map before and after the updation.
public class Question4 {

	public static void main(String[] args) {
		Map<String, Integer> Employee = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Employee.put("Abhishekh", 1);
		Employee.put("Athrav", 2);
		Employee.put("Kalpesh", 3);
		Employee.put("Jitesh", 4);
		Employee.put("Jitesh", 5); // It will override the value of key if the same key is inserted more than once
									// with different value
		System.out.println("Content of Map before updation is " + Employee);
		
//		Updating the value of exsisting key
		int Id=Employee.get("Kalpesh");
//		Updating the value of key 
		Id=8;
//		Put the value into the map with it's respective key 
		Employee.put("Kalpesh",Id);
		
		System.out.println("Content of Map after updation is " + Employee);
		sc.close();
	}

}
