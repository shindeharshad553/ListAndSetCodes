package ListQuestions;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//Write a program to find sum and average of all elements in a List<Integer>.
public class Question1 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		System.out.println("Enter the number of elements you want to insert : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int element;
		System.out.println("Enter the list elements : ");
		for (int i = 0; i < n; i++) {
			element = sc.nextInt();
			li.add(element);
		}
		int sum = 0;
		for (int i = 0; i < li.size(); i++) {
			sum += li.get(i);
		}
		System.out.println("Sum :" + sum);
		double avg = (double) sum / li.size();
		System.out.println("Average : " + avg);
	}

}
