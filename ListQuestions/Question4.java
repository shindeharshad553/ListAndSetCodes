package ListQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Implement the code to merge two list objects and sort the result 
public class Question4  {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first list : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the size of second list : ");
		int n2 = sc.nextInt();

		System.out.println("Enter first List elements : ");
		for (int i = 0; i < n1; i++) {
			l1.add(sc.nextInt());
		}

		System.out.println("Enter second List elements : ");
		for (int i = 0; i < n2; i++) {
			l2.add(sc.nextInt());
		}
//		code for merging two list objects 
		l1.addAll(l2);

		Comparator<Integer> c=new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				if(num1>num2)
					return 1;
				else if(num1<num2)
					return -1;
				return 0;

			}
			
		};
//		code for sorting the list
		Collections.sort(l1, c);
		System.out.println(l1);
	}
}
