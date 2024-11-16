package MapQuestions;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

//Create a map of any type and check whether it contains a specific key and value or not and print the result for each check. 
public class Question3 {

	public static void main(String[] args) {
		Map<String, Integer> Student = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Student.put("Abhishekh", 1);
		Student.put("Athrav", 2);
		Student.put("Kalpesh", 3);
		Student.put("Jitesh", 4);

//		retrieve the value corresponding to the key 
//		get() method returns the value to which specified index is matched 
		
		String ch;
		do {
			System.out.println("Enter the key to search in Map : ");
			String k = sc.next();

			if (!Student.containsKey(k))// map doesn't have the key
				System.out.println("No such key exists in Map");
			else// corresponding value of key
				System.out.println("Value corresponding to the  key " + k + " is " + Student.get(k));

			System.out.println("Would you like to continue the search (y/n)");
			ch = sc.next();
		} while (!ch.equals("n"));
		sc.close();

	}

}
