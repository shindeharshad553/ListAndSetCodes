package ListQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Implement a method to remove duplicate elements from the list<Integer>
public class Question2 {
	public static List<Integer> removeDuplicate(List<Integer> li) {
		if(li.size()==1)
			return li;
		int j = 0;
		for (int i = 0; i < li.size(); i++) {
//			If elements are not unique then place the element at j th index 
			if (!li.get(i).equals(li.get(j))) {
				j++;
				li.set(j, li.get(i));
			}
		}

//		removing duplicate elements which are at the end of the list 
		for (int k = j; k < li.size(); k++)
			li.remove(k);
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
		System.out.println("Answer : " + removeDuplicate(li));
		sc.close();
	}
}
