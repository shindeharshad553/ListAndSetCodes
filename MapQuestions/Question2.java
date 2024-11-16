package MapQuestions;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

//Create a map of any type and retrieve value based on key if it present and if it is not present then give appropriate 
//message 
public class Question2 {

	public static void main(String[] args) {
		Map<Integer, String> Student = new HashMap<Integer, String>();
		Student.put(1, "Abhishekh");
		Student.put(2, "Athrav");
		Student.put(3, "Kalpesh");
		Student.put(4, "Jitesh");

//		retrieve the value corresponding to the key 
//		get() method returns the value to which specified index is matched 

		System.out.println("Enter the key to search in map");
		Scanner sc=new Scanner(System.in);
		int k = sc.nextInt();
		if (Student.get(k) == null)// map doesn't have the key
			System.out.println("No such key exists in Map");
		else// corresponding value of key
			System.out.println("Value corresponding to the  key " + k + " is " + Student.get(k));
		sc.close();

	}

}
