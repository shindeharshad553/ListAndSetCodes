package SetQuestions;

import java.util.HashSet;
import java.util.Set;

//write a code to find the intersection of two set objects 
public class Question2 {
	public static void main(String args[]) {
		Set<Integer> s1=new HashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(23);
		s1.add(21);
		Set<Integer> s2=new HashSet<>();
		s2.add(1);
		s2.add(31);
		s2.add(10);
		s2.add(4);

		//retains only the elements from the s1 which are present in s2		
		s1.retainAll(s2);
		System.out.println(s1);
	}
}
