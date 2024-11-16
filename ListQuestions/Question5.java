package ListQuestions;

import java.util.ArrayList;
import java.util.Scanner;
//create a method that finds maximum and minimum element from a list<Dobule>

public class Question5 {
	public static double maximumElement(ArrayList<Double> l) {
		double max = 0;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) > max) {
				max = l.get(i);
			}
		}
		return max;
	}

	public static double minimumElement(ArrayList<Double> l) {
		double min = Double.MIN_VALUE;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) < min)
				min = l.get(i);
		}
		return min;
	}

	public static void main(String args[]) {
		ArrayList<Double> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			l.add(sc.nextDouble());
		}
		System.out.println("Maximum element is : " + maximumElement(l));
		System.out.println("Minimum element is : " + minimumElement(l));
		sc.close();
	}
}
