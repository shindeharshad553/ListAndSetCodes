package SetQuestions;

import java.util.HashSet;
import java.util.Set;

//write a program to check whether all elements of set1 is present in another set or not 
public class Question4 {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		s1.add(2);
		s1.add(23);
		s1.add(32);
		s1.add(45);

		s2.add(2);
		s2.add(23);
		s2.add(32);
		s2.add(45);
		
		if(s2.containsAll(s1))
			System.out.println("s2 contains all elements of s1");
		else
			System.out.println("s2 not contains all elements of s1");
	}

}
