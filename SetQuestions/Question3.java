package SetQuestions;

import java.util.Set;
import java.util.HashSet;

//Given two sets find the difference between two sets 
public class Question3 {
	public static void main(String args[]) {
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		s1.add(2);
		s1.add(23);
		s1.add(32);
		s1.add(45);

		s2.add(32);
		s2.add(45);
		s2.add(27);
		s2.add(21);

		Set<Integer> s3 = new HashSet<>();
		s3.addAll(s1);		
		s3.removeAll(s2);
		System.out.println("Difference set is : " + s3);
		

	}
}
