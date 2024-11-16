package SetQuestions;

import java.util.Set;
import java.util.TreeSet;

//Problem Statement : Write a program to calculate the second smallest and second largest element from a set<Integer>.
public class Question10 {
	public static void main(String args[]) {
		Set<Integer> s = new TreeSet<>();
		s.add(13);
		s.add(2);
		s.add(24);
		s.add(1);
//		Iterator<Integer> itr=s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		Object[]elements=s.toArray();
		System.out.println("Second smallest : " + elements[1]);
		System.out.println("Second largest : " + elements[elements.length - 2]);
	}
}
