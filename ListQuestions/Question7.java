package ListQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Given a list of integers find all pairs of numbers that add up to the target sum 
public class Question7 {
	public static void main(String args[]) {
		ArrayList<Integer> l = new ArrayList<>();
		int target = 15;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();

		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}

		Collections.sort(l);
		int s = 0, e = l.size() - 1;
		while (s < e) {
			int sum = l.get(s) + l.get(e);
			if (sum == target) {
				System.out.println(s+" "+e);
				s++;
				e--;
			} else if (sum > target)
				e--;
			else if (sum < target)
				s++;
		}
	}
}

