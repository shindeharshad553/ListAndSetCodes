package SetQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Given a set<Integer> find the sum of all set elements without converting it into a list 

public class Question7 {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values that you want (Integer only): ");
		int n = sc.nextInt();
		System.out.println("Enter values : ");
		for (int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}

		// Logic to calculate the sum of all set elements
		int sum = 0;
		for (Integer ele : s) {
			sum += ele;
		}
		System.out.println(sum);
		sc.close();
	}

}
