package ListQuestions;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

//Reverse a list without using inbuilt method 
public class Question3 {
	public static List<Integer> reverse(List<Integer> li) {
		int i = 0, j = li.size() - 1;
		while (i < j) {
//			swapping the values 
			int temp = li.get(i);
			li.set(i, li.get(j));
			li.set(j, temp);
			i++;
			j--;
		}
		return li;
	}

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n, ele;
		System.out.println("Enter the size of List : ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ele = sc.nextInt();
			li.add(ele);
		}
		List<Integer> ans = reverse(li);
		System.out.println("reverse of List is : " + ans);
		sc.close();
	}

}
