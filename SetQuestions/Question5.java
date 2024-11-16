package SetQuestions;

import java.util.HashSet;
import java.util.Set;

//write a program to check to calculate the symmetric difference between two set objects 
public class Question5 {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);

		s2.add(1);
		s2.add(2);
		s2.add(3);

//		union calculate
		Set<Integer> UnionSet = new HashSet<>(s1);
		UnionSet.addAll(s2);
//		intersection calculate 
		s1.retainAll(s2);
		UnionSet.removeAll(s1);
		System.out.println(UnionSet);

	}

}
